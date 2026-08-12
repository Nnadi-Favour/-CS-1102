/**
 * Unit7.java
 * Unit 7 Programming Assignment
 * Student Management System GUI Application
 *
 * Demonstrates:
 * - Java Swing GUI
 * - Event Handling
 * - JTable
 * - Buttons
 * - Menus
 * - Dynamic Interface Updates
 * - Error Handling
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;


public class Unit7 extends JFrame {


    // Store students
    private ArrayList<Student> students = new ArrayList<>();


    // GUI Components

    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtCourse;
    private JTextField txtGrade;


    private JTable table;
    private DefaultTableModel model;


    private JButton addButton;
    private JButton updateButton;
    private JButton viewButton;
    private JButton clearButton;



    public Unit7() {


        setTitle("Student Management System");

        setSize(700,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);



        // Main Panel

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(6,2,10,10));



        // Labels and Text Fields


        panel.add(new JLabel("Student ID:"));

        txtId = new JTextField();

        panel.add(txtId);



        panel.add(new JLabel("Student Name:"));

        txtName = new JTextField();

        panel.add(txtName);



        panel.add(new JLabel("Course:"));

        txtCourse = new JTextField();

        panel.add(txtCourse);



        panel.add(new JLabel("Grade:"));

        txtGrade = new JTextField();

        panel.add(txtGrade);



        // Buttons


        addButton = new JButton("Add Student");

        updateButton = new JButton("Update Student");

        viewButton = new JButton("View Students");

        clearButton = new JButton("Clear");



        panel.add(addButton);

        panel.add(updateButton);

        panel.add(viewButton);

        panel.add(clearButton);



        add(panel, BorderLayout.NORTH);



        // Table


        model = new DefaultTableModel();


        model.addColumn("Student ID");

        model.addColumn("Name");

        model.addColumn("Course");

        model.addColumn("Grade");



        table = new JTable(model);


        JScrollPane scrollPane = new JScrollPane(table);


        add(scrollPane, BorderLayout.CENTER);



        // Menu


        JMenuBar menuBar = new JMenuBar();


        JMenu menu = new JMenu("File");


        JMenuItem exitItem = new JMenuItem("Exit");


        menu.add(exitItem);


        menuBar.add(menu);


        setJMenuBar(menuBar);



        // Event Handling


        addButton.addActionListener(e -> addStudent());


        updateButton.addActionListener(e -> updateStudent());


        viewButton.addActionListener(e -> loadTable());


        clearButton.addActionListener(e -> clearFields());


        exitItem.addActionListener(e -> System.exit(0));



        // Select table row to edit


        table.getSelectionModel().addListSelectionListener(e -> {


            int row = table.getSelectedRow();


            if(row >=0){


                txtId.setText(
                    model.getValueAt(row,0).toString()
                );


                txtName.setText(
                    model.getValueAt(row,1).toString()
                );


                txtCourse.setText(
                    model.getValueAt(row,2).toString()
                );


                txtGrade.setText(
                    model.getValueAt(row,3).toString()
                );

            }

        });



        setVisible(true);

    }





    // Add Student Function


    private void addStudent(){


        String id = txtId.getText().trim();

        String name = txtName.getText().trim();

        String course = txtCourse.getText().trim();

        String grade = txtGrade.getText().trim();



        if(id.isEmpty() || name.isEmpty()
                || course.isEmpty()
                || grade.isEmpty()){



            JOptionPane.showMessageDialog(
                    this,
                    "All fields are required."
            );


            return;

        }



        for(Student s : students){


            if(s.getStudentId()
                    .equalsIgnoreCase(id)){



                JOptionPane.showMessageDialog(
                        this,
                        "Student ID already exists."
                );


                return;

            }

        }



        students.add(
            new Student(id,name,course,grade)
        );



        loadTable();


        clearFields();



        JOptionPane.showMessageDialog(
                this,
                "Student added successfully."
        );


    }





    // Update Student


    private void updateStudent(){


        int row = table.getSelectedRow();



        if(row == -1){


            JOptionPane.showMessageDialog(
                    this,
                    "Select a student first."
            );


            return;

        }



        Student s = students.get(row);



        s.setStudentId(txtId.getText());

        s.setStudentName(txtName.getText());

        s.setCourse(txtCourse.getText());

        s.setGrade(txtGrade.getText());



        loadTable();



        JOptionPane.showMessageDialog(
                this,
                "Student updated successfully."
        );


    }





    // Display Table


    private void loadTable(){


        model.setRowCount(0);



        for(Student s : students){


            model.addRow(
                    new Object[]{

                            s.getStudentId(),

                            s.getStudentName(),

                            s.getCourse(),

                            s.getGrade()

                    }
            );

        }

    }





    // Clear Inputs


    private void clearFields(){


        txtId.setText("");

        txtName.setText("");

        txtCourse.setText("");

        txtGrade.setText("");

    }





    public static void main(String[] args){


        new Unit7();


    }

}
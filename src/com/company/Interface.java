package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Interface {
    public Connection connect(){
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:@localhost:1521:xe","ROOT","root");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }
    public JFrame dashboard(JFrame dashboard){
        JLabel welcome = new JLabel("Welcome Here");
        JButton createStudentStructure = new JButton("Create Student Structure");
        JButton createTeacherStructure = new JButton("Create Teacher Structure");
        JButton insert = new JButton("Insert");
        JButton delete = new JButton("Delete");
        JButton select = new JButton("Select");
        JButton update = new JButton("Update");
        Component [] comp = {welcome,createStudentStructure,createTeacherStructure,insert,delete,select,update};
        for (Component component : comp) {
            dashboard.add(component);
        }
        dashboard.setSize(500,500);
        dashboard.setVisible(true);
        dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dashboard.setLayout(new GridLayout(9,2));
        createStudentStructure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame createStud = new JFrame("Create Student");
                createStudent(createStud);
            }
        });
        createTeacherStructure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame createTeach = new JFrame("Create Teacher");
                createTeacher(createTeach);
            }
        });
        return dashboard;
    }
    public JFrame insert(){
        return null;
    }
    public JFrame select(){
        return null;
    }
    public JFrame delete(){
        return null;
    }
    public JFrame update(){
        return null;
    }
    public JFrame createTeacher(JFrame createTeacher){
        JLabel id = new JLabel("Insert Teacher ID");
        JTextField idIn = new JTextField();
        JLabel name = new JLabel("Insert Teacher Name");
        JTextField nameIn = new JTextField();
        JLabel age = new JLabel("Insert Teacher Age");
        JTextField ageIn = new JTextField();
        JButton add = new JButton("Add Teacher");
        Component [] comp = {id,idIn,name,nameIn,age,ageIn,add};
        for (Component component : comp) {
            createTeacher.add(component);
        }
        createTeacher.setLocation(1000,0);
        createTeacher.setSize(500,500);
        createTeacher.setVisible(true);
        createTeacher.setLayout(new GridLayout(8,2));
        return createTeacher;
    }
    public JFrame createStudent(JFrame createStudent){
        JLabel id = new JLabel("Insert Student ID");
        JTextField idIn = new JTextField();
        JLabel name = new JLabel("Insert Student Name");
        JTextField nameIn = new JTextField();
        JLabel age = new JLabel("Insert Student Age");
        JTextField ageIn = new JTextField();
        JButton add = new JButton("Add Student");
        Component [] comp = {id,idIn,name,nameIn,age,ageIn,add};
        for (Component component : comp) {
            createStudent.add(component);
        }
        createStudent.setSize(500,500);
        createStudent.setVisible(true);
        createStudent.setLayout(new GridLayout(8,2));
        return createStudent;
    }
}

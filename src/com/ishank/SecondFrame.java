package com.ishank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class SecondFrame {
    Connection Con = null;
    PreparedStatement pst = null;
    //jTable1 = new javax.swing.JTable();
    JTable jTable1 = new JTable();
    ResultSet rs = null;
    private JFrame f2 = new JFrame("Second");
    public JPanel p1x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p2x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p3x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p4x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p5x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p6x = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p7x = new JPanel((new FlowLayout(FlowLayout.CENTER)));
    public JPanel p8x = new JPanel((new FlowLayout(FlowLayout.CENTER)));
    public JPanel p9x = new JPanel((new FlowLayout(FlowLayout.CENTER)));
    public JPanel p10x = new JPanel();
    public JPanel p11x = new JPanel();
    public JPanel p12x = new JPanel();
    public JButton bok2 = new JButton("Create Account");
    public JButton back = new JButton("Go Back");

    public JLabel details = new JLabel("    ADD YOUR DETAILS    ");
    public JLabel FirstName = new JLabel("First Name         ");
    public JLabel LastName = new JLabel("Last Name          ");
    public JLabel PhoneNo = new JLabel("Phone No.          ");
    public JLabel pwd1 = new JLabel("Create Password    ");
    public JLabel cpwd = new JLabel("Confirm Password   ");
    public JLabel or = new JLabel("     OR     ");

    public JTextField fname = new JTextField(20);
    public JTextField lname = new JTextField(20);
    public JTextField phno = new JTextField(20);
    public JPasswordField pwdd = new JPasswordField(20);
    public JPasswordField cpwdd = new JPasswordField(20);

    public SecondFrame() {
//        try {
//            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "password");
//        if(Con!=null) {
//            String sql = "insert into customer values(?,?,?,?,?)";
//
//            pst = Con.prepareStatement(sql);
//            pst.setString(1, fname.getText());
//            pst.setString(2, lname.getText());
//            pst.setString(3, phno.getText());
//            pst.setString(4, pwdd.getText());
//            pst.setString(5, cpwdd.getText());
//            rs = pst.executeQuery();
//        }else
//            JOptionPane.showMessageDialog(null," NOT CONNECTED _ SECOND FRAME");
//        } catch (SQLException e1) {
//            e1.printStackTrace();
//        }







        details.setFont(new Font("Algerian", Font.ITALIC, 30));
        FirstName.setFont(new Font("Monospaced", Font.BOLD, 20));
        LastName.setFont(new Font("Monospaced", Font.BOLD, 20));
        PhoneNo.setFont(new Font("Monospaced", Font.BOLD, 20));
        pwd1.setFont(new Font("Monospaced", Font.BOLD, 20));
        cpwd.setFont(new Font("Monospaced", Font.BOLD, 20));
        or.setFont(new Font("Monospaced", Font.BOLD, 25));

        back.setPreferredSize(new Dimension(130, 40));
        back.setFont(new Font("Arial Black", Font.PLAIN, 20));
        back.setBackground(Color.white);

        bok2.setPreferredSize(new Dimension(200, 40));
        bok2.setFont(new Font("Arial Black", Font.PLAIN, 20));
        bok2.setBackground(Color.white);

        back.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.orange, Color.red, Color.blue));
        bok2.setBorder(BorderFactory.createBevelBorder(1, Color.green, Color.orange, Color.red, Color.blue));


        p1x.add(details);
        p2x.add(FirstName);
        p2x.add(fname);
        p3x.add(LastName);
        p3x.add(lname);
        p4x.add(PhoneNo);
        p4x.add(phno);
        p5x.add(pwd1);
        p5x.add(pwdd);
        p6x.add(cpwd);
        p6x.add(cpwdd);
        p7x.add(bok2);
        p8x.add(or);
        p10x.add(back);

        f2.add(p1x);
        f2.add(p10x);
        f2.add(p2x);
        f2.add(p3x);
        f2.add(p4x);
        f2.add(p5x);
        f2.add(p6x);
        f2.add(p9x);
        f2.add(p7x);
        f2.add(p8x);
        f2.add(p10x);

        String s21 = fname.getText();
        String s22 = lname.getText();
        String s23 = phno.getText();

        bok2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f2.dispose();
                bok2Action();
                JOptionPane.showMessageDialog(null, "Your account has been created !");
                new MyLogin();
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f2.dispose();
                new MyLogin();
            }
        });

        f2.setLayout(new GridLayout(10,1));
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setSize(500,600);
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);
    }
    public void bok2Action(){
        try {
            Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","password");
            if(Con!=null){

                String sql="insert into customer(name,password,phoneno) values(?,?,?)";

                pst=Con.prepareStatement(sql);
                pst.setString(1,fname.getText());
                pst.setString(2,pwdd.getText());
                pst.setString(3,phno.getText());

                pst.executeUpdate();


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

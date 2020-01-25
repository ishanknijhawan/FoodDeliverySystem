package com.ishank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class MyLogin {
    Connection Con=null;
    PreparedStatement pst=null;
    //jTable1 = new javax.swing.JTable();
    JTable jTable1=new JTable();
    ResultSet rs=null;
    public JFrame f = new JFrame("Login");
    public JButton createAcc = new JButton("Create Account");
    public JButton newaccount = new JButton("Sign In ");
    public ImageIcon ii = new ImageIcon("C:/ryan-holloway-273158-unsplash.jpg");

    public JLabel lb = new JLabel("  FOOD DELIVERY SYSTEM  ");
    public JLabel user = new JLabel("UserName : ");
    public JLabel or = new JLabel("     OR     ");
    public JLabel pwd = new JLabel("Password : ");
    public JLabel login = new JLabel("Login");
    public JTextField jtfuser = new JTextField(20);
    public JPasswordField jtfpwd = new JPasswordField(20);

    public JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p2 = new JPanel();
    public JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel p6 = new JPanel();
    public JPanel p7 = new JPanel();
    public JPanel p8 = new JPanel();
    public JPanel p9 = new JPanel();
    public JPanel p10 = new JPanel();
    public JPanel p11 = new JPanel();
    public JPanel p12 = new JPanel();

    public MyLogin() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "password");

            DefaultTableModel DM = (DefaultTableModel) jTable1.getModel();
            DM.setRowCount(0);
        }catch (Exception e){}
        //
//            String sql="select * from CUSTOMER";
//

//            JOptionPane.showMessageDialog(null,"connected");
//            String colhead[]={"FNAME","LNAME","CUSTID","EMAILID","PWD","ADDRESS","STREET","PINCODE","GENDER","PHONENO","ALLERGY"};
//            DM.setColumnIdentifiers(colhead);
//            Statement stmt=Con.createStatement();
//            rs=stmt.executeQuery(sql);
//            ResultSetMetaData rsmd=rs.getMetaData();
//            int cols=rsmd.getColumnCount();
//            while(rs.next()){
//                Object[] obj=new Object[cols];
//                for(int i=0;i<cols;i++)
//                {
//                    obj[i]=rs.getObject(i+1);
//
//                }
//             //   DM.addRow(obj);
//
//            }

//
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//
//        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        newaccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newaccountAction() ;}
        });
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
        lb.setFont(new Font("Arial Black", Font.ITALIC, 45));
        user.setFont(new Font("Monospaced", Font.BOLD, 20));
        pwd.setFont(new Font("MonoSpaced", Font.BOLD, 20));
        login.setFont(new Font("Sans Serif", Font.BOLD, 25));
        or.setFont(new Font("Algerian", Font.BOLD, 20));

        newaccount.setBorder(BorderFactory.createLineBorder(Color.black));
        createAcc.setBorder(BorderFactory.createLineBorder(Color.black));

        newaccount.setPreferredSize(new Dimension(130, 40));
        newaccount.setFont(new Font("Arial Black", Font.PLAIN, 20));
        newaccount.setBackground(Color.white);

        createAcc.setPreferredSize(new Dimension(200, 40));
        createAcc.setFont(new Font("Arial Black", Font.PLAIN, 18));
        createAcc.setBackground(Color.white);

        lb.setForeground(Color.MAGENTA);
        // f.getContentPane().setBackground(Color.GRAY);
        p1.add(lb);
        p2.add(user);
        p2.add(jtfuser);
        p3.add(pwd);
        p3.add(jtfpwd);
        p4.add(newaccount);
        p4.add(or);
        p4.add(createAcc);
        p5.add(login);

        f.add(p1);
        f.add(p6);
        f.add(p7);
        f.add(p5);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.setLayout(new GridLayout(10,1));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createAcc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                f.dispose();
                new SecondFrame();
            }
        });
        newaccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.dispose();
                new ThirdFrame();
            }
        });
        newaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newaccount.setBackground(Color.WHITE);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newaccount.setBackground(Color.YELLOW);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newaccount.setBackground(Color.BLACK);
                newaccount.setForeground(Color.WHITE);
            }
        });
        createAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createAcc.setBackground(Color.WHITE);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createAcc.setBackground(Color.YELLOW);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //newaccount.setBackground(Color.BLACK);
                //newaccount.setForeground(Color.WHITE);
            }
        });

        f.setSize(900,600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void newaccountAction(){
        try {
            Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","password");
            if(Con!=null){

                String sql="select * from customer where  name=?  and password=?";

                pst=Con.prepareStatement(sql);
                pst.setString(1,jtfuser.getText());
                pst.setString(2,jtfpwd.getText());

                rs=pst.executeQuery();

//                if(rs.next()){
//                    JOptionPane.showMessageDialog(null,"your customer id is"+rs.getString("user_id" )+ " Thank you for choosing us");
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(null,"could not sign in : please type valid username/password");
//                   new MyLogin();
//                }
                if(!rs.next()){
                    JOptionPane.showMessageDialog(null,"could not sign in : please type valid username/password");
                    new MyLogin();

                }
                else {
                    JOptionPane.showMessageDialog(null,"your customer id is"+rs.getString("user_id" ));

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        new MyLogin();
    }

}





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author John Britto
 */
public class StudentLogin extends javax.swing.JFrame {
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    /**
     * Creates new form StudentLogin
     */
    public StudentLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("Username");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soad/07e3575.png"))); // NOI18N
        jLabel3.setText("jLabel2");

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(153, 255, 153));
        label1.setText("Welcome Student!");

        button1.setBackground(new java.awt.Color(153, 204, 255));
        button1.setLabel("Check Attendance!");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 255, 153));
        button2.setLabel("Go Back");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        
    }                                           

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String username=jTextField1.getText();
        String password=jPasswordField2.getText();
        String s="SE Comps";
        String t="TE Comps";
        String n="";
        
        try
                {
                String host= "jdbc:mysql://localhost:3306/soad";
                String uname="root";
                String upassword="";
                Connection con= DriverManager.getConnection(host, uname, upassword);
                Statement stmt = con.createStatement( );
                String SQL = "SELECT * FROM studentlogin";
                ResultSet rs=stmt.executeQuery(SQL);
                while(rs.next())
                {
                    String u=rs.getString("Username");
                    String p=rs.getString("Password");
                    String c=rs.getString("Class");
                    if(username.equalsIgnoreCase(u) && password.equals(p))
                    {
                        n=rs.getString("Name");
                        JOptionPane.showMessageDialog(null, "You have successfully logged in!");
                        JOptionPane.showMessageDialog(null, "Welcome " + n + "!");
                        if(c.equals(s))
                        {
                            String SQL1 = "SELECT * FROM secomps";
                            ResultSet rs1=stmt.executeQuery(SQL1);
                            while(rs1.next())
                            {
                                if((rs1.getString("Name")).equals(n))
                                {
                                    JOptionPane.showMessageDialog(null, "Your attendance is " + rs1.getString("Attendance") + "%");
                                    String test4=rs1.getString("Attendance");
                                    float f4=Float.parseFloat(test4);
                                    if(f4<75)
                                        JOptionPane.showMessageDialog(null, "Note: You are currently in the defaulters' list for this subject. Improve your attendance or you will be exempted from the practical exam of this subject.");
                                    break;
                                }
                            }
                        }
                        else if(c.equals(t))
                        {
                            String SQL1 = "SELECT * FROM tecomps";
                            ResultSet rs1=stmt.executeQuery(SQL1);
                            while(rs1.next())
                            {
                                if((rs1.getString("Name")).equals(n))
                                {
                                    JOptionPane.showMessageDialog(null, "Your attendance is " + rs1.getString("Attendance") + "%");
                                    String test4=rs1.getString("Attendance");
                                    float f4=Float.parseFloat(test4);
                                    if(f4<75)
                                        JOptionPane.showMessageDialog(null, "Note: You are currently in the defaulters' list for this subject. Improve your attendance or you will be exempted from the practical exam of this subject.");
                                    break;
                                }
                            }
                        }
                        else
                        {
                            String SQL1 = "SELECT * FROM becomps";
                            ResultSet rs1=stmt.executeQuery(SQL1);
                            while(rs1.next())
                            {
                                if((rs1.getString("Name")).equals(n))
                                {
                                    JOptionPane.showMessageDialog(null, "Your attendance is " + rs1.getString("Attendance") + "%");
                                    String test4=rs1.getString("Attendance");
                                    float f4=Float.parseFloat(test4);
                                    if(f4<75)
                                        JOptionPane.showMessageDialog(null, "Note: You are currently in the defaulters' list for this subject. Improve your attendance or you will be exempted from the practical exam of this subject.");
                                    break;
                                }
                            }
                        
                        }
                        break;
                    }
                    
                }
                if(!(rs.next()))
                {
                    JOptionPane.showMessageDialog(null, "Username/Password incorrect");
                    jTextField1.setText("");
                    jPasswordField2.setText("");
                }
                }
                catch(SQLException err)
                {
                    System.out.println(err.getMessage());
                }
                
    }                                       

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        
    }                                               

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        this.setVisible(false);
        MainPage mp=new MainPage();
        mp.setVisible(true);
    }                                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    Connection conn = null;
    Statement stmt = null;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    // End of variables declaration                   
}

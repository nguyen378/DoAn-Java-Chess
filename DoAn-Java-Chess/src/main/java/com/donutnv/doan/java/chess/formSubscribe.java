/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.donutnv.doan.java.chess;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Chi Nguyen
 */
public class formSubscribe extends javax.swing.JFrame {

    /**
     * Creates new form formSignIn
     */
    public formSubscribe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtyourname = new javax.swing.JPasswordField();
        btnsubcribe = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtpassword1 = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        btnback1 = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 143, 280, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chi Nguyen\\Downloads\\R.png")); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 260, 220));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Join Now");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        txtusername.setBackground(new java.awt.Color(51, 51, 51));
        txtusername.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setText("Username or Email");
        txtusername.setBorder(null);
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusernameFocusLost(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel5.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 317, 32));

        txtyourname.setBackground(new java.awt.Color(51, 51, 51));
        txtyourname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtyourname.setForeground(new java.awt.Color(255, 255, 255));
        txtyourname.setText("Your Name");
        txtyourname.setBorder(null);
        txtyourname.setEchoChar('\u0000');
        txtyourname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtyournameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtyournameFocusLost(evt);
            }
        });
        jPanel5.add(txtyourname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        btnsubcribe.setBackground(new java.awt.Color(102, 102, 102));
        btnsubcribe.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btnsubcribe.setForeground(new java.awt.Color(255, 255, 255));
        btnsubcribe.setText("SUBCRIBE");
        btnsubcribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubcribeActionPerformed(evt);
            }
        });
        jPanel5.add(btnsubcribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 290, 60));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 280, 30));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 280, 30));

        txtpassword1.setBackground(new java.awt.Color(51, 51, 51));
        txtpassword1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtpassword1.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword1.setText("Password");
        txtpassword1.setBorder(null);
        txtpassword1.setEchoChar('\u0000');
        txtpassword1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassword1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpassword1FocusLost(evt);
            }
        });
        jPanel5.add(txtpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 280, 30));

        btnback1.setBackground(new java.awt.Color(51, 51, 51));
        btnback1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        btnback1.setForeground(new java.awt.Color(255, 255, 255));
        btnback1.setText("Back");
        btnback1.setBorder(null);
        btnback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnback1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        btnback.setBackground(new java.awt.Color(51, 51, 51));
        btnback.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.setBorder(null);
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnback)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        // TODO add your handling code here:
        if(txtusername.getText().equals("Username or Email")){
            txtusername.setText(null);
            txtusername.requestFocus();

            removePlaceholderStyle(txtusername);
        }
    }//GEN-LAST:event_txtusernameFocusGained

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusLost
        // TODO add your handling code here:
        if(txtusername.getText().length()==0){
            addPlaceholderStyle(txtusername);
            txtusername.setText("Username or Email");
        }
    }//GEN-LAST:event_txtusernameFocusLost

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtyournameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtyournameFocusGained
        // TODO add your handling code here:
        if(txtyourname.getText().equals("Password")){
            txtyourname.setText(null);
            txtyourname.requestFocus();

            txtyourname.setEchoChar('*');
            removePlaceholderStyle(txtyourname);
        }
    }//GEN-LAST:event_txtyournameFocusGained

    private void txtyournameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtyournameFocusLost
        // TODO add your handling code here:
        if(txtyourname.getText().length()==0){
            addPlaceholderStyle(txtyourname);
            txtyourname.setText("Password");
            txtyourname.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtyournameFocusLost

    private void btnsubcribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubcribeActionPerformed

        String username = txtusername.getText();
        String password = new String(txtyourname.getPassword());
        StringBuilder sb = new StringBuilder();
        if(username .equals("")){
            sb.append("Username is empty \n");
        }
        if(password.equals("")){
            sb.append("Password is empty \n");
        }
        if (sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(username.equals("User1") && password.equals("chess123")){
            JOptionPane.showMessageDialog(this,"Login successfully");

        }
        else{
            JOptionPane.showMessageDialog(this,"Invalid username or password","Failure",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsubcribeActionPerformed

    private void txtpassword1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassword1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassword1FocusGained

    private void txtpassword1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassword1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassword1FocusLost

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        formIndex2 id2 = new formIndex2();
        // Ẩn form đăng nhập hiện tại
        this.setVisible(false);
        // Hiển thị form mới
        id2.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback1ActionPerformed
        // TODO add your handling code here:
        formIndex2 id2 = new formIndex2();
        // Ẩn form đăng nhập hiện tại
        this.setVisible(false);
        // Hiển thị form mới
        id2.setVisible(true);
    }//GEN-LAST:event_btnback1ActionPerformed

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
            java.util.logging.Logger.getLogger(formSubscribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formSubscribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formSubscribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formSubscribe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formSubscribe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnback1;
    private javax.swing.JButton btnsubcribe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPasswordField txtpassword1;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPasswordField txtyourname;
    // End of variables declaration//GEN-END:variables

    private void removePlaceholderStyle(JTextField txtusername) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void addPlaceholderStyle(JTextField txtusername) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

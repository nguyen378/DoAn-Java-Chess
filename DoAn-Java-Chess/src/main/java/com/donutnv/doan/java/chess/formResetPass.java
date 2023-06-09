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
public class formResetPass extends javax.swing.JFrame {

    /**
     * Creates new form formResetPass
     */
    public formResetPass() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtresetpass = new javax.swing.JTextField();
        txtEnterpass = new javax.swing.JPasswordField();
        btncontinue = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 143, 280, 0));
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 260, 220));

        jLabel4.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FORGOT PASSWORD");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        txtresetpass.setBackground(new java.awt.Color(51, 51, 51));
        txtresetpass.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtresetpass.setForeground(new java.awt.Color(255, 255, 255));
        txtresetpass.setText("Reset Password");
        txtresetpass.setBorder(null);
        txtresetpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtresetpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtresetpassFocusLost(evt);
            }
        });
        jPanel5.add(txtresetpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 317, 32));

        txtEnterpass.setBackground(new java.awt.Color(51, 51, 51));
        txtEnterpass.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtEnterpass.setForeground(new java.awt.Color(255, 255, 255));
        txtEnterpass.setText("Enter the password");
        txtEnterpass.setBorder(null);
        txtEnterpass.setEchoChar('\u0000');
        txtEnterpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnterpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnterpassFocusLost(evt);
            }
        });
        jPanel5.add(txtEnterpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        btncontinue.setBackground(new java.awt.Color(102, 102, 102));
        btncontinue.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        btncontinue.setForeground(new java.awt.Color(255, 255, 255));
        btncontinue.setText("CONTINUE");
        btncontinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinueActionPerformed(evt);
            }
        });
        jPanel5.add(btncontinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 290, 60));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 190, 30));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnterpassFocusGained
        // TODO add your handling code here:
        if(txtEnterpass.getText().equals("Password")){
            txtEnterpass.setText(null);
            txtEnterpass.requestFocus();

            txtEnterpass.setEchoChar('*');
            removePlaceholderStyle(txtEnterpass);
        }
    }//GEN-LAST:event_txtEnterpassFocusGained

    private void txtEnterpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnterpassFocusLost
        // TODO add your handling code here:
        if(txtEnterpass.getText().length()==0){
            addPlaceholderStyle(txtEnterpass);
            txtEnterpass.setText("Password");
            txtEnterpass.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtEnterpassFocusLost

    private void btncontinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinueActionPerformed

     //   if (password.equals(passwordAgain)) {
                // Mật khẩu trùng khớp
                javax.swing.JOptionPane.showMessageDialog(this, "Đăng ký thành công");
                formLogin lg = new formLogin();
                // Ẩn form đăng nhập hiện tại
                this.setVisible(false);
                // Hiển thị form mới
            lg.setVisible(true);
    }//GEN-LAST:event_btncontinueActionPerformed

    private void txtresetpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtresetpassFocusLost
        // TODO add your handling code here:
        if(txtresetpass.getText().length()==0){
            addPlaceholderStyle(txtresetpass);
            txtresetpass.setText("Username or Email");
        }
    }//GEN-LAST:event_txtresetpassFocusLost

    private void txtresetpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtresetpassFocusGained
        // TODO add your handling code here:
        if(txtresetpass.getText().equals("Username or Email")){
            txtresetpass.setText(null);
            txtresetpass.requestFocus();

            removePlaceholderStyle(txtresetpass);
        }
    }//GEN-LAST:event_txtresetpassFocusGained

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
            java.util.logging.Logger.getLogger(formResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formResetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formResetPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncontinue;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField txtEnterpass;
    private javax.swing.JTextField txtresetpass;
    // End of variables declaration//GEN-END:variables

    private void addPlaceholderStyle(JTextField txtresetpass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void removePlaceholderStyle(JTextField txtresetpass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

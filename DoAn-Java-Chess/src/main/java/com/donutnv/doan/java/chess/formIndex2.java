/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.donutnv.doan.java.chess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Chi Nguyen
 */
public class formIndex2 extends javax.swing.JFrame {

    /**
     * Creates new form formIndex2
     */
    public formIndex2() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnplay = new javax.swing.JButton();
        btnpuzzles = new javax.swing.JButton();
        btnleanrn = new javax.swing.JButton();
        btnwatch = new javax.swing.JButton();
        btnnews = new javax.swing.JButton();
        btnmore = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnplayonline = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnplaycomputer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.windowBorder);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        btnplay.setBackground(new java.awt.Color(51, 51, 51));
        btnplay.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnplay.setForeground(new java.awt.Color(255, 255, 255));
        btnplay.setText("PLay");
        btnplay.setBorder(null);
        btnplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayActionPerformed(evt);
            }
        });

        btnpuzzles.setBackground(new java.awt.Color(51, 51, 51));
        btnpuzzles.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnpuzzles.setForeground(new java.awt.Color(255, 255, 255));
        btnpuzzles.setText(" Puzzles");
        btnpuzzles.setBorder(null);
        btnpuzzles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuzzlesActionPerformed(evt);
            }
        });

        btnleanrn.setBackground(new java.awt.Color(51, 51, 51));
        btnleanrn.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnleanrn.setForeground(new java.awt.Color(255, 255, 255));
        btnleanrn.setText("Learn");
        btnleanrn.setBorder(null);
        btnleanrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleanrnActionPerformed(evt);
            }
        });

        btnwatch.setBackground(new java.awt.Color(51, 51, 51));
        btnwatch.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnwatch.setForeground(new java.awt.Color(255, 255, 255));
        btnwatch.setText("Watch");
        btnwatch.setBorder(null);

        btnnews.setBackground(new java.awt.Color(51, 51, 51));
        btnnews.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnnews.setForeground(new java.awt.Color(255, 255, 255));
        btnnews.setText("News");
        btnnews.setBorder(null);
        btnnews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewsActionPerformed(evt);
            }
        });

        btnmore.setBackground(new java.awt.Color(51, 51, 51));
        btnmore.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnmore.setForeground(new java.awt.Color(255, 255, 255));
        btnmore.setText("More");
        btnmore.setBorder(null);
        btnmore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoreActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chi Nguyen\\Downloads\\logom.jpg")); // NOI18N
        jLabel4.setText("jLabel4");

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Sign Up");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(51, 51, 51));
        jButton10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Log In");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnmore, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnplay, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnpuzzles, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnleanrn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnwatch, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnnews, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jButton9))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnplay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpuzzles, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnleanrn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnwatch, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnnews, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmore, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        btnplayonline.setBackground(new java.awt.Color(51, 51, 51));
        btnplayonline.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        btnplayonline.setForeground(new java.awt.Color(255, 255, 255));
        btnplayonline.setText("PLay Online");
        btnplayonline.setBorder(null);
        btnplayonline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayonlineActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chi Nguyen\\Downloads\\abancooo.jpg")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Online #1");

        jLabel6.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Play Chess ");

        btnplaycomputer.setBackground(new java.awt.Color(51, 51, 51));
        btnplaycomputer.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        btnplaycomputer.setForeground(new java.awt.Color(255, 255, 255));
        btnplaycomputer.setText("PLay Computer");
        btnplaycomputer.setBorder(null);
        btnplaycomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplaycomputerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 679, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnplaycomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnplayonline, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(933, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(108, 108, 108)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnplayonline, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnplaycomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(556, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        formSubscribe dangky = new formSubscribe();
        // Ẩn form đăng nhập hiện tại
        this.setVisible(false);
        // Hiển thị form mới
        dangky.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         formLogin dangnhap = new formLogin();
        // Ẩn form đăng nhập hiện tại
        this.setVisible(false);
        // Hiển thị form mới
        dangnhap.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Bạn đã có tài khoản chưa?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            // Nếu chọn Yes, mở form đăng nhập (formLogin)
            formLogin loginForm = new formLogin();
            loginForm.setVisible(true);
        } else if (result == JOptionPane.NO_OPTION) {
            // Nếu chọn No, mở form đăng ký (formSubscribe)
            formSubscribe subscribeForm = new formSubscribe();
            subscribeForm.setVisible(true);
        }

    }//GEN-LAST:event_btnplayActionPerformed

    private void btnpuzzlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuzzlesActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Bạn đã có tài khoản chưa?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            // Nếu chọn Yes, mở form đăng nhập (formLogin)
            formLogin loginForm = new formLogin();
            loginForm.setVisible(true);
        } else if (result == JOptionPane.NO_OPTION) {
            // Nếu chọn No, mở form đăng ký (formSubscribe)
            formSubscribe subscribeForm = new formSubscribe();
            subscribeForm.setVisible(true);
        }
    }//GEN-LAST:event_btnpuzzlesActionPerformed

    private void btnleanrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleanrnActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Bạn đã có tài khoản chưa?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            // Nếu chọn Yes, mở form đăng nhập (formLogin)
            formLogin loginForm = new formLogin();
            loginForm.setVisible(true);
        } else if (result == JOptionPane.NO_OPTION) {
            // Nếu chọn No, mở form đăng ký (formSubscribe)
            formSubscribe subscribeForm = new formSubscribe();
            subscribeForm.setVisible(true);
        }
    }//GEN-LAST:event_btnleanrnActionPerformed

    private void btnnewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewsActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(this, "Bạn đã có tài khoản chưa?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            // Nếu chọn Yes, mở form đăng nhập (formLogin)
            formLogin loginForm = new formLogin();
            loginForm.setVisible(true);
        } else if (result == JOptionPane.NO_OPTION) {
            // Nếu chọn No, mở form đăng ký (formSubscribe)
            formSubscribe subscribeForm = new formSubscribe();
            subscribeForm.setVisible(true);
        }
    }//GEN-LAST:event_btnnewsActionPerformed

    private void btnmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoreActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(this, "Bạn đã có tài khoản chưa?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            // Nếu chọn Yes, mở form đăng nhập (formLogin)
            formLogin loginForm = new formLogin();
            loginForm.setVisible(true);
        } else if (result == JOptionPane.NO_OPTION) {
            // Nếu chọn No, mở form đăng ký (formSubscribe)
            formSubscribe subscribeForm = new formSubscribe();
            subscribeForm.setVisible(true);
        }
    }//GEN-LAST:event_btnmoreActionPerformed

    private void btnplayonlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayonlineActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(this, "Bạn đã có tài khoản chưa?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            // Nếu chọn Yes, mở form đăng nhập (formLogin)
            formLogin loginForm = new formLogin();
            loginForm.setVisible(true);
        } else if (result == JOptionPane.NO_OPTION) {
            // Nếu chọn No, mở form đăng ký (formSubscribe)
            formSubscribe subscribeForm = new formSubscribe();
            subscribeForm.setVisible(true);
        }
    }//GEN-LAST:event_btnplayonlineActionPerformed

    private void btnplaycomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplaycomputerActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(this, "Bạn đã có tài khoản chưa?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            // Nếu chọn Yes, mở form đăng nhập (formLogin)
            formLogin loginForm = new formLogin();
            loginForm.setVisible(true);
        } else if (result == JOptionPane.NO_OPTION) {
            // Nếu chọn No, mở form đăng ký (formSubscribe)
            formSubscribe subscribeForm = new formSubscribe();
            subscribeForm.setVisible(true);
        }
    }//GEN-LAST:event_btnplaycomputerActionPerformed

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
            java.util.logging.Logger.getLogger(formIndex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formIndex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formIndex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formIndex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formIndex2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnleanrn;
    private javax.swing.JButton btnmore;
    private javax.swing.JButton btnnews;
    private javax.swing.JButton btnplay;
    private javax.swing.JButton btnplaycomputer;
    private javax.swing.JButton btnplayonline;
    private javax.swing.JButton btnpuzzles;
    private javax.swing.JButton btnwatch;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

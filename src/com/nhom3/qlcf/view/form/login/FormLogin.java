/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.view.form.login;

import com.nhom3.qlcf.view.Run;
import static com.nhom3.qlcf.view.form.login.Login.jpnNenButton_login;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author baotri1998
 */
public class FormLogin extends javax.swing.JPanel {

    /**
     * Creates new form FormLogin
     */
    public static FormLogin login;

    public FormLogin() {
        initComponents();
        jpnLogin.setBackground(new Color(0, 0, 0, 134));
       
        login = this;
        jpnLogin.add(new Login());
   

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfLogin = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jlbLogo150px = new javax.swing.JLabel();
        jpnToolbar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpnLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Card = new javax.swing.JPanel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jfLogin.setBackground(new java.awt.Color(255, 255, 255));
        jfLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jfLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("GLASSIC LOGIN FORM");
        jfLogin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 870, 80));

        jlbLogo150px.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nhom3/qlcf/img/logoCafe.png"))); // NOI18N
        jfLogin.add(jlbLogo150px, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 150));

        jpnToolbar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("x");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnToolbarLayout = new javax.swing.GroupLayout(jpnToolbar);
        jpnToolbar.setLayout(jpnToolbarLayout);
        jpnToolbarLayout.setHorizontalGroup(
            jpnToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnToolbarLayout.createSequentialGroup()
                .addGap(0, 1013, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jpnToolbarLayout.setVerticalGroup(
            jpnToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnToolbarLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jfLogin.add(jpnToolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 40));

        jpnLogin.setBackground(new java.awt.Color(0, 0, 65));
        jpnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jpnLogin.setOpaque(false);
        jpnLogin.setLayout(new javax.swing.BoxLayout(jpnLogin, javax.swing.BoxLayout.LINE_AXIS));
        jfLogin.add(jpnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 450, 530));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nhom3/qlcf/img/nenLogin.png"))); // NOI18N
        jfLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        add(jfLogin);

        Card.setBackground(new java.awt.Color(255, 255, 255));
        Card.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Card.setLayout(new java.awt.CardLayout());
        add(Card);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:

        Run.main.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Card;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jfLogin;
    private javax.swing.JLabel jlbLogo150px;
    private javax.swing.JPanel jpnLogin;
    private javax.swing.JPanel jpnToolbar;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.view;

import sp.component.Password;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
    }

    public Password getPassword1() {
        return password1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPage1 = new sp.background.LoginPage();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        loginTextField1 = new sp.component.LoginTextField();
        password1 = new sp.component.Password();
        loginButton1 = new sp.componentButton.LoginButton();
        closeminbutton1 = new sp.componentButton.Closeminbutton();
        minimizebutton1 = new sp.componentButton.Minimizebutton();

        loginTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginTextField1MouseClicked(evt);
            }
        });

        password1.setText("password1");
        password1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password1MouseClicked(evt);
            }
        });

        loginButton1.setText("loginButton1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(loginTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(loginTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(loginTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(password1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(loginButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        closeminbutton1.setText("");
        closeminbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeminbutton1ActionPerformed(evt);
            }
        });

        minimizebutton1.setText("");
        minimizebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizebutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPage1Layout = new javax.swing.GroupLayout(loginPage1);
        loginPage1.setLayout(loginPage1Layout);
        loginPage1Layout.setHorizontalGroup(
            loginPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPage1Layout.createSequentialGroup()
                .addGap(523, 523, 523)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(491, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPage1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimizebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeminbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginPage1Layout.setVerticalGroup(
            loginPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPage1Layout.createSequentialGroup()
                .addGroup(loginPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeminbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(255, 255, 255)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTextField1MouseClicked
        loginTextField1.setText("");
       
    }//GEN-LAST:event_loginTextField1MouseClicked

    private void password1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password1MouseClicked
         password1.setText("");
        
    }//GEN-LAST:event_password1MouseClicked

    private void closeminbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeminbutton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeminbutton1ActionPerformed

    private void minimizebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizebutton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_minimizebutton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.componentButton.Closeminbutton closeminbutton1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private sp.componentButton.LoginButton loginButton1;
    private sp.background.LoginPage loginPage1;
    private sp.component.LoginTextField loginTextField1;
    private sp.componentButton.Minimizebutton minimizebutton1;
    private sp.component.Password password1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the loginButton1
     */
    public sp.componentButton.LoginButton getLoginButton1() {
        return loginButton1;
    }

    /**
     * @return the loginTextField1
     */
    public sp.component.LoginTextField getLoginTextField1() {
        return loginTextField1;
    }

    /**
     * @return the closeminbutton1
     */
    public sp.componentButton.Closeminbutton getCloseminbutton1() {
        return closeminbutton1;
    }

    /**
     * @return the minimizebutton1
     */
    public sp.componentButton.Minimizebutton getMinimizebutton1() {
        return minimizebutton1;
    }
}

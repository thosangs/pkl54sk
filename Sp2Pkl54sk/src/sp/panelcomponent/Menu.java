/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.panelcomponent;

/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    private String state;
    public Menu() {
        initComponents();
        
        this.setOpaque(false);
    }
    
                                              

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container1 = new sp.component.Container();
        Label = new javax.swing.JLabel();
        backButton1 = new sp.componentButton.BackButton();
        updatebutton1 = new sp.componentButton.Updatebutton();
        dataentrybutton1 = new sp.componentButton.Dataentrybutton();

        Label.setFont(new java.awt.Font("abeatbyKai", 0, 36)); // NOI18N
        Label.setForeground(new java.awt.Color(0, 38, 105));
        Label.setText("Label");

        backButton1.setText("");

        updatebutton1.setText("");
        updatebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebutton1ActionPerformed(evt);
            }
        });

        dataentrybutton1.setText("");
        dataentrybutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataentrybutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Label)
                .addContainerGap(931, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                        .addComponent(updatebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(dataentrybutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                        .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(352, 352, 352))))
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updatebutton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataentrybutton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(container1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updatebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebutton1ActionPerformed
        getDataentrybutton1().resetButton();
        
        setState("update");
    }//GEN-LAST:event_updatebutton1ActionPerformed

    private void dataentrybutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataentrybutton1ActionPerformed
        getUpdatebutton1().resetButton();
        
        setState("dataentry");
    }//GEN-LAST:event_dataentrybutton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private sp.componentButton.BackButton backButton1;
    private sp.component.Container container1;
    private sp.componentButton.Dataentrybutton dataentrybutton1;
    private sp.componentButton.Updatebutton updatebutton1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the Label
     */
    public javax.swing.JLabel getLabel() {
        return Label;
    }

    /**
     * @return the backButton1
     */
    public sp.componentButton.BackButton getBackButton1() {
        return backButton1;
    }

    /**
     * @return the dataentrybutton1
     */
    public sp.componentButton.Dataentrybutton getDataentrybutton1() {
        return dataentrybutton1;
    }

    /**
     * @return the selectButton1
     */
    

    /**
     * @return the updatebutton1
     */
    public sp.componentButton.Updatebutton getUpdatebutton1() {
        return updatebutton1;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    
}
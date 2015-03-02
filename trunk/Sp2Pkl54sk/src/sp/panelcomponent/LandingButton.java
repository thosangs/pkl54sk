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
public class LandingButton extends javax.swing.JPanel {

    /**
     * Creates new form LandingButton
     */
    private String state;
    public LandingButton() {
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
        listinglandingbutton1 = new sp.componentButton.Listinglandingbutton();
        questionnairelandingbutton1 = new sp.componentButton.Questionnairelandingbutton();
        selectButton1 = new sp.componentButton.SelectButton();

        listinglandingbutton1.setText("");
        listinglandingbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listinglandingbutton1ActionPerformed(evt);
            }
        });

        questionnairelandingbutton1.setText("");
        questionnairelandingbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionnairelandingbutton1ActionPerformed(evt);
            }
        });

        selectButton1.setText("");

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                        .addComponent(listinglandingbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(questionnairelandingbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                        .addComponent(selectButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(373, 373, 373))))
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listinglandingbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questionnairelandingbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(selectButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listinglandingbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listinglandingbutton1ActionPerformed
        getQuestionnairelandingbutton1().resetButton();
        getSelectButton1().activeButton();
        setState("listing");
    }//GEN-LAST:event_listinglandingbutton1ActionPerformed

    private void questionnairelandingbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionnairelandingbutton1ActionPerformed
        getListinglandingbutton1().resetButton();
        getSelectButton1().activeButton();
        setState("quest");
    }//GEN-LAST:event_questionnairelandingbutton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.component.Container container1;
    private sp.componentButton.Listinglandingbutton listinglandingbutton1;
    private sp.componentButton.Questionnairelandingbutton questionnairelandingbutton1;
    private sp.componentButton.SelectButton selectButton1;
    // End of variables declaration//GEN-END:variables
    
    public sp.componentButton.Listinglandingbutton getListinglandingbutton1() {
        return listinglandingbutton1;
    }

    /**
     * @return the questionnairelandingbutton1
     */
    public sp.componentButton.Questionnairelandingbutton getQuestionnairelandingbutton1() {
        return questionnairelandingbutton1;
    }

    /**
     * @return the selectButton1
     */
    public sp.componentButton.SelectButton getSelectButton1() {
        return selectButton1;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
}

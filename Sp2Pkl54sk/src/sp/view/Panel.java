/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.view;

import javax.swing.JLabel;
import sp.controller.LandingMenuControllerTest;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class Panel extends javax.swing.JPanel {

    private LandingMenuControllerTest controller;

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
        navbarButton1.getHomebutton1().setActive(true);
        
        controller = new LandingMenuControllerTest(getEntryListing(), getDataEntryQuest1(),  updateQuest1, this, MainPanel, getMenuListing(), getMenuQuest(), landingButton1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background2 = new sp.background.Background();
        namaLabel = new javax.swing.JLabel();
        navbarButton1 = new sp.panelcomponent.NavbarButton();
        closeminbutton1 = new sp.componentButton.Closeminbutton();
        minimizebutton1 = new sp.componentButton.Minimizebutton();
        MainPanel = new javax.swing.JPanel();
        landingButton1 = new sp.panelcomponent.LandingButton();
        menuListing = new sp.panelcomponent.MenuListing();
        menuQuest = new sp.panelcomponent.Menu();
        EntryListing = new sp.panelcomponent.DataEntryListing();
        EntryQuest = new sp.panelcomponent.DataEntryQuest();
        updateQuest1 = new sp.panelcomponent.UpdateQuest();
        comingSoon = new sp.panelcomponent.ComingSoonPanel();

        namaLabel.setFont(new java.awt.Font("abeatbyKai", 1, 18)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(204, 204, 255));
        namaLabel.setText("User Name");

        closeminbutton1.setText("");

        minimizebutton1.setText("");

        MainPanel.setLayout(new java.awt.CardLayout());
        MainPanel.add(landingButton1, "landing");
        MainPanel.add(menuListing, "menuListing");
        MainPanel.add(menuQuest, "menuQuest");
        MainPanel.add(EntryListing, "entrylisting");
        MainPanel.add(EntryQuest, "entryquest");
        MainPanel.add(updateQuest1, "updatequest");
        MainPanel.add(comingSoon, "comingsoon");

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(1270, 1270, 1270)
                        .addComponent(minimizebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeminbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background2Layout.createSequentialGroup()
                        .addComponent(navbarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(namaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeminbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(navbarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(namaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sp.panelcomponent.DataEntryListing EntryListing;
    private sp.panelcomponent.DataEntryQuest EntryQuest;
    private javax.swing.JPanel MainPanel;
    private sp.background.Background background2;
    private sp.componentButton.Closeminbutton closeminbutton1;
    private sp.panelcomponent.ComingSoonPanel comingSoon;
    private sp.panelcomponent.LandingButton landingButton1;
    private sp.panelcomponent.MenuListing menuListing;
    private sp.panelcomponent.Menu menuQuest;
    private sp.componentButton.Minimizebutton minimizebutton1;
    private javax.swing.JLabel namaLabel;
    private sp.panelcomponent.NavbarButton navbarButton1;
    private sp.panelcomponent.UpdateQuest updateQuest1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the controller
     */
    public LandingMenuControllerTest getController() {
        return controller;
    }

    /**
     * @return the MainPanel
     */
    public javax.swing.JPanel getMainPanel() {
        return MainPanel;
    }

    /**
     * @return the background1
     */
    public sp.background.Background getBackground1() {
        return background2;
    }

    /**
     * @return the closeminbutton1
     */
    public sp.componentButton.Closeminbutton getCloseminbutton1() {
        return closeminbutton1;
    }

    /**
     * @return the dataEntryQuest1
     */
    public sp.panelcomponent.DataEntryQuest getDataEntryQuest1() {
        return getEntryQuest();
    }

    /**
     * @return the landingButton1
     */
    public sp.panelcomponent.LandingButton getLandingButton1() {
        return landingButton1;
    }

    
    

    /**
     * @return the minimizebutton1
     */
    public sp.componentButton.Minimizebutton getMinimizebutton1() {
        return minimizebutton1;
    }

    public JLabel getNamaLabel() {
        return namaLabel;
    }

    public void setNamaLabel(JLabel namaLabel) {
        this.namaLabel = namaLabel;
    }

    /**
     * @return the navbarButton1
     */
    public sp.panelcomponent.NavbarButton getNavbarButton1() {
        return navbarButton1;
    }

    /**
     * @return the updateQuest1
     */
    public sp.panelcomponent.UpdateQuest getUpdateQuest1() {
        return updateQuest1;
    }

    /**
     * @return the EntryListing
     */
    public sp.panelcomponent.DataEntryListing getEntryListing() {
        return EntryListing;
    }

    /**
     * @return the EntryQuest
     */
    public sp.panelcomponent.DataEntryQuest getEntryQuest() {
        return EntryQuest;
    }

    /**
     * @return the menuListing
     */
   

    /**
     * @return the menuQuest
     */
    public sp.panelcomponent.Menu getMenuQuest() {
        return menuQuest;
    }

    /**
     * @return the updateListing1
     */
    

    /**
     * @return the nimLabel
     */
    public javax.swing.JLabel getNimLabel() {
        return namaLabel;
    }

    /**
     * @return the menuListing
     */
    public sp.panelcomponent.MenuListing getMenuListing() {
        return menuListing;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.panelcomponent;

import javax.swing.JTable;
import javax.swing.table.TableColumn;
import sp.model.TableUpdateModel;

/**
 *
 * @author HP
 */
public class TableUpdate extends javax.swing.JPanel {

    /**
     * Creates new form TableUpdate
     */
    TableUpdateModel model;

    public TableUpdate() {
        initComponents();
        model = new TableUpdateModel();
        jScrollPane1.getViewport().setOpaque(false);
        setOpaque(false);
        tabelUpdate.setOpaque(false);
        setLebarKolom();
    }

    public void setLebarKolom() {
        TableColumn column;
        this.tabelUpdate.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = this.tabelUpdate.getColumnModel().getColumn(0);
        column.setPreferredWidth(150);
        column = this.tabelUpdate.getColumnModel().getColumn(1);
        column.setPreferredWidth(150);
        column = this.tabelUpdate.getColumnModel().getColumn(2);
        column.setPreferredWidth(150);
        column = this.tabelUpdate.getColumnModel().getColumn(3);
        column.setPreferredWidth(50);
    }

    public TableUpdateModel getModel() {
        return model;
    }

    public void setModel(TableUpdateModel model) {
        this.model = model;
    }

    public JTable getTabelUpdate() {
        return tabelUpdate;
    }

    public void setTabelUpdate(JTable tabelUpdate) {
        this.tabelUpdate = tabelUpdate;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUpdate = new javax.swing.JTable();

        sp.model.TableUpdateModel model = new sp.model.TableUpdateModel();
        tabelUpdate.setModel(model);
        jScrollPane1.setViewportView(tabelUpdate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelUpdate;
    // End of variables declaration//GEN-END:variables
}

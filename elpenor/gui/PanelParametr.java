/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelParametr.java
 *
 * Created on 2011-11-13, 21:35:28
 */

package elpenor.gui;

import javax.swing.JLabel;
import javax.swing.JSpinner;

/**
 *
 * @author darian
 */
public class PanelParametr extends javax.swing.JPanel {

    /** Creates new form PanelParametr */
    public PanelParametr() {
        initComponents();
        this.setVisible(true);
    }

    public PanelParametr(String nazwaParametru, int wartośćParametru)
    {
        initComponents();
        this.nazwaParametru.setText(nazwaParametru);
        this.wartośćParametru.setValue(wartośćParametru);
    }

    public int podajWartość()
    {
        return (Integer)this.wartośćParametru.getValue();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nazwaParametru = new javax.swing.JLabel();
        wartośćParametru = new javax.swing.JSpinner();

        nazwaParametru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nazwaParametru.setText("parametr");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nazwaParametru, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wartośćParametru, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nazwaParametru)
                .addComponent(wartośćParametru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nazwaParametru;
    private javax.swing.JSpinner wartośćParametru;
    // End of variables declaration//GEN-END:variables

}
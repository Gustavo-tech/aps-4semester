package view;

import java.awt.Dimension;
import java.beans.PropertyVetoException;

public class About extends javax.swing.JInternalFrame {

    public About() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAbout = new javax.swing.JLabel();
        buttonClose = new javax.swing.JButton();

        labelAbout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAbout.setText("Livraria Amazônia:");

        buttonClose.setText("Fechar");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(buttonClose)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAbout)
                .addGap(201, 201, 201)
                .addComponent(buttonClose)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonCloseActionPerformed

    public void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClose;
    private javax.swing.JLabel labelAbout;
    // End of variables declaration//GEN-END:variables
}

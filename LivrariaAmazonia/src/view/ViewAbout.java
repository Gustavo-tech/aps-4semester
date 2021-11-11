package view;

import java.awt.Dimension;
import java.beans.PropertyVetoException;

public class ViewAbout extends javax.swing.JInternalFrame {

    public ViewAbout() {
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

        buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-exit.png"))); // NOI18N
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
                .addContainerGap()
                .addComponent(labelAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(buttonClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAbout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(buttonClose)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // fecha a janela atual
    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonCloseActionPerformed

    // coloca a janela atual na posição central do programa
    public void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClose;
    private javax.swing.JLabel labelAbout;
    // End of variables declaration//GEN-END:variables
}

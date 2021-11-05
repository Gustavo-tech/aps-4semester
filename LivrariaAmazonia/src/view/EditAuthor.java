package view;

import java.awt.Dimension;
import java.beans.PropertyVetoException;

public class EditAuthor extends javax.swing.JInternalFrame {

    protected EditAuthor() {
        initComponents();
        buttonEdit.setEnabled(false);
        textEdit.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEdit = new javax.swing.JLabel();
        panelEdit = new javax.swing.JPanel();
        buttonEdit = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        textEdit = new javax.swing.JTextField();
        comboSelect = new javax.swing.JComboBox<>();

        labelEdit.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        labelEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEdit.setText("Editar autor");

        panelEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonEdit.setText("Editar");
        buttonEdit.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonEdit.setPreferredSize(new java.awt.Dimension(134, 22));

        buttonCancel.setText("Cancelar");
        buttonCancel.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonCancel.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        textEdit.setToolTipText("");
        textEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textEditKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textEditKeyTyped(evt);
            }
        });

        comboSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o que deseja editar:", "Nome", "Sobrenome" }));
        comboSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditLayout = new javax.swing.GroupLayout(panelEdit);
        panelEdit.setLayout(panelEditLayout);
        panelEditLayout.setHorizontalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textEdit)
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addComponent(buttonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                    .addComponent(comboSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEditLayout.setVerticalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // EVENTS
    
    // quando é clicado em "Cancelar", fecha a janela interna "Editar livro"
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonCancelActionPerformed

    // quando uma tecla é solta no "textEdit", chama o método verifyEdit() 
    private void textEditKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEditKeyReleased
        verifyEdit();
    }//GEN-LAST:event_textEditKeyReleased

    /* quando acontece uma ação no "comboSelect", chama o método verifyEdit() 
       caso o usuário escolha uma opção, habilitar o "textEdit"
       caso o usuário selecione a opção 0, limpa e desabilita o "textEdit" */
    private void comboSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectActionPerformed
        int combo = comboSelect.getSelectedIndex();
        
        verifyEdit();
        
        if (combo != 0) {
            textEdit.setEnabled(true);
        } else {
            textEdit.setText("");
            textEdit.setEnabled(false);
        }
    }//GEN-LAST:event_comboSelectActionPerformed

    //
    private void textEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEditKeyTyped
        String isbn="0123456789";
        String preco="0123456789,";
        int combo = comboSelect.getSelectedIndex();
        
        // quando estiver na opção de "ISBN", só aceita números
        if(combo == 4 && !isbn.contains(evt.getKeyChar()+"")){ 
            evt.consume();
        }
        
        // quando estiver na opção de "Preço" só aceita números e vírgula
        if (combo == 5 && !preco.contains(evt.getKeyChar()+"")) { // ainda ta deixando 2 virgulas, preciso arrumar, depois converter a vírgula para ponto pra mandar pro bd
            evt.consume();
        }
    }//GEN-LAST:event_textEditKeyTyped

    
    // NOT EVENTS
    
    // define a posição da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }

    /* verifica se existe texto no "textEdit" e se alguma opção foi selecionada no "comboSelect"
       caso sim: habilita o botão "Editar"
       caso não: desabilita o botão "Editar" */
    private void verifyEdit() {
        String text = textEdit.getText();
        int combo = comboSelect.getSelectedIndex();
        
        if (text.isBlank() || combo == 0) {
            buttonEdit.setEnabled(false);
        } else {
            buttonEdit.setEnabled(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JComboBox<String> comboSelect;
    private javax.swing.JLabel labelEdit;
    private javax.swing.JPanel panelEdit;
    private javax.swing.JTextField textEdit;
    // End of variables declaration//GEN-END:variables
}

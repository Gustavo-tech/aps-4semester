package view;

import controller.ControllerView;
import model.dao.AuthorDAO;
import model.bean.Author;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ViewEditAuthor extends javax.swing.JInternalFrame {
  
    public ViewEditAuthor() {
        initComponents();
        buttonSave.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAdd = new javax.swing.JLabel();
        panelAdd = new javax.swing.JPanel();
        buttonSave = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textLastName = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(421, 192));

        labelAdd.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        labelAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdd.setText("Editar autor");

        panelAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonSave.setText("Salvar");
        buttonSave.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonSave.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancelar");
        buttonCancel.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonCancel.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelName.setText("Nome:");

        labelLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelLastName.setText("Sobrenome:");

        textName.setToolTipText("");
        textName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNameKeyReleased(evt);
            }
        });

        textLastName.setToolTipText("");
        textLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textLastNameKeyReleased(evt);
            }
        });

        labelId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelId.setText("ID:");

        textId.setToolTipText("");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelName)
                            .addComponent(labelLastName)
                            .addComponent(labelId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textId)
                            .addComponent(textName)
                            .addComponent(textLastName))))
                .addContainerGap())
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textId)
                    .addComponent(labelId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textName)
                    .addComponent(labelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLastName)
                    .addComponent(labelLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(labelAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(panelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // quando é clicado em "Cancelar" , fecha a janela interna "Adicionar livro"
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        closeWindow();
    }//GEN-LAST:event_buttonCancelActionPerformed

    // quando uma tecla é solta no "textTitle", chama o método verifyText() 
    private void textNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameKeyReleased
        verifyText();
    }//GEN-LAST:event_textNameKeyReleased

    // quando uma tecla é solta no "textAuthor", chama o método verifyText() 
    private void textLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLastNameKeyReleased
        verifyText();
    }//GEN-LAST:event_textLastNameKeyReleased

    // atualiza o autor selecionado no banco de dados
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        String name = textName.getText();
        String lastName = textLastName.getText();
        Integer id = ((int) ViewAuthor.tableAuthor.getValueAt(ViewAuthor.tableAuthor.getSelectedRow(), 0));
        
        Author author = new Author(id, name, lastName);
        AuthorDAO.updateAuthor(author);
        
        Object[] options = { "Ok" };
        Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("../images/icon-done.png"))); 
        JOptionPane.showOptionDialog(null, "Autor(a) atualizado!", "Editar autor(a)", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, figura, options, options[0]);
        closeWindow();
        ControllerView.readTableAuthor();
        ViewAuthor.buttonEdit.setEnabled(false);
        ViewAuthor.buttonDelete.setEnabled(false);
    }//GEN-LAST:event_buttonSaveActionPerformed

    // fecha a janela atual
    private void closeWindow() {
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }
    
    // define a posição da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    /* verifica se existe texto nos campos "Título", "Autor", "Editora", "ISBN" e "Preço"
       caso todos tenham texto: habilita o botão "Adicionar"
       caso não: desabilita o botão "Adicionar" */
    private void verifyText() {
        String textT = textName.getText();
        String textA = textLastName.getText();
        
        if (textT.isBlank() || textA.isBlank()) {
            buttonSave.setEnabled(false);
        } else {
            buttonSave.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel labelAdd;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelName;
    private javax.swing.JPanel panelAdd;
    protected javax.swing.JTextField textId;
    protected javax.swing.JTextField textLastName;
    protected javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}

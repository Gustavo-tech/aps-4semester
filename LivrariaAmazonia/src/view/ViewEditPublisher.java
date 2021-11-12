package view;

import controller.ControllerView;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.bean.Publisher;
import model.dao.PublisherDAO;

public class ViewEditPublisher extends javax.swing.JInternalFrame {
        
    public ViewEditPublisher() {
        initComponents();
        buttonSave.setEnabled(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAdd = new javax.swing.JPanel();
        buttonSave = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        labelUrl = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textUrl = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Editar Editora");
        setMinimumSize(new java.awt.Dimension(421, 192));

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

        labelUrl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUrl.setText("URL:");

        textName.setToolTipText("Digite o nome da editora");
        textName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNameKeyTyped(evt);
            }
        });

        textUrl.setToolTipText("Digite a URL (website) da editora");
        textUrl.setName(""); // NOI18N
        textUrl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textUrlKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textUrlKeyTyped(evt);
            }
        });

        labelId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelId.setText("ID:");

        textId.setToolTipText("ID da editora (não editável)");

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
                            .addComponent(labelUrl)
                            .addComponent(labelId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textId)
                            .addComponent(textName)
                            .addComponent(textUrl))))
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
                    .addComponent(textUrl)
                    .addComponent(labelUrl))
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
                .addComponent(panelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
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
    private void textUrlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUrlKeyReleased
        verifyText();
    }//GEN-LAST:event_textUrlKeyReleased

    // adiciona um novo autor no banco de dados
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        String name = textName.getText();
        String url = textUrl.getText();
        Integer publisherId = ((int) ViewPublisher.tablePublisher.getValueAt(ViewPublisher.tablePublisher.getSelectedRow(), 0));
        
        Publisher publisher = new Publisher(publisherId, name, url);
        PublisherDAO.updatePublisher(publisher);
        
        Object[] options = { "Ok" };
        Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("../images/icon-done.png"))); 
        JOptionPane.showOptionDialog(null, "Editora atualizada!", "Editar editora", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, figura, options, options[0]);
        closeWindow();
        ControllerView.readTablePublisher();
        ViewPublisher.buttonEdit.setEnabled(false);
        ViewPublisher.buttonDelete.setEnabled(false);
    }//GEN-LAST:event_buttonSaveActionPerformed

    // limita a quantidade de caracteres em "Nome" para 30
    private void textNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameKeyTyped
        if ((textName.getText() + evt.getKeyChar()).length() > 30) {
            evt.consume();
        }
    }//GEN-LAST:event_textNameKeyTyped

    // limita a quantidade de caracteres em "URL" para 80 e proíbe espaço
    private void textUrlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUrlKeyTyped
        char c = evt.getKeyChar();
        if (((textUrl.getText() + c).length() > 80) || c == KeyEvent.VK_SPACE) {
            evt.consume();
        }  
    }//GEN-LAST:event_textUrlKeyTyped

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
        String textA = textUrl.getText();
        
        if (textT.isBlank() || textA.isBlank()) {
            buttonSave.setEnabled(false);
        } else {
            buttonSave.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelUrl;
    private javax.swing.JPanel panelAdd;
    protected javax.swing.JTextField textId;
    protected javax.swing.JTextField textName;
    protected javax.swing.JTextField textUrl;
    // End of variables declaration//GEN-END:variables
}

package view;

import controller.ControllerView;
import model.dao.AuthorDAO;
import model.bean.Author;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ViewAddAuthor extends javax.swing.JInternalFrame {

    public ViewAddAuthor() {
        initComponents();
        buttonAdd.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAdd = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textLastName = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Adicionar Autor");
        setMinimumSize(new java.awt.Dimension(421, 192));

        panelAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonAdd.setText("Adicionar");
        buttonAdd.setMaximumSize(null);
        buttonAdd.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonAdd.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
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

        textName.setToolTipText("Digite o nome do autor");
        textName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNameKeyTyped(evt);
            }
        });

        textLastName.setToolTipText("Digite o último nome do autor");
        textLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textLastNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textLastNameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelLastName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textName)
                            .addComponent(textLastName))))
                .addContainerGap())
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textName)
                    .addComponent(labelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLastName)
                    .addComponent(labelLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    // adiciona um novo autor no banco de dados
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        String name = textName.getText();
        String lastName = textLastName.getText();
        
        Author author = new Author(name, lastName);
        AuthorDAO.addAuthor(author);
        
        try {
            ControllerView.readTableAuthor();
            ViewAuthor.buttonEdit.setEnabled(false);
            ViewAuthor.buttonDelete.setEnabled(false);
            ViewAddBook.comboBoxAuthor.addItem(author.toString());
        } catch (NullPointerException ignored) {}
        
        Object[] options = { "Sim", "Não" };
        Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("../images/icon-done.png"))); 
        int option = JOptionPane.showOptionDialog(null, "Autor(a) adicionado.\nGostaria de adicionar mais?", "Adicionar autor(a)", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, figura, options, options[1]);
        
        if (option == 1) {
            closeWindow();
        } else if (option == 0) {
            textName.setText("");
            textLastName.setText("");
        }
    }//GEN-LAST:event_buttonAddActionPerformed
    
    // limita a quantidade de caracteres em "Nome" para 25 e não permite espaço
    private void textNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameKeyTyped
        char c = evt.getKeyChar();
        if (((textName.getText() + c).length() > 25) || c == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_textNameKeyTyped

    // limita a quantidade de caracteres em "Sobrenome" para 25 e não permite espaço
    private void textLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLastNameKeyTyped
        char c = evt.getKeyChar();
        if (((textLastName.getText() + c).length() > 25) || c == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_textLastNameKeyTyped

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
            buttonAdd.setEnabled(false);
        } else {
            buttonAdd.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelName;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}

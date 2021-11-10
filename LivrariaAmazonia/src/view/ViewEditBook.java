package view;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.bean.*;
import model.dao.*;
import static view.ViewLivrariaAmazonia.desktopAmazonia;

public class ViewEditBook extends javax.swing.JInternalFrame {

    protected ViewEditBook() {
        initComponents();
        buttonSave.setEnabled(false);
        getComboAuthor();
        getComboPublisher();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEdit = new javax.swing.JLabel();
        panelAdd = new javax.swing.JPanel();
        buttonSave = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        labelAuthor = new javax.swing.JLabel();
        labelPublisher = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        labelIsbn = new javax.swing.JLabel();
        textTitle = new javax.swing.JTextField();
        textPrice = new javax.swing.JTextField();
        textIsbn = new javax.swing.JTextField();
        comboBoxAuthor = new javax.swing.JComboBox<>();
        comboBoxPublisher = new javax.swing.JComboBox<>();
        buttonAddAuthor = new javax.swing.JButton();
        buttonAddPublisher = new javax.swing.JButton();
        labelSequence = new javax.swing.JLabel();
        textSequence = new javax.swing.JTextField();

        labelEdit.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        labelEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEdit.setText("Editar livro");

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

        labelTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTitle.setText("Título:");

        labelAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelAuthor.setText("Autor:");

        labelPublisher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPublisher.setText("Editora:");

        labelPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPrice.setText("Preço:");

        labelIsbn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelIsbn.setText("ISBN:");

        textTitle.setToolTipText("");
        textTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textTitleKeyReleased(evt);
            }
        });

        textPrice.setToolTipText("");
        textPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPriceKeyReleased(evt);
            }
        });

        textIsbn.setToolTipText("");
        textIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textIsbnKeyReleased(evt);
            }
        });

        comboBoxAuthor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um autor(a)" }));

        comboBoxPublisher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma editora" }));

        buttonAddAuthor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAddAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-add-book.png"))); // NOI18N
        buttonAddAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddAuthorActionPerformed(evt);
            }
        });

        buttonAddPublisher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAddPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-add-book.png"))); // NOI18N
        buttonAddPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddPublisherActionPerformed(evt);
            }
        });

        labelSequence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSequence.setText("Seq. n°:");

        textSequence.setToolTipText("");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelAuthor, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(labelPublisher))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxAuthor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxPublisher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonAddAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonAddPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelIsbn)
                            .addComponent(labelPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textIsbn)
                            .addComponent(textPrice)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelSequence)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSequence, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTitle)
                    .addComponent(labelTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSequence)
                    .addComponent(labelSequence))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAuthor)
                    .addComponent(comboBoxAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddAuthor))
                .addGap(13, 13, 13)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPublisher)
                    .addComponent(comboBoxPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddPublisher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIsbn)
                    .addComponent(labelIsbn))
                .addGap(13, 13, 13)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPrice)
                    .addComponent(labelPrice))
                .addGap(13, 13, 13)
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
                    .addComponent(labelEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // EVENTS
    
    // quando é clicado em "Cancelar" , fecha a janela interna "Adicionar livro"
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        closeWindow();
    }//GEN-LAST:event_buttonCancelActionPerformed

    // quando uma tecla é solta no "textTitle", chama o método verifyText() 
    private void textTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTitleKeyReleased
        verifyText();
    }//GEN-LAST:event_textTitleKeyReleased

    // quando uma tecla é solta no "textPrice", chama o método verifyText() 
    private void textPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPriceKeyReleased
        verifyText();
    }//GEN-LAST:event_textPriceKeyReleased

    // quando uma tecla é solta no "textIsbn", chama o método verifyText() 
    private void textIsbnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIsbnKeyReleased
        verifyText();
    }//GEN-LAST:event_textIsbnKeyReleased

    // adiciona um novo livro no banco de dados
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
//        String title = textTitle.getText();
//        String isbn = textIsbn.getText();
//        Integer publisherId = PublisherDAO.getPublisherId((String) comboBoxPublisher.getModel().getSelectedItem());
//        Double price = setToDouble(textPrice.getText());
//        
//        Book book = new Book(title, isbn, publisherId, price);
//        BookDAO.updateBook(book);
//        
//        Object[] options = { "Sim", "Não" };
//        Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("../images/icon-done.png"))); 
//        int option = JOptionPane.showOptionDialog(null, "Autor(a) adicionado.\nGostaria de adicionar mais?", "Adicionar autor(a)", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, figura, options, options[1]);
//        
//        if (option == 1) {
//            closeWindow();
//        } else if (option == 0) {
//            textTitle.setText("");
//            textIsbn.setText("");
//            textPrice.setText("");
//            comboBoxAuthor.setSelectedItem(0);
//            comboBoxPublisher.setSelectedItem(0);
//        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    // chama a janela de adicionar autor
    private void buttonAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddAuthorActionPerformed
        ViewAddAuthor viewAddAuthor = new ViewAddAuthor();
        desktopAmazonia.add(viewAddAuthor);
        viewAddAuthor.setVisible(true);
        viewAddAuthor.setPositionCenter();
    }//GEN-LAST:event_buttonAddAuthorActionPerformed

    // chama a janela de adicionar editora
    private void buttonAddPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPublisherActionPerformed
        ViewAddPublisher viewAddPublisher = new  ViewAddPublisher();
        desktopAmazonia.add(viewAddPublisher);
        viewAddPublisher.setVisible(true);
        viewAddPublisher.setPositionCenter();
    }//GEN-LAST:event_buttonAddPublisherActionPerformed

    // NOT EVENTS
    
    // fecha a janela atual
    private void closeWindow() {
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }
    
    // coloca os autores no "comboBoxAuthor"
    private void getComboAuthor() {
        AuthorDAO dao = new AuthorDAO();
        for (Author author: dao.getAuthors()) {
            comboBoxAuthor.addItem(author.toString());
        }
    }
    
    // coloca os autores no "comboBoxPublisher"
    private void getComboPublisher() {
        PublisherDAO dao = new PublisherDAO();
        for (Publisher publisher: dao.getPublishers()) {
            comboBoxPublisher.addItem(publisher.toString());
        }
    }
    
    // tira vírgula do double e ajusta para o bd
    private Double setToDouble(String value) {
        value = value.replace(".","");
        value = value.replace(',', '.');
        Double valueDouble = Double.parseDouble(value);
        
        return valueDouble;
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
        String textT = textTitle.getText();
        String textI = textIsbn.getText();
        String textPr = textPrice.getText();
        String textS = textSequence.getText();
        
        if (textT.isBlank() || textI.isBlank() || textPr.isBlank() || textS.isBlank()) {
            buttonSave.setEnabled(false);
        } else {
            buttonSave.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddAuthor;
    private javax.swing.JButton buttonAddPublisher;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    protected javax.swing.JComboBox<Object> comboBoxAuthor;
    protected javax.swing.JComboBox<Object> comboBoxPublisher;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JLabel labelEdit;
    private javax.swing.JLabel labelIsbn;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelPublisher;
    private javax.swing.JLabel labelSequence;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelAdd;
    protected javax.swing.JTextField textIsbn;
    protected javax.swing.JTextField textPrice;
    protected javax.swing.JTextField textSequence;
    protected javax.swing.JTextField textTitle;
    // End of variables declaration//GEN-END:variables
}

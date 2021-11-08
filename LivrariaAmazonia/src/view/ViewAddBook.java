package view;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.bean.*;
import model.dao.*;
import static view.ViewLivrariaAmazonia.desktopAmazonia;

public class ViewAddBook extends javax.swing.JInternalFrame {

    protected ViewAddBook() {
        initComponents();
        buttonAdd.setEnabled(false);
        getComboAuthor();
        getComboPublisher();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAdd = new javax.swing.JLabel();
        panelAdd = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
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

        labelAdd.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        labelAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdd.setText("Adicionar livro");

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
        comboBoxPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPublisherActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(textPrice))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(15, Short.MAX_VALUE))
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
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        String title = textTitle.getText();
        String isbn = textIsbn.getText();
        // String author = comboBoxAuthor.getSelectedItem().toString();
        
        String priceString = textPrice.getText();
        priceString = priceString.replace(".","");
        priceString = priceString.replace(',', '.');
        Double price = Double.parseDouble(priceString);
        Integer publisherId = null;
        
        Book book = new Book(title, isbn, publisherId, price);
        BookDAO.addBook(book);
        
        Object[] options = { "Sim", "Não" };
        Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("../images/icon-done.png"))); 
        int option = JOptionPane.showOptionDialog(null, "Autor(a) adicionado.\nGostaria de adicionar mais?", "Adicionar autor(a)", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, figura, options, options[1]);
        
        if (option == 1) {
            closeWindow();
        } else if (option == 0) {
            textTitle.setText("");
            textIsbn.setText("");
            textPrice.setText("");
            comboBoxAuthor.setSelectedItem(0);
            comboBoxPublisher.setSelectedItem(0);
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddAuthorActionPerformed
        ViewAddAuthor viewAddAuthor = new ViewAddAuthor();
        desktopAmazonia.add(viewAddAuthor);
        viewAddAuthor.setVisible(true);
        viewAddAuthor.setPositionCenter();
    }//GEN-LAST:event_buttonAddAuthorActionPerformed

    private void buttonAddPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPublisherActionPerformed
        ViewAddPublisher viewAddPublisher = new  ViewAddPublisher();
        desktopAmazonia.add(viewAddPublisher);
        viewAddPublisher.setVisible(true);
        viewAddPublisher.setPositionCenter();
    }//GEN-LAST:event_buttonAddPublisherActionPerformed

    private void comboBoxPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPublisherActionPerformed
        Publisher selectedPublisher = (Publisher) comboBoxPublisher.getModel().getSelectedItem();
        
        System.out.println(selectedPublisher.getName());
    }//GEN-LAST:event_comboBoxPublisherActionPerformed

    
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
        
        if (textT.isBlank() || textI.isBlank() || textPr.isBlank()) {
            buttonAdd.setEnabled(false);
        } else {
            buttonAdd.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAddAuthor;
    private javax.swing.JButton buttonAddPublisher;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JComboBox<Object> comboBoxAuthor;
    private javax.swing.JComboBox<Object> comboBoxPublisher;
    private javax.swing.JLabel labelAdd;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JLabel labelIsbn;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelPublisher;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JTextField textIsbn;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textTitle;
    // End of variables declaration//GEN-END:variables
}

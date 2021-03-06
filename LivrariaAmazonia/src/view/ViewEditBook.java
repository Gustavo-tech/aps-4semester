package view;

import controller.ControllerView;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import model.bean.*;
import model.dao.*;

public class ViewEditBook extends javax.swing.JInternalFrame {

    protected ViewEditBook() {
        initComponents();
        buttonSave.setEnabled(false);
        textIsbn.setEnabled(false);
        ControllerView.updateEditComboAuthor();
        ControllerView.updateEditComboPublisher();
        addInternalFrameListener(new InternalFrameAdapter(){
            public void internalFrameClosing(InternalFrameEvent e) {
                ViewBook.editBookIsOpen = false;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setClosable(true);
        setTitle("Editar Livro");

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
        labelTitle.setText("T??tulo:");

        labelAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelAuthor.setText("Autor:");

        labelPublisher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPublisher.setText("Editora:");

        labelPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPrice.setText("Pre??o:");

        labelIsbn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelIsbn.setText("ISBN:");

        textTitle.setToolTipText("Digite o t??tulo do livro");
        textTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textTitleKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTitleKeyTyped(evt);
            }
        });

        textPrice.setToolTipText("Digite o valor do livro. Exemplo: 32.99");
        textPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPriceKeyTyped(evt);
            }
        });

        textIsbn.setToolTipText("ISBN do livro (n??o edit??vel, para alterar ?? necess??rio excluir e adicionar novamente)");

        comboBoxAuthor.setToolTipText("Selecione o autor(a)");
        comboBoxAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAuthorActionPerformed(evt);
            }
        });

        comboBoxPublisher.setToolTipText("Selecione a editora");
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

        labelSequence.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSequence.setText("Seq. n??:");

        textSequence.setToolTipText("Digite a sequ??ncia do livro, caso n??o seja de uma cole????o, digite 1");
        textSequence.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSequenceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSequenceKeyTyped(evt);
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
                            .addComponent(textIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
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

    // quando ?? clicado em "Cancelar" , fecha a janela interna "Adicionar livro"
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        try {
            this.setClosed(true);
            ViewBook.editBookIsOpen = false;
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonCancelActionPerformed

    // quando uma tecla ?? solta no "textTitle", chama o m??todo verifyText() 
    private void textTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTitleKeyReleased
        verifyText();
    }//GEN-LAST:event_textTitleKeyReleased

    // quando uma tecla ?? solta no "textPrice", chama o m??todo verifyText() 
    private void textPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPriceKeyReleased
        verifyText();
    }//GEN-LAST:event_textPriceKeyReleased

    // edita um livro no banco de dados
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        String title = textTitle.getText();
        String isbn = textIsbn.getText();
        Integer publisherId = PublisherDAO.getPublisherId((String) comboBoxPublisher.getModel().getSelectedItem());
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        Double price = Double.parseDouble(textPrice.getText());
        df.format(price);
        
        Book book = new Book(title, isbn, publisherId, price);
        BookDAO.updateBook(book);
        
        Object[] options = { "Ok" };
        Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("../images/icon-done.png"))); 
        int option = JOptionPane.showOptionDialog(null, "Livro atualizado!", "Editar livro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, figura, options, options[0]);
        
        if (option == -1) {
            try {
                this.setClosed(true);
            } catch (PropertyVetoException ex) {
                System.err.println("Closing Exception");
            }
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    // chama a janela de adicionar autor, limitando para 1 janela dessa aberta
    private void buttonAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddAuthorActionPerformed
        if (!ViewAuthor.addAuthorIsOpen) {
            ViewAddAuthor viewAddAuthor = new ViewAddAuthor();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewAddAuthor);
            viewAddAuthor.setVisible(true);
            viewAddAuthor.setPositionCenter();
            ViewAuthor.addAuthorIsOpen = true;
        }
    }//GEN-LAST:event_buttonAddAuthorActionPerformed

    // chama a janela de adicionar editora, limitando para 1 janela dessa aberta
    private void buttonAddPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPublisherActionPerformed
        if (!ViewPublisher.addPublisherIsOpen) {
            ViewAddPublisher viewAddPublisher = new  ViewAddPublisher();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewAddPublisher);
            viewAddPublisher.setVisible(true);
            viewAddPublisher.setPositionCenter();
            ViewPublisher.addPublisherIsOpen = true;
        }
    }//GEN-LAST:event_buttonAddPublisherActionPerformed

    // quando uma tecla ?? solta no "Seq. N", chama o m??todo verifyText()
    private void textSequenceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSequenceKeyReleased
        verifyText();
    }//GEN-LAST:event_textSequenceKeyReleased

    // quando ?? clicado em "Autor(a)", chama o m??todo verifyText()
    private void comboBoxAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAuthorActionPerformed
        verifyText();
    }//GEN-LAST:event_comboBoxAuthorActionPerformed

    // quando ?? clicado em "Editora", chama o m??todo verifyText()
    private void comboBoxPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPublisherActionPerformed
        verifyText();
    }//GEN-LAST:event_comboBoxPublisherActionPerformed

    // limita a quantidade de caracteres em "T??tulo" para 60
    private void textTitleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTitleKeyTyped
        if ((textTitle.getText() + evt.getKeyChar()).length() > 60) {
            evt.consume();
        }
    }//GEN-LAST:event_textTitleKeyTyped

    // limita a quantidade de caracteres em "Seq No." para 11, pro??be espa??o e aceita s?? n??meros
    private void textSequenceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSequenceKeyTyped
        char c = evt.getKeyChar();
        if (((textSequence.getText() + c).length() > 11) || c == KeyEvent.VK_SPACE || !Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_textSequenceKeyTyped

    // limita a quantidade de caracteres em "Pre??o" para 11, para 11, pro??be espa??o e s?? aceita n??meros decimais
    private void textPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPriceKeyTyped
        char c = evt.getKeyChar();
        String text = textPrice.getText();
        if (((text + c).length() > 11) || c == KeyEvent.VK_SPACE || Character.isLetter(c)) {
            evt.consume();
        } else {
            try {
                Double.parseDouble(text + c);
            } catch(NumberFormatException e) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_textPriceKeyTyped

    // define a posi????o da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    /* verifica se existe texto nos campos "T??tulo", "Autor", "Editora", "ISBN" e "Pre??o"
       caso todos tenham texto: habilita o bot??o "Adicionar"
       caso n??o: desabilita o bot??o "Adicionar" */
    private void verifyText() {
        String textT = textTitle.getText();
        String textI = textIsbn.getText();
        String textPr = textPrice.getText();
        String textS = textSequence.getText();
        int comboA = comboBoxAuthor.getSelectedIndex();
        int comboP = comboBoxPublisher.getSelectedIndex();
        
        if (textT.isBlank() || textI.isBlank() || textPr.isBlank() || textS.isBlank() || comboA == 0 || comboP == 0) {
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
    public static javax.swing.JComboBox<Object> comboBoxAuthor;
    public static javax.swing.JComboBox<Object> comboBoxPublisher;
    private javax.swing.JLabel labelAuthor;
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

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
import model.bean.*;
import model.dao.*;

public class ViewAddBook extends javax.swing.JInternalFrame {

    protected ViewAddBook() {
        initComponents();
        buttonAdd.setEnabled(false);
        ControllerView.updateAddComboAuthor();
        ControllerView.updateAddComboPublisher();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        labelSequence = new javax.swing.JLabel();
        textSequence = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Adicionar Livro");

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

        textTitle.setToolTipText("Digite o título do livro");
        textTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textTitleKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTitleKeyTyped(evt);
            }
        });

        textPrice.setToolTipText("Digite o valor do livro. Exemplo: 32,99");
        textPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPriceKeyTyped(evt);
            }
        });

        textIsbn.setToolTipText("Digite o ISBN do livro (ATENÇÃO: para editar posteriormente, deverá excluir o livro)");
        textIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textIsbnKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIsbnKeyTyped(evt);
            }
        });

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
        labelSequence.setText("Seq. n°:");

        textSequence.setToolTipText("Digite a sequência do livro, caso não seja de uma coleção, digite 1");
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
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(labelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSequence)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSequence, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(labelAuthor))
                                    .addComponent(labelPublisher))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxAuthor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxPublisher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonAddAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonAddPublisher)))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelIsbn)
                                    .addComponent(labelPrice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textIsbn)
                                    .addComponent(textPrice))))))
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
                .addGap(12, 12, 12)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIsbn)
                    .addComponent(labelIsbn))
                .addGap(13, 13, 13)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPrice)
                    .addComponent(labelPrice))
                .addGap(18, 18, 18)
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
    private void textTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTitleKeyReleased
        verifyText();
    }//GEN-LAST:event_textTitleKeyReleased

    // quando uma tecla é solta no "textPrice", chama o método verifyText() 
    private void textPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPriceKeyReleased
        verifyText();
    }//GEN-LAST:event_textPriceKeyReleased

    // adiciona um novo livro e autor de livro no banco de dados
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        
        // pegando titulo, isbn, sequencia, preço e id(editora)
        String title = textTitle.getText();
        String isbn = textIsbn.getText();
        Integer seqNo = Integer.parseInt(textSequence.getText());
        Double price = Double.parseDouble(textPrice.getText());
        df.format(price);
        Integer publisherId = PublisherDAO.getPublisherId((String) comboBoxPublisher.getModel().getSelectedItem());
        
        // pegando o id do autor, a partir do nome e sobrenome
        String name = ControllerView.splitAuthor((String) comboBoxAuthor.getModel().getSelectedItem(), 0);
        String fname = ControllerView.splitAuthor((String) comboBoxAuthor.getModel().getSelectedItem(), 1);
        Integer authorId = AuthorDAO.getAuthorId(name, fname);

        // adicionando o livro e o autor do livro
        Book book = new Book(title, isbn, publisherId, price);
        BookDAO.addBook(book);
        BookAuthor bookAuthor = new BookAuthor(isbn, authorId, seqNo);
        BookAuthorDAO.addBookAuthor(bookAuthor);
        
        // atualizando a tabela da tela de livros
        ControllerView.readTableBook();
        
        // chamando a janela de opções para saber se o usuário quer adicionar mais livros
        Object[] options = { "Sim", "Não" };
        Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("../images/icon-done.png"))); 
        int option = JOptionPane.showOptionDialog(null, "Livro adicionado.\nGostaria de adicionar mais?", "Adicionar livro", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, figura, options, options[1]);
        
        if (option == 1) {
            closeWindow();
        } else if (option == 0) {
            textTitle.setText("");
            textIsbn.setText("");
            textPrice.setText("");
            textSequence.setText("");
            comboBoxAuthor.setSelectedItem(0);
            comboBoxPublisher.setSelectedItem(0);
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    // chama a janela interna para adicionar um novo autor
    private void buttonAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddAuthorActionPerformed
        ViewAddAuthor viewAddAuthor = new ViewAddAuthor();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewAddAuthor);
        viewAddAuthor.setVisible(true);
        viewAddAuthor.setPositionCenter();
    }//GEN-LAST:event_buttonAddAuthorActionPerformed

    // chama a janela interna para adicionar uma nova editora
    private void buttonAddPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPublisherActionPerformed
        ViewAddPublisher viewAddPublisher = new  ViewAddPublisher();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewAddPublisher);
        viewAddPublisher.setVisible(true);
        viewAddPublisher.setPositionCenter();
    }//GEN-LAST:event_buttonAddPublisherActionPerformed

    // quando uma tecla é solta no "Seq. N", chama o método verifyText() 
    private void textSequenceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSequenceKeyReleased
        verifyText();
    }//GEN-LAST:event_textSequenceKeyReleased

    // quando um autor(a) é selecionado, chama o método verifyText() 
    private void comboBoxAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAuthorActionPerformed
        verifyText();
    }//GEN-LAST:event_comboBoxAuthorActionPerformed

    // quando uma editora é selecionado, chama o método verifyText() 
    private void comboBoxPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPublisherActionPerformed
        verifyText();
    }//GEN-LAST:event_comboBoxPublisherActionPerformed

    // limita a quantidade de caracteres em "ISBN" para 13 e proíbe espaço
    private void textIsbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIsbnKeyTyped
        char c = evt.getKeyChar();
        if (((textIsbn.getText() + c).length() > 13) || c == KeyEvent.VK_SPACE) {
            evt.consume();
        } 
    }//GEN-LAST:event_textIsbnKeyTyped
    
    // quando uma tecla é solta no "ISBN", chama o método verifyText()
    private void textIsbnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIsbnKeyReleased
        verifyText();
    }//GEN-LAST:event_textIsbnKeyReleased
    
    // limita a quantidade de caracteres em "Título" para 60
    private void textTitleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTitleKeyTyped
        if ((textTitle.getText() + evt.getKeyChar()).length() > 60) {
            evt.consume();
        }
    }//GEN-LAST:event_textTitleKeyTyped

    // limita a quantidade de caracteres em "Seq No." para 11, proíbe espaço e aceita só números
    private void textSequenceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSequenceKeyTyped
        char c = evt.getKeyChar();
        if (((textSequence.getText() + c).length() > 11) || c == KeyEvent.VK_SPACE || !Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_textSequenceKeyTyped

    // limita a quantidade de caracteres em "Preço" para 11, para 11, proíbe espaço e só aceita números decimais
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
        String textT = textTitle.getText();
        String textI = textIsbn.getText();
        String textPr = textPrice.getText();
        String textS = textSequence.getText();
        int comboA = comboBoxAuthor.getSelectedIndex();
        int comboP = comboBoxPublisher.getSelectedIndex();
        
        if (textT.isBlank() || textI.isBlank() || textPr.isBlank() || textS.isBlank() || comboA == 0 || comboP == 0) {
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
    public static javax.swing.JComboBox<Object> comboBoxAuthor;
    public static javax.swing.JComboBox<Object> comboBoxPublisher;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JLabel labelIsbn;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelPublisher;
    private javax.swing.JLabel labelSequence;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JTextField textIsbn;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textSequence;
    private javax.swing.JTextField textTitle;
    // End of variables declaration//GEN-END:variables
}

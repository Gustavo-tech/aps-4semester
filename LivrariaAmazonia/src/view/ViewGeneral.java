package view;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.ViewModelsDAO;
import model.view.SearchViewModel;

public class ViewGeneral extends javax.swing.JInternalFrame {

    boolean haveText = false;
    
    
    protected ViewGeneral() {
        initComponents();
        
        buttonClean.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonSearch.setEnabled(false);
        buttonEdit.setEnabled(false);
        buttonGroupType.add(radioAuthor);
        buttonGroupType.add(radioTitle);
        buttonGroupType.add(radioPublisher);
        buttonGroupType.add(radioIsbn);
        radioAuthor.setFocusPainted(false);
        radioTitle.doClick();
        readTableGeneral();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupType = new javax.swing.ButtonGroup();
        panelLivraria = new javax.swing.JPanel();
        radioTitle = new javax.swing.JRadioButton();
        radioAuthor = new javax.swing.JRadioButton();
        radioPublisher = new javax.swing.JRadioButton();
        radioIsbn = new javax.swing.JRadioButton();
        buttonSearch = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonClean = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        paneBooklist = new javax.swing.JScrollPane();
        tableGeneral = new javax.swing.JTable();
        textSearch = new javax.swing.JTextField();
        labelSearch = new javax.swing.JLabel();

        panelLivraria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        radioTitle.setText("Título");

        radioAuthor.setText("Autor");

        radioPublisher.setText("Editora");

        radioIsbn.setText("ISBN");

        buttonSearch.setText("Pesquisar");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonAdd.setText("Adicionar");
        buttonAdd.setMaximumSize(null);
        buttonAdd.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonAdd.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonDelete.setText("Excluir");
        buttonDelete.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonDelete.setPreferredSize(new java.awt.Dimension(134, 22));

        buttonEdit.setText("Editar");
        buttonEdit.setToolTipText("");
        buttonEdit.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonEdit.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonClean.setText("Limpar");
        buttonClean.setToolTipText("");
        buttonClean.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonClean.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCleanActionPerformed(evt);
            }
        });

        buttonClose.setText("Fechar");
        buttonClose.setToolTipText("");
        buttonClose.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonClose.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        tableGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Preço", "Livro", "Autor", "Editora", "ISBN"
            }
        ));
        tableGeneral.setColumnSelectionAllowed(true);
        tableGeneral.getTableHeader().setReorderingAllowed(false);
        tableGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGeneralMouseClicked(evt);
            }
        });
        paneBooklist.setViewportView(tableGeneral);

        textSearch.setToolTipText("");
        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelLivrariaLayout = new javax.swing.GroupLayout(panelLivraria);
        panelLivraria.setLayout(panelLivrariaLayout);
        panelLivrariaLayout.setHorizontalGroup(
            panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLivrariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLivrariaLayout.createSequentialGroup()
                        .addComponent(radioTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(540, 540, 540))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLivrariaLayout.createSequentialGroup()
                        .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paneBooklist)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLivrariaLayout.createSequentialGroup()
                                .addComponent(textSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLivrariaLayout.createSequentialGroup()
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelLivrariaLayout.setVerticalGroup(
            panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLivrariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneBooklist, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelLivrariaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonAdd, buttonClean, buttonClose, buttonDelete, buttonEdit});

        labelSearch.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        labelSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSearch.setText("Geral");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLivraria, javax.swing.GroupLayout.PREFERRED_SIZE, 639, Short.MAX_VALUE)
                    .addComponent(labelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(labelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLivraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // EVENTS
    
    /* quando uma tecla é solta dentro do campo de busca
       verifica se existe texto no campo de busca
       caso sim: habilita o botão "Pesquisar"
       caso não: desabilita o botão "Pesquisar" */
    private void textSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyReleased
        String text = textSearch.getText();

        if (text.isBlank()) {
            buttonSearch.setEnabled(false);
        } else {
            buttonSearch.setEnabled(true);
        }
    }//GEN-LAST:event_textSearchKeyReleased

    // quando é clicado em "Fechar", fecha a janela interna "Buscar livro"
    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonCloseActionPerformed

    // quando é clicado em "Editar", abre a janela interna "Editar livro"
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        ViewBook viewModify = new ViewBook();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewModify);
        viewModify.setVisible(true);
        viewModify.setPositionCenter();
    }//GEN-LAST:event_buttonEditActionPerformed

    // quando é clicado em "Adicionar", abre a janela interna "Adicionar livro"
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        ViewAddBook viewAdd = new  ViewAddBook();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewAdd);
        viewAdd.setVisible(true);
        viewAdd.setPositionCenter();
    }//GEN-LAST:event_buttonAddActionPerformed

    // realiza a pesquisa de acordo com o tipo selecionado
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String search = textSearch.getText();

        if (radioTitle.isSelected()) {
            readTableTitle(search);
        } else if (radioAuthor.isSelected()) {
            readTableAuthor(search);
        } else if (radioPublisher.isSelected()) {
            readTablePublisher(search);
        } else if (radioIsbn.isSelected()) {
            readTableIsbn(search);
        }
        
        buttonClean.setEnabled(true);
    }//GEN-LAST:event_buttonSearchActionPerformed

    // quando é clicado em algum item da tabela, ativa o botão "Editar" e "Excluir"
    private void tableGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGeneralMouseClicked
        buttonEdit.setEnabled(true);
        buttonDelete.setEnabled(true);
    }//GEN-LAST:event_tableGeneralMouseClicked

    private void buttonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleanActionPerformed
        readTableGeneral();
        buttonClean.setEnabled(false);
        buttonSearch.setEnabled(false);
        textSearch.setText("");
    }//GEN-LAST:event_buttonCleanActionPerformed

    // NOT EVENTS
    
    // define a posição da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    // exibe todos os livros cadastrados na tabela
    public void readTableGeneral() {
        DefaultTableModel modelo = (DefaultTableModel) tableGeneral.getModel();
        modelo.setNumRows(0);
        ViewModelsDAO vmdao = new ViewModelsDAO();
        
        for (SearchViewModel search: vmdao.getSearchViewModels()) {
                modelo.addRow(new Object[] {
                    search.getPrice(),
                    search.getTitle(),
                    search.getAuthor(),
                    search.getPublisher(),
                    search.getIsbn()
                });
        }
    }
    
    // exibe os livros da busca por título na tabela
    public void readTableTitle(String title) {
        DefaultTableModel modelo = (DefaultTableModel) tableGeneral.getModel();
        modelo.setNumRows(0);
        ViewModelsDAO vmdao = new ViewModelsDAO();
        
        for (SearchViewModel search: vmdao.getSearchByTitle(title)) {
                modelo.addRow(new Object[] {
                    search.getPrice(),
                    search.getTitle(),
                    search.getAuthor(),
                    search.getPublisher(),
                    search.getIsbn()
                });
        }
        
        if (modelo.getRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Livro não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE );
        }
    }
    
    // exibe os livros da busca por autor na tabela
    public void readTableAuthor(String author) {
        DefaultTableModel modelo = (DefaultTableModel) tableGeneral.getModel();
        modelo.setNumRows(0);
        ViewModelsDAO vmdao = new ViewModelsDAO();
        
        for (SearchViewModel search: vmdao.getSearchByAuthor(author)) {
                modelo.addRow(new Object[] {
                    search.getPrice(),
                    search.getTitle(),
                    search.getAuthor(),
                    search.getPublisher(),
                    search.getIsbn()
                });
        }
        
        if (modelo.getRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Autor(a) não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE );
        }
    }
    
    // exibe os livros da busca por editora na tabela
    public void readTablePublisher(String publisher) {
        DefaultTableModel modelo = (DefaultTableModel) tableGeneral.getModel();
        modelo.setNumRows(0);
        ViewModelsDAO vmdao = new ViewModelsDAO();
        
        for (SearchViewModel search: vmdao.getSearchByPublisher(publisher)) {
                modelo.addRow(new Object[] {
                    search.getPrice(),
                    search.getTitle(),
                    search.getAuthor(),
                    search.getPublisher(),
                    search.getIsbn()
                });
        }
        
        if (modelo.getRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Editora não encontrada.", "Aviso", JOptionPane.WARNING_MESSAGE );
        }
    }
    
    // exibe os livros da busca por isbn na tabela
    public void readTableIsbn(String isbn) {
        DefaultTableModel modelo = (DefaultTableModel) tableGeneral.getModel();
        modelo.setNumRows(0);
        ViewModelsDAO vmdao = new ViewModelsDAO();
        
        for (SearchViewModel search: vmdao.getSearchByIsbn(isbn)) {
                modelo.addRow(new Object[] {
                    search.getPrice(),
                    search.getTitle(),
                    search.getAuthor(),
                    search.getPublisher(),
                    search.getIsbn()
                });
        }
        
        if (modelo.getRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "ISBN não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonClean;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.ButtonGroup buttonGroupType;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JScrollPane paneBooklist;
    private javax.swing.JPanel panelLivraria;
    private javax.swing.JRadioButton radioAuthor;
    private javax.swing.JRadioButton radioIsbn;
    private javax.swing.JRadioButton radioPublisher;
    private javax.swing.JRadioButton radioTitle;
    private javax.swing.JTable tableGeneral;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables

}

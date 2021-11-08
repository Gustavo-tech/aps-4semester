package view;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.bean.Publisher;
import model.dao.PublisherDAO;
import model.dao.ViewModelsDAO;
import model.view.SearchViewModel;

public class ViewSearch extends javax.swing.JInternalFrame {

    boolean haveText = false;
    
    
    protected ViewSearch() {
        initComponents();
        
        buttonClean.setEnabled(false);
        buttonRemove.setEnabled(false);
        buttonSearch.setEnabled(false);
        buttonGroupType.add(radioAuthor);
        buttonGroupType.add(radioBook);
        buttonGroupType.add(radioGeneral);
        buttonGroupType.add(radioPublisher);
        buttonGroupType.add(radioIsbn);
        radioAuthor.setFocusPainted(false);
        radioGeneral.doClick();
        readTableSearch();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupType = new javax.swing.ButtonGroup();
        panelLivraria = new javax.swing.JPanel();
        radioGeneral = new javax.swing.JRadioButton();
        radioBook = new javax.swing.JRadioButton();
        radioAuthor = new javax.swing.JRadioButton();
        radioPublisher = new javax.swing.JRadioButton();
        radioIsbn = new javax.swing.JRadioButton();
        buttonSearch = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        buttonRemove = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonClean = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        paneBooklist = new javax.swing.JScrollPane();
        tableBooklist = new javax.swing.JTable();
        textSearch = new javax.swing.JTextField();
        labelSearch = new javax.swing.JLabel();

        panelLivraria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        radioGeneral.setText("Geral");

        radioBook.setText("Livro");

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

        buttonRemove.setText("Remover");
        buttonRemove.setMaximumSize(null);
        buttonRemove.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonRemove.setPreferredSize(new java.awt.Dimension(134, 22));

        buttonEdit.setText("Editar");
        buttonEdit.setToolTipText("");
        buttonEdit.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonEdit.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonClean.setText("Limpar Busca");
        buttonClean.setToolTipText("");
        buttonClean.setMaximumSize(null);
        buttonClean.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonClean.setPreferredSize(new java.awt.Dimension(134, 22));

        buttonClose.setText("Fechar");
        buttonClose.setToolTipText("");
        buttonClose.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonClose.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        tableBooklist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Preço", "Livro", "Autor", "Editora", "ISBN"
            }
        ));
        tableBooklist.setColumnSelectionAllowed(true);
        tableBooklist.getTableHeader().setReorderingAllowed(false);
        paneBooklist.setViewportView(tableBooklist);

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
                    .addGroup(panelLivrariaLayout.createSequentialGroup()
                        .addComponent(textSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paneBooklist, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLivrariaLayout.createSequentialGroup()
                        .addComponent(radioGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(540, 540, 540))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLivrariaLayout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLivrariaLayout.setVerticalGroup(
            panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLivrariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneBooklist, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelLivrariaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonAdd, buttonClean, buttonClose, buttonEdit, buttonRemove});

        labelSearch.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        labelSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSearch.setText("Buscar livro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLivraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(panelLivraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelSearch)
                    .addContainerGap(450, Short.MAX_VALUE)))
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

    // realiza a pesquisa de acordo com o tipo selecionado
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String search = textSearch.getText();
        
        if (radioAuthor.isFocusOwner()) {
            
        } else if (radioBook.isFocusOwner()) {
            
        } else if (radioIsbn.isFocusOwner()) {
            
        } else if (radioPublisher.isFocusOwner()) {
            
        } else if (radioGeneral.isFocusOwner()) {
            
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    // quando é clicado em "Editar", abre a janela interna "Editar livro"
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        ViewEditBook viewModify = new ViewEditBook();
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

    // NOT EVENTS
    
    // define a posição da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    public void readTableSearch() {
        DefaultTableModel modelo = (DefaultTableModel) tableBooklist.getModel();
        modelo.setNumRows(0);
        List<SearchViewModel> vmds = ViewModelsDAO.getSearchViewModels();
        
        for (SearchViewModel vm: vmds) {
                modelo.addRow(new Object[] {
                    vm.getPrice(),
                    vm.getTitle(),
                    vm.getAuthor(),
                    vm.getPublisher(),
                    vm.getIsbn()
                });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonClean;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonEdit;
    private javax.swing.ButtonGroup buttonGroupType;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JScrollPane paneBooklist;
    private javax.swing.JPanel panelLivraria;
    private javax.swing.JRadioButton radioAuthor;
    private javax.swing.JRadioButton radioBook;
    private javax.swing.JRadioButton radioGeneral;
    private javax.swing.JRadioButton radioIsbn;
    private javax.swing.JRadioButton radioPublisher;
    private javax.swing.JTable tableBooklist;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables

}

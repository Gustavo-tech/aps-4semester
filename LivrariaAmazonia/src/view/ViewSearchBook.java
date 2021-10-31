package view;

import java.awt.Dimension;
import java.beans.PropertyVetoException;

public class ViewSearchBook extends javax.swing.JInternalFrame {

    boolean haveText = false;
    
    
    protected ViewSearchBook() {
        initComponents();
        radioGeneral.doClick();
        buttonClean.setEnabled(false);
        buttonRemove.setEnabled(false);
        buttonSearch.setEnabled(false);
        buttonGroupType.add(radioAuthor);
        buttonGroupType.add(radioBook);
        buttonGroupType.add(radioGeneral);
        buttonGroupType.add(radioPublisher);
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

        buttonSearch.setText("Pesquisar");

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
                "Livro", "Autor", "Editora"
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
            .addGroup(panelLivrariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLivrariaLayout.createSequentialGroup()
                        .addComponent(textSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paneBooklist)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLivrariaLayout.createSequentialGroup()
                            .addComponent(radioGeneral)
                            .addGap(12, 12, 12)
                            .addComponent(radioBook)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(radioAuthor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(radioPublisher))
                        .addGroup(panelLivrariaLayout.createSequentialGroup()
                            .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLivrariaLayout.setVerticalGroup(
            panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLivrariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBook)
                    .addComponent(radioGeneral)
                    .addComponent(radioAuthor)
                    .addComponent(radioPublisher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneBooklist, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
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

    // quando é clicado em "Adicionar", abre a janela interna "Adicionar livro"
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        ViewAddBook viewAdd = new  ViewAddBook();
        ViewAmazonia.desktopAmazonia.add(viewAdd);
        viewAdd.setVisible(true);
        viewAdd.setPositionCenter();
    }//GEN-LAST:event_buttonAddActionPerformed

    // quando é clicado em "Editar", abre a janela interna "Editar livro"
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        ViewEditBook viewModify = new ViewEditBook();
        ViewAmazonia.desktopAmazonia.add(viewModify);
        viewModify.setVisible(true);
        viewModify.setPositionCenter();
    }//GEN-LAST:event_buttonEditActionPerformed

    // quando é clicado em "Fechar", fecha a janela interna "Buscar livro"
    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonCloseActionPerformed

    
    // NOT EVENTS
    
    // define a posição da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
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
    private javax.swing.JRadioButton radioPublisher;
    private javax.swing.JTable tableBooklist;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables

}

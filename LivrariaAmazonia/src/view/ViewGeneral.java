package view;

import controller.ControllerView;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;

public class ViewGeneral extends javax.swing.JInternalFrame {

    protected ViewGeneral() {
        initComponents();
        buttonClean.setEnabled(false);
        buttonSearch.setEnabled(false);
        buttonGroupType.add(radioAuthor);
        buttonGroupType.add(radioTitle);
        buttonGroupType.add(radioPublisher);
        buttonGroupType.add(radioIsbn);
        radioAuthor.setFocusPainted(false);
        radioTitle.doClick();
        tableGeneral.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        addInternalFrameListener(new InternalFrameAdapter(){
            public void internalFrameClosing(InternalFrameEvent e) {
                ViewLivrariaAmazonia.generalIsOpen = false;
            }
        });
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
        buttonClean = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        paneBooklist = new javax.swing.JScrollPane();
        tableGeneral = new javax.swing.JTable();
        textSearch = new javax.swing.JTextField();
        buttonShowAll = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Busca Geral");

        panelLivraria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        radioTitle.setText("T??tulo");

        radioAuthor.setText("Autor");

        radioPublisher.setText("Editora");

        radioIsbn.setText("ISBN");

        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-search.png"))); // NOI18N
        buttonSearch.setText("Buscar");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-clear.png"))); // NOI18N
        buttonClean.setText("Limpar");
        buttonClean.setToolTipText("");
        buttonClean.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonClean.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCleanActionPerformed(evt);
            }
        });

        buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-exit.png"))); // NOI18N
        buttonClose.setText("Fechar");
        buttonClose.setToolTipText("");
        buttonClose.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonClose.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        tableGeneral.setAutoCreateRowSorter(true);
        tableGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Livro", "ISBN", "Autor", "Pre??o", "Editora"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        tableGeneral.getTableHeader().setReorderingAllowed(false);
        paneBooklist.setViewportView(tableGeneral);

        textSearch.setToolTipText("Digite o que deseja buscar");
        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSearchKeyReleased(evt);
            }
        });

        buttonShowAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-show.png"))); // NOI18N
        buttonShowAll.setText("Mostrar tudo");
        buttonShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLivrariaLayout = new javax.swing.GroupLayout(panelLivraria);
        panelLivraria.setLayout(panelLivrariaLayout);
        panelLivrariaLayout.setHorizontalGroup(
            panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLivrariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneBooklist, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(panelLivrariaLayout.createSequentialGroup()
                        .addComponent(radioTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLivrariaLayout.createSequentialGroup()
                        .addComponent(textSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLivrariaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonShowAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panelLivrariaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonClean, buttonClose, buttonShowAll});

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
                .addComponent(paneBooklist, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLivrariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonShowAll))
                .addContainerGap())
        );

        panelLivrariaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonClean, buttonClose, buttonSearch, buttonShowAll, textSearch});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLivraria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLivraria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* quando uma tecla ?? solta dentro do campo de busca
       verifica se existe texto no campo de busca
       caso sim: habilita o bot??o "Pesquisar"
       caso n??o: desabilita o bot??o "Pesquisar" */
    private void textSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyReleased
        String text = textSearch.getText();

        if (text.isBlank()) {
            buttonSearch.setEnabled(false);
        } else {
            buttonSearch.setEnabled(true);
        }
    }//GEN-LAST:event_textSearchKeyReleased

    // quando ?? clicado em "Fechar", fecha a janela interna "Buscar livro"
    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        try {
            this.setClosed(true);
            ViewLivrariaAmazonia.generalIsOpen = false;
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonCloseActionPerformed

    // realiza a pesquisa de acordo com o tipo selecionado
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String search = textSearch.getText();

        if (radioTitle.isSelected()) {
            ControllerView.readTableTitle(search);
        } else if (radioAuthor.isSelected()) {
            ControllerView.readTableAuthor(search);
        } else if (radioPublisher.isSelected()) {
            ControllerView.readTablePublisher(search);
        } else if (radioIsbn.isSelected()) {
            ControllerView.readTableIsbn(search);
        }
        
        buttonClean.setEnabled(true);
        buttonShowAll.setEnabled(true);
    }//GEN-LAST:event_buttonSearchActionPerformed

    // limpa a busca
    private void buttonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleanActionPerformed
        buttonClean.setEnabled(false);
        buttonSearch.setEnabled(false);
        buttonShowAll.setEnabled(true);
        DefaultTableModel modelo = (DefaultTableModel) tableGeneral.getModel();
        modelo.setNumRows(0);
        textSearch.setText("");
    }//GEN-LAST:event_buttonCleanActionPerformed

    private void buttonShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowAllActionPerformed
        ControllerView.readTableGeneral();
        buttonClean.setEnabled(true);
        buttonShowAll.setEnabled(false);
    }//GEN-LAST:event_buttonShowAllActionPerformed

    // define a posi????o da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton buttonClean;
    private javax.swing.JButton buttonClose;
    private javax.swing.ButtonGroup buttonGroupType;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonShowAll;
    private javax.swing.JScrollPane paneBooklist;
    private javax.swing.JPanel panelLivraria;
    private javax.swing.JRadioButton radioAuthor;
    private javax.swing.JRadioButton radioIsbn;
    private javax.swing.JRadioButton radioPublisher;
    private javax.swing.JRadioButton radioTitle;
    public static javax.swing.JTable tableGeneral;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables

}

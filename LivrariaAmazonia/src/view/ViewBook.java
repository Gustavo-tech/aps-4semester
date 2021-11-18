package view;

import controller.ControllerView;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;
import model.bean.*;
import model.dao.*;

public class ViewBook extends javax.swing.JInternalFrame {

    static boolean addBookIsOpen = false;
    static boolean editBookIsOpen = false;
    
    protected ViewBook() {
        initComponents();
        buttonEdit.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonShowAll.setEnabled(false);
        buttonSearch.setEnabled(false);
        ControllerView.readTableBook();
        tableBook.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        addInternalFrameListener(new InternalFrameAdapter(){
            public void internalFrameClosing(InternalFrameEvent e) {
                ViewLivrariaAmazonia.bookIsOpen = false;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEdit = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBook = new javax.swing.JTable();
        buttonAdd = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        textSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonShowAll = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Livros");

        panelEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tableBook.setAutoCreateRowSorter(true);
        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "ISBN", "Preço", "Editora"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    tableBook.setCellSelectionEnabled(true);
    tableBook.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tableBookMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tableBook);

    buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-add-book.png"))); // NOI18N
    buttonAdd.setText("Adicionar");
    buttonAdd.setMinimumSize(new java.awt.Dimension(134, 22));
    buttonAdd.setPreferredSize(new java.awt.Dimension(134, 22));
    buttonAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonAddActionPerformed(evt);
        }
    });

    buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-pencil.png"))); // NOI18N
    buttonEdit.setText("Editar");
    buttonEdit.setMinimumSize(new java.awt.Dimension(134, 22));
    buttonEdit.setPreferredSize(new java.awt.Dimension(134, 22));
    buttonEdit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonEditActionPerformed(evt);
        }
    });

    buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.png"))); // NOI18N
    buttonDelete.setText("Excluir");
    buttonDelete.setMinimumSize(new java.awt.Dimension(134, 22));
    buttonDelete.setPreferredSize(new java.awt.Dimension(134, 22));
    buttonDelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonDeleteActionPerformed(evt);
        }
    });

    buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-exit.png"))); // NOI18N
    buttonCancel.setText("Fechar");
    buttonCancel.setMinimumSize(new java.awt.Dimension(134, 22));
    buttonCancel.setPreferredSize(new java.awt.Dimension(134, 22));
    buttonCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonCancelActionPerformed(evt);
        }
    });

    textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            textSearchKeyReleased(evt);
        }
    });

    buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-search.png"))); // NOI18N
    buttonSearch.setText("Buscar");
    buttonSearch.setPreferredSize(new java.awt.Dimension(119, 22));
    buttonSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonSearchActionPerformed(evt);
        }
    });

    buttonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-clear.png"))); // NOI18N
    buttonClear.setText("Limpar");
    buttonClear.setPreferredSize(new java.awt.Dimension(119, 22));
    buttonClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonClearActionPerformed(evt);
        }
    });

    buttonShowAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-show.png"))); // NOI18N
    buttonShowAll.setText("Mostrar tudo");
    buttonShowAll.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonShowAllActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout panelEditLayout = new javax.swing.GroupLayout(panelEdit);
    panelEdit.setLayout(panelEditLayout);
    panelEditLayout.setHorizontalGroup(
        panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelEditLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addGroup(panelEditLayout.createSequentialGroup()
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditLayout.createSequentialGroup()
                    .addComponent(textSearch)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonShowAll)))
            .addContainerGap())
    );
    panelEditLayout.setVerticalGroup(
        panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelEditLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonShowAll)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    panelEditLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonAdd, buttonCancel, buttonClear, buttonDelete, buttonEdit, buttonSearch, buttonShowAll, textSearch});

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(panelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(panelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(7, 7, 7))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    // quando um item da tabela é selecionado, ativa os botões "buttonEdit" e "buttonDelete"
    private void tableBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBookMouseClicked
        buttonEdit.setEnabled(true);
        buttonDelete.setEnabled(true);
    }//GEN-LAST:event_tableBookMouseClicked
    
    // quando é clicado em "Cancelar", fecha a janela interna "Livros"
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        try {
            this.setClosed(true);
            ViewLivrariaAmazonia.bookIsOpen = false;
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonCancelActionPerformed

    // quando é clicado em "Adicionar" chama a view "ViewAddBook", limitando para 1 janela dessa aberta
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        if (!addBookIsOpen) {
            ViewAddBook viewAddBook = new  ViewAddBook();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewAddBook);
            viewAddBook.setVisible(true);
            viewAddBook.setPositionCenter();
            addBookIsOpen = true;
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    // quando é clicado em "Excluir" exclui o livro do banco de dados e atualiza a tabela
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        Book book = new Book();
        BookDAO bookDAO = new BookDAO();
        
        book.setIsbn((String) tableBook.getValueAt(tableBook.getSelectedRow(), 3));
        bookDAO.deleteBook(book);
        buttonEdit.setEnabled(false);
        buttonDelete.setEnabled(false);
        ControllerView.readTableBook();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    // quando é clicado em "Editar" abre a janela interna de edição já com os dados do livro selecionado, limitando para 1 janela dessa aberta
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        if (!editBookIsOpen) {
            ViewEditBook ViewEditBook = new ViewEditBook();
            ViewLivrariaAmazonia.desktopAmazonia.add(ViewEditBook);
            ViewEditBook.setVisible(true);
            ViewEditBook.setPositionCenter();

            Double price = ((double) tableBook.getValueAt(tableBook.getSelectedRow(), 0));
            ViewEditBook.textPrice.setText(price.toString());

            String title = ((String) tableBook.getValueAt(tableBook.getSelectedRow(), 1));
            ViewEditBook.textTitle.setText(title);

            String isbn = ((String) tableBook.getValueAt(tableBook.getSelectedRow(), 3));
            ViewEditBook.textIsbn.setText(isbn);

            Integer sequence = BookAuthorDAO.getSeq(isbn);
            ViewEditBook.textSequence.setText(sequence.toString());

            String author = AuthorDAO.getAuthorName(isbn);
            ViewEditBook.comboBoxAuthor.setSelectedItem(author);

            String publisher = PublisherDAO.getPublisherName(((Integer) tableBook.getValueAt(tableBook.getSelectedRow(), 2)));
            ViewEditBook.comboBoxPublisher.setSelectedItem(publisher);
            editBookIsOpen = true;
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void textSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyReleased
        String text = textSearch.getText();

        if (text.isBlank()) {
            buttonSearch.setEnabled(false);
        } else {
            buttonSearch.setEnabled(true);
        }
    }//GEN-LAST:event_textSearchKeyReleased

    // realiza a pesquisa de livro
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String search = textSearch.getText();
        ControllerView.readTableBookGeneral(search);
        buttonClear.setEnabled(true);
        buttonShowAll.setEnabled(true);
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        buttonClear.setEnabled(false);
        buttonSearch.setEnabled(false);
        buttonShowAll.setEnabled(true);
        DefaultTableModel modelo = (DefaultTableModel) tableBook.getModel();
        modelo.setNumRows(0);
        textSearch.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowAllActionPerformed
        ControllerView.readTableBook();
        buttonClear.setEnabled(true);
        buttonShowAll.setEnabled(false);
    }//GEN-LAST:event_buttonShowAllActionPerformed

    // define a posição da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonShowAll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEdit;
    public static javax.swing.JTable tableBook;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}

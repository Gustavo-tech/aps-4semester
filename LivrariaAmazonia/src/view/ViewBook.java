package view;

import controller.ControllerView;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import model.bean.*;
import model.dao.*;

public class ViewBook extends javax.swing.JInternalFrame {

    protected ViewBook() {
        initComponents();
        buttonEdit.setEnabled(false);
        buttonDelete.setEnabled(false);
        ControllerView.readTableBook();
        tableBook.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Livros");

        panelEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tableBook.setAutoCreateRowSorter(true);
        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Preço", "Título", "Editora", "ISBN"
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

    javax.swing.GroupLayout panelEditLayout = new javax.swing.GroupLayout(panelEdit);
    panelEdit.setLayout(panelEditLayout);
    panelEditLayout.setHorizontalGroup(
        panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelEditLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGroup(panelEditLayout.createSequentialGroup()
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
            .addContainerGap())
    );
    panelEditLayout.setVerticalGroup(
        panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelEditLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

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
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonCancelActionPerformed

    // quando é clicado em "Adicionar" chama a view "ViewAddBook"
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        ViewAddBook viewAddBook = new  ViewAddBook();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewAddBook);
        viewAddBook.setVisible(true);
        viewAddBook.setPositionCenter();
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

    // quando é clicado em "Editar" abre a janela interna de edição já com os dados do livro selecionado
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
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
    }//GEN-LAST:event_buttonEditActionPerformed

    // define a posição da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEdit;
    public static javax.swing.JTable tableBook;
    // End of variables declaration//GEN-END:variables
}

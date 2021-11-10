package view;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.table.DefaultTableModel;
import model.bean.Author;
import model.dao.AuthorDAO;
import view.ViewAddAuthor;

public class ViewAuthor extends javax.swing.JInternalFrame {

    protected ViewAuthor() {
        initComponents();
        buttonEdit.setEnabled(false);
        buttonDelete.setEnabled(false);
        readTableAuthor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEdit = new javax.swing.JLabel();
        panelEdit = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAuthor = new javax.swing.JTable();
        buttonDelete = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();

        labelEdit.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        labelEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEdit.setText("Autores");

        panelEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-add-book.png"))); // NOI18N
        buttonAdd.setText("Adicionar");
        buttonAdd.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonAdd.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-exit.png"))); // NOI18N
        buttonFechar.setText("Fechar");
        buttonFechar.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonFechar.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharActionPerformed(evt);
            }
        });

        tableAuthor.setAutoCreateRowSorter(true);
        tableAuthor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome"
            }
        ));
        tableAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAuthorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAuthor);

        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.png"))); // NOI18N
        buttonDelete.setText("Excluir");
        buttonDelete.setMinimumSize(new java.awt.Dimension(134, 22));
        buttonDelete.setPreferredSize(new java.awt.Dimension(134, 22));
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
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

        javax.swing.GroupLayout panelEditLayout = new javax.swing.GroupLayout(panelEdit);
        panelEdit.setLayout(panelEditLayout);
        panelEditLayout.setHorizontalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEditLayout.setVerticalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // EVENTS
    
    // quando é clicado em "Cancelar", fecha a janela interna "Autores"
    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        closeWindow();
    }//GEN-LAST:event_buttonFecharActionPerformed

    // quando um item da tabela é selecionado, ativa os botões "buttonEdit" e "buttonDelete"
    private void tableAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAuthorMouseClicked
        buttonEdit.setEnabled(true);
        buttonDelete.setEnabled(true);
    }//GEN-LAST:event_tableAuthorMouseClicked

    // quando é clicado em "Adicionar" chama a view "ViewAddAuthor"
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        ViewAddAuthor viewAddAuthor = new ViewAddAuthor();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewAddAuthor);
        viewAddAuthor.setVisible(true);
        viewAddAuthor.setPositionCenter();
    }//GEN-LAST:event_buttonAddActionPerformed

    // quando é clicado em "Excluir" exclui o autor do banco de dados e atualiza a tabela
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        Integer id = ((int) tableAuthor.getValueAt(tableAuthor.getSelectedRow(), 0));
        AuthorDAO.deleteAuthor(id);
        buttonDelete.setEnabled(false);
        buttonEdit.setEnabled(false);
        readTableAuthor();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    /* quando é clicado em "editar" chama a internalFrame "viewEditAuthor" já com as 
       informações do autor selecionado */
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        ViewEditAuthor viewEditAuthor = new ViewEditAuthor();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewEditAuthor);
        viewEditAuthor.setVisible(true);
        viewEditAuthor.setPositionCenter();
        viewEditAuthor.textId.setEnabled(false);
        
        String name = ((String) tableAuthor.getValueAt(tableAuthor.getSelectedRow(), 1));
        viewEditAuthor.textName.setText(name);
        
        String lastName = ((String) tableAuthor.getValueAt(tableAuthor.getSelectedRow(), 2));
        viewEditAuthor.textLastName.setText(lastName);
        
        Integer id = ((int) tableAuthor.getValueAt(tableAuthor.getSelectedRow(), 0));
        viewEditAuthor.textId.setText(id.toString());
    }//GEN-LAST:event_buttonEditActionPerformed

    // NOT EVENTS
    
    // para trazer os dados de editora para a tabela
    protected static void readTableAuthor() {
        DefaultTableModel modelo = (DefaultTableModel) tableAuthor.getModel();
        modelo.setNumRows(0);
        AuthorDAO pdao = new AuthorDAO();
        
        for (Author author: pdao.getAuthors()) {
                modelo.addRow(new Object[] {
                    author.getId(),
                    author.getName(),
                    author.getFName()
                });
        }
    }
    
    // define a posição da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    // fecha a janela atual
    private void closeWindow() {
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    protected static javax.swing.JButton buttonDelete;
    protected static javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEdit;
    private javax.swing.JPanel panelEdit;
    protected static javax.swing.JTable tableAuthor;
    // End of variables declaration//GEN-END:variables
}

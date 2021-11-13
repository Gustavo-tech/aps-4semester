package view;

import controller.ControllerView;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;
import model.dao.AuthorDAO;
import view.ViewAddAuthor;

public class ViewAuthor extends javax.swing.JInternalFrame {

    static boolean addAuthorIsOpen = false;
    static boolean editAuthorIsOpen = false;
    
    protected ViewAuthor() {
        initComponents();
        buttonEdit.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonSearch.setEnabled(false);
        buttonShowAll.setEnabled(false);
        ControllerView.readTableAuthor();
        tableAuthor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        addInternalFrameListener(new InternalFrameAdapter(){
            public void internalFrameClosing(InternalFrameEvent e) {
                ViewLivrariaAmazonia.authorIsOpen = false;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEdit = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAuthor = new javax.swing.JTable();
        buttonDelete = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        textSearch = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonShowAll = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Autores");

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
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
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
                    .addComponent(buttonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGroup(panelEditLayout.createSequentialGroup()
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
            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonShowAll)
                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    panelEditLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonAdd, buttonClear, buttonDelete, buttonEdit, buttonFechar, buttonSearch, buttonShowAll, textSearch});

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
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    // quando é clicado em "Cancelar", fecha a janela interna "Autores"
    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        try {
            this.setClosed(true);
            ViewLivrariaAmazonia.authorIsOpen = false;
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonFecharActionPerformed

    // quando um item da tabela é selecionado, ativa os botões "buttonEdit" e "buttonDelete"
    private void tableAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAuthorMouseClicked
        buttonEdit.setEnabled(true);
        buttonDelete.setEnabled(true);
    }//GEN-LAST:event_tableAuthorMouseClicked

    // quando é clicado em "Adicionar" chama a view "ViewAddAuthor", limitando para 1 janela dessa aberta
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        if (!addAuthorIsOpen) {
            ViewAddAuthor viewAddAuthor = new ViewAddAuthor();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewAddAuthor);
            viewAddAuthor.setVisible(true);
            viewAddAuthor.setPositionCenter();
            addAuthorIsOpen = true;
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    // quando é clicado em "Excluir" exclui o autor do banco de dados e atualiza a tabela
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        Integer id = ((int) tableAuthor.getValueAt(tableAuthor.getSelectedRow(), 0));
        AuthorDAO.deleteAuthor(id);
        buttonDelete.setEnabled(false);
        buttonEdit.setEnabled(false);
        ControllerView.readTableAuthor();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    /* quando é clicado em "editar" chama a internalFrame "viewAuthor" já com as 
       informações do autor selecionado, limitando para 1 janela dessa aberta */
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        if (!editAuthorIsOpen) {
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
            editAuthorIsOpen = true;
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    // realiza a pesquisa de autor
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String search = textSearch.getText();
        ControllerView.readTableAuthorGeneral(search);
        buttonClear.setEnabled(true);
        buttonShowAll.setEnabled(true);
    }//GEN-LAST:event_buttonSearchActionPerformed

    // limpa a busca
    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        buttonClear.setEnabled(false);
        buttonSearch.setEnabled(false);
        buttonShowAll.setEnabled(true);
        DefaultTableModel modelo = (DefaultTableModel) tableAuthor.getModel();
        modelo.setNumRows(0);
        textSearch.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

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

    // mostra todos os autores para o usuário
    private void buttonShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowAllActionPerformed
        ControllerView.readTableAuthor();
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
    private javax.swing.JButton buttonClear;
    protected static javax.swing.JButton buttonDelete;
    protected static javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonShowAll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEdit;
    public static javax.swing.JTable tableAuthor;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}

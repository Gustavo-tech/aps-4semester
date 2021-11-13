package view;

import controller.ControllerView;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import model.bean.Publisher;
import model.dao.PublisherDAO;

public class ViewPublisher extends javax.swing.JInternalFrame {

    static boolean addPublisherIsOpen = false;
    static boolean editPublisherIsOpen = false;
    
    protected ViewPublisher() {
        initComponents();
        buttonEdit.setEnabled(false);
        buttonDelete.setEnabled(false);
        ControllerView.readTablePublisher();
        tablePublisher.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        addInternalFrameListener(new InternalFrameAdapter(){
            public void internalFrameClosing(InternalFrameEvent e) {
                ViewLivrariaAmazonia.publisherIsOpen = false;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEdit = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePublisher = new javax.swing.JTable();
        buttonAdd = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editoras");
        setPreferredSize(new java.awt.Dimension(456, 400));

        panelEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablePublisher.setAutoCreateRowSorter(true);
        tablePublisher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "URL"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    tablePublisher.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablePublisherMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tablePublisher);

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

    buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-exit.png"))); // NOI18N
    buttonClose.setText("Fechar");
    buttonClose.setMinimumSize(new java.awt.Dimension(134, 22));
    buttonClose.setPreferredSize(new java.awt.Dimension(134, 22));
    buttonClose.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonCloseActionPerformed(evt);
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
                    .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
            .addContainerGap())
    );
    panelEditLayout.setVerticalGroup(
        panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelEditLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private void tablePublisherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePublisherMouseClicked
        buttonEdit.setEnabled(true);
        buttonDelete.setEnabled(true);
    }//GEN-LAST:event_tablePublisherMouseClicked

    // quando é clicado em "Cancelar", fecha a janela interna "Editoras"
    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        try {
            this.setClosed(true);
            ViewLivrariaAmazonia.publisherIsOpen = false;
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_buttonCloseActionPerformed

    // quando é clicado em "Adicionar" chama a view "ViewAddPublisher", limitando para 1 janela dessa aberta
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        if (!addPublisherIsOpen) {
            ViewAddPublisher viewAddPublisher = new  ViewAddPublisher();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewAddPublisher);
            viewAddPublisher.setVisible(true);
            viewAddPublisher.setPositionCenter();
            addPublisherIsOpen = true;
        } 
    }//GEN-LAST:event_buttonAddActionPerformed

    // quando é clicado em "Excluir" exclui a editora do banco de dados e atualiza a tabela
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        Object[] options = { "Sim", "Não" };
        Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("../images/icon-warning.png"))); 
        int option = JOptionPane.showOptionDialog(null, "Caso exclua essa editora, todos os livros vinculados a ela também serão excluídos.\nGostaria de continuar mesmo assim?", "Excluir editora", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, figura, options, options[1]);

        if (option == 0) {
            Publisher publisher = new Publisher();
            PublisherDAO publisherDAO = new PublisherDAO();

            publisher.setId((int) tablePublisher.getValueAt(tablePublisher.getSelectedRow(), 0));
            publisherDAO.deletePublisher(publisher);
            ControllerView.readTablePublisher();
            buttonDelete.setEnabled(false);
            buttonEdit.setEnabled(false);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    /* quando é clicado em "editar" chama a internalFrame "viewPublisher" já com as 
       informações da editora selecionada, limitando para 1 janela dessa aberta */
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        if (!editPublisherIsOpen) {
            ViewEditPublisher viewEditPublisher = new ViewEditPublisher();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewEditPublisher);
            viewEditPublisher.setVisible(true);
            viewEditPublisher.setPositionCenter();
            viewEditPublisher.textId.setEnabled(false);

            String name = ((String) tablePublisher.getValueAt(tablePublisher.getSelectedRow(), 1));
            viewEditPublisher.textName.setText(name);

            String url = ((String) tablePublisher.getValueAt(tablePublisher.getSelectedRow(), 2));
            viewEditPublisher.textUrl.setText(url);

            Integer id = ((int) tablePublisher.getValueAt(tablePublisher.getSelectedRow(), 0));
            viewEditPublisher.textId.setText(id.toString());
            editPublisherIsOpen = true;
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    // define a posição da janela interna no centro do programa
    protected void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonClose;
    protected static javax.swing.JButton buttonDelete;
    protected static javax.swing.JButton buttonEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEdit;
    public static javax.swing.JTable tablePublisher;
    // End of variables declaration//GEN-END:variables
}

package view;

import Database.AuthorsDao;
import Model.Author;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;

public class ViewAddAuthor extends javax.swing.JInternalFrame {    
    public ViewAddAuthor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addAuthorLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        authorNameLabel = new javax.swing.JLabel();
        authorNameTextField = new javax.swing.JTextField();
        authorFirstNameLabel = new javax.swing.JLabel();
        authorFirstNameTextField = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        addAuthorBtn = new javax.swing.JButton();

        addAuthorLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        addAuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addAuthorLabel.setText("Adicionar autor");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        authorNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        authorNameLabel.setText("Nome: ");

        authorNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        authorNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                authorNameTextFieldKeyTyped(evt);
            }
        });

        authorFirstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        authorFirstNameLabel.setText("Primeiro nome: ");

        authorFirstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        authorFirstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                authorFirstNameTextFieldKeyTyped(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelBtn.setText("Cancelar");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        addAuthorBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addAuthorBtn.setText("Adicionar");
        addAuthorBtn.setEnabled(false);
        addAuthorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addAuthorBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(authorFirstNameLabel)
                                .addGap(54, 54, 54)
                                .addComponent(authorFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(authorNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(authorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addAuthorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorNameLabel)
                    .addComponent(authorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorFirstNameLabel)
                    .addComponent(authorFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addAuthorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addAuthorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addAuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            System.err.println("Closing Exception");
        }
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void addAuthorBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAuthorBtnMouseClicked
        String name = authorNameTextField.getText();
        String fName = authorFirstNameTextField.getText();
        
        Author author = new Author(name, fName);
        AuthorsDao.addAuthor(author);
        JOptionPane.showMessageDialog(null, "Author Adicionado com sucesso", 
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_addAuthorBtnMouseClicked

    private void authorNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_authorNameTextFieldKeyTyped
        checkIfAuthorCanBeAdded();
    }//GEN-LAST:event_authorNameTextFieldKeyTyped

    private void authorFirstNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_authorFirstNameTextFieldKeyTyped
        checkIfAuthorCanBeAdded();
    }//GEN-LAST:event_authorFirstNameTextFieldKeyTyped

    public void setPositionCenter() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    private void checkIfAuthorCanBeAdded() {
        String name = authorNameTextField.getText();
        String fName = authorFirstNameTextField.getText();
        
        if (name.equals("") || fName.equals("")) {
            addAuthorBtn.setEnabled(false);
        }
        
        else {
            addAuthorBtn.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAuthorBtn;
    private javax.swing.JLabel addAuthorLabel;
    private javax.swing.JLabel authorFirstNameLabel;
    private javax.swing.JTextField authorFirstNameTextField;
    private javax.swing.JLabel authorNameLabel;
    private javax.swing.JTextField authorNameTextField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

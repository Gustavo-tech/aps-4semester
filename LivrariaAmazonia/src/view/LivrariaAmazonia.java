package view;

public class LivrariaAmazonia extends javax.swing.JFrame {

    public LivrariaAmazonia() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopAmazonia = new javax.swing.JDesktopPane();
        menuBarra = new javax.swing.JMenuBar();
        menuLivraria = new javax.swing.JMenu();
        menuAdd = new javax.swing.JMenu();
        menuAddBook = new javax.swing.JMenuItem();
        menuAddAuthor = new javax.swing.JMenuItem();
        menuAddPublisher = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuEditBook = new javax.swing.JMenuItem();
        menuEditAuthor = new javax.swing.JMenuItem();
        menuEditPublisher = new javax.swing.JMenuItem();
        menuDelete = new javax.swing.JMenu();
        menuDeleteBook = new javax.swing.JMenuItem();
        menuDeleteAuthor = new javax.swing.JMenuItem();
        menuDeletePublisher = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuLivrariaSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Livraria Amazônia");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setName("Livraria Amazônia"); // NOI18N
        setSize(new java.awt.Dimension(1000, 500));

        javax.swing.GroupLayout desktopAmazoniaLayout = new javax.swing.GroupLayout(desktopAmazonia);
        desktopAmazonia.setLayout(desktopAmazoniaLayout);
        desktopAmazoniaLayout.setHorizontalGroup(
            desktopAmazoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
        );
        desktopAmazoniaLayout.setVerticalGroup(
            desktopAmazoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        menuLivraria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-search.png"))); // NOI18N
        menuLivraria.setText("Buscar");
        menuLivraria.setFocusable(false);
        menuLivraria.setRequestFocusEnabled(false);
        menuLivraria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLivrariaMouseClicked(evt);
            }
        });
        menuBarra.add(menuLivraria);

        menuAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-add-book.png"))); // NOI18N
        menuAdd.setText("Adicionar");

        menuAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-open-book.png"))); // NOI18N
        menuAddBook.setText("Livro");
        menuAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddBookActionPerformed(evt);
            }
        });
        menuAdd.add(menuAddBook);

        menuAddAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/writer.png"))); // NOI18N
        menuAddAuthor.setText("Autor");
        menuAddAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddAuthorActionPerformed(evt);
            }
        });
        menuAdd.add(menuAddAuthor);

        menuAddPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-publisher.png"))); // NOI18N
        menuAddPublisher.setText("Editora");
        menuAddPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddPublisherActionPerformed(evt);
            }
        });
        menuAdd.add(menuAddPublisher);

        menuBarra.add(menuAdd);

        menuEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        menuEdit.setText("Editar");

        menuEditBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-open-book.png"))); // NOI18N
        menuEditBook.setText("Livro");
        menuEditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditBookActionPerformed(evt);
            }
        });
        menuEdit.add(menuEditBook);

        menuEditAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/writer.png"))); // NOI18N
        menuEditAuthor.setText("Autor");
        menuEditAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditAuthorActionPerformed(evt);
            }
        });
        menuEdit.add(menuEditAuthor);

        menuEditPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-publisher.png"))); // NOI18N
        menuEditPublisher.setText("Editora");
        menuEditPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditPublisherActionPerformed(evt);
            }
        });
        menuEdit.add(menuEditPublisher);

        menuBarra.add(menuEdit);

        menuDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.png"))); // NOI18N
        menuDelete.setText("Remover");

        menuDeleteBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-open-book.png"))); // NOI18N
        menuDeleteBook.setText("Livro");
        menuDelete.add(menuDeleteBook);

        menuDeleteAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/writer.png"))); // NOI18N
        menuDeleteAuthor.setText("Autor");
        menuDelete.add(menuDeleteAuthor);

        menuDeletePublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-publisher.png"))); // NOI18N
        menuDeletePublisher.setText("Editora");
        menuDelete.add(menuDeletePublisher);

        menuBarra.add(menuDelete);

        menuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-about.png"))); // NOI18N
        menuAjuda.setText("Ajuda");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-about.png"))); // NOI18N
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAjuda.add(jMenuItem1);

        menuLivrariaSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-exit.png"))); // NOI18N
        menuLivrariaSair.setText("Sair");
        menuLivrariaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivrariaSairActionPerformed(evt);
            }
        });
        menuAjuda.add(menuLivrariaSair);

        menuBarra.add(menuAjuda);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopAmazonia)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopAmazonia)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // fecha o programa pelo "Sair" no menu superior
    private void menuLivrariaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaSairActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_menuLivrariaSairActionPerformed

    // abre a janela interna "Sobre" pelo menu superior
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        About viewAbout = new About();
        desktopAmazonia.add(viewAbout);
        viewAbout.setVisible(true);
        viewAbout.setPositionCenter();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private void menuAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddBookActionPerformed
        AddBook viewAddBook = new  AddBook();
        desktopAmazonia.add(viewAddBook);
        viewAddBook.setVisible(true);
        viewAddBook.setPositionCenter();
    }//GEN-LAST:event_menuAddBookActionPerformed

    private void menuLivrariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLivrariaMouseClicked
        Search viewSearch = new Search();
        desktopAmazonia.add(viewSearch);
        viewSearch.setVisible(true);
        viewSearch.setPositionCenter();
    }//GEN-LAST:event_menuLivrariaMouseClicked

    private void menuEditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditBookActionPerformed
        EditBook viewEditBook = new EditBook();
        LivrariaAmazonia.desktopAmazonia.add(viewEditBook);
        viewEditBook.setVisible(true);
        viewEditBook.setPositionCenter();
    }//GEN-LAST:event_menuEditBookActionPerformed

    private void menuAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddAuthorActionPerformed
        AddAuthor viewAddAuthor = new AddAuthor();
        desktopAmazonia.add(viewAddAuthor);
        viewAddAuthor.setVisible(true);
        viewAddAuthor.setPositionCenter();
    }//GEN-LAST:event_menuAddAuthorActionPerformed

    private void menuAddPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddPublisherActionPerformed
        AddPublisher viewAddPublisher = new  AddPublisher();
        desktopAmazonia.add(viewAddPublisher);
        viewAddPublisher.setVisible(true);
        viewAddPublisher.setPositionCenter();
    }//GEN-LAST:event_menuAddPublisherActionPerformed

    private void menuEditAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditAuthorActionPerformed
        EditAuthor viewEditAuthor = new EditAuthor();
        LivrariaAmazonia.desktopAmazonia.add(viewEditAuthor);
        viewEditAuthor.setVisible(true);
        viewEditAuthor.setPositionCenter();
    }//GEN-LAST:event_menuEditAuthorActionPerformed

    private void menuEditPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditPublisherActionPerformed
        EditPublisher viewEditPublisher = new EditPublisher();
        LivrariaAmazonia.desktopAmazonia.add(viewEditPublisher);
        viewEditPublisher.setVisible(true);
        viewEditPublisher.setPositionCenter();
    }//GEN-LAST:event_menuEditPublisherActionPerformed
    
    // NOT EVENTS
        // por enquanto nada    
    // NOT EVENTS
        // por enquanto nada    
    // NOT EVENTS
        // por enquanto nada    
    // NOT EVENTS
        // por enquanto nada    
    // NOT EVENTS
        // por enquanto nada    
    // NOT EVENTS
        // por enquanto nada    
    // NOT EVENTS
        // por enquanto nada    
    // NOT EVENTS
        // por enquanto nada
    
    
    // MAIN
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LivrariaAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivrariaAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivrariaAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivrariaAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LivrariaAmazonia vla = new LivrariaAmazonia();
                vla.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JDesktopPane desktopAmazonia;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAdd;
    private javax.swing.JMenuItem menuAddAuthor;
    private javax.swing.JMenuItem menuAddBook;
    private javax.swing.JMenuItem menuAddPublisher;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuDelete;
    private javax.swing.JMenuItem menuDeleteAuthor;
    private javax.swing.JMenuItem menuDeleteBook;
    private javax.swing.JMenuItem menuDeletePublisher;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenuItem menuEditAuthor;
    private javax.swing.JMenuItem menuEditBook;
    private javax.swing.JMenuItem menuEditPublisher;
    private javax.swing.JMenu menuLivraria;
    private javax.swing.JMenuItem menuLivrariaSair;
    // End of variables declaration//GEN-END:variables
}

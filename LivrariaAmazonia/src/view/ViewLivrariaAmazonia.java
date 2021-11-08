package view;

public class ViewLivrariaAmazonia extends javax.swing.JFrame {

    public ViewLivrariaAmazonia() {
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
        menuAjuda = new javax.swing.JMenu();
        menuAjudaSobre = new javax.swing.JMenuItem();
        menuAjudaSair = new javax.swing.JMenuItem();

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
        menuEdit.setText("Editar/Remover");

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

        menuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-about.png"))); // NOI18N
        menuAjuda.setText("Ajuda");

        menuAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-about.png"))); // NOI18N
        menuAjudaSobre.setText("Sobre");
        menuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuAjudaSobre);

        menuAjudaSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-exit.png"))); // NOI18N
        menuAjudaSair.setText("Sair");
        menuAjudaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaSairActionPerformed(evt);
            }
        });
        menuAjuda.add(menuAjudaSair);

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
    private void menuAjudaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaSairActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_menuAjudaSairActionPerformed

    // abre a janela interna "Sobre" pelo menu superior
    private void menuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaSobreActionPerformed
        ViewAbout viewAbout = new ViewAbout();
        desktopAmazonia.add(viewAbout);
        viewAbout.setVisible(true);
        viewAbout.setPositionCenter();
    }//GEN-LAST:event_menuAjudaSobreActionPerformed
    
    private void menuAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddBookActionPerformed
        ViewAddBook viewAddBook = new  ViewAddBook();
        desktopAmazonia.add(viewAddBook);
        viewAddBook.setVisible(true);
        viewAddBook.setPositionCenter();
    }//GEN-LAST:event_menuAddBookActionPerformed

    private void menuLivrariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLivrariaMouseClicked
        ViewSearch viewSearch = new ViewSearch();
        desktopAmazonia.add(viewSearch);
        viewSearch.setVisible(true);
        viewSearch.setPositionCenter();
    }//GEN-LAST:event_menuLivrariaMouseClicked

    private void menuEditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditBookActionPerformed
        ViewEditBook viewEditBook = new ViewEditBook();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewEditBook);
        viewEditBook.setVisible(true);
        viewEditBook.setPositionCenter();
    }//GEN-LAST:event_menuEditBookActionPerformed

    private void menuAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddAuthorActionPerformed
        ViewAddAuthor viewAddAuthor = new ViewAddAuthor();
        desktopAmazonia.add(viewAddAuthor);
        viewAddAuthor.setVisible(true);
        viewAddAuthor.setPositionCenter();
    }//GEN-LAST:event_menuAddAuthorActionPerformed

    private void menuAddPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddPublisherActionPerformed
        ViewAddPublisher viewAddPublisher = new  ViewAddPublisher();
        desktopAmazonia.add(viewAddPublisher);
        viewAddPublisher.setVisible(true);
        viewAddPublisher.setPositionCenter();
    }//GEN-LAST:event_menuAddPublisherActionPerformed

    private void menuEditAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditAuthorActionPerformed
        ViewEditAuthor viewEditAuthor = new ViewEditAuthor();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewEditAuthor);
        viewEditAuthor.setVisible(true);
        viewEditAuthor.setPositionCenter();
    }//GEN-LAST:event_menuEditAuthorActionPerformed

    private void menuEditPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditPublisherActionPerformed
        ViewEditPublisher viewEditPublisher = new ViewEditPublisher();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewEditPublisher);
        viewEditPublisher.setVisible(true);
        viewEditPublisher.setPositionCenter();
    }//GEN-LAST:event_menuEditPublisherActionPerformed
   
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
            java.util.logging.Logger.getLogger(ViewLivrariaAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLivrariaAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLivrariaAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLivrariaAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ViewLivrariaAmazonia vla = new ViewLivrariaAmazonia();
                vla.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JDesktopPane desktopAmazonia;
    private javax.swing.JMenu menuAdd;
    private javax.swing.JMenuItem menuAddAuthor;
    private javax.swing.JMenuItem menuAddBook;
    private javax.swing.JMenuItem menuAddPublisher;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaSair;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenuItem menuEditAuthor;
    private javax.swing.JMenuItem menuEditBook;
    private javax.swing.JMenuItem menuEditPublisher;
    private javax.swing.JMenu menuLivraria;
    // End of variables declaration//GEN-END:variables
}

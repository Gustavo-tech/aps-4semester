package view;

public class ViewLivrariaAmazonia extends javax.swing.JFrame {

    public ViewLivrariaAmazonia() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopAmazonia = new javax.swing.JDesktopPane();
        buttonAuthors = new javax.swing.JButton();
        buttonBooks = new javax.swing.JButton();
        buttonGeneral = new javax.swing.JButton();
        buttonPublishers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menuBarra = new javax.swing.JMenuBar();
        menuLivraria = new javax.swing.JMenu();
        menuLivrariaGeneral = new javax.swing.JMenuItem();
        menuLivrariaBook = new javax.swing.JMenuItem();
        menuLivrariaAuthor = new javax.swing.JMenuItem();
        menuLivrariaPublisher = new javax.swing.JMenuItem();
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

        buttonAuthors.setText("Autores");
        buttonAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAuthorsActionPerformed(evt);
            }
        });

        buttonBooks.setText("Livros");
        buttonBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBooksActionPerformed(evt);
            }
        });

        buttonGeneral.setText("Geral");
        buttonGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGeneralActionPerformed(evt);
            }
        });

        buttonPublishers.setText("Editoras");
        buttonPublishers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPublishersActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bem vindo(a) à Livraria Amazônia!");

        desktopAmazonia.setLayer(buttonAuthors, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopAmazonia.setLayer(buttonBooks, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopAmazonia.setLayer(buttonGeneral, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopAmazonia.setLayer(buttonPublishers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopAmazonia.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopAmazoniaLayout = new javax.swing.GroupLayout(desktopAmazonia);
        desktopAmazonia.setLayout(desktopAmazoniaLayout);
        desktopAmazoniaLayout.setHorizontalGroup(
            desktopAmazoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopAmazoniaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopAmazoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(desktopAmazoniaLayout.createSequentialGroup()
                        .addComponent(buttonBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        desktopAmazoniaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonAuthors, buttonBooks, buttonGeneral, buttonPublishers});

        desktopAmazoniaLayout.setVerticalGroup(
            desktopAmazoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopAmazoniaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addGroup(desktopAmazoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        menuLivraria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-search.png"))); // NOI18N
        menuLivraria.setText("Buscar");
        menuLivraria.setFocusable(false);
        menuLivraria.setRequestFocusEnabled(false);

        menuLivrariaGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-search.png"))); // NOI18N
        menuLivrariaGeneral.setText("Geral");
        menuLivrariaGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivrariaGeneralActionPerformed(evt);
            }
        });
        menuLivraria.add(menuLivrariaGeneral);

        menuLivrariaBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-open-book.png"))); // NOI18N
        menuLivrariaBook.setText("Livro");
        menuLivrariaBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivrariaBookActionPerformed(evt);
            }
        });
        menuLivraria.add(menuLivrariaBook);

        menuLivrariaAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/writer.png"))); // NOI18N
        menuLivrariaAuthor.setText("Autor");
        menuLivrariaAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivrariaAuthorActionPerformed(evt);
            }
        });
        menuLivraria.add(menuLivrariaAuthor);

        menuLivrariaPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-publisher.png"))); // NOI18N
        menuLivrariaPublisher.setText("Editora");
        menuLivrariaPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivrariaPublisherActionPerformed(evt);
            }
        });
        menuLivraria.add(menuLivrariaPublisher);

        menuBarra.add(menuLivraria);

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
    
    private void menuLivrariaBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaBookActionPerformed
        ViewBook viewEditBook = new ViewBook();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewEditBook);
        viewEditBook.setVisible(true);
        viewEditBook.setPositionCenter();
    }//GEN-LAST:event_menuLivrariaBookActionPerformed

    private void menuLivrariaAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaAuthorActionPerformed
        ViewAuthor viewEditAuthor = new ViewAuthor();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewEditAuthor);
        viewEditAuthor.setVisible(true);
        viewEditAuthor.setPositionCenter();
    }//GEN-LAST:event_menuLivrariaAuthorActionPerformed

    private void menuLivrariaPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaPublisherActionPerformed
        ViewPublisher viewEditPublisher = new ViewPublisher();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewEditPublisher);
        viewEditPublisher.setVisible(true);
        viewEditPublisher.setPositionCenter();
    }//GEN-LAST:event_menuLivrariaPublisherActionPerformed

    private void menuLivrariaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaGeneralActionPerformed
        ViewGeneral viewSearch = new ViewGeneral();
        desktopAmazonia.add(viewSearch);
        viewSearch.setVisible(true);
        viewSearch.setPositionCenter();
    }//GEN-LAST:event_menuLivrariaGeneralActionPerformed

    private void buttonBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBooksActionPerformed
        ViewBook viewEditBook = new ViewBook();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewEditBook);
        viewEditBook.setVisible(true);
        viewEditBook.setPositionCenter();
    }//GEN-LAST:event_buttonBooksActionPerformed

    private void buttonAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAuthorsActionPerformed
        ViewAuthor viewEditAuthor = new ViewAuthor();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewEditAuthor);
        viewEditAuthor.setVisible(true);
        viewEditAuthor.setPositionCenter();
    }//GEN-LAST:event_buttonAuthorsActionPerformed

    private void buttonPublishersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPublishersActionPerformed
        ViewPublisher viewEditPublisher = new ViewPublisher();
        ViewLivrariaAmazonia.desktopAmazonia.add(viewEditPublisher);
        viewEditPublisher.setVisible(true);
        viewEditPublisher.setPositionCenter();
    }//GEN-LAST:event_buttonPublishersActionPerformed

    private void buttonGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGeneralActionPerformed
        ViewGeneral viewSearch = new ViewGeneral();
        desktopAmazonia.add(viewSearch);
        viewSearch.setVisible(true);
        viewSearch.setPositionCenter();
    }//GEN-LAST:event_buttonGeneralActionPerformed
   
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
    private javax.swing.JButton buttonAuthors;
    private javax.swing.JButton buttonBooks;
    private javax.swing.JButton buttonGeneral;
    private javax.swing.JButton buttonPublishers;
    protected static javax.swing.JDesktopPane desktopAmazonia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaSair;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuLivraria;
    private javax.swing.JMenuItem menuLivrariaAuthor;
    private javax.swing.JMenuItem menuLivrariaBook;
    private javax.swing.JMenuItem menuLivrariaGeneral;
    private javax.swing.JMenuItem menuLivrariaPublisher;
    // End of variables declaration//GEN-END:variables
}

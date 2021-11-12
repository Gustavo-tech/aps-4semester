package view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class ViewLivrariaAmazonia extends javax.swing.JFrame {

    static boolean aboutIsOpen = false;
    static boolean bookIsOpen = false;
    static boolean authorIsOpen = false;
    static boolean generalIsOpen = false;
    static boolean publisherIsOpen = false;
    
    public ViewLivrariaAmazonia() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/background.jpg"));
        Image img = icon.getImage();
        desktopAmazonia = new javax.swing.JDesktopPane() {

            public void paintComponent(Graphics g) {
                g.drawImage(img,0,0,2560,1440,this);
            }
        };
        labelWelcome = new javax.swing.JLabel();
        panelButtons = new javax.swing.JPanel();
        buttonBooks = new javax.swing.JButton();
        buttonAuthors = new javax.swing.JButton();
        buttonPublishers = new javax.swing.JButton();
        buttonGeneral = new javax.swing.JButton();
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

        labelWelcome.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(0, 102, 51));
        labelWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWelcome.setText("Bem vindo(a) à Livraria Amazônia!");

        panelButtons.setBackground(new java.awt.Color(0, 102, 0));

        buttonBooks.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonBooks.setText("Livros");
        buttonBooks.setPreferredSize(new java.awt.Dimension(180, 38));
        buttonBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBooksActionPerformed(evt);
            }
        });

        buttonAuthors.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonAuthors.setText("Autores");
        buttonAuthors.setPreferredSize(new java.awt.Dimension(180, 38));
        buttonAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAuthorsActionPerformed(evt);
            }
        });

        buttonPublishers.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonPublishers.setText("Editoras");
        buttonPublishers.setPreferredSize(new java.awt.Dimension(180, 38));
        buttonPublishers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPublishersActionPerformed(evt);
            }
        });

        buttonGeneral.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonGeneral.setText("Buscar");
        buttonGeneral.setPreferredSize(new java.awt.Dimension(180, 38));
        buttonGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGeneralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buttonPublishers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buttonAuthors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonPublishers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        desktopAmazonia.setLayer(labelWelcome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopAmazonia.setLayer(panelButtons, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopAmazoniaLayout = new javax.swing.GroupLayout(desktopAmazonia);
        desktopAmazonia.setLayout(desktopAmazoniaLayout);
        desktopAmazoniaLayout.setHorizontalGroup(
            desktopAmazoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopAmazoniaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopAmazoniaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        desktopAmazoniaLayout.setVerticalGroup(
            desktopAmazoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopAmazoniaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        menuLivraria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-open-book.png"))); // NOI18N
        menuLivraria.setText("Livraria");
        menuLivraria.setFocusable(false);
        menuLivraria.setRequestFocusEnabled(false);

        menuLivrariaGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-search.png"))); // NOI18N
        menuLivrariaGeneral.setText("Buscar");
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

        menuLivrariaAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-writer.png"))); // NOI18N
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

    // abre a janela interna "Sobre" pelo menu superior, com limite de 1 janela aberta por vez
    private void menuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaSobreActionPerformed
        if (!aboutIsOpen) {
            ViewAbout viewAbout = new ViewAbout();
            desktopAmazonia.add(viewAbout);
            viewAbout.setVisible(true);
            viewAbout.setPositionCenter();
            aboutIsOpen = true;
        }
        
    }//GEN-LAST:event_menuAjudaSobreActionPerformed
    
    // abre a janela interna "Livros", com limite de 1 janela aberta por vez
    private void menuLivrariaBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaBookActionPerformed
        if (!bookIsOpen) {
            ViewBook viewBook = new ViewBook();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewBook);
            viewBook.setVisible(true);
            viewBook.setPositionCenter();
            bookIsOpen = true;
        }
    }//GEN-LAST:event_menuLivrariaBookActionPerformed

    // abre a janela interna "Autores" , com limite de 1 janela aberta por vez
    private void menuLivrariaAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaAuthorActionPerformed
        if (!authorIsOpen) {
            ViewAuthor viewAuthor = new ViewAuthor();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewAuthor);
            viewAuthor.setVisible(true);
            viewAuthor.setPositionCenter();
            authorIsOpen = true;
        }
    }//GEN-LAST:event_menuLivrariaAuthorActionPerformed

    // abre a janela interna "Editoras" , com limite de 1 janela aberta por vez
    private void menuLivrariaPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaPublisherActionPerformed
        if (!publisherIsOpen) {
            ViewPublisher viewPublisher = new ViewPublisher();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewPublisher);
            viewPublisher.setVisible(true);
            viewPublisher.setPositionCenter();
            publisherIsOpen = true;
        }
    }//GEN-LAST:event_menuLivrariaPublisherActionPerformed

    // abre a janela interna "Buscar" , com limite de 1 janela aberta por vez
    private void menuLivrariaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaGeneralActionPerformed
        if (!generalIsOpen) {
            ViewGeneral viewSearch = new ViewGeneral();
            desktopAmazonia.add(viewSearch);
            viewSearch.setVisible(true);
            viewSearch.setPositionCenter();
            generalIsOpen = true;
        }
    }//GEN-LAST:event_menuLivrariaGeneralActionPerformed

    // abre a janela interna "Livros" pelo botão, com limite de 1 janela aberta por vez
    private void buttonBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBooksActionPerformed
        if (!bookIsOpen) {
            ViewBook viewBook = new ViewBook();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewBook);
            viewBook.setVisible(true);
            viewBook.setPositionCenter();
            bookIsOpen = true;
        }
    }//GEN-LAST:event_buttonBooksActionPerformed

    // abre a janela interna "Autores" pelo botão, com limite de 1 janela aberta por vez
    private void buttonAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAuthorsActionPerformed
        if (!authorIsOpen) {
            ViewAuthor viewAuthor = new ViewAuthor();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewAuthor);
            viewAuthor.setVisible(true);
            viewAuthor.setPositionCenter();
            authorIsOpen = true;
        }
    }//GEN-LAST:event_buttonAuthorsActionPerformed

    // abre a janela interna "Editoras" pelo botão, com limite de 1 janela aberta por vez
    private void buttonPublishersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPublishersActionPerformed
        if (!publisherIsOpen) {
            ViewPublisher viewPublisher = new ViewPublisher();
            ViewLivrariaAmazonia.desktopAmazonia.add(viewPublisher);
            viewPublisher.setVisible(true);
            viewPublisher.setPositionCenter();
            publisherIsOpen = true;
        }
    }//GEN-LAST:event_buttonPublishersActionPerformed

    // abre a janela interna "geral" pelo botão, com limite de 1 janela aberta por vez
    private void buttonGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGeneralActionPerformed
        if (!generalIsOpen) {
            ViewGeneral viewSearch = new ViewGeneral();
            desktopAmazonia.add(viewSearch);
            viewSearch.setVisible(true);
            viewSearch.setPositionCenter();
        }
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
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaSair;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuLivraria;
    private javax.swing.JMenuItem menuLivrariaAuthor;
    private javax.swing.JMenuItem menuLivrariaBook;
    private javax.swing.JMenuItem menuLivrariaGeneral;
    private javax.swing.JMenuItem menuLivrariaPublisher;
    private javax.swing.JPanel panelButtons;
    // End of variables declaration//GEN-END:variables
}

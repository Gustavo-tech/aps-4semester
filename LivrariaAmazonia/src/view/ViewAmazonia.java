package view;

public class ViewAmazonia extends javax.swing.JFrame {

    public ViewAmazonia() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        desktopAmazonia = new javax.swing.JDesktopPane();
        menuBarra = new javax.swing.JMenuBar();
        menuLivraria = new javax.swing.JMenu();
        menuLivrariaBuscar = new javax.swing.JMenuItem();
        menuLivrariaAdd = new javax.swing.JMenuItem();
        menuLivrariaSair = new javax.swing.JMenuItem();
        menuAutores = new javax.swing.JMenu();
        menuAddAutor = new javax.swing.JMenuItem();
        menuEditAutor = new javax.swing.JMenuItem();
        menuDeleteAutor = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

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
            .addGap(0, 718, Short.MAX_VALUE)
        );
        desktopAmazoniaLayout.setVerticalGroup(
            desktopAmazoniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuLivraria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-open-book.png"))); // NOI18N
        menuLivraria.setText("Livraria");

        menuLivrariaBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-search.png"))); // NOI18N
        menuLivrariaBuscar.setText("Buscar livro");
        menuLivrariaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivrariaBuscarActionPerformed(evt);
            }
        });
        menuLivraria.add(menuLivrariaBuscar);

        menuLivrariaAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-add-book.png"))); // NOI18N
        menuLivrariaAdd.setText("Adicionar livro");
        menuLivrariaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivrariaAddActionPerformed(evt);
            }
        });
        menuLivraria.add(menuLivrariaAdd);

        menuLivrariaSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-exit.png"))); // NOI18N
        menuLivrariaSair.setText("Sair");
        menuLivrariaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivrariaSairActionPerformed(evt);
            }
        });
        menuLivraria.add(menuLivrariaSair);

        menuBarra.add(menuLivraria);

        menuAutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/writer.png"))); // NOI18N
        menuAutores.setText("Autores");

        menuAddAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-add-book.png"))); // NOI18N
        menuAddAutor.setText("Adicionar autor");
        menuAddAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddAutorActionPerformed(evt);
            }
        });
        menuAutores.add(menuAddAutor);

        menuEditAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        menuEditAutor.setText("Editar autor");
        menuAutores.add(menuEditAutor);

        menuDeleteAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        menuDeleteAutor.setText("Deletar autor");
        menuDeleteAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteAutorActionPerformed(evt);
            }
        });
        menuAutores.add(menuDeleteAutor);

        menuBarra.add(menuAutores);

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

    // EVENTS
    
    // abre a janela interna "Buscar livro" pelo menu superior
    private void menuLivrariaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaBuscarActionPerformed
        ViewSearchBook viewSearch = new ViewSearchBook();
        desktopAmazonia.add(viewSearch);
        viewSearch.setVisible(true);
        viewSearch.setPositionCenter();
    }//GEN-LAST:event_menuLivrariaBuscarActionPerformed

    // abre a janela interna "Adicionar livro" pelo menu superior
    private void menuLivrariaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaAddActionPerformed
        ViewAddBook viewAdd = new  ViewAddBook();
        desktopAmazonia.add(viewAdd);
        viewAdd.setVisible(true);
        viewAdd.setPositionCenter();
    }//GEN-LAST:event_menuLivrariaAddActionPerformed

    // fecha o programa pelo "Sair" no menu superior
    private void menuLivrariaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivrariaSairActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_menuLivrariaSairActionPerformed

    // abre a janela interna "Sobre" pelo menu superior
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ViewAbout viewAbout = new ViewAbout();
        desktopAmazonia.add(viewAbout);
        viewAbout.setVisible(true);
        viewAbout.setPositionCenter();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    // Abre a janela para adicionar um novo autor
    private void menuAddAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddAutorActionPerformed
        ViewAddAuthor vw = new ViewAddAuthor();
        desktopAmazonia.add(vw);
        vw.setVisible(true);
        vw.setPositionCenter();
    }//GEN-LAST:event_menuAddAutorActionPerformed

    private void menuDeleteAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteAutorActionPerformed
        ViewDeleteAuthor vw = new ViewDeleteAuthor();
        desktopAmazonia.add(vw);
        vw.setVisible(true);
        vw.setPositionCenter();
    }//GEN-LAST:event_menuDeleteAutorActionPerformed
    
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
            java.util.logging.Logger.getLogger(ViewAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAmazonia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ViewAmazonia vla = new ViewAmazonia();
                vla.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JDesktopPane desktopAmazonia;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem menuAddAutor;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuAutores;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem menuDeleteAutor;
    private javax.swing.JMenuItem menuEditAutor;
    private javax.swing.JMenu menuLivraria;
    private javax.swing.JMenuItem menuLivrariaAdd;
    private javax.swing.JMenuItem menuLivrariaBuscar;
    private javax.swing.JMenuItem menuLivrariaSair;
    // End of variables declaration//GEN-END:variables
}

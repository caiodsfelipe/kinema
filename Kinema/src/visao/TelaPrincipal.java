package visao;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        super("Kinema");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        painelMenu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnFuncionarios = new javax.swing.JLabel();
        btnSessoes = new javax.swing.JLabel();
        btnFilmes = new javax.swing.JLabel();
        btnDeslogar = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnDistribuidora = new javax.swing.JLabel();
        btnSala = new javax.swing.JLabel();
        btnProdutos = new javax.swing.JLabel();
        btnVenda = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kinema");
        setName("Kinema"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        desktop.setBackground(new java.awt.Color(46, 51, 62));
        desktop.setForeground(new java.awt.Color(46, 51, 62));
        desktop.setPreferredSize(new java.awt.Dimension(824, 600));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        painelMenu.setBackground(new java.awt.Color(56, 145, 139));
        painelMenu.setForeground(new java.awt.Color(56, 145, 139));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionario-38.png"))); // NOI18N
        btnFuncionarios.setToolTipText("Funcionários");
        btnFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFuncionariosMouseClicked(evt);
            }
        });

        btnSessoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rolo-38.png"))); // NOI18N
        btnSessoes.setToolTipText("Sessão");
        btnSessoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSessoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSessoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSessoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSessoesMouseExited(evt);
            }
        });

        btnFilmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/filme-38.png"))); // NOI18N
        btnFilmes.setToolTipText("Filmes");
        btnFilmes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFilmesMouseClicked(evt);
            }
        });

        btnDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout-38.png"))); // NOI18N
        btnDeslogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeslogarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeslogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeslogarMouseExited(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        btnDistribuidora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/distribuidora-38.png"))); // NOI18N
        btnDistribuidora.setToolTipText("Distribuidora");
        btnDistribuidora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDistribuidora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDistribuidoraMouseClicked(evt);
            }
        });

        btnSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sala-38.png"))); // NOI18N
        btnSala.setToolTipText("Salas");
        btnSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalaMouseClicked(evt);
            }
        });

        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produto-38.png"))); // NOI18N
        btnProdutos.setToolTipText("Produtos");
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdutosMouseClicked(evt);
            }
        });

        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/venda-38.png"))); // NOI18N
        btnVenda.setToolTipText("Vendas");
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendaMouseClicked(evt);
            }
        });

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio.png"))); // NOI18N
        btnRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelatorioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelMenuLayout = new javax.swing.GroupLayout(painelMenu);
        painelMenu.setLayout(painelMenuLayout);
        painelMenuLayout.setHorizontalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSessoes)
                            .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnFilmes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSala, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnFuncionarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDistribuidora, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(btnVenda)))
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeslogar)))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRelatorio)
                    .addComponent(btnProdutos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelMenuLayout.setVerticalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnSessoes)
                .addGap(32, 32, 32)
                .addComponent(btnFilmes)
                .addGap(30, 30, 30)
                .addComponent(btnSala)
                .addGap(30, 30, 30)
                .addComponent(btnProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFuncionarios)
                .addGap(28, 28, 28)
                .addComponent(btnDistribuidora)
                .addGap(31, 31, 31)
                .addComponent(btnRelatorio)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeslogar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSessoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSessoesMouseClicked
        desktop.removeAll();

        TelaSessoes telaSessoes = new TelaSessoes();

        ((BasicInternalFrameUI) telaSessoes.getUI()).setNorthPane(null);

        desktop.add(telaSessoes);

        try {
            telaSessoes.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        telaSessoes.setVisible(true);
    }//GEN-LAST:event_btnSessoesMouseClicked

    private void btnFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFilmesMouseClicked
        desktop.removeAll();

        TelaFilmes telaFilmes = new TelaFilmes();

        ((BasicInternalFrameUI) telaFilmes.getUI()).setNorthPane(null);

        desktop.add(telaFilmes);

        try {
            telaFilmes.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        telaFilmes.setVisible(true);
    }//GEN-LAST:event_btnFilmesMouseClicked

    private void btnFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuncionariosMouseClicked
        desktop.removeAll();

        TelaFuncionarios telaFuncionarios = new TelaFuncionarios();

        ((BasicInternalFrameUI) telaFuncionarios.getUI()).setNorthPane(null);

        desktop.add(telaFuncionarios);

        try {
            telaFuncionarios.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        telaFuncionarios.setVisible(true);
    }//GEN-LAST:event_btnFuncionariosMouseClicked

    private void btnDeslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeslogarMouseClicked
        dispose();
    }//GEN-LAST:event_btnDeslogarMouseClicked

    private void btnSessoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSessoesMouseEntered
        btnSessoes.setBackground(new java.awt.Color(0, 120, 130));
    }//GEN-LAST:event_btnSessoesMouseEntered

    private void btnSessoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSessoesMouseExited
        btnSessoes.setBackground(new java.awt.Color(56, 145, 139));
    }//GEN-LAST:event_btnSessoesMouseExited

    private void btnDistribuidoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistribuidoraMouseClicked
        desktop.removeAll();

        TelaDistribuidora telaDistribuidora = new TelaDistribuidora();

        ((BasicInternalFrameUI) telaDistribuidora.getUI()).setNorthPane(null);

        desktop.add(telaDistribuidora);

        try {
            telaDistribuidora.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        telaDistribuidora.setVisible(true);
    }//GEN-LAST:event_btnDistribuidoraMouseClicked

    private void btnDeslogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeslogarMouseEntered
        btnDeslogar.setIcon(new ImageIcon("src/Imagens/logout2.png"));
    }//GEN-LAST:event_btnDeslogarMouseEntered

    private void btnDeslogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeslogarMouseExited
        btnDeslogar.setIcon(new ImageIcon("src/Imagens/logout-38.png"));
    }//GEN-LAST:event_btnDeslogarMouseExited

    private void btnSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalaMouseClicked
        desktop.removeAll();

        TelaSalas telaSalas = new TelaSalas();

        ((BasicInternalFrameUI) telaSalas.getUI()).setNorthPane(null);

        desktop.add(telaSalas);

        try {
            telaSalas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        telaSalas.setVisible(true);
    }//GEN-LAST:event_btnSalaMouseClicked

    private void btnProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseClicked
        desktop.removeAll();

        TelaProdutos telaProdutos = new TelaProdutos();

        ((BasicInternalFrameUI) telaProdutos.getUI()).setNorthPane(null);

        desktop.add(telaProdutos);

        try {
            telaProdutos.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        telaProdutos.setVisible(true);
    }//GEN-LAST:event_btnProdutosMouseClicked

    private void btnVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendaMouseClicked
        desktop.removeAll();

        TelaVenda telaVenda = new TelaVenda();

        ((BasicInternalFrameUI) telaVenda.getUI()).setNorthPane(null);

        desktop.add(telaVenda);

        try {
            telaVenda.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        telaVenda.setVisible(true);
    }//GEN-LAST:event_btnVendaMouseClicked

    private void btnRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMouseClicked
        desktop.removeAll();

        TelaRelatorio telaRelatorio = new TelaRelatorio();

        ((BasicInternalFrameUI) telaRelatorio.getUI()).setNorthPane(null);

        desktop.add(telaRelatorio);

        try {
            telaRelatorio.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        telaRelatorio.setVisible(true);
    }//GEN-LAST:event_btnRelatorioMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDeslogar;
    private javax.swing.JLabel btnDistribuidora;
    private javax.swing.JLabel btnFilmes;
    private javax.swing.JLabel btnFuncionarios;
    private javax.swing.JLabel btnProdutos;
    private javax.swing.JLabel btnRelatorio;
    private javax.swing.JLabel btnSala;
    private javax.swing.JLabel btnSessoes;
    private javax.swing.JLabel btnVenda;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel painelMenu;
    // End of variables declaration//GEN-END:variables
}

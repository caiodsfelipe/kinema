package visao;

import controle.ControleDistribuidora;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import modelo.Distribuidora;

public class TelaDistribuidora extends javax.swing.JInternalFrame {

    ArrayList<Distribuidora> listaDist = new ArrayList<>();

    private ControleDistribuidora contDist = new ControleDistribuidora();
    private List<JPanel> paineis = new ArrayList<>();

    public TelaDistribuidora() {
        initComponents();

        listaDist.addAll(contDist.listarTodas());
        criarPaineis();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        grid = new javax.swing.JPanel();
        btnAdicionarDistribuidora = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSair = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(46, 51, 62));
        setBorder(null);
        setTitle("Distribuidoras");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/distribuidora.png"))); // NOI18N
        setName("Distribuidoras"); // NOI18N
        setPreferredSize(new java.awt.Dimension(824, 55));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/distribuidora-38.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(495, 0, 40, 50);

        grid.setBackground(new java.awt.Color(46, 51, 62));
        grid.setLayout(new java.awt.GridLayout(2, 5, 4, 4));
        getContentPane().add(grid);
        grid.setBounds(40, 100, 940, 430);

        btnAdicionarDistribuidora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/+.png"))); // NOI18N
        btnAdicionarDistribuidora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarDistribuidora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarDistribuidoraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarDistribuidoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarDistribuidoraMouseExited(evt);
            }
        });
        getContentPane().add(btnAdicionarDistribuidora);
        btnAdicionarDistribuidora.setBounds(490, 540, 48, 50);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 55, 1020, 28);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/x.png"))); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(960, 4, 48, 48);

        txtPesquisar.setToolTipText("Digite para pesquisar");
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(810, 550, 170, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(780, 540, 20, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void criarPaineis() {
        for (int i = 0; i < 10; i++) {

            String nome = "";
            String email = "";
            String contato = "";

            final Distribuidora d;

            if (i < listaDist.size()) {

                d = listaDist.get(i);

                nome = d.getNome();
                email = d.getEmail();
                contato = d.getNome_contato();

            } else {
                d = null;
            }

            javax.swing.JLabel iconeDist = new javax.swing.JLabel();
            javax.swing.JLabel iconeVisualizar = new javax.swing.JLabel();
            javax.swing.JLabel iconeAlterar = new javax.swing.JLabel();
            javax.swing.JLabel iconeExcluir = new javax.swing.JLabel();
            javax.swing.JSeparator Separador = new javax.swing.JSeparator();
            javax.swing.JSeparator Separador2 = new javax.swing.JSeparator();
            javax.swing.JLabel Nome = new javax.swing.JLabel();
            javax.swing.JLabel Email = new javax.swing.JLabel();
            javax.swing.JLabel Contato = new javax.swing.JLabel();

            JPanel pa = new javax.swing.JPanel();
            pa.setPreferredSize(new java.awt.Dimension(180, 150));
            pa.setLayout(null);

            if (d != null) {

                pa.setBackground(new java.awt.Color(56, 145, 139));
                pa.setForeground(new java.awt.Color(56, 145, 139));

                pa.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        painelMouseEntered(evt, pa);
                    }

                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        painelMouseExited(evt, pa);
                    }
                });

                iconeDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/distribuidora.png"))); // NOI18N
                pa.add(iconeDist);
                iconeDist.setBounds(70, 10, 48, 48);

                Nome.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Nome.setForeground(new java.awt.Color(255, 255, 255));
                Nome.setText("Nome: " + nome);
                pa.add(Nome);
                Nome.setBounds(6, 98, 150, 15);

                Email.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Email.setForeground(new java.awt.Color(255, 255, 255));
                Email.setText("Email: " + email);
                pa.add(Email);
                Email.setBounds(6, 142, 150, 15);

                Contato.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Contato.setForeground(new java.awt.Color(255, 255, 255));
                Contato.setText("Contato: " + contato);
                pa.add(Contato);
                Contato.setBounds(6, 120, 150, 15);

                iconeVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/visualizar.png")));

                if (d != null) {

                    iconeVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeVisualizarMouseClicked(evt, d);
                        }
                    });

                }

                iconeVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeVisualizar);
                iconeVisualizar.setBounds(15, 180, 16, 20);

                iconeExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lixo.png")));

                if (d != null) {

                    iconeExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeExcluirMouseClicked(evt, d);
                        }
                    });

                }

                iconeExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeExcluir);
                iconeExcluir.setBounds(150, 180, 16, 20);

                iconeAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alterar.png")));

                if (d != null) {

                    iconeAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeAlterarMouseClicked(evt, d);
                        }
                    });

                }

                iconeAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeAlterar);
                iconeAlterar.setBounds(85, 180, 16, 20);

                pa.add(Separador2);
                Separador2.setBounds(0, 170, 184, 10);

                pa.add(Separador);
                Separador.setBounds(0, 82, 184, 10);

            } else {

                pa.setBackground(new java.awt.Color(46, 51, 62));
                pa.setForeground(new java.awt.Color(46, 51, 62));

                pa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56, 145, 139)));

            }

            getContentPane().add(pa);
            pa.setBounds(40, 100, 180, 210);

            grid.add(pa);
            grid.revalidate();
            paineis.add(pa);
        }

    }

    public void destruirPaineis() {
        grid.removeAll();
    }

    private void btnAdicionarDistribuidoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarDistribuidoraMouseClicked

        TelaAdicionarDistribuidora telaAdicionarDistribuidora = new TelaAdicionarDistribuidora(null, true);

        telaAdicionarDistribuidora.setVisible(true);

        Distribuidora d = telaAdicionarDistribuidora.getDist();

        if (telaAdicionarDistribuidora.getCancelar() != 1) {

            contDist.inserir(d);

            listaDist.clear();
            listaDist.addAll(contDist.listarTodas());

            destruirPaineis();
            criarPaineis();

        }

    }//GEN-LAST:event_btnAdicionarDistribuidoraMouseClicked

    private void btnAdicionarDistribuidoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarDistribuidoraMouseEntered

        btnAdicionarDistribuidora.setIcon(new ImageIcon("src/Imagens/+2.png"));

    }//GEN-LAST:event_btnAdicionarDistribuidoraMouseEntered

    private void btnAdicionarDistribuidoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarDistribuidoraMouseExited

        btnAdicionarDistribuidora.setIcon(new ImageIcon("src/Imagens/+.png"));

    }//GEN-LAST:event_btnAdicionarDistribuidoraMouseExited

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked

        dispose();

    }//GEN-LAST:event_btnSairMouseClicked

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased

        listaDist.clear();
        listaDist.addAll(contDist.listarPorNome(txtPesquisar.getText()));

        destruirPaineis();
        criarPaineis();

    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void painelMouseEntered(java.awt.event.MouseEvent evt, JPanel pa) {
        pa.setBackground(new java.awt.Color(255, 255, 255));
        for (Component c : pa.getComponents()) {
            if (c instanceof JLabel) {
                ((JLabel) c).setForeground(new java.awt.Color(0, 0, 0));
            }
            if (c instanceof JSeparator) {
                ((JSeparator) c).setForeground(new java.awt.Color(0, 0, 0));
            }
        }
    }

    private void painelMouseExited(java.awt.event.MouseEvent evt, JPanel pa) {
        pa.setBackground(new java.awt.Color(56, 145, 139));
        for (Component c : pa.getComponents()) {
            if (c instanceof JLabel) {
                ((JLabel) c).setForeground(new java.awt.Color(255, 255, 255));
            }
            if (c instanceof JSeparator) {
                ((JSeparator) c).setForeground(new java.awt.Color(255, 255, 255));
            }
        }
    }

    private void iconeVisualizarMouseClicked(java.awt.event.MouseEvent evt, Distribuidora dist) {

        TelaAdicionarDistribuidora telaAdicionarDistribuidora = new TelaAdicionarDistribuidora(null, true);

        telaAdicionarDistribuidora.setDist(dist);

        telaAdicionarDistribuidora.proibirAlteracao();

        telaAdicionarDistribuidora.setVisible(true);

    }

    private void iconeAlterarMouseClicked(java.awt.event.MouseEvent evt, Distribuidora dist) {

        TelaAdicionarDistribuidora telaAdicionarDistribuidora = new TelaAdicionarDistribuidora(null, true);

        telaAdicionarDistribuidora.setDist(dist);

        telaAdicionarDistribuidora.setVisible(true);

        Distribuidora d = telaAdicionarDistribuidora.getDist();

        if (telaAdicionarDistribuidora.getCancelar() != 1) {

            contDist.alterar(d);

            listaDist.clear();
            listaDist.addAll(contDist.listarTodas());

            destruirPaineis();
            criarPaineis();

        }

    }

    private void iconeExcluirMouseClicked(java.awt.event.MouseEvent evt, Distribuidora dist) {

        if (JOptionPane.showConfirmDialog(this, "Deseja apagar esta Distribuidora ?",
                "Apagar Distribuidora",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {

            if (contDist.listarPorFilme(dist).isEmpty()) {

                contDist.excluir(dist);

                listaDist.clear();
                listaDist.addAll(contDist.listarTodas());

                destruirPaineis();
                criarPaineis();

            } else {

                JOptionPane.showMessageDialog(this,
                        "Esta Distribuidora está associada a um Filme, portanto não "
                        + "pode ser excluída.");

            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdicionarDistribuidora;
    private javax.swing.JLabel btnSair;
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}

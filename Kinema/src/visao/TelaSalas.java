package visao;

import controle.ControleSala;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import modelo.Sala;

public class TelaSalas extends javax.swing.JInternalFrame {

    ArrayList<Sala> listaSala = new ArrayList<>();

    private ControleSala contSala = new ControleSala();
    private List<JPanel> paineis = new ArrayList<>();

    public TelaSalas() {
        initComponents();

        listaSala.addAll(contSala.listarTodas());
        criarPaineis();
    }

    public void criarPaineis() {
        for (int i = 0; i < 10; i++) {

            int id = 0;
            int capacidade = 0;

            final Sala s;

            if (i < listaSala.size()) {

                s = listaSala.get(i);

                id = s.getIdSala();
                capacidade = s.getCapacidade();

            } else {
                s = null;
            }

            javax.swing.JLabel iconeSala = new javax.swing.JLabel();
            javax.swing.JLabel iconeVisualizar = new javax.swing.JLabel();
            javax.swing.JLabel iconeAlterar = new javax.swing.JLabel();
            javax.swing.JLabel iconeExcluir = new javax.swing.JLabel();
            javax.swing.JSeparator Separador = new javax.swing.JSeparator();
            javax.swing.JSeparator Separador2 = new javax.swing.JSeparator();
            javax.swing.JLabel Codigo = new javax.swing.JLabel();
            javax.swing.JLabel Capacidade = new javax.swing.JLabel();

            JPanel pa = new javax.swing.JPanel();
            pa.setBackground(new java.awt.Color(56, 145, 139));
            pa.setForeground(new java.awt.Color(56, 145, 139));
            pa.setPreferredSize(new java.awt.Dimension(180, 150));
            pa.setLayout(null);

            if (s != null) {

                pa.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        painelMouseEntered(evt, pa);
                    }

                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        painelMouseExited(evt, pa);
                    }
                });

                iconeSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sala.png"))); // NOI18N
                pa.add(iconeSala);
                iconeSala.setBounds(70, 20, 48, 48);
                pa.add(Separador);
                Separador.setBounds(0, 82, 185, 10);

                Codigo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Codigo.setForeground(new java.awt.Color(255, 255, 255));
                Codigo.setText("Código: " + id);
                pa.add(Codigo);
                Codigo.setBounds(10, 100, 60, 15);

                Capacidade.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Capacidade.setForeground(new java.awt.Color(255, 255, 255));
                Capacidade.setText("Capacidade: " + capacidade);
                pa.add(Capacidade);
                Capacidade.setBounds(10, 130, 110, 15);
                pa.add(Separador2);
                Separador2.setBounds(0, 160, 185, 10);

                iconeVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/visualizar.png")));

                if (s != null) {

                    iconeVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeVisualizarMouseClicked(evt, s);
                        }
                    });

                }

                iconeVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeVisualizar);
                iconeVisualizar.setBounds(15, 180, 16, 20);

                iconeExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lixo.png")));

                if (s != null) {

                    iconeExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeExcluirMouseClicked(evt, s);
                        }
                    });

                }

                iconeExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeExcluir);
                iconeExcluir.setBounds(150, 180, 16, 20);

                iconeAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alterar.png")));

                if (s != null) {

                    iconeAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeAlterarMouseClicked(evt, s);
                        }
                    });

                }

                iconeAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeAlterar);
                iconeAlterar.setBounds(85, 180, 16, 20);

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAdicionarSala = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        grid = new javax.swing.JPanel();

        setBackground(new java.awt.Color(46, 51, 62));
        setBorder(null);
        setTitle("Salas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sala.png"))); // NOI18N
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sala-38.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(495, 3, 40, 50);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 55, 1020, 28);

        btnAdicionarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/+.png"))); // NOI18N
        btnAdicionarSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarSalaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarSalaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarSalaMouseExited(evt);
            }
        });
        getContentPane().add(btnAdicionarSala);
        btnAdicionarSala.setBounds(490, 540, 48, 50);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/x.png"))); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(960, 4, 48, 48);

        grid.setBackground(new java.awt.Color(46, 51, 62));
        grid.setLayout(new java.awt.GridLayout(2, 5, 4, 4));
        getContentPane().add(grid);
        grid.setBounds(40, 100, 940, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarSalaMouseClicked
        TelaAdicionarSala telaAdicionarSala = new TelaAdicionarSala(null, true);

        telaAdicionarSala.setVisible(true);

        Sala s = telaAdicionarSala.getSala();

        if (telaAdicionarSala.getCancelar() != 1) {

            contSala.inserir(s);

            listaSala.clear();

            listaSala.addAll(contSala.listarTodas());

            destruirPaineis();
            criarPaineis();

        }

    }//GEN-LAST:event_btnAdicionarSalaMouseClicked

    private void btnAdicionarSalaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarSalaMouseEntered
        btnAdicionarSala.setIcon(new ImageIcon("src/Imagens/+2.png"));
    }//GEN-LAST:event_btnAdicionarSalaMouseEntered

    private void btnAdicionarSalaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarSalaMouseExited
        btnAdicionarSala.setIcon(new ImageIcon("src/Imagens/+.png"));
    }//GEN-LAST:event_btnAdicionarSalaMouseExited

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        dispose();
    }//GEN-LAST:event_btnSairMouseClicked

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

    private void iconeVisualizarMouseClicked(java.awt.event.MouseEvent evt, Sala sala) {

        TelaAdicionarSala telaAdicionarSala = new TelaAdicionarSala(null, true);

        telaAdicionarSala.setSala(sala);

        telaAdicionarSala.proibirAlteracao();

        telaAdicionarSala.setVisible(true);

    }

    private void iconeAlterarMouseClicked(java.awt.event.MouseEvent evt, Sala sala) {

        TelaAdicionarSala telaAdicionarSala = new TelaAdicionarSala(null, true);

        telaAdicionarSala.setSala(sala);

        telaAdicionarSala.setVisible(true);

        Sala s = telaAdicionarSala.getSala();

        if (telaAdicionarSala.getCancelar() != 1) {

            contSala.alterar(s);

            listaSala.clear();
            listaSala.addAll(contSala.listarTodas());

            destruirPaineis();
            criarPaineis();

        }

    }

    private void iconeExcluirMouseClicked(java.awt.event.MouseEvent evt, Sala sala) {

        if (JOptionPane.showConfirmDialog(this, "Deseja apagar esta Sala ?",
                "Apagar Sala",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {

            if (contSala.listarPorSessao(sala).isEmpty()) {

                contSala.excluir(sala);

                listaSala.clear();
                listaSala.addAll(contSala.listarTodas());

                destruirPaineis();
                criarPaineis();

            } else {
                
                JOptionPane.showMessageDialog(this,
                        "Esta Sala está associada a uma Sessão, portanto não "
                        + "pode ser excluída.");
                
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdicionarSala;
    private javax.swing.JLabel btnSair;
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

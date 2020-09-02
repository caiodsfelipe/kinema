package visao;

import controle.ControleSessao;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import modelo.Sessao;

public class TelaSessoes extends javax.swing.JInternalFrame {

    ArrayList<Sessao> listaSessao = new ArrayList<>();

    private ControleSessao contSessao = new ControleSessao();
    private List<JPanel> paineis = new ArrayList<>();

    public TelaSessoes() {
        initComponents();

        listaSessao.addAll(contSessao.listarTodas());
        criarPaineis();
    }

    public void criarPaineis() {
        for (int i = 0; i < 10; i++) {

            int inicio = 1;
            int fim = 1;
            String data = "";
            int sala = 0;

            final Sessao s;

            if (i < listaSessao.size()) {

                s = listaSessao.get(i);

                SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

                Date dataSessao = s.getDataSessao();
                data = fmt.format(dataSessao);

                inicio = s.getInicio();
                fim = s.getTermino();

                sala = s.getIdSala().getIdSala();

            } else {
                s = null;
            }

            javax.swing.JLabel iconeVisualizar = new javax.swing.JLabel();
            javax.swing.JLabel iconeAlterar = new javax.swing.JLabel();
            javax.swing.JLabel iconeExcluir = new javax.swing.JLabel();
            javax.swing.JLabel p1Image1 = new javax.swing.JLabel();
            javax.swing.JLabel p1HoraInicio = new javax.swing.JLabel();
            javax.swing.JLabel p1HoraFim = new javax.swing.JLabel();
            javax.swing.JLabel p1Situacao = new javax.swing.JLabel();
            
            JPanel pa = new javax.swing.JPanel();
            pa.setBackground(new java.awt.Color(56, 145, 139));
            pa.setForeground(new java.awt.Color(56, 145, 139));
            pa.setPreferredSize(new java.awt.Dimension(180, 150));
            pa.setMaximumSize(new java.awt.Dimension(180, 150));
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

                p1Image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pipoca.png")));
                pa.add(p1Image1);
                p1Image1.setBounds(60, 10, 64, 64);
                javax.swing.JSeparator p1Separador = new javax.swing.JSeparator();
                pa.add(p1Separador);
                p1Separador.setBounds(0, 82, 184, 10);

                p1HoraInicio.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                p1HoraInicio.setForeground(new java.awt.Color(255, 255, 255));
                p1HoraInicio.setText("Sala: " + sala);
                pa.add(p1HoraInicio);
                p1HoraInicio.setBounds(6, 98, 184, 15);

                p1HoraFim.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                p1HoraFim.setForeground(new java.awt.Color(255, 255, 255));
                p1HoraFim.setText("Início: " + inicio);
                pa.add(p1HoraFim);
                p1HoraFim.setBounds(6, 120, 184, 15);

                p1Situacao.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                p1Situacao.setForeground(new java.awt.Color(255, 255, 255));
                p1Situacao.setText("Fim: " + fim);
                pa.add(p1Situacao);
                p1Situacao.setBounds(6, 142, 96, 15);
                javax.swing.JSeparator p1Separador2 = new javax.swing.JSeparator();
                pa.add(p1Separador2);
                p1Separador2.setBounds(0, 170, 184, 10);

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdicionarSessao = new javax.swing.JLabel();
        grid = new javax.swing.JPanel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lixo.png"))); // NOI18N

        setBackground(new java.awt.Color(46, 51, 62));
        setBorder(null);
        setTitle("Sessões");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rolo.png"))); // NOI18N
        setName("Sessões"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1030, 600));
        getContentPane().setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 55, 1020, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/x.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(960, 4, 48, 48);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rolo-38.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(495, 0, 40, 50);

        btnAdicionarSessao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/+.png"))); // NOI18N
        btnAdicionarSessao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarSessao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarSessaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarSessaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarSessaoMouseExited(evt);
            }
        });
        getContentPane().add(btnAdicionarSessao);
        btnAdicionarSessao.setBounds(490, 540, 48, 50);

        grid.setBackground(new java.awt.Color(46, 51, 62));
        grid.setForeground(new java.awt.Color(46, 51, 62));
        grid.setLayout(new java.awt.GridLayout(2, 5, 4, 4));
        getContentPane().add(grid);
        grid.setBounds(40, 100, 940, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnAdicionarSessaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarSessaoMouseClicked
        TelaAdicionarSessao telaAdicionarSessao = new TelaAdicionarSessao(null, true);

        telaAdicionarSessao.setVisible(true);

        if (telaAdicionarSessao.getCancelar() != 1) {

            Sessao s = telaAdicionarSessao.getSessao();

            contSessao.inserir(s);

            listaSessao.clear();

            listaSessao.addAll(contSessao.listarTodas());

            destruirPaineis();
            criarPaineis();

        }
    }//GEN-LAST:event_btnAdicionarSessaoMouseClicked

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

    private void iconeVisualizarMouseClicked(java.awt.event.MouseEvent evt, Sessao sessao) {

        TelaAdicionarSessao telaAdicionarSessao = new TelaAdicionarSessao(null, true);

        telaAdicionarSessao.setSessao(sessao);

        telaAdicionarSessao.proibirAlteracao();

        telaAdicionarSessao.setVisible(true);

    }

    private void iconeAlterarMouseClicked(java.awt.event.MouseEvent evt, Sessao sessao) {

        TelaAdicionarSessao telaAdicionarSessao = new TelaAdicionarSessao(null, true);

        telaAdicionarSessao.setSessao(sessao);

        telaAdicionarSessao.setVisible(true);

        if (telaAdicionarSessao.getCancelar() != 1) {

            Sessao f = telaAdicionarSessao.getSessao();
            
            contSessao.alterar(f);

            listaSessao.clear();
            listaSessao.addAll(contSessao.listarTodas());

            destruirPaineis();
            criarPaineis();

        }

    }

    private void iconeExcluirMouseClicked(java.awt.event.MouseEvent evt, Sessao Sessao) {

        if (JOptionPane.showConfirmDialog(this, "Deseja apagar esta Sessão ?",
                "Apagar Sessão",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {

            contSessao.excluir(Sessao);

            listaSessao.clear();
            listaSessao.addAll(contSessao.listarTodas());

            destruirPaineis();
            criarPaineis();
        }

    }
    
    public void destruirPaineis() {
        grid.removeAll();
    }

    private void btnAdicionarSessaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarSessaoMouseEntered
        btnAdicionarSessao.setIcon(new ImageIcon("src/Imagens/+2.png"));
    }//GEN-LAST:event_btnAdicionarSessaoMouseEntered

    private void btnAdicionarSessaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarSessaoMouseExited
        btnAdicionarSessao.setIcon(new ImageIcon("src/Imagens/+.png"));
    }//GEN-LAST:event_btnAdicionarSessaoMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdicionarSessao;
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

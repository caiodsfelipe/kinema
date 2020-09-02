package visao;

import controle.ControleFilme;
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
import modelo.Filme;

public class TelaFilmes extends javax.swing.JInternalFrame {

    ArrayList<Filme> listaFilme = new ArrayList<>();

    private ControleFilme contFilme = new ControleFilme();
    private List<JPanel> paineis = new ArrayList<>();

    public TelaFilmes() {
        initComponents();

        listaFilme.addAll(contFilme.listarTodos());
        criarPaineis();
    }

    public void criarPaineis() {
        for (int i = 0; i < 10; i++) {

            String lanc = "";
            String gen = "";
            String nome = "";

            final Filme f;

            if (i < listaFilme.size()) {

                f = listaFilme.get(i);

                nome = f.getNome();
                gen = f.getGenero();

                SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
                Date lancDate = f.getLancamento();
                lanc = fmt.format(lancDate);

            } else {
                f = null;
            }

            javax.swing.JLabel iconeFilme = new javax.swing.JLabel();
            javax.swing.JLabel iconeVisualizar = new javax.swing.JLabel();
            javax.swing.JLabel iconeAlterar = new javax.swing.JLabel();
            javax.swing.JLabel iconeExcluir = new javax.swing.JLabel();
            javax.swing.JSeparator Separador = new javax.swing.JSeparator();
            javax.swing.JSeparator Separador2 = new javax.swing.JSeparator();
            javax.swing.JLabel Nome = new javax.swing.JLabel();
            javax.swing.JLabel Genero = new javax.swing.JLabel();
            javax.swing.JLabel Lancamento = new javax.swing.JLabel();

            JPanel pa = new javax.swing.JPanel();
            pa.setBackground(new java.awt.Color(56, 145, 139));
            pa.setForeground(new java.awt.Color(56, 145, 139));
            pa.setPreferredSize(new java.awt.Dimension(180, 150));
            pa.setLayout(null);

            if (f != null) {

                pa.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        painelMouseEntered(evt, pa);
                    }

                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        painelMouseExited(evt, pa);
                    }
                });

                iconeFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/filme.png")));
                pa.add(iconeFilme);
                iconeFilme.setBounds(70, 20, 48, 48);
                pa.add(Separador);
                Separador.setBounds(0, 82, 185, 10);

                Nome.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Nome.setForeground(new java.awt.Color(255, 255, 255));
                Nome.setText("Nome: " + nome);
                pa.add(Nome);
                Nome.setBounds(10, 98, 150, 15);

                Genero.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Genero.setForeground(new java.awt.Color(255, 255, 255));
                Genero.setText("Gênero: " + gen);
                pa.add(Genero);
                Genero.setBounds(10, 142, 150, 15);

                Lancamento.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Lancamento.setForeground(new java.awt.Color(255, 255, 255));
                Lancamento.setText("Estreia: " + lanc);
                pa.add(Lancamento);
                Lancamento.setBounds(10, 120, 150, 15);

                pa.add(Separador2);
                Separador2.setBounds(0, 170, 184, 10);

                iconeVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/visualizar.png")));

                if (f != null) {

                    iconeVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeVisualizarMouseClicked(evt, f);
                        }
                    });

                }

                iconeVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeVisualizar);
                iconeVisualizar.setBounds(15, 180, 16, 20);

                iconeExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lixo.png")));

                if (f != null) {

                    iconeExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeExcluirMouseClicked(evt, f);
                        }
                    });

                }

                iconeExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeExcluir);
                iconeExcluir.setBounds(150, 180, 16, 20);

                iconeAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alterar.png")));

                if (f != null) {

                    iconeAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeAlterarMouseClicked(evt, f);
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdicionarFilme = new javax.swing.JLabel();
        grid = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(46, 51, 62));
        setBorder(null);
        setTitle("Filmes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/filme.png"))); // NOI18N
        setName("Filmes"); // NOI18N
        setPreferredSize(new java.awt.Dimension(824, 556));
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
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/filme-38.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(495, 0, 38, 50);

        btnAdicionarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/+.png"))); // NOI18N
        btnAdicionarFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarFilmeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarFilmeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarFilmeMouseExited(evt);
            }
        });
        getContentPane().add(btnAdicionarFilme);
        btnAdicionarFilme.setBounds(490, 540, 48, 50);

        grid.setBackground(new java.awt.Color(46, 51, 62));
        grid.setLayout(new java.awt.GridLayout(2, 5, 4, 4));
        getContentPane().add(grid);
        grid.setBounds(40, 100, 940, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(780, 540, 20, 40);

        txtPesquisar.setToolTipText("Digite para pesquisar");
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(810, 550, 170, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnAdicionarFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarFilmeMouseClicked
        TelaAdicionarFilme telaAdicionarFilme = new TelaAdicionarFilme(null, true);

        telaAdicionarFilme.setVisible(true);

        if (telaAdicionarFilme.getCancelar() != 1) {

            Filme f = telaAdicionarFilme.getFilme();

            contFilme.inserir(f);

            listaFilme.clear();

            listaFilme.addAll(contFilme.listarTodos());

            destruirPaineis();
            criarPaineis();

        }
    }//GEN-LAST:event_btnAdicionarFilmeMouseClicked

    private void btnAdicionarFilmeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarFilmeMouseEntered
        btnAdicionarFilme.setIcon(new ImageIcon("src/Imagens/+2.png"));
    }//GEN-LAST:event_btnAdicionarFilmeMouseEntered

    private void btnAdicionarFilmeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarFilmeMouseExited
        btnAdicionarFilme.setIcon(new ImageIcon("src/Imagens/+.png"));
    }//GEN-LAST:event_btnAdicionarFilmeMouseExited

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        listaFilme.clear();
        listaFilme.addAll(contFilme.listarPorNome(txtPesquisar.getText()));

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

    private void iconeVisualizarMouseClicked(java.awt.event.MouseEvent evt, Filme filme) {

        TelaAdicionarFilme telaAdicionarFilme = new TelaAdicionarFilme(null, true);

        telaAdicionarFilme.setFilme(filme);

        telaAdicionarFilme.proibirAlteracao();

        telaAdicionarFilme.setVisible(true);

    }

    private void iconeAlterarMouseClicked(java.awt.event.MouseEvent evt, Filme filme) {

        TelaAdicionarFilme telaAdicionarFilme = new TelaAdicionarFilme(null, true);

        telaAdicionarFilme.setFilme(filme);

        telaAdicionarFilme.setVisible(true);

        if (telaAdicionarFilme.getCancelar() != 1) {

            Filme f = telaAdicionarFilme.getFilme();

            contFilme.alterar(f);

            listaFilme.clear();
            listaFilme.addAll(contFilme.listarTodos());

            destruirPaineis();
            criarPaineis();

        }

    }

    private void iconeExcluirMouseClicked(java.awt.event.MouseEvent evt, Filme filme) {

        if (JOptionPane.showConfirmDialog(this, "Deseja apagar este Filme ?",
                "Apagar Filme",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {

            if (contFilme.listarPorSessao(filme).isEmpty()) {

                contFilme.excluir(filme);

                listaFilme.clear();
                listaFilme.addAll(contFilme.listarTodos());

                destruirPaineis();
                criarPaineis();

            } else {

                JOptionPane.showMessageDialog(this,
                        "Este Filme está associado a uma Sessão, portanto não "
                        + "pode ser excluído.");

            }

        }

    }

    public void destruirPaineis() {
        grid.removeAll();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdicionarFilme;
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}

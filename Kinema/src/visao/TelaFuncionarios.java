package visao;

import controle.ControleFuncionario;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import modelo.Funcionario;

public class TelaFuncionarios extends javax.swing.JInternalFrame {

    ArrayList<Funcionario> listaFunc = new ArrayList<>();

    private ControleFuncionario contFunc = new ControleFuncionario();
    private List<JPanel> paineis = new ArrayList<>();

    public TelaFuncionarios() {
        initComponents();

        listaFunc.addAll(contFunc.listarTodos());
        criarPaineis();
    }

    public void criarPaineis() {
        for (int i = 0; i < 10; i++) {

            String nome = "";
            String email = "";
            String telefone = "";

            final Funcionario f;

            if (i < listaFunc.size()) {

                f = listaFunc.get(i);

                nome = f.getNome();
                email = f.getEmail();
                telefone = f.getTelefone();

            } else {
                f = null;
            }

            javax.swing.JLabel iconeFunc = new javax.swing.JLabel();
            javax.swing.JLabel iconeVisualizar = new javax.swing.JLabel();
            javax.swing.JLabel iconeAlterar = new javax.swing.JLabel();
            javax.swing.JLabel iconeExcluir = new javax.swing.JLabel();
            javax.swing.JSeparator Separador = new javax.swing.JSeparator();
            javax.swing.JSeparator Separador2 = new javax.swing.JSeparator();
            javax.swing.JLabel Nome = new javax.swing.JLabel();
            javax.swing.JLabel Email = new javax.swing.JLabel();
            javax.swing.JLabel Telefone = new javax.swing.JLabel();

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

                iconeFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionario.png"))); // NOI18N
                pa.add(iconeFunc);
                iconeFunc.setBounds(70, 10, 48, 48);
                pa.add(Separador);
                Separador.setBounds(0, 82, 184, 10);

                Nome.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Nome.setForeground(new java.awt.Color(255, 255, 255));
                Nome.setText("Nome: " + nome);
                pa.add(Nome);
                Nome.setBounds(6, 98, 150, 15);

                Telefone.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Telefone.setForeground(new java.awt.Color(255, 255, 255));
                Telefone.setText("Telefone: " + telefone);
                pa.add(Telefone);
                Telefone.setBounds(6, 142, 150, 15);

                Email.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Email.setForeground(new java.awt.Color(255, 255, 255));
                Email.setText("Email: " + email);
                pa.add(Email);
                Email.setBounds(6, 120, 150, 15);

                pa.add(Separador2);
                Separador2.setBounds(0, 170, 184, 10);

                iconeVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/visualizar.png"))); // NOI18N

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

                iconeExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lixo.png"))); // NOI18N

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

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnAdicionarFuncionario = new javax.swing.JLabel();
        grid = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(46, 51, 62));
        setBorder(null);
        setTitle("Funcionários");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionario.png"))); // NOI18N
        setName("Funcionários"); // NOI18N
        setPreferredSize(new java.awt.Dimension(824, 556));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionario-38.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(495, 3, 40, 50);

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

        btnAdicionarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/+.png"))); // NOI18N
        btnAdicionarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarFuncionarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarFuncionarioMouseExited(evt);
            }
        });
        getContentPane().add(btnAdicionarFuncionario);
        btnAdicionarFuncionario.setBounds(490, 540, 48, 50);

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
    public void destruirPaineis() {
        grid.removeAll();
    }
    private void btnAdicionarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarFuncionarioMouseClicked
        TelaAdicionarFuncionario telaAdicionarFuncionario = new TelaAdicionarFuncionario(null, true);

        telaAdicionarFuncionario.setVisible(true);

        Funcionario f = telaAdicionarFuncionario.getFunc();

        if (telaAdicionarFuncionario.getCancelar() != 1) {

            contFunc.inserir(f);

            listaFunc.clear();

            listaFunc.addAll(contFunc.listarTodos());

            destruirPaineis();
            criarPaineis();

        }

    }//GEN-LAST:event_btnAdicionarFuncionarioMouseClicked

    private void btnAdicionarFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarFuncionarioMouseEntered
        btnAdicionarFuncionario.setIcon(new ImageIcon("src/Imagens/+2.png"));
    }//GEN-LAST:event_btnAdicionarFuncionarioMouseEntered

    private void btnAdicionarFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarFuncionarioMouseExited
        btnAdicionarFuncionario.setIcon(new ImageIcon("src/Imagens/+.png"));
    }//GEN-LAST:event_btnAdicionarFuncionarioMouseExited

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        listaFunc.clear();
        listaFunc.addAll(contFunc.listarPorNome(txtPesquisar.getText()));

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

    private void iconeVisualizarMouseClicked(java.awt.event.MouseEvent evt, Funcionario func) {

        TelaAdicionarFuncionario telaAdicionarFuncionario = new TelaAdicionarFuncionario(null, true);

        telaAdicionarFuncionario.setFunc(func);

        telaAdicionarFuncionario.proibirAlteracao();

        telaAdicionarFuncionario.setVisible(true);

    }

    private void iconeExcluirMouseClicked(java.awt.event.MouseEvent evt, Funcionario func) {

        if (JOptionPane.showConfirmDialog(this, "Deseja apagar este Funcionário ?",
                "Apagar Funcionário",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {

            if (!ControleFuncionario.getUsuarioLogado().equals(func)) {

                if (contFunc.listarPorVenda(func).isEmpty()) {

                    contFunc.excluir(func);

                    listaFunc.clear();
                    listaFunc.addAll(contFunc.listarTodos());

                    destruirPaineis();
                    criarPaineis();

                } else {

                    JOptionPane.showMessageDialog(this,
                            "Este Funcionário está associado à uma Venda, portanto não "
                            + "pode ser excluído.");

                }
            } else {
                
                JOptionPane.showMessageDialog(this,
                            "Este Funcionário está atualmente logado no sistema.");
                
            }
        }

    }

    private void iconeAlterarMouseClicked(java.awt.event.MouseEvent evt, Funcionario func) {

        TelaAdicionarFuncionario telaAdicionarFuncionario = new TelaAdicionarFuncionario(null, true);

        telaAdicionarFuncionario.setFunc(func);

        telaAdicionarFuncionario.setVisible(true);

        Funcionario f = telaAdicionarFuncionario.getFunc();

        if (telaAdicionarFuncionario.getCancelar() != 1) {

            contFunc.alterar(f);

            listaFunc.clear();
            listaFunc.addAll(contFunc.listarTodos());

            destruirPaineis();
            criarPaineis();

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdicionarFuncionario;
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}

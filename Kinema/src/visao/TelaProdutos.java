package visao;

import controle.ControleProduto;
import modelo.Produto;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class TelaProdutos extends javax.swing.JInternalFrame {

    ArrayList<Produto> listaProd = new ArrayList<>();

    private ControleProduto contProd = new ControleProduto();
    private List<JPanel> paineis = new ArrayList<>();

    public TelaProdutos() {
        initComponents();

        listaProd.addAll(contProd.listarTodos());
        criarPaineis();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnAdicionarProduto = new javax.swing.JLabel();
        grid = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(46, 51, 62));
        setBorder(null);
        setTitle("Produtos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produto.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(47, 27));
        setName("Produtos"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 47, 0));
        setPreferredSize(new java.awt.Dimension(824, 556));
        getContentPane().setLayout(null);

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

        btnAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/+.png"))); // NOI18N
        btnAdicionarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarProdutoMouseExited(evt);
            }
        });
        getContentPane().add(btnAdicionarProduto);
        btnAdicionarProduto.setBounds(490, 540, 48, 50);

        grid.setBackground(new java.awt.Color(46, 51, 62));
        grid.setLayout(new java.awt.GridLayout(2, 5, 4, 4));
        getContentPane().add(grid);
        grid.setBounds(40, 100, 940, 430);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 55, 1020, 28);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produto-38.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(495, 2, 38, 50);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/x.png"))); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(960, 4, 48, 48);

        btnRelatorio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio.png"))); // NOI18N
        btnRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelatorioMouseClicked(evt);
            }
        });
        getContentPane().add(btnRelatorio);
        btnRelatorio.setBounds(12, 3, 40, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void criarPaineis() {
        for (int i = 0; i < 10; i++) {

            String descricao = "";
            float valor = 0;

            final Produto p;

            if (i < listaProd.size()) {

                p = listaProd.get(i);

                descricao = p.getDescricao();
                valor = p.getValor();

            } else {
                p = null;
            }

            javax.swing.JLabel iconeDist = new javax.swing.JLabel();
            javax.swing.JLabel iconeVisualizar = new javax.swing.JLabel();
            javax.swing.JLabel iconeAlterar = new javax.swing.JLabel();
            javax.swing.JLabel iconeExcluir = new javax.swing.JLabel();
            javax.swing.JSeparator Separador = new javax.swing.JSeparator();
            javax.swing.JSeparator Separador2 = new javax.swing.JSeparator();
            javax.swing.JLabel Nome = new javax.swing.JLabel();
            javax.swing.JLabel Valor = new javax.swing.JLabel();

            JPanel pa = new javax.swing.JPanel();
            pa.setPreferredSize(new java.awt.Dimension(180, 150));
            pa.setLayout(null);

            if (p != null) {

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

                iconeDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produto.png"))); // NOI18N
                pa.add(iconeDist);
                iconeDist.setBounds(70, 10, 48, 48);

                Nome.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Nome.setForeground(new java.awt.Color(255, 255, 255));
                Nome.setText("Descrição: " + descricao);
                pa.add(Nome);
                Nome.setBounds(6, 100, 150, 15);

                Valor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                Valor.setForeground(new java.awt.Color(255, 255, 255));
                Valor.setText("Valor: " + valor);
                pa.add(Valor);
                Valor.setBounds(6, 130, 150, 15);

                iconeVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/visualizar.png")));

                if (p != null) {

                    iconeVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeVisualizarMouseClicked(evt, p);
                        }
                    });

                }

                iconeVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeVisualizar);
                iconeVisualizar.setBounds(15, 180, 16, 20);

                iconeExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lixo.png")));

                if (p != null) {

                    iconeExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeExcluirMouseClicked(evt, p);
                        }
                    });

                }

                iconeExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeExcluir);
                iconeExcluir.setBounds(150, 180, 16, 20);

                iconeAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alterar.png")));

                if (p != null) {

                    iconeAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconeAlterarMouseClicked(evt, p);
                        }
                    });

                }

                iconeAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                pa.add(iconeAlterar);
                iconeAlterar.setBounds(85, 180, 16, 20);

                pa.add(Separador2);
                Separador2.setBounds(0, 160, 184, 10);

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

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        listaProd.clear();
        listaProd.addAll(contProd.listarPorNome(txtPesquisar.getText()));

        destruirPaineis();
        criarPaineis();
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnAdicionarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoMouseClicked

        TelaAdicionarProduto telaAdicionarProduto = new TelaAdicionarProduto(null, true);

        telaAdicionarProduto.setVisible(true);

        Produto p = telaAdicionarProduto.getProduto();

        if (telaAdicionarProduto.getCancelar() != 1) {

            contProd.inserir(p);

            listaProd.clear();
            listaProd.addAll(contProd.listarTodos());

            destruirPaineis();
            criarPaineis();

        }
    }//GEN-LAST:event_btnAdicionarProdutoMouseClicked

    private void btnAdicionarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoMouseEntered
        btnAdicionarProduto.setIcon(new ImageIcon("src/Imagens/+2.png"));
    }//GEN-LAST:event_btnAdicionarProdutoMouseEntered

    private void btnAdicionarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoMouseExited
        btnAdicionarProduto.setIcon(new ImageIcon("src/Imagens/+.png"));
    }//GEN-LAST:event_btnAdicionarProdutoMouseExited

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        dispose();
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMouseClicked
        // Imprimindo o relatório a partir de uma lista de usuários listado pelo controle,
        // ou uma lista associada a uma tabela
        // Primeiro passo - alterar os campos do relatório no Designer de Relatório, utilizando
        // os Fields do Report Inspector, adicionando na propriedade Description
        // o nome do atributo na classe. A propriedade Description é utilizada para
        // preencher o valor dos Fields com os valores dos objetos existentes na
        // lista a ser passada para o Relatório.
        try {

            // cria um objeto da classe JasperReport, ou seja, um relatório
            // deve-se passar o caminho onde está o relatório dentro do
            // seu projeto
            JasperReport relatorio
            = JasperCompileManager.compileReport("src/relatórios/RelatorioProdutos.jrxml");

            // Preencher o relatório com uma lista de usuários passada como um JRBeanCollectionDataSource
            JasperPrint relatorioPreenchido = JasperFillManager.fillReport(relatorio, null,
                new JRBeanCollectionDataSource(contProd.listarTodos()));

            // criar uma janela para a apresentação do relatório
            JasperViewer janelaRelatorio = new JasperViewer(relatorioPreenchido, false);

            // tornar visível a janela criada para o relatório
            janelaRelatorio.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao gerar o relatório.");
        }
    }//GEN-LAST:event_btnRelatorioMouseClicked

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

    private void iconeVisualizarMouseClicked(java.awt.event.MouseEvent evt, Produto produto) {

        TelaAdicionarProduto telaAdicionarProduto = new TelaAdicionarProduto(null, true);

        telaAdicionarProduto.setProduto(produto);

        telaAdicionarProduto.proibirAlteracao();

        telaAdicionarProduto.setVisible(true);

    }

    private void iconeAlterarMouseClicked(java.awt.event.MouseEvent evt, Produto produto) {

        TelaAdicionarProduto telaAdicionarProduto = new TelaAdicionarProduto(null, true);

        telaAdicionarProduto.setProduto(produto);

        telaAdicionarProduto.setVisible(true);

        Produto p = telaAdicionarProduto.getProduto();

        if (telaAdicionarProduto.getCancelar() != 1) {

            contProd.alterar(p);

            listaProd.clear();
            listaProd.addAll(contProd.listarTodos());

            destruirPaineis();
            criarPaineis();

        }

    }

    private void iconeExcluirMouseClicked(java.awt.event.MouseEvent evt, Produto produto) {

        if (JOptionPane.showConfirmDialog(this, "Deseja apagar esta Produto ?",
                "Apagar Produto",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {

            if (contProd.listarPorVenda(produto).isEmpty()) {

                contProd.excluir(produto);

                listaProd.clear();
                listaProd.addAll(contProd.listarTodos());

                destruirPaineis();
                criarPaineis();

            } else {

                JOptionPane.showMessageDialog(this,
                        "Este Produto está associado a uma Venda, portanto não "
                        + "pode ser excluído.");

            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdicionarProduto;
    private javax.swing.JLabel btnRelatorio;
    private javax.swing.JLabel btnSair;
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}

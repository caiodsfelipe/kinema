package visao;

import controle.ControleFuncionario;
import controle.ControleIngresso;
import controle.ControleProduto;
import controle.ControleSessao;
import controle.ControleVenda;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ingresso;
import modelo.Item_venda;
import modelo.Produto;
import modelo.Sala;
import modelo.Sessao;
import modelo.Venda;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class TelaVenda extends javax.swing.JInternalFrame {

    private ControleProduto contProd = new ControleProduto();
    ArrayList<Produto> listaProd = new ArrayList<>();

    ArrayList<Produto> listaProdutoAdicionado = new ArrayList<>();
    ArrayList listaQtd = new ArrayList<>();

    private ControleSessao contSessao = new ControleSessao();
    ArrayList<Sessao> listaSessao = new ArrayList<>();

    private ControleVenda contVenda = new ControleVenda();
    private ControleIngresso contIngresso = new ControleIngresso();

    ArrayList<Ingresso> listaIngresso = new ArrayList<>();

    public TelaVenda() {
        initComponents();

        listaProd.addAll(contProd.listarTodos());
        listaSessao.addAll(contSessao.listarTodasDisponiveis());

        atualizaComboSessoes();
        atualizaTabelaProdutos();
        atualizaTabelaIngressos();

        dataChooser.setDate(new Date());

        btnEfetuarVenda.setVisible(false);
    }

    private void atualizaComboSessoes() {

        comboSessao.removeAll();

        String string = "";

        for (Sessao s : listaSessao) {
            string = "Sessão " + s.getIdSessao() + " | " + s.getIdFilme().getNome()
                    + " | " + s.getInicio();
            comboSessao.addItem(string);
        }

    }

    private void atualizaTabelaProdutos() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaProd.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Produto p : listaProd) {
            modelo.addRow(new Object[]{p.getDescricao(), p.getValor()});
        }

    }

    private void atualizaTabelaProdutosAdicionado() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaProdAdd.getModel();

        int qtdProdAdd = listaProdutoAdicionado.size();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (int i = 0; i < qtdProdAdd; i++) {
            Produto p = listaProdutoAdicionado.get(i);

            modelo.addRow(new Object[]{p.getDescricao(), p.getValor(), listaQtd.get(i)});
        }

    }

    private void atualizaTabelaIngressos() {

        DefaultTableModel modelo = (DefaultTableModel) tabelaIngressos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Ingresso i : listaIngresso) {
            modelo.addRow(new Object[]{i.getIdSessao(), i.getQtd(), i.getValor()});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnSair = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboSessao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtValorIngresso = new javax.swing.JTextField();
        btnRemoverIngresso = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        btnEfetuarVenda = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnAdicionarIngresso = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdAdd = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaIngressos = new javax.swing.JTable();
        btnLimparCampos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        dataChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaProd = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnAdicionarProduto1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnRemoverProduto1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        qtdIngressos = new javax.swing.JSpinner();
        qtdProduto = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(46, 51, 62));
        setBorder(null);
        getContentPane().setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 55, 1020, 10);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/x.png"))); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(960, 4, 48, 48);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sessão");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 110, 50, 15);

        comboSessao.setBorder(null);
        comboSessao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSessaoItemStateChanged(evt);
            }
        });
        getContentPane().add(comboSessao);
        comboSessao.setBounds(40, 130, 430, 20);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 440, 27, 15);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Qtd");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 210, 30, 15);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(810, 440, 28, 15);

        txtTotal.setEditable(false);
        txtTotal.setBorder(null);
        getContentPane().add(txtTotal);
        txtTotal.setBounds(700, 460, 290, 20);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Ingresso");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 210, 100, 15);

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inteira", "Meia" }));
        comboTipo.setBorder(null);
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });
        getContentPane().add(comboTipo);
        comboTipo.setBounds(270, 230, 200, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(40, 180, 430, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(40, 280, 430, 10);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor unitário");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 210, 80, 15);

        txtValorIngresso.setEditable(false);
        txtValorIngresso.setBorder(null);
        getContentPane().add(txtValorIngresso);
        txtValorIngresso.setBounds(40, 230, 80, 20);

        btnRemoverIngresso.setBackground(new java.awt.Color(255, 153, 153));
        btnRemoverIngresso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoverIngresso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverIngressoMouseClicked(evt);
            }
        });
        btnRemoverIngresso.setLayout(null);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Remover");
        btnRemoverIngresso.add(jLabel9);
        jLabel9.setBounds(70, 7, 58, 15);

        getContentPane().add(btnRemoverIngresso);
        btnRemoverIngresso.setBounds(270, 320, 200, 30);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(510, 280, 10, 300);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(510, 390, 480, 10);

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Qtd. Produto");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(540, 310, 80, 15);

        btnEfetuarVenda.setBackground(new java.awt.Color(56, 145, 139));
        btnEfetuarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEfetuarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEfetuarVendaMouseClicked(evt);
            }
        });
        btnEfetuarVenda.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Efetuar Venda");
        btnEfetuarVenda.add(jLabel14);
        jLabel14.setBounds(60, 7, 100, 15);

        getContentPane().add(btnEfetuarVenda);
        btnEfetuarVenda.setBounds(540, 510, 220, 30);

        btnAdicionarIngresso.setBackground(new java.awt.Color(56, 145, 139));
        btnAdicionarIngresso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarIngresso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarIngressoMouseClicked(evt);
            }
        });
        btnAdicionarIngresso.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Adicionar");
        btnAdicionarIngresso.add(jLabel15);
        jLabel15.setBounds(70, 7, 62, 15);

        getContentPane().add(btnAdicionarIngresso);
        btnAdicionarIngresso.setBounds(40, 320, 200, 30);

        tabelaProdAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Qtd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdAdd);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(770, 130, 220, 160);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Produtos Adicionados");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(770, 110, 180, 15);

        tabelaIngressos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sessão", "Preço", "Qtd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaIngressos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 380, 430, 160);

        btnLimparCampos.setBackground(new java.awt.Color(255, 153, 153));
        btnLimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparCamposMouseClicked(evt);
            }
        });
        btnLimparCampos.setLayout(null);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Limpar Campos");
        btnLimparCampos.add(jLabel12);
        jLabel12.setBounds(51, 7, 100, 15);

        getContentPane().add(btnLimparCampos);
        btnLimparCampos.setBounds(790, 510, 200, 30);

        dataChooser.setEnabled(false);
        getContentPane().add(dataChooser);
        dataChooser.setBounds(540, 460, 140, 20);

        tabelaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaProd);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(540, 130, 220, 160);

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Produtos Disponíveis");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(540, 110, 220, 15);

        btnAdicionarProduto1.setBackground(new java.awt.Color(56, 145, 139));
        btnAdicionarProduto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarProduto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarProduto1MouseClicked(evt);
            }
        });
        btnAdicionarProduto1.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Adicionar");
        btnAdicionarProduto1.add(jLabel16);
        jLabel16.setBounds(25, 7, 62, 15);

        getContentPane().add(btnAdicionarProduto1);
        btnAdicionarProduto1.setBounds(650, 320, 110, 30);

        btnRemoverProduto1.setBackground(new java.awt.Color(255, 153, 153));
        btnRemoverProduto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoverProduto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverProduto1MouseClicked(evt);
            }
        });
        btnRemoverProduto1.setLayout(null);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Remover");
        btnRemoverProduto1.add(jLabel17);
        jLabel17.setBounds(22, 7, 70, 15);

        getContentPane().add(btnRemoverProduto1);
        btnRemoverProduto1.setBounds(890, 320, 100, 30);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(510, 90, 10, 300);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/venda-38.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(495, 3, 40, 50);

        qtdIngressos.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        qtdIngressos.setBorder(null);
        getContentPane().add(qtdIngressos);
        qtdIngressos.setBounds(160, 230, 80, 20);

        qtdProduto.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        qtdProduto.setBorder(null);
        getContentPane().add(qtdProduto);
        qtdProduto.setBounds(540, 330, 70, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        dispose();
    }//GEN-LAST:event_btnSairMouseClicked

    private void comboSessaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSessaoItemStateChanged
        int i = comboSessao.getSelectedIndex();

        txtValorIngresso.setText(String.valueOf(listaSessao.get(i).getValorIngresso()));

        atualizaIngresso();

        atualizaTotal();
    }//GEN-LAST:event_comboSessaoItemStateChanged

    private void btnAdicionarIngressoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarIngressoMouseClicked
        if ((int) qtdIngressos.getValue() == 0) {
            JOptionPane.showMessageDialog(this,
                    "A quantidade de Ingressos deve ser diferente de 0 "
                    + "para efetuar esta operação.");
        } else {

            Sessao s = listaSessao.get(comboSessao.getSelectedIndex());
            Sala l = s.getIdSala();
            int qtd = (int) qtdIngressos.getValue();

            if (s.getLotacao() + qtd > l.getCapacidade()) {
                JOptionPane.showMessageDialog(this,
                        "Esta Sessão não comporta mais " + qtd + " pessoas.");
            } else {

                Ingresso i = new Ingresso();

                i.setIdIngresso(0);
                i.setExpedicao(new Date());
                i.setIdSessao(listaSessao.get(comboSessao.getSelectedIndex()));
                i.setTipo(comboTipo.getSelectedIndex());
                i.setValor(Float.valueOf(txtValorIngresso.getText()));
                i.setQtd((int) qtdIngressos.getValue());

                listaIngresso.add(i);

                btnEfetuarVenda.setVisible(true);

            }

        }

        atualizaTabelaIngressos();
        atualizaTotal();
    }//GEN-LAST:event_btnAdicionarIngressoMouseClicked

    private void btnRemoverIngressoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverIngressoMouseClicked
        int linha = tabelaIngressos.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(this,
                    "Selecione um Ingresso na Tabela abaixo.");
        } else {
            Ingresso i = listaIngresso.get(linha);

            listaIngresso.remove(i);

            if (listaIngresso.isEmpty()) {
                btnEfetuarVenda.setVisible(false);
            }
        }

        atualizaTabelaIngressos();
        atualizaTotal();
    }//GEN-LAST:event_btnRemoverIngressoMouseClicked

    private void btnLimparCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparCamposMouseClicked
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposMouseClicked

    private void btnEfetuarVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEfetuarVendaMouseClicked

        if (JOptionPane.showConfirmDialog(this, "Deseja efetuar a venda ?",
                "Efetuar Venda",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {

            Venda v = new Venda();

            List<Item_venda> listaItens = new ArrayList<>();

            int contador = 0;

            v.setData(dataChooser.getDate());
            v.setTotal(Float.valueOf(txtTotal.getText()));
            v.setIdVenda(0);
            v.setIdFuncionário(ControleFuncionario.getUsuarioLogado());

            for (Produto p : listaProdutoAdicionado) {
                Item_venda i = new Item_venda();

                i.setIdProduto(p);
                i.setQtd((int) tabelaProdAdd.getValueAt(contador, 2));
                i.setValor_unit(p.getValor());
                i.setIdVenda(v);

                listaItens.add(i);

                contador++;
            }

            v.setListaItens(listaItens);
            contVenda.inserir(v);

            if (!listaIngresso.isEmpty()) {
                for (Ingresso i : listaIngresso) {

                    i.setIdVenda(v);

                    contIngresso.inserir(i);

                }
            }

            limparCampos();

            JOptionPane.showMessageDialog(rootPane, "Venda efetuada com sucesso !");

            List<Ingresso> lista = contIngresso.porVenda(v);

            Ingresso i = lista.get(0);

            int qtd = i.getQtd();

            Sessao s = i.getIdSessao();

            s.setLotacao(s.getLotacao() + qtd);

            contSessao.alterar(s);

            if (qtd > 1) {
                i.setQtd(1);

                for (int x = 0; x < qtd - 1; x++) {
                    lista.add(i);
                }
            }

            try {

                JasperReport relatorio
                        = JasperCompileManager.compileReport("src/relatórios/Ingresso.jrxml");

                JasperPrint relatorioPreenchido = JasperFillManager.fillReport(relatorio, null,
                        new JRBeanCollectionDataSource(lista));

                JasperViewer janelaRelatorio = new JasperViewer(relatorioPreenchido, false);

                janelaRelatorio.setVisible(true);

            } catch (JRException ex) {
                Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Erro ao gerar o relatório.");
            }

            listaSessao.clear();
            listaSessao.addAll(contSessao.listarTodasDisponiveis());

            atualizaComboSessoes();

        }
    }//GEN-LAST:event_btnEfetuarVendaMouseClicked

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        atualizaIngresso();

        atualizaTotal();
    }//GEN-LAST:event_comboTipoActionPerformed

    private void btnAdicionarProduto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarProduto1MouseClicked
        int linha = tabelaProd.getSelectedRow();
        int x = 0;

        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto");
        } else {
            if ((int) qtdProduto.getValue() <= 0) {
                JOptionPane.showMessageDialog(this,
                        "A quantidade deve ser maior que 0.");
            } else {

                Produto p = listaProd.get(linha);

                for (Produto pr : listaProdutoAdicionado) {
                    if (pr.equals(p)) {
                        x = 1;
                    }
                }

                if (x == 1) {
                    JOptionPane.showMessageDialog(this, "Este produto já foi adicionado.");
                } else {

                    listaProdutoAdicionado.add(p);
                    listaQtd.add((int) qtdProduto.getValue());

                    atualizaTabelaProdutosAdicionado();
                    atualizaTotal();

                    btnEfetuarVenda.setVisible(true);

                }
            }
        }
    }//GEN-LAST:event_btnAdicionarProduto1MouseClicked

    private void btnRemoverProduto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverProduto1MouseClicked
        int linha = tabelaProdAdd.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto");
        } else {

            Produto p = listaProdutoAdicionado.get(linha);

            listaProdutoAdicionado.remove(p);

            if (listaProdutoAdicionado.isEmpty()) {
                btnEfetuarVenda.setVisible(false);
            }

            atualizaTabelaProdutosAdicionado();
            atualizaTotal();

        }
    }//GEN-LAST:event_btnRemoverProduto1MouseClicked

    private void limparCampos() {
        qtdIngressos.setValue(1);
        qtdProduto.setValue(1);
        listaProdutoAdicionado.clear();
        listaIngresso.clear();
        txtTotal.setText("");
        btnEfetuarVenda.setVisible(false);

        atualizaTabelaProdutosAdicionado();
        atualizaTabelaIngressos();
    }

    private void atualizaIngresso() {
        int i = comboTipo.getSelectedIndex();

        if (i == 1) {
            float valor = Float.valueOf(txtValorIngresso.getText()) / 2;

            txtValorIngresso.setText(String.valueOf(valor));
        } else {
            int ii = comboSessao.getSelectedIndex();

            float valorOriginal = listaSessao.get(ii).getValorIngresso();

            txtValorIngresso.setText(String.valueOf(valorOriginal));
        }
    }

    private void atualizaTotal() {
        float total = 0;
        float valorProd = 0;
        int qtd = 0;

        for (Ingresso i : listaIngresso) {
            total += i.getValor() * i.getQtd();
        }

        for (int i = 0; i < listaProdutoAdicionado.size(); i++) {
            valorProd = listaProdutoAdicionado.get(i).getValor();
            qtd = (int) listaQtd.get(i);

            total += valorProd * qtd;
        }

        txtTotal.setText(String.valueOf(total));
    }

//    private float getTotalProdutos() {
//        float total = 0;
//        int i = 0;
//        int qtd = 0;
//
//        DefaultTableModel modelo = (DefaultTableModel) tabelaProdAdd.getModel();
//
//        for (Produto p : listaProdutoAdicionado) {
//
//            qtd = (int) modelo.getValueAt(i, 2);
//
//            total += p.getValor() * qtd;
//
//            i++;
//        }
//
//        return total;
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAdicionarIngresso;
    private javax.swing.JPanel btnAdicionarProduto1;
    private javax.swing.JPanel btnEfetuarVenda;
    private javax.swing.JPanel btnLimparCampos;
    private javax.swing.JPanel btnRemoverIngresso;
    private javax.swing.JPanel btnRemoverProduto1;
    private javax.swing.JLabel btnSair;
    private javax.swing.JComboBox<String> comboSessao;
    private javax.swing.JComboBox<String> comboTipo;
    private com.toedter.calendar.JDateChooser dataChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner qtdIngressos;
    private javax.swing.JSpinner qtdProduto;
    private javax.swing.JTable tabelaIngressos;
    private javax.swing.JTable tabelaProd;
    private javax.swing.JTable tabelaProdAdd;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValorIngresso;
    // End of variables declaration//GEN-END:variables
}

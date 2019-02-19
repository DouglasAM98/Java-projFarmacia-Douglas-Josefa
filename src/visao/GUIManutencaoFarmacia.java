/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.FarmaciaVO;
import servicos.FarmaciaServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 */
public class GUIManutencaoFarmacia extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "CNPJ", "Nome", "Telefone", "Endereço"});

    /**
     * Creates new form GUIManutencaoFarmacia
     */
    public GUIManutencaoFarmacia() {
        initComponents();

        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableFarmacia = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbBuscar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbConfirmarAlteracao = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jtPesq = new javax.swing.JTextField();
        jCombofiltro = new javax.swing.JComboBox<>();
        jlPesquisa = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtCNPJ = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jlCodigo = new javax.swing.JLabel();
        jlCnpj = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção Farmacia");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtableFarmacia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "CNPJ", "Nome", "Telefone", "Endereco"
            }
        ));
        jtableFarmacia.getTableHeader().setReorderingAllowed(false);
        jtableFarmacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableFarmaciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableFarmacia);

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbConfirmarAlteracao.setText("Confirmar Alteração");
        jbConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAlteracaoActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbConfirmarAlteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbBuscar)
                .addGap(51, 51, 51)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jbLimpar)
                        .addGap(43, 43, 43)
                        .addComponent(jbDeletar)
                        .addGap(43, 43, 43)
                        .addComponent(jbAlterar))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jbConfirmarAlteracao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jbConfirmarAlteracao)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDeletar)
                    .addComponent(jbLimpar)
                    .addComponent(jbBuscar)
                    .addComponent(jbAlterar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqKeyReleased(evt);
            }
        });

        jCombofiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "CNPJ", "Nome", "Telefone", "Endereço" }));
        jCombofiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombofiltroItemStateChanged(evt);
            }
        });

        jlPesquisa.setText("Pesquisa");

        jLayeredPane3.setLayer(jtPesq, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jCombofiltro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jlPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCombofiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombofiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesquisa))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtCodigo.setEnabled(false);

        jlCodigo.setText("Código");
        jlCodigo.setEnabled(false);

        jlCnpj.setText("CNPJ");

        jlNome.setText("Nome");

        jLabel1.setText("Telefone");

        jlEndereco.setText("Endereço");

        jLayeredPane4.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtCNPJ, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlCnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jlCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlNome))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jlCnpj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jlEndereco)
                        .addGap(18, 18, 18)
                        .addComponent(jtEndereco)
                        .addGap(22, 22, 22))))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCodigo)
                    .addComponent(jlNome)
                    .addComponent(jlEndereco)
                    .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCnpj)
                    .addComponent(jLabel1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane4)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    FarmaciaVO objFarmaciaVO = new FarmaciaVO();

    private void preencherTabela() {
        try {

            ArrayList<FarmaciaVO> farmacia = new ArrayList<>();
            FarmaciaServicos fs = ServicosFactory.getFarmaciaServicos();
            farmacia = fs.buscarFarmacia();

            limparTabela();

            for (int i = 0; i < farmacia.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(farmacia.get(i).getIdFarmacia()),
                    farmacia.get(i).getCNPJFarmacia(),
                    farmacia.get(i).getNomeFarmacia(),
                    String.valueOf(farmacia.get(i).getTelFarmacia()),
                    farmacia.get(i).getEnderecoFarmacia()

                });

                jtableFarmacia.setModel(dtm);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this,
                    "Erro!" + e.getMessage());

        }//fecha catch
    }//fecha preencherTabela

    private void limparTabela() {
        dtm.setNumRows(0);

    }//fecha limparTabela

    private void deletar() {
        try {
            int linha = jtableFarmacia.getSelectedRow();

            if (linha == 1) {
                JOptionPane.showMessageDialog(this, "Selecione uma linha!");
            } else {

                String id = jtableFarmacia.getValueAt(linha, 0).toString();
                FarmaciaServicos fs = ServicosFactory.getFarmaciaServicos();
                fs.deletarFarmacia(Long.parseLong(id));
                JOptionPane.showMessageDialog(this, "Farmácia excluído com Sucesso!");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao deletar" + e.getMessage());

        }
    }//fecha deletar

    private void filtrar() {
        try {
            if (jtPesq.getText().isEmpty()) {
                preencherTabela();
            } else {
                String filtro = jCombofiltro.getSelectedItem().toString();
                String pesq = jtPesq.getText();

                String query = "";
                if (filtro.equalsIgnoreCase("Código")) {
                    query = "where idfarmacia like '%" + pesq + "%'";
                } else if (filtro.equalsIgnoreCase("CNPJ")) {
                    query = "where CNPJ like '%" + pesq + "%'";
                } else if (filtro.equalsIgnoreCase("Nome")) {
                    query = "where nome like '%" + pesq + "%'";
                } else if (filtro.equalsIgnoreCase("Telefone")) {
                    query = "where telefone like '%" + pesq + "%'";
                } else if (filtro.equalsIgnoreCase("Endereço")) {
                    query = "where endereço like '%" + pesq + "%'";
                }/*else if (filtro.equalsIgnoreCase("CNPJ Maior que")) {
                   query = "where CNPJ > " + pesq;
               } else if (filtro.equalsIgnoreCase("CNPJ Menor que")) {
                   query = "where CNPJ < " + pesq;
               } else if (filtro.equalsIgnoreCase("Telefone maior que")){
                   query = "where telefone > " + pesq;
               } else if (filtro.equalsIgnoreCase("telefone menor que")) {
                   query = "where telefone < " + pesq;
               }*/

                FarmaciaServicos fs = ServicosFactory.getFarmaciaServicos();
                ArrayList<FarmaciaVO> farm = fs.filtrar(query);

                for (int i = 0; i < farm.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(farm.get(i).getIdFarmacia()),
                        farm.get(i).getCNPJFarmacia(),
                        farm.get(i).getNomeFarmacia(),
                        String.valueOf(farm.get(i).getTelFarmacia()),
                        farm.get(i).getEnderecoFarmacia()
                    });
                }//fecha for
                jtableFarmacia.setModel(dtm);

            }//fecha else
        } catch (Exception e) {
            jtPesq.setText("");
            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao filtrar!" + e.getMessage());

        }//fecha catch
    }//fecha filtrar

    private void alterar() {
        try {

            int linha = jtableFarmacia.getSelectedRow();
            if (linha != -1) {

                jtCodigo.setText((String) jtableFarmacia.getValueAt(linha, 0));
                jtCNPJ.setText((String) jtableFarmacia.getValueAt(linha, 1));
                jtNome.setText((String) jtableFarmacia.getValueAt(linha, 2));
                jtTelefone.setText((String) jtableFarmacia.getValueAt(linha, 3));
                jtEndereco.setText((String) jtableFarmacia.getValueAt(linha, 4));

            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "Selecione uma linha!");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "erro! " + e.getMessage());
        }//fecha catch

    }//fecha método alterar

    private void confirmarAlteracao() {
        try {
            FarmaciaVO fVO = new FarmaciaVO();
            fVO.setIdFarmacia(Long.parseLong(jtCodigo.getText()));
            fVO.setCNPJFarmacia(jtCNPJ.getText());
            fVO.setNomeFarmacia(jtNome.getText());
            fVO.setTelFarmacia(Integer.parseInt(jtTelefone.getText()));
            fVO.setEnderecoFarmacia(jtEndereco.getText());

            FarmaciaServicos fs = ServicosFactory.getFarmaciaServicos();

            fs.alterarFarmacia(fVO);

            JOptionPane.showMessageDialog(this,
                    "Farmácia Alterada com Sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "erro! " + e.getMessage());

        }//fecha catch
    }//fecha método confirmarAlteracao

    private void limparCampos() {
        jtCodigo.setText(null);
        jtCNPJ.setText(null);
        jtNome.setText(null);
        jtTelefone.setText(null);
        jtEndereco.setText(null);

    }//fecha método limparCampos


    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        preencherTabela();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparTabela();
        limparCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        deletar();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarAlteracaoActionPerformed
        confirmarAlteracao();
    }//GEN-LAST:event_jbConfirmarAlteracaoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtPesqKeyReleased

    private void jCombofiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombofiltroItemStateChanged
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jCombofiltroItemStateChanged

    private void jtableFarmaciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableFarmaciaMouseClicked
        alterar();
    }//GEN-LAST:event_jtableFarmaciaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombofiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbConfirmarAlteracao;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlCnpj;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JTextField jtCNPJ;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPesq;
    private javax.swing.JTextField jtTelefone;
    private javax.swing.JTable jtableFarmacia;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.FuncionarioVO;
import servicos.FuncionarioServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Douglas, Josefa
 * @since 05/05/2018
 */
public class GUIManutencaoFuncionario extends javax.swing.JInternalFrame {
    
    DefaultTableModel dtm = new DefaultTableModel(
    new Object[][]{},
    new Object[]{"Código","Nome", "Idade", "Telefone", "cpf", "cnpj", "rg"});  
    

    /**
     * Creates new form GUIManutencaoFuncionario
     */
    public GUIManutencaoFuncionario() {
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
        jCombofiltroFunci = new javax.swing.JComboBox<>();
        jtPesqFunci = new javax.swing.JTextField();
        jlPesquisa = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableFuncionario = new javax.swing.JTable();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jbbuscar = new javax.swing.JButton();
        jblimpar = new javax.swing.JButton();
        jbdeletar = new javax.swing.JButton();
        jbConfirmarAteracao = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtIdade = new javax.swing.JTextField();
        jtCpf = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jtCnpj = new javax.swing.JTextField();
        jtRg = new javax.swing.JTextField();
        jlCodigo = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlCnpj = new javax.swing.JLabel();
        jlIdade = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlRg = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCombofiltroFunci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Idade", "Telefone", "cpf", "cnpj", "rg" }));
        jCombofiltroFunci.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombofiltroFunciItemStateChanged(evt);
            }
        });

        jtPesqFunci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqFunciKeyReleased(evt);
            }
        });

        jlPesquisa.setText("Pesquisa");

        jLayeredPane1.setLayer(jCombofiltroFunci, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtPesqFunci, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlPesquisa)
                .addGap(43, 43, 43)
                .addComponent(jtPesqFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCombofiltroFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombofiltroFunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPesqFunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesquisa))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Idade", "Telefone", "Cpf", "Cnpj", "rg"
            }
        ));
        jtableFuncionario.getTableHeader().setReorderingAllowed(false);
        jtableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableFuncionario);

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jblimpar.setText("Limpar");
        jblimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparActionPerformed(evt);
            }
        });

        jbdeletar.setText("Deletar");
        jbdeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdeletarActionPerformed(evt);
            }
        });

        jbConfirmarAteracao.setText("Confirma Alteração");
        jbConfirmarAteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAteracaoActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jbbuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jblimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbdeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbConfirmarAteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jbbuscar)
                .addGap(41, 41, 41)
                .addComponent(jblimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbdeletar)
                .addGap(45, 45, 45)
                .addComponent(jbAlterar)
                .addGap(97, 97, 97))
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jbConfirmarAteracao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addComponent(jbConfirmarAteracao)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblimpar)
                    .addComponent(jbbuscar)
                    .addComponent(jbdeletar)
                    .addComponent(jbAlterar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtCodigo.setEnabled(false);

        jlCodigo.setText("Código");
        jlCodigo.setEnabled(false);

        jlCpf.setText("Cpf");

        jlNome.setText("Nome");

        jlCnpj.setText("Cnpj");

        jlIdade.setText("Idade");

        jlTelefone.setText("Telefone");

        jlRg.setText("Rg");

        jLayeredPane4.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtCnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtRg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlCnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jlRg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCodigo)
                    .addComponent(jlCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jlCnpj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIdade)
                    .addComponent(jlTelefone))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlRg)
                        .addGap(18, 18, 18)
                        .addComponent(jtRg)
                        .addContainerGap())))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCodigo)
                    .addComponent(jlNome)
                    .addComponent(jlIdade)
                    .addComponent(jtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlRg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCpf)
                        .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlTelefone))
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCnpj)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    FuncionarioVO objFuncionarioVO = new FuncionarioVO();
    
    private void preencherTabela(){
    
        try {
            
            ArrayList<FuncionarioVO> funcionario = new ArrayList<>();
            FuncionarioServicos fs = ServicosFactory.getFuncionarioServicos();
            
            funcionario = fs.buscarFuncionario();
            
            limparTabela();
            
            for (int i = 0; i < funcionario.size(); i++) {
                
                dtm.addRow(new String [] {
                    String.valueOf(funcionario.get(i).getIdFuncionario()),
                    funcionario.get(i).getNome(),
                    String.valueOf(funcionario.get(i).getIdade()),
                    String.valueOf(funcionario.get(i).getTelefone()),
                    String.valueOf(funcionario.get(i).getCpf()),
                    String.valueOf(funcionario.get(i).getCnpj()),
                    String.valueOf(funcionario.get(i).getRg()),                   
                    
                });
                
                jtableFuncionario.setModel(dtm);
            }
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this,
                    "Erro!" + e.getMessage());
        }//Fecha catch       
    
    }//Fecha preencher tabela
    
     private void limparTabela() {
         dtm.setNumRows(0);

    }//fecha limparTabela
    
      private void deletar() {
        try {
            int linha = jtableFuncionario.getSelectedRow();
            
            if(linha == -1){
            JOptionPane.showMessageDialog(this,"Selecione uma linha");
            
            } else{
                String id = jtableFuncionario.getValueAt(linha, 0).toString();
                FuncionarioServicos fs = ServicosFactory.getFuncionarioServicos();
                fs.deletarFuncionario(Long.parseLong(id));
               JOptionPane.showMessageDialog(this,
                       "Produto excluído com Sucesso!");  
            }
            

        } catch (Exception e) {
              JOptionPane.showMessageDialog(this,
                      "Erro ao deletar" + e.getMessage());
        }//fecha catch
    }//fecha deletar

    private void filtrar() {
        try {
            if(jtPesqFunci.getText().isEmpty()){
                preencherTabela();
            }else{
               String filtro = jCombofiltroFunci.getSelectedItem().toString();
               String pesq = jtPesqFunci.getText();
               
               String query = "";
               if (filtro.equalsIgnoreCase("Código")) {
                   query = "where idfuncionario like '%" + pesq + "%'";
               } else if (filtro.equalsIgnoreCase("Nome")) {
                   query = "where Nome like '%" + pesq + "%'";
               } else if (filtro.equalsIgnoreCase("Idade")) {
                   query = "where idade like '%" + pesq + "%'";
               } else if (filtro.equalsIgnoreCase("Telefone")) {
                   query = "where telefone like '%" + pesq + "%'";
               } else if(filtro.equalsIgnoreCase("Cpf")) {
                   query = "where cpf like '%" + pesq + "%'";   
               }else if (filtro.equalsIgnoreCase("Cnpj")) {
                   query ="where cnpj like '%"+pesq+"%'";                 
               }else if (filtro.equalsIgnoreCase("RG")) {
                   query ="where rg like '%"+pesq+"%'";                 
               }
               
               FuncionarioServicos fs = ServicosFactory.getFuncionarioServicos();
               ArrayList<FuncionarioVO> funcionario = fs.filtrar(query);
               
               for (int i = 0; i <funcionario.size(); i++) {
                dtm.addRow(new String[]{
                     String.valueOf(funcionario.get(i).getIdFuncionario()),
                    funcionario.get(i).getNome(),
                    String.valueOf(funcionario.get(i).getIdade()),
                    String.valueOf(funcionario.get(i).getTelefone()),
                    String.valueOf(funcionario.get(i).getCpf()),
                    String.valueOf(funcionario.get(i).getCnpj()),
                    String.valueOf(funcionario.get(i).getRg()),
                   
                });
                
                jtableFuncionario.setModel(dtm);
            }//fecha for
          }//fecha else

        } catch (Exception e) {
           jtPesqFunci.setText("");
           JOptionPane.showMessageDialog(this,"Erro ao filtrar" + e.getMessage());
               
        }//fecha catch
    }//fecha filtrar

    private void alterar() {
        try {

            int linha = jtableFuncionario.getSelectedRow();
            if (linha == -1) {

                jtCodigo.setText((String) jtableFuncionario.getValueAt(linha, 0));
                jtNome.setText((String) jtableFuncionario.getValueAt(linha, 1));
                jtIdade.setText((String) jtableFuncionario.getValueAt(linha, 2));
                jtTelefone.setText((String) jtableFuncionario.getValueAt(linha, 3));
                jtCpf.setText((String) jtableFuncionario.getValueAt(linha, 4));
                jtCnpj.setText((String) jtableFuncionario.getValueAt(linha, 5));
                jtRg.setText((String) jtableFuncionario.getValueAt(linha, 6));

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
            
            FuncionarioVO fVO = new FuncionarioVO();
            
            fVO.setIdFuncionario(Long.parseLong(jtCodigo.getText()));
            fVO.setNome(jtNome.getText());
             fVO.setIdade(Integer.parseInt(jtIdade.getText()));
            fVO.setTelefone(Integer.parseInt(jtTelefone.getText()));
            fVO.setCpf(Long.parseLong(jtCpf.getText()));
             fVO.setCnpj(Long.parseLong(jtCnpj.getText()));
              fVO.setRg(Long.parseLong(jtRg.getText()));
              
              FuncionarioServicos fs = ServicosFactory.getFuncionarioServicos();
              
              fs.alterarFuncionario(fVO);
               JOptionPane.showMessageDialog(this,
                       "Funcionário Alterado com Sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro!" + e.getMessage());

        }
    }//fecha método confirmarAlteracao
    
    private void limparCampos(){
         jtCodigo.setText(null);
        jtNome.setText(null);
        jtIdade.setText(null);
        jtTelefone.setText(null);
        jtCpf.setText(null);
         jtCnpj.setText(null);
        jtRg.setText(null);
        
    }//fecha método limparCampos
    
    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        preencherTabela();
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jblimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparActionPerformed
        limparTabela();
        limparCampos();
    }//GEN-LAST:event_jblimparActionPerformed

    private void jbdeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdeletarActionPerformed
        deletar();
    }//GEN-LAST:event_jbdeletarActionPerformed

    private void jbConfirmarAteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarAteracaoActionPerformed
        confirmarAlteracao();
        limparTabela();
        preencherTabela();
        limparTabela();
    }//GEN-LAST:event_jbConfirmarAteracaoActionPerformed

    private void jtableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableFuncionarioMouseClicked
        confirmarAlteracao();
        limparTabela();
        preencherTabela();
        limparCampos();
    }//GEN-LAST:event_jtableFuncionarioMouseClicked

    private void jtPesqFunciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqFunciKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtPesqFunciKeyReleased

    private void jCombofiltroFunciItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombofiltroFunciItemStateChanged
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jCombofiltroFunciItemStateChanged

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombofiltroFunci;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbConfirmarAteracao;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbdeletar;
    private javax.swing.JButton jblimpar;
    private javax.swing.JLabel jlCnpj;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlRg;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTextField jtCnpj;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtCpf;
    private javax.swing.JTextField jtIdade;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPesqFunci;
    private javax.swing.JTextField jtRg;
    private javax.swing.JTextField jtTelefone;
    private javax.swing.JTable jtableFuncionario;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.lang.String;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.bean.Funcionario;
import model.dao.FuncionarioDAO;
/**
 *
 * @author user
 */
public final class PesquisarFunc extends javax.swing.JInternalFrame {

    /**
     * Creates new form PesquisarAluno
     */
    public PesquisarFunc() {
        initComponents();
        
        DefaultTableModel pesquisa = (DefaultTableModel) PaFunc.getModel();
        PaFunc.setRowSorter(new TableRowSorter(pesquisa));
        readPesquisar();
        CampoNome.setDocument(new JTextFieldLimit(30));
        
        
        
        
        
    }
      
   public void readPesquisar(){
        
        DefaultTableModel pesquisa = (DefaultTableModel) PaFunc.getModel();
        pesquisa.setNumRows(0);
        
        FuncionarioDAO fdao = new FuncionarioDAO();
        
        for(Funcionario f:fdao.readFunc()){
            
            pesquisa.addRow(new Object[]{
            f.getId_f(),
            f.getNome(),
            f.getRg(),
            f.getNasc(),
            f.getEndereco(),
            f.getTel(),
            f.getLogin(),
            f.getSenha()
            
            
            //id_a, nome,sexo,ra, serie, turma, rg, nasc, End, tel
            
            });
        
            
        }
    }
           
    
        
   
        public void readPesquisarForName(String nome){
        
        DefaultTableModel pesquisa = (DefaultTableModel) PaFunc.getModel();
        pesquisa.setNumRows(0);
        
        FuncionarioDAO fdao = new FuncionarioDAO();
        
        for(Funcionario f:fdao.readFuncForName(nome)){
            
            pesquisa.addRow(new Object[]{
            f.getId_f(),
            f.getNome(),
            f.getRg(),
            f.getNasc(),
            f.getEndereco(),
            f.getTel(),
            f.getLogin(),
            f.getSenha()
            
            
            //id_a, nome,sexo,ra, serie, turma, rg, nasc, End, tel
            
            });
        
            
        }
    }

    
        
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        btnPRA = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PaFunc = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setMaximizable(true);
        setTitle("Pesquisar Funcionario");

        jLabel1.setText("Nome do Aluno");

        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        btnPRA.setText("Pesquisar");
        btnPRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRAActionPerformed(evt);
            }
        });

        PaFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "RG", "Nasc", "End", "Tel", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PaFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaFuncMouseClicked(evt);
            }
        });
        PaFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PaFuncKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(PaFunc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPRA, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 389, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPRA))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void btnPRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRAActionPerformed
        readPesquisarForName(CampoNome.getText());
    }//GEN-LAST:event_btnPRAActionPerformed

    private void PaFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaFuncMouseClicked
        if(PaFunc.getSelectedRow()!=-1){

        }
    }//GEN-LAST:event_PaFuncMouseClicked

    private void PaFuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaFuncKeyReleased
        if(PaFunc.getSelectedRow()!=-1){

        }
    }//GEN-LAST:event_PaFuncKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTable PaFunc;
    private javax.swing.JToggleButton btnPRA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.ConnectionFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Aluno;
import model.dao.AlunoDAO;

/**
 *
 * @author user
 */
public class RemoverAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form RemoverAluno
     */
    public RemoverAluno() {
        initComponents();
        DefaultTableModel pesquisa = (DefaultTableModel) PaAlunos.getModel();
        PaAlunos.setRowSorter(new TableRowSorter(pesquisa));
        readPesquisar();
        CampoNome.setDocument(new JTextFieldLimit(30));
    }
    public void readPesquisar(){
        
        DefaultTableModel pesquisa = (DefaultTableModel) PaAlunos.getModel();
        pesquisa.setNumRows(0);
        
        AlunoDAO adao = new AlunoDAO();
        
        for(Aluno a:adao.read()){
            
            pesquisa.addRow(new Object[]{
            a.getId_a(),
            a.getRa(),
            a.getRg(),
            a.getNome(),
            a.getEndereco(),
            a.getNasc(),
            a.getSexo(),
            a.getSerie(),
            a.getTurma(),
            a.getTel()
            
            //id_a, nome,sexo,ra, serie, turma, rg, nasc, End, tel
            
            });
        
            
        }
    }
           
    
        
   
        public void readPesquisarForName(String nome){
        
        DefaultTableModel pesquisa = (DefaultTableModel) PaAlunos.getModel();
        pesquisa.setNumRows(0);
        
        AlunoDAO adao = new AlunoDAO();
        
        for(Aluno a:adao.readForName(nome)){
            
            pesquisa.addRow(new Object[]{
            a.getId_a(),
            a.getRa(),
            a.getRg(),
            a.getNome(),
            a.getEndereco(),
            a.getNasc(),
            a.getSexo(),
            a.getSerie(),
            a.getTurma(),
            a.getTel()
            
            //id_a, nome,sexo,ra, serie, turma, rg, nasc, End, tel
            
            });
        
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        PaAlunos = new javax.swing.JTable();
        CampoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPRA = new javax.swing.JToggleButton();
        btnRA = new javax.swing.JToggleButton();

        setClosable(true);
        setTitle("Remover Aluno");
        setRequestFocusEnabled(false);

        PaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RA", "RG", "Nome", "End", "Data de Nasc", "Sexo", "Serie", "Turma", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaAlunosMouseClicked(evt);
            }
        });
        PaAlunos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PaAlunosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(PaAlunos);

        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Aluno");

        btnPRA.setText("Pesquisar");
        btnPRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRAActionPerformed(evt);
            }
        });

        btnRA.setText("Remover");
        btnRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRA)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPRA, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)))
                        .addGap(0, 159, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPRA))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void PaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaAlunosMouseClicked
        if(PaAlunos.getSelectedRow()!=-1){



        }

    }//GEN-LAST:event_PaAlunosMouseClicked

    private void PaAlunosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaAlunosKeyReleased
        if(PaAlunos.getSelectedRow()!=-1){

         

        }

    }//GEN-LAST:event_PaAlunosKeyReleased

    private void btnPRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRAActionPerformed
        readPesquisarForName(CampoNome.getText());
    }//GEN-LAST:event_btnPRAActionPerformed

    private void btnRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRAActionPerformed

            Aluno a = new Aluno();
            AlunoDAO adao = new AlunoDAO();

            a.setId_a((int)PaAlunos.getValueAt(PaAlunos.getSelectedRow(), 0));
            
            adao.delete(a);
            
            readPesquisar();


    }//GEN-LAST:event_btnRAActionPerformed
    
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTable PaAlunos;
    private javax.swing.JToggleButton btnPRA;
    private javax.swing.JToggleButton btnRA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Aluno;
import model.dao.AlunoDAO;
import java.lang.String;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public final class PesquisarAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form PesquisarAluno
     */
    public PesquisarAluno() {
        initComponents();
        
        DefaultTableModel pesquisa = (DefaultTableModel) PaAlunos.getModel();
        PaAlunos.setRowSorter(new TableRowSorter(pesquisa));
        readPesquisar();
        CampoPes.setDocument(new JTextFieldLimit(30));
        
        
        
        
        
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

    
        
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        PaAlunos = new javax.swing.JTable();
        CampoPes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPA = new javax.swing.JToggleButton();

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
        setTitle("Pesquisar Aluno");
        setToolTipText("");

        PaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID#", "RA", "RG", "Nome", "Endereço", "Nasc", "Sexo", "Serie", "Turma", "Tel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PaAlunos);
        PaAlunos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (PaAlunos.getColumnModel().getColumnCount() > 0) {
            PaAlunos.getColumnModel().getColumn(0).setPreferredWidth(40);
        }

        CampoPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPesActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Aluno");

        btnPA.setText("Pesquisar");
        btnPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CampoPes, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPA, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPA))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPesActionPerformed

    private void btnPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAActionPerformed

   //readJTableForDesc(txtBuscaDesc.getText());

        readPesquisarForName(CampoPes.getText());
    }//GEN-LAST:event_btnPAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoPes;
    private javax.swing.JTable PaAlunos;
    private javax.swing.JToggleButton btnPA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

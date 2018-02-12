/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.bean.Livros;
import model.dao.LivroDAO;

/**
 *
 * @author user
 */
public class EditarLivro extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarLivro
     */
    public EditarLivro() {
        initComponents();
        readpesquisarL();
        CampoNome.setDocument(new JTextFieldLimit(40));
        CampoTit.setDocument(new JTextFieldLimit(40));
        CampoA.setDocument(new JTextFieldLimit(30));
        CampoG.setDocument(new JTextFieldLimit(20));
        
        
    
    }
    
    
    

       public void readpesquisarL(){
        
        DefaultTableModel pesquisa = (DefaultTableModel) PaLivros.getModel();
        pesquisa.setNumRows(0);
        
        LivroDAO ldao = new LivroDAO();
        
        for(Livros l:ldao.readL()){
            
            pesquisa.addRow(new Object[]{
            l.getId_l(),
            l.getTitulo(),
            l.getAutor(),
            l.getGenero(),
            l.getDisp()
            
            
            
            
            
            });
        
            
        }
    }
      
    public void readpesquisarLT(String titulo){
        
        DefaultTableModel pesquisa = (DefaultTableModel) PaLivros.getModel();
        pesquisa.setNumRows(0);
        
        LivroDAO ldao = new LivroDAO();
        
        for(Livros l:ldao.readLT(titulo)){
            
            pesquisa.addRow(new Object[]{
            l.getId_l(),
            l.getTitulo(),
            l.getAutor(),
            l.getGenero(),
            l.getDisp()
            
            
            
            
            
            });
        
            
        }
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        PaLivros = new javax.swing.JTable();
        btnEL = new javax.swing.JButton();
        CampoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        CampoTit = new javax.swing.JTextField();
        CampoG = new javax.swing.JTextField();
        CampoA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Editar Livro");

        PaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Autor", "Genero", "Disponivel S(0) e N(1)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PaLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaLivrosMouseClicked(evt);
            }
        });
        PaLivros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PaLivrosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(PaLivros);
        if (PaLivros.getColumnModel().getColumnCount() > 0) {
            PaLivros.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        btnEL.setText("Editar");
        btnEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELActionPerformed(evt);
            }
        });

        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Livro");

        jToggleButton1.setText("Pesquisar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        CampoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoAActionPerformed(evt);
            }
        });

        jLabel2.setText("Titulo");

        jLabel3.setText("Genero:");

        jLabel4.setText("Autor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEL, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CampoA)
                                .addComponent(CampoG, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CampoTit)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEL)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoAActionPerformed

    private void PaLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaLivrosMouseClicked
        if(PaLivros.getSelectedRow()!=-1){

            CampoTit.setText(PaLivros.getValueAt(PaLivros.getSelectedRow(),1).toString());
            CampoA.setText(PaLivros.getValueAt(PaLivros.getSelectedRow(),2).toString());
            CampoG.setText(PaLivros.getValueAt(PaLivros.getSelectedRow(),3).toString());
            

        }

    }//GEN-LAST:event_PaLivrosMouseClicked

    private void PaLivrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaLivrosKeyReleased
        if(PaLivros.getSelectedRow()!=-1){

           CampoTit.setText(PaLivros.getValueAt(PaLivros.getSelectedRow(),1).toString());
            CampoA.setText(PaLivros.getValueAt(PaLivros.getSelectedRow(),2).toString());
            CampoG.setText(PaLivros.getValueAt(PaLivros.getSelectedRow(),3).toString());

        }

    }//GEN-LAST:event_PaLivrosKeyReleased

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        readpesquisarLT(CampoNome.getText());

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELActionPerformed
        if(PaLivros.getSelectedRow() != -1){
        
            Livros l = new Livros();
            LivroDAO ldao = new LivroDAO();
            
            l.setTitulo(CampoTit.getText());
            l.setAutor(CampoA.getText());
            l.setGenero(CampoG.getText());
            
            l.setId_l((int)PaLivros.getValueAt(PaLivros.getSelectedRow(), 0));
            
            ldao.update(l);
            
            readpesquisarL(); 
    }//GEN-LAST:event_btnELActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoA;
    private javax.swing.JTextField CampoG;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoTit;
    private javax.swing.JTable PaLivros;
    private javax.swing.JButton btnEL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}

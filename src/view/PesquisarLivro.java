/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Aluno;
import model.bean.Livros;
import model.dao.AlunoDAO;
import model.dao.LivroDAO;

/**
 *
 * @author user
 */
public final class PesquisarLivro extends javax.swing.JInternalFrame {

    /**
     * Creates new form PesquisarLivro
     */
    public PesquisarLivro() {
        initComponents();
        
        DefaultTableModel pesquisa = (DefaultTableModel) PaLivros.getModel();
        PaLivros.setRowSorter(new TableRowSorter(pesquisa));
        
       readpesquisarL();
        CampoTitu.setDocument(new JTextFieldLimit(40));
                
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
        CampoTitu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPL = new javax.swing.JToggleButton();

        setClosable(true);
        setTitle("Pesquisar Livro");

        jScrollPane2.setAutoscrolls(true);

        PaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Autor", "Genero", "Disponivel"
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
        jScrollPane2.setViewportView(PaLivros);

        CampoTitu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTituActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Livro:");

        btnPL.setText("Pesquisar");
        btnPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CampoTitu, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnPL, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTitu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPL))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoTituActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTituActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTituActionPerformed

    private void btnPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPLActionPerformed

        readpesquisarLT(CampoTitu.getText());
    }//GEN-LAST:event_btnPLActionPerformed

    private void PaLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaLivrosMouseClicked
       
        
        
        
    }//GEN-LAST:event_PaLivrosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoTitu;
    private javax.swing.JTable PaLivros;
    private javax.swing.JToggleButton btnPL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

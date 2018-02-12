package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import java.sql.Statement;
import model.bean.Livros;
import view.AdicionarAluno;





public class AlunoDAO {
    
    
    public void create(Aluno a) {
       
        Connection con= ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Statement st = null;
        
        
        try {
            stmt = con.prepareStatement("Insert Into aluno (nome,sexo,ra, serie, turma, rg, nasc, End, tel) VALUES(?,?,?,?,?,?,?,?,?);");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getSexo());
            stmt.setString(3, a.getRa());
            stmt.setString(4, a.getSerie());
            stmt.setString(5, a.getTurma());
            stmt.setString(6, a.getRg());
            stmt.setString(7, a.getNasc());
            stmt.setString(8, a.getEndereco());
            stmt.setString(9, a.getTel());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
           
          
  
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
            
           
            
        }
    

        
        
        
        public List<Aluno> read(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Aluno> alunos = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select*from aluno");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Aluno aluno = new Aluno();
                
                
                aluno.setId_a(rs.getInt("Id_a"));
                aluno.setRa(rs.getString("ra"));
                aluno.setRg(rs.getString("RG"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("End"));
                aluno.setNasc(rs.getString("Nasc"));
                aluno.setSexo(rs.getString("Sexo"));
                aluno.setSerie(rs.getString("serie"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setTel(rs.getString("tel"));
                alunos.add(aluno);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return alunos;
            
        
        }
        
        public List<Aluno> readForName(String nome){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Aluno> alunos = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select*from aluno\n where nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Aluno aluno = new Aluno();
                
                
                aluno.setId_a(rs.getInt("Id_a"));
                aluno.setRa(rs.getString("ra"));
                aluno.setRg(rs.getString("RG"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("End"));
                aluno.setNasc(rs.getString("Nasc"));
                aluno.setSexo(rs.getString("Sexo"));
                aluno.setSerie(rs.getString("serie"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setTel(rs.getString("tel"));
                alunos.add(aluno);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return alunos;
            
        
        }
        
        
        
  
         public void update(Aluno a) {
       
        Connection con= ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update aluno set ra = ? ,rg = ? , nome= ? ,End = ? , nasc=?,sexo=?, serie=?, turma = ?, tel=?  where id_a = ?;");
            stmt.setString(1, a.getRa());
            stmt.setString(2, a.getRg());
            stmt.setString(3, a.getNome());
            stmt.setString(4, a.getEndereco());
            stmt.setString(5, a.getNasc());
            stmt.setString(6, a.getSexo());
            stmt.setString(7, a.getSerie());
            stmt.setString(8,a.getTurma());
            stmt.setString(9, a.getTel());
            stmt.setInt(10, a.getId_a());
            
            stmt.executeUpdate(); 
            
           
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao atualizar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
    }

         public void reserva(Aluno a, Livros l){
        	 
        	 Connection con = ConnectionFactory.getConnection();
        	 PreparedStatement stmt = null;
        	 
        	 try{
        		 stmt = con.prepareStatement("Insert into historico_Livros (id_a, nome, id_l, livro, data_retirada, data_entrega) values(?,?,?,?,?,?);");
        		 stmt.setInt   (1, a.getId_a());
        		 stmt.setString(2, a.getNome());
        		 stmt.setInt   (3, l.getId_l());
        		 stmt.setString(4, a.getTituloo());
        		 stmt.setString(5, a.getDataR());
        		 stmt.setString(6, a.getDataE());

        		 stmt.executeUpdate();
        		 JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        	 }
        	 catch (SQLException ex){
        		 Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null,ex);
        		 JOptionPane.showMessageDialog(null, "Erro ao salvar no Banco de dados");
        		 }
        	 
        		 finally{
        			 ConnectionFactory.closeConnection(con, stmt);
        			 
        		 }
        	 }
         	public void hist_Alunos(Aluno a, Livros l){
        	 
        	 Connection con = ConnectionFactory.getConnection();
        	 PreparedStatement stmt = null;
        	 
        	 try{
        		 stmt = con.prepareStatement("Insert into historico_Livros (id_a, nome, id_l, livro, data_retirada, data_entrega) values(?,?,?,?,?,?);");
        		 stmt.setInt   (1, a.getId_a());
        		 stmt.setString(2, a.getNome());
        		 stmt.setInt   (3, l.getId_l());
        		 stmt.setString(4, a.getTituloo());
        		 stmt.setString(5, a.getDataR());
        		 stmt.setString(6, a.getDataE());

        		 stmt.executeUpdate();
        		 JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        	 }
        	 catch (SQLException ex){
        		 Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null,ex);
        		 JOptionPane.showMessageDialog(null, "Erro ao salvar no Banco de dados");
        		 }
        	 
        		 finally{
        			 ConnectionFactory.closeConnection(con, stmt);
        			 
        		 }
         }
         	
         	
               public void delete(Aluno a) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM aluno WHERE id_a = ?");
            
            stmt.setInt(1, a.getId_a());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
               
               
}
        
   


package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Livros;





public class LivroDAO {
    
    
    public void create(Livros l) {
       
        Connection con= ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Statement st = null;
        
        try {
            stmt = con.prepareStatement("Insert Into Livro (Titulo, autor, genero, disponivel) VALUES(?,?,?, ?);");
            stmt.setString(1, l.getTitulo());
            stmt.setString(2, l.getAutor());
            stmt.setString(3, l.getGenero());
            stmt.setString(4, l.getDisp());
            stmt.executeUpdate(); 
           
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt );
            
        }
    }
        public List<Livros> readL(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Livros> livros = new ArrayList<>();
            
            
        try{
            stmt = con.prepareStatement("Select * from livro ");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Livros livro = new Livros();
                
                livro.setId_l(rs.getInt("id_l"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setGenero(rs.getString("genero"));
                livro.setDisp(rs.getString("disponivel"));
                
                livros.add(livro);
        
        
        }
        }
        catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return livros;
            
        
        }
        
        public List<Livros> readLT(String titulo){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Livros> livros = new ArrayList<>();
            
            
        try{
            stmt = con.prepareStatement("Select * from livro where titulo LIKE ?");
            stmt.setString(1, "%"+titulo+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Livros livro = new Livros();
                
                livro.setId_l(rs.getInt("id_l"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setGenero(rs.getString("genero"));
                livro.setDisp(rs.getString("disponivel"));
                
                livros.add(livro);
        
        
        }
        }
        catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return livros;
            
        
        }
        public List<Livros> readLRR(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Livros> livros = new ArrayList<>();
            
            
        try{
            stmt = con.prepareStatement("Select * from livro where disponivel =\"Sim\"");
            
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Livros livro = new Livros();
                
                livro.setId_l(rs.getInt("id_l"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setGenero(rs.getString("genero"));
                livro.setDisp(rs.getString("disponivel"));
                
                livros.add(livro);
        
        
        }
        }
        catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return livros;
            
        
        }
        
        public List<Livros> readLTRR(String titulo){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Livros> livros = new ArrayList<>();
            
            
        try{
            stmt = con.prepareStatement("Select * from livro where titulo LIKE ? and disponivel =\"Sim\"");
            stmt.setString(1, "%"+titulo+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Livros livro = new Livros();
                
                livro.setId_l(rs.getInt("id_l"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setGenero(rs.getString("genero"));
                livro.setDisp(rs.getString("disponivel"));
                
                livros.add(livro);
        
        
        }
        }
        catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return livros;
            
        
        }
   public void update(Livros l) {
       
        Connection con= ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update livro set titulo = ? ,autor = ? , genero= ? where id_l = ?;");
            stmt.setString(1, l.getTitulo());
            stmt.setString(2, l.getAutor());
            stmt.setString(3, l.getGenero());
            stmt.setInt(4, l.getId_l());
            
            stmt.executeUpdate(); 
            
           
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao atualizar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
    }
        
        
        
   public void delete(Livros l) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM livro WHERE id_l = ?");
            
            stmt.setInt(1, l.getId_l());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
        public void updateRL(Livros l) {
       
        Connection con= ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update livro set disponivel = ? where id_l = ?;");
            stmt.setString(1, l.getDisp());
            stmt.setInt(2, l.getId_l());
   
            stmt.executeUpdate(); 
            
           
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao atualizar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
    }
        
        
    }


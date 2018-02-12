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
import model.bean.Aluno;
import model.bean.Funcionario;




public class FuncionarioDAO {
 
    
    
    
    
    public void create(Funcionario f) {
       
        Connection con= ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Statement st = null;
        
        
        try {
            stmt = con.prepareStatement("Insert Into func (nome,rg, nasc, End, tel, login, senha) VALUES(?,?,?,?,?,?,?);");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getRg());
            stmt.setString(3, f.getNasc());
            stmt.setString(4, f.getEndereco());
            stmt.setString(5, f.getTel());
            stmt.setString(6, f.getLogin());
            stmt.setString(7, f.getSenha());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
           
          
  
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
            
           
            
        }
    

        
        
        
        public List<Funcionario> readFunc(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Funcionario> funcionarios = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select*from func");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Funcionario funcionario = new Funcionario();
                
                
                funcionario.setId_f(rs.getInt("Id_f"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setRg(rs.getString("RG"));
                funcionario.setNasc(rs.getString("Nasc"));
                funcionario.setEndereco(rs.getString("End"));
                funcionario.setTel(rs.getString("tel"));
                funcionario.setLogin(rs.getString("login"));
                funcionario.setSenha(rs.getString("senha"));
                
                funcionarios.add(funcionario);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return funcionarios;
            
        
        }
        
        public List<Funcionario> readFuncForName(String nome){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Funcionario> funcionarios = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select*from func\n where nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Funcionario funcionario = new Funcionario();
                
                
                funcionario.setId_f(rs.getInt("Id_f"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setRg(rs.getString("RG"));
                funcionario.setNasc(rs.getString("Nasc"));
                funcionario.setEndereco(rs.getString("End"));
                funcionario.setTel(rs.getString("tel"));
                funcionario.setLogin(rs.getString("login"));
                funcionario.setSenha(rs.getString("senha"));
                
                funcionarios.add(funcionario);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return funcionarios;
            
        
        }
        
        
        
  
         public void updateFunc(Funcionario f) {
       
        Connection con= ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update func set nome = ? ,rg = ? , nasc= ? ,End = ? , tel=?,login=?, senha=? where id_f = ?;");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getRg());
            stmt.setString(3, f.getNasc());
            stmt.setString(4, f.getEndereco());
            stmt.setString(5, f.getTel());
            stmt.setString(6, f.getLogin());
            stmt.setString(7, f.getSenha());
            stmt.setInt(8, f.getId_f());
            
            
            stmt.executeUpdate(); 
            
           
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao atualizar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
    }
        public void delete(Funcionario f) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM func WHERE id_f = ?");
            
            stmt.setInt(1, f.getId_f());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

        public boolean checkLogin(String login, String senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM func WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
        
        public boolean checkLoginM(String login, String senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM func WHERE login = ? and senha = ? and id_f=2 ");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            
            
            rs = stmt.executeQuery();

            if (rs.next()) {

                
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }


}



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
import model.bean.Reserva;






public class ReservaDAO {
    
    
    public void createReserva(Aluno a, Livros l) {
       
        Connection con= ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Statement st = null;
        
        
        try {
            stmt = con.prepareStatement("Insert Into reserva (id_a,nome,id_l, titulo, Data_Retirada, Data_Entrega, Pendente) VALUES(?,?,?,?,?,?,?);");
            stmt.setInt(1, a.getId_a());
            stmt.setString(2, a.getNome());
            stmt.setInt(3, l.getId_l());
            stmt.setString(4, l.getTitulo());
            stmt.setString(5, a.getDataR());
            stmt.setString(6, a.getDataE());
            stmt.setString(7, a.getPendente());
           
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
           
          
  
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
            
    }
    
    
    
    public List<Reserva> readRA(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Reserva> reservaa = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select id_a, nome,id_l,titulo, data_retirada, data_entrega from reserva where Pendente = \"Sim\"");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Reserva reserva = new Reserva();
                
                
                reserva.setId_a(rs.getInt("Id_a"));
                reserva.setNome(rs.getString("nome"));
                reserva.setId_l(rs.getInt("id_l"));
                reserva.setTituloo(rs.getString("titulo"));
                reserva.setDatarR(rs.getString("data_retirada"));
                reserva.setDataeE(rs.getString("data_entrega"));
                
                reservaa.add(reserva);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return reservaa;
            
        
        }
    
    public List<Reserva> readRAN(String nome){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Reserva> reservaa = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select id_a, nome,id_l,titulo, data_retirada, data_entrega from reserva where Pendente = \"Sim\" and nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Reserva reserva = new Reserva();
                
                
                reserva.setId_a(rs.getInt("Id_a"));
                reserva.setNome(rs.getString("nome"));
                reserva.setId_l(rs.getInt("id_l"));
                reserva.setTituloo(rs.getString("titulo"));
                reserva.setDatarR(rs.getString("data_retirada"));
                reserva.setDataeE(rs.getString("data_entrega"));
                
                reservaa.add(reserva);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return reservaa;
            
        
        }
   
    public List<Reserva> readRAID(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Reserva> reservaa = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select id, id_a, nome,id_l,titulo, data_retirada, data_entrega from reserva where Pendente = \"Sim\"");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Reserva reserva = new Reserva();
                
                reserva.setId(rs.getInt("id"));
                reserva.setId_a(rs.getInt("Id_a"));
                reserva.setNome(rs.getString("nome"));
                reserva.setId_l(rs.getInt("id_l"));
                reserva.setTituloo(rs.getString("titulo"));
                reserva.setDatarR(rs.getString("data_retirada"));
                reserva.setDataeE(rs.getString("data_entrega"));
                
                reservaa.add(reserva);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return reservaa;
            
        
        }
    
    public List<Reserva> readRANID(String nome){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Reserva> reservaa = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select id, id_a, nome,id_l,titulo, data_retirada, data_entrega from reserva where Pendente = \"Sim\" and nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Reserva reserva = new Reserva();
                
                reserva.setId(rs.getInt("id"));
                reserva.setId_a(rs.getInt("Id_a"));
                reserva.setNome(rs.getString("nome"));
                reserva.setId_l(rs.getInt("id_l"));
                reserva.setTituloo(rs.getString("titulo"));
                reserva.setDatarR(rs.getString("data_retirada"));
                reserva.setDataeE(rs.getString("data_entrega"));
                
                reservaa.add(reserva);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return reservaa;
            
        
        }
    
    public void update(Reserva r) {
       
        Connection con= ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update reserva set pendente=? where id = ?;");
            stmt.setString(1, r.getPendente());
            stmt.setInt(2, r.getId());
            
            stmt.executeUpdate(); 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao atualizar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
    }
    
    public List<Reserva> readRANIDH(String nome){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Reserva> reservaa = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select id, id_a, nome,id_l,titulo, data_retirada, data_entrega from reserva where nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Reserva reserva = new Reserva();
                
                reserva.setId(rs.getInt("id"));
                reserva.setId_a(rs.getInt("Id_a"));
                reserva.setNome(rs.getString("nome"));
                reserva.setId_l(rs.getInt("id_l"));
                reserva.setTituloo(rs.getString("titulo"));
                reserva.setDatarR(rs.getString("data_retirada"));
                reserva.setDataeE(rs.getString("data_entrega"));
                
                reservaa.add(reserva);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return reservaa;
            
        
        }
   public List<Reserva> readRAIDH(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Reserva> reservaa = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select id, id_a, nome,id_l,titulo, data_retirada, data_entrega from reserva ");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Reserva reserva = new Reserva();
                
                reserva.setId(rs.getInt("id"));
                reserva.setId_a(rs.getInt("Id_a"));
                reserva.setNome(rs.getString("nome"));
                reserva.setId_l(rs.getInt("id_l"));
                reserva.setTituloo(rs.getString("titulo"));
                reserva.setDatarR(rs.getString("data_retirada"));
                reserva.setDataeE(rs.getString("data_entrega"));
                
                reservaa.add(reserva);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return reservaa;
            
        
        }

   
       public List<Reserva> readRANIDHA(String nome){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Reserva> reservaa = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select id, id_a, nome,id_l,titulo, data_retirada, data_entrega from reserva where titulo LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Reserva reserva = new Reserva();
                
                reserva.setId(rs.getInt("id"));
                reserva.setId_a(rs.getInt("Id_a"));
                reserva.setNome(rs.getString("nome"));
                reserva.setId_l(rs.getInt("id_l"));
                reserva.setTituloo(rs.getString("titulo"));
                reserva.setDatarR(rs.getString("data_retirada"));
                reserva.setDataeE(rs.getString("data_entrega"));
                
                reservaa.add(reserva);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return reservaa;
            
        
        }
   public List<Reserva> readRAIDHA(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Reserva> reservaa = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("Select id,id_l,titulo, id_a, nome, data_retirada, data_entrega from reserva ");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                
                Reserva reserva = new Reserva();
                
                reserva.setId(rs.getInt("id"));
                reserva.setId_a(rs.getInt("Id_a"));
                reserva.setNome(rs.getString("nome"));
                reserva.setId_l(rs.getInt("id_l"));
                reserva.setTituloo(rs.getString("titulo"));
                reserva.setDatarR(rs.getString("data_retirada"));
                reserva.setDataeE(rs.getString("data_entrega"));
                
                reservaa.add(reserva);
                
                
                
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return reservaa;
            
        
        }
}
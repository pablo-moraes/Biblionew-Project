package model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Editora;

public class EditoraDAO extends DatabaseDAO {

    public EditoraDAO() throws Exception, SQLException, ClassNotFoundException {
    }
    
    
    public ArrayList<Editora> listar() throws SQLException, Exception {
        ArrayList<Editora> lista = new ArrayList<>();
        String sql = "SELECT * FROM editora WHERE inativo>0";
        try {
            this.connect();
            try(PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {
                Editora e = new Editora();
                while(rs.next()) {
                    e.setId(rs.getLong("id"));
                    e.setNome(rs.getString("nome"));
                    e.setNomeRepresentante(rs.getString("nomeDoRepresentante"));
                    e.setCnpj(rs.getString("cnpj"));
                    e.setTelefone1(rs.getString("telefone1"));
                    e.setTelefone2(rs.getString("telefone2"));
                    e.setEndereco(rs.getString("endereco"));
                    e.setCidade(rs.getString("cidade"));
                    e.setUf(rs.getString("uf"));
                    lista.add(e);
                }
            }
            return lista;
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            conn.close();
        }
    }
    
    public Editora carregar(Editora e) throws SQLException, Exception {
        String sql = "SELECT * FROM editora WHERE id=? AND inativo>0";
        this.connect();
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {
                pstm.setLong(1, e.getId());
                
                if(rs.next()) {
                    e.setId(rs.getLong("id"));
                    e.setNome(rs.getString("nome"));
                    e.setNomeRepresentante(rs.getString("nomeRepresentante"));
                    e.setCnpj(rs.getString("cnpj"));
                    e.setTelefone1(rs.getString("telefone1"));
                    e.setTelefone2(rs.getString("telefone2"));
                    e.setEndereco(rs.getString("endereco"));
                    e.setCidade(rs.getString("cidade"));
                    e.setUf(rs.getString("uf"));
                }
            }
            return e;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            conn.close();
        }
    }
    
    public void inativar(Editora e) throws SQLException {
        String sql = "UPDATE editora SET inativo=? WHERE id=?";
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setBoolean(1, e.getInativo());
                pstm.setLong(2, e.getId());
                pstm.execute();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            conn.close();
        }
    }
    
    public void  salvar(Editora e) throws SQLException {
        String sql;
        sql = (e.getId() == 0) ?  "INSERT INTO editora"
                + " (nome, nomeDoRepresentante, inativo, cnpj, telefone1, telefone2, endereco, cidade, uf) " 
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)": "UPDATE editora SET"
                + " nome=? nomeDoRepresentante=? inativo=? cnpj=? telefone1=? telefone2=? endereco=? cidade=? uf=? WHERE id=?";
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, e.getNome());
                pstm.setString(2, e.getNomeRepresentante());
                pstm.setBoolean(3, e.getInativo());
                pstm.setString(4, e.getCnpj());
                pstm.setString(5,e.getTelefone1());
                pstm.setString(6, e.getTelefone2());
                pstm.setString(7, e.getEndereco());
                pstm.setString(8, e.getCidade());
                pstm.setString(9, e.getUf());
                if(e.getId() > 0) pstm.setLong(10, e.getId());
                pstm.execute();
            }
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            conn.close();
        }
    }
            
}

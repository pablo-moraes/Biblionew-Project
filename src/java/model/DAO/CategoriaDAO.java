package model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Categoria;

public class CategoriaDAO extends DatabaseDAO {

    public CategoriaDAO() throws Exception, SQLException, ClassNotFoundException {
    }
    
    
    
    public ArrayList<Categoria> listar(Categoria c) throws Exception {
        ArrayList<Categoria> lista = new ArrayList<>();
        String sql = "SELECT * FROM categoria";
        this.connect();
        try {
            try (PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setInativo(rs.getBoolean("inativo"));
                c.setDescricao(rs.getString("descricao"));
               if(c.getCategoriaMae() == null) c.setCategoriaMae((Categoria) rs.getObject("categoriaMae"));
               lista.add(c);
            }
            
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            this.desconnect();
        }
    }
    
    public Categoria carregar(Categoria c) throws SQLException, Exception {
        String sql = "SELECT * FROM categoria WHERE id=? AND inativo > 0";
        this.connect();
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {
                pstm.setLong(1, c.getId());
                
                if(rs.next()) {
                    c.setId(rs.getLong("id"));
                    c.setNome(rs.getString("nome"));
                    c.setInativo(rs.getBoolean("inativo"));
                    c.setDescricao(rs.getString("descricao"));
                   if(c.getCategoriaMae() == null) c.setCategoriaMae((Categoria) rs.getObject("categoriaMae"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            this.desconnect();
        }
        return c;

    }
    
    public void inativar(Categoria c) throws SQLException {
        String sql = "UPDATE categoria SET inativo=? WHERE id=?";
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setBoolean(1, c.getInativo());
                pstm.setLong(2, c.getId());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }
    
    public void salvar(Categoria c) throws SQLException {
        String sql;
        sql = (c.getId() == 0) ? "INSERT INTO categoria"
                + " (categoriaMae, nome, descricao, inativo)" : 
                "UPDATE categoria SET categoriaMae=? nome=? descricao=? inativo=? WHERE id=?";
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql)) {
                if(c.getCategoriaMae() == null) pstm.setObject(1, c.getCategoriaMae().getId());
                pstm.setString(2, c.getNome());
                pstm.setString(3, c.getDescricao());
                pstm.setBoolean(4, c.getInativo());
                if(c.getId() > 0) pstm.setLong(5, c.getId());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }
    
}

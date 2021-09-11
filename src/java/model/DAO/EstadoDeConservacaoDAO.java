package model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.EstadoDeConservacao;

public class EstadoDeConservacaoDAO extends DatabaseDAO {

    public EstadoDeConservacaoDAO() throws Exception, SQLException, ClassNotFoundException {
    }
    
    
    
    public ArrayList<EstadoDeConservacao> listar() throws SQLException {
        ArrayList<EstadoDeConservacao> lista = new ArrayList<>();
        String sql = "SELECT * FROM estadoDeConservacao";
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {
                EstadoDeConservacao ec = new EstadoDeConservacao();
                ec.setId(rs.getLong("id"));
                ec.setObservacao(rs.getString("observacao"));
                ec.setEstadoDeConservacao(rs.getInt("estadoDeConservacao"));
            }
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }
    
    public EstadoDeConservacao carregar(EstadoDeConservacao ec) throws SQLException {
        String sql = "SELECT * FROM estadoDeConservao WHERE id=?";
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {
                pstm.setLong(1, ec.getId());
                if(rs.next()) {
                    ec.setId(rs.getLong("id"));
                    ec.setEstadoDeConservacao(rs.getInt("int"));
                    ec.setObservacao(rs.getString("observacao"));
                }
            }
            return ec;
        } catch(SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }
    
    public void salvar(EstadoDeConservacao ec) throws SQLException {
        String sql = (ec.getId() == 0)?  "INSERT INTO estadoDeConservacao"
                + " (estadoDeConservacao, observacao)"
                + " VALUES (?, ?)" : "UPDATE estadoDeConservacao SET" 
                + " estadoDeConservacao=? observacao=? WHERE id=?";
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setInt(1, ec.getEstadoDeConservacao());
                pstm.setString(2, ec.getObservacao());
                if(ec.getId() > 0) pstm.setLong(3, ec.getId());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }
    
    public void excluir(EstadoDeConservacao ec) throws SQLException {
        String sql = "DELETE FROM estadoDeConservacao WHERE id=?";
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setLong(1, ec.getId());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }
}

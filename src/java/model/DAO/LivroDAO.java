package model.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Categoria;
import model.Livro;
import model.Editora;
import model.EmprestimoLivro;
import model.EstadoDeConservacao;

public class LivroDAO extends DatabaseDAO {

    public LivroDAO() throws Exception, SQLException, ClassNotFoundException {
    }
    
    
    public ArrayList<Livro> listar(Livro l) throws SQLException {
        ArrayList<Livro> lista = new ArrayList<>();
        String sql = "SELECT * FROM ((livro l INNER JOIN editora e ON l.idEditora=e.id) "
                + "INNER JOIN categoria c ON l.idCategoria=c.id) WHERE inativo>0";
        
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {
                while(rs.next()) {
                    l.setId(rs.getLong("id"));
                    l.setNome(rs.getString("nome"));
                    l.setAutor(rs.getString("autor"));
                    l.setEditora((Editora) rs.getObject("idEditora"));
                    l.setCategoria((Categoria) rs.getObject("idCategoria"));
                    l.setEdicao(rs.getInt("edicao"));
                    l.setNumeroPaginas(rs.getInt("numeroPaginas"));
                    l.setIdioma(rs.getString("idioma"));
                    l.setIsbn10(rs.getString("isbn10"));
                    l.setIsbn13(rs.getString("isbn13"));
                    l.setDimensoesLarguraCm(rs.getInt("dimensoesLarguraCm"));
                    l.setDimensoesAlturaCm(rs.getInt("dimensoesAlturaCm"));
                    l.setEstadoDeConservacao((EstadoDeConservacao) rs.getObject("estadoDeConservacao"));
                }
            }
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            
        }
    }
    
    public void excluir (Livro l) throws SQLException {
        String sql = "DELETE FROM livro WHERE id=?";
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setLong(1, l.getId());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }
    
    public Livro carregar(Livro l) throws SQLException {
        String sql = "SELECT * FROM ((livro l INNER JOIN editora e ON l.idEditora=e.id) "
                + "INNER JOIN categoria c ON l.idCategoria=c.id) WHERE livro.id = ?";
        try {
            try(PreparedStatement pstm = conn.prepareCall(sql); ResultSet rs = pstm.executeQuery()) {
                pstm.setLong(1, l.getId());
                if(rs.next()) {
                    l.setId(rs.getLong("id"));
                    l.setNome(rs.getString("nome"));
                    l.setAutor(rs.getString("autor"));
                    l.setEditora((Editora) rs.getObject("idEditora"));
                    l.setCategoria((Categoria) rs.getObject("idCategoria"));
                    l.setEdicao(rs.getInt("edicao"));
                    l.setNumeroPaginas(rs.getInt("numeroPaginas"));
                    l.setIdioma(rs.getString("idioma"));
                    l.setIsbn10(rs.getString("isbn10"));
                    l.setIsbn13(rs.getString("isbn13"));
                    l.setDimensoesLarguraCm(rs.getInt("dimensoesLarguraCm"));
                    l.setDimensoesAlturaCm(rs.getInt("dimensoesAlturaCm"));
                    l.setEstadoDeConservacao((EstadoDeConservacao) rs.getObject("estadoDeConservacao"));
                } else {
                }
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
        return l;
    }
    
    public void salvar(Livro l) throws SQLException, Exception {
        String sql;
        sql = (l.getId() == 0) ? "INSERT INTO livro"
                + " (nome, autor, idEditora, idCategoria, edicao, numeroPaginas, idioma, isbn10, isbn13"
                + "dimensoesLarguraCm, dimensoesAlturaCm, estadoDeConservacao"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" : "UPDATE livro SET "
                + "nome=? autor=? idEditora=? idCategoria=? edicao=? numeroPaginas=? idioma=? isbn10=? isbn13=?"
                + "dimensoesLarguraCm=? dimensoesAlturaCm=? estadoDeConservacao=? WHERE id=?";
        try {
            EstadoDeConservacaoDAO ecDAO = new EstadoDeConservacaoDAO();
            try(PreparedStatement  pstm = conn.prepareStatement(sql)){
                pstm.setString(1, l.getNome());
                pstm.setString(2, l.getAutor());
                pstm.setLong(3, l.getEditora().getId());
                pstm.setLong(4, l.getCategoria().getId());
                pstm.setInt(5, l.getEdicao());
                pstm.setInt(6, l.getNumeroPaginas());
                pstm.setString(7, l.getIdioma());
                pstm.setString(8, l.getIsbn10());
                pstm.setString(9, l.getIsbn13());
                pstm.setInt(10, l.getDimensoesLarguraCm());
                pstm.setInt(11, l.getDimensoesAlturaCm());
                pstm.setLong(12, l.getEstadoDeConservacao().getId());
                if(l.getId() > 0) pstm.setLong(13, l.getId());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }
    
    public void renovarEmprestimo() throws SQLException {
        String sql = "UPDATE emprestimoLivro e "
                + "INNER JOIN livro l ON e.idLivro = l.id "
                + "INNER JOIN usuario u ON e.idUsuario = u.id SET dataDevolucao=?";
        try {
            EmprestimoLivro el = new EmprestimoLivro();
            try(PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setDate(1, new Date(el.getDataDevolucao().getTimeInMillis()));
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }
    
    public void reservar() throws SQLException {
        String sql = "";
        try {
            try(PreparedStatement pstm = conn.prepareStatement(sql)) {
                
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }
//    
//    public void emprestar() throws SQLException {
//        String sql = "";
//        try {
//            
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            conn.close();
//        }
//    }
//    
//    public void devolver() throws SQLException {
//        String sql = "";
//        try {
//            
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            conn.close();
//        }
//    }
    
    
}

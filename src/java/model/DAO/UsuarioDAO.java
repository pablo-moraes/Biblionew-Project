package model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

public class UsuarioDAO extends DatabaseDAO {

    public UsuarioDAO() throws Exception, SQLException, ClassNotFoundException {
    }
    

    public ArrayList<Usuario> listar() throws Exception {
        ArrayList<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try {
            this.connect();
            try (PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {

                while (rs.next()) {
                    Usuario u = new Usuario();
                    u.setId(rs.getLong("id"));
                    u.setNomeCompleto(rs.getString("nomeCompleto"));
                    u.setBibliotecario(rs.getBoolean("bibliotecario"));
                    u.setChefeDeBiblioteca(rs.getBoolean("chefeDeBiblioteca"));
                    u.setLogin(rs.getString("login"));
                    u.setSenha(rs.getString("senha"));
                    u.setInativo(rs.getBoolean("inativo"));
                    u.setRg(rs.getString("rg"));
                    u.setCpf(rs.getString("cpf"));
                    u.setFotografia(rs.getString("fotografia"));
                    u.setTelefone(rs.getString("telefone"));
                    u.setEndereco(rs.getString("endereco"));
                    u.setCidade(rs.getString("cidade"));
                    u.setUf(rs.getString("uf"));
                    lista.add(u);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }

        return lista;
    }

    public Usuario carregar(Usuario u) throws Exception {
        String sql = "SELECT * FROM usuario WHERE id=?";
        try {
            this.connect();
            try (PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {
                pstm.setLong(1, u.getId());
                if (rs.next()) {
                    u.setId(rs.getLong("id"));
                    u.setNomeCompleto(rs.getString("nomeCompleto"));
                    u.setBibliotecario(rs.getBoolean("bibliotecario"));
                    u.setChefeDeBiblioteca(rs.getBoolean("chefeDeBiblioteca"));
                    u.setLogin(rs.getString("login"));
                    u.setSenha(rs.getString("senha"));
                    u.setInativo(rs.getBoolean("inativo"));
                    u.setRg(rs.getString("rg"));
                    u.setCpf(rs.getString("cpf"));
                    u.setFotografia(rs.getString("fotografia"));
                    u.setTelefone(rs.getString("telefone"));
                    u.setEndereco(rs.getString("endereco"));
                    u.setCidade(rs.getString("cidade"));
                    u.setUf(rs.getString("uf"));
                }
            }
            return u;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }

    public void inativar(Usuario u) throws Exception {
        String sql = "UPDATE usuario SET inativo=? WHERE id=?";
        try {
            this.connect();
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setBoolean(1, u.getInativo());
                pstm.setLong(2, u.getId());
                pstm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
    }

    public void salvar(Usuario u) throws Exception {
        String sql;
        sql = (u.getId() == null) ? "INSERT INTO usuario (nomeCompleto, bibliotecario, chefeDeBiblioteca, login, senha, inativo, rg, cpf, fotografia, telefone, endereco, cidade, uf)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" : "UPDATE usuario SET nomeCompleto=? bibliotecario=? chefeDeBiblioteca=? login=? senha=? inativo=? rg=? cpf=? fotografia=? telefone=? endereco=? cidade=? uf=? WHERE id=?";
        try {
            this.connect();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, u.getNomeCompleto());
            pstm.setBoolean(2, u.getBibliotecario());
            pstm.setBoolean(3, u.getChefeDeBiblioteca());
//            if (this.listar().isEmpty()) {
//                pstm.setBoolean(3, true);
//            } else {
//                pstm.setBoolean(3, u.getChefeDeBiblioteca());
//            }
            pstm.setString(4, u.getLogin());
            pstm.setString(5, u.getSenha());
            pstm.setBoolean(6, u.getInativo());
            pstm.setString(7, u.getRg());
            pstm.setString(8, u.getCpf());
            pstm.setString(9, u.getFotografia());
            pstm.setString(10, u.getTelefone());
            pstm.setString(11, u.getEndereco());
            pstm.setString(12, u.getCidade());
            pstm.setString(13, u.getUf());
            if (!(u.getId() == null)) {
                pstm.setLong(14, u.getId());
            }
            pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            this.desconnect();
        }
    }

   
    public Usuario login(String login) throws Exception {
        System.out.println("###" + login);
        String sql = "SELECT * FROM usuario WHERE `login` = ?";
        try {
            connect();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, login);
            ResultSet rs = pstm.executeQuery();
            Usuario u = new Usuario();
            if (rs.next()) {
                u.setId(rs.getLong("id"));
                u.setNomeCompleto(rs.getString("nomeCompleto"));
                u.setBibliotecario(rs.getBoolean("bibliotecario"));
                u.setChefeDeBiblioteca(rs.getBoolean("chefeDeBiblioteca"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setInativo(rs.getBoolean("inativo"));
                u.setRg(rs.getString("rg"));
                u.setCpf(rs.getString("cpf"));
                u.setFotografia(rs.getString("fotografia"));
                u.setTelefone(rs.getString("telefone"));
                u.setEndereco(rs.getString("endereco"));
                u.setCidade(rs.getString("cidade"));
                u.setUf(rs.getString("uf"));
            }
            return u;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            this.desconnect();
        }
    }

    public void logout() {

    }

}

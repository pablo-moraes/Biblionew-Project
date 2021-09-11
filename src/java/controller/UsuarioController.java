package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO.UsuarioDAO;
import model.Usuario;
import service.EncryptPassword;

public class UsuarioController extends HttpServlet {

    private static HttpServletResponse response;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {
//            out.close();
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
//    @SuppressWarnings("empty-statement")
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuarioController.response = response;

        PrintWriter out = response.getWriter();
        String nome = request.getParameter("nome");
        String login = request.getParameter("email").trim();
        String senha = request.getParameter("password").trim();
        String rg = request.getParameter("rg").trim();
        String cpf = request.getParameter("cpf").trim();
        String tel = request.getParameter("telefone").trim();
        String endereco = request.getParameter("endereco");
        String cidade = request.getParameter("cidade");
        String uf = request.getParameter("uf");
        Usuario u = new Usuario();

        try {
            
            EncryptPassword enc = new EncryptPassword();
            u.setSenha(enc.encrypt(senha));
            
            
            UsuarioDAO uDAO = new UsuarioDAO();
            u.setNomeCompleto(nome);
            u.setLogin(login);
            u.setRg(rg);
            u.setCpf(cpf);
            u.setTelefone(tel);
            u.setEndereco(endereco);
            u.setCidade(cidade);
            u.setUf(uf);
            uDAO.salvar(u);
        } catch (SQLException e) {
            out.print(e);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }

        out.println("<script type='text/javascript'>");
        out.println("alert('Seu registro foi efetuado!');");
        out.println("location.href='user/login.jsp';");
        out.println("</script>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

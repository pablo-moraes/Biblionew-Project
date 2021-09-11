/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.servlet.http.HttpSession;
import model.DAO.UsuarioDAO;
import model.Usuario;
import service.EncryptPassword;

/**
 *
 * @author pablo
 */
public class LoginController extends HttpServlet {
    
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
        response.setContentType("text/html;charset=UTF-8");

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        LoginController.response = response;
        String login = request.getParameter("mail").trim();
        String senha = request.getParameter("pass").trim();
        String remember = request.getParameter("remember");
        EncryptPassword encod = new EncryptPassword();
        try (PrintWriter out = response.getWriter()) {
            try {
                UsuarioDAO uDAO = new UsuarioDAO();
                Usuario u = new Usuario();
                
                u = uDAO.login(login);
                String passwd = u.getSenha();
                if(u.getId()>0 && encod.match(senha, passwd)) {
//                if(u.getId()>0 && u.getSenha().equals(senha)) {
                    HttpSession sessao = request.getSession();
                    sessao.setAttribute("ulogado", u);
                    out.println("<script type='text/javascript'>");
                    out.println("location.href='home/home.jsp';");
                    out.println("</script>");
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("location.href='user/login.jsp';");
                    out.println("alert('login ou senha inválidos');");
                    out.print("</script>");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 

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

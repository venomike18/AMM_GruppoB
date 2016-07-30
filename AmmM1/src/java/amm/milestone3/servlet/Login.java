/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3.servlet;

import amm.milestone3.ClienteClass;
import amm.milestone3.ClienteFactory;
import amm.milestone3.VenditoreClass;
import amm.milestone3.VenditoreFactory;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author medas
 */
@WebServlet(name = "Login", urlPatterns = {"/login.html"})
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);

        /*Verifica se hanno compilato i campi*/
        if (request.getParameter("login") != null) {

            /* dati di inserimento nel form di login */
            String username = request.getParameter("user");
            String password = request.getParameter("pswd");

            /*Carico la lista dei clienti*/
            ArrayList<ClienteClass> listaClienti;
            listaClienti = ClienteFactory.getInstance().getClientiList();

            /*Verifico che la lista clienti non sia vuota*/
            if (listaClienti != null) {
                /*Scorro la lista*/
                for (ClienteClass cliente : listaClienti) {
                    /* Se i dati di accesso sono corretti loggo il cliente */
                    if (cliente.getUsr().equals(username) && cliente.getPsw().equals(password)) {
                        session.setAttribute("loggedIn", true);
                        session.setAttribute("cliente", cliente);
                        /* Rimando alla pagina di vendita prodotti per i clienti */
                        request.getRequestDispatcher("cliente.html").forward(request, response);
                        return;
                    }
                }
            }

            /*Carico la lista dei Venditori*/
            ArrayList<VenditoreClass> listaVenditori = VenditoreFactory.getInstance().getVenditoriList();

            /*Verifico che la lista venditori non sia vuota*/
            if (listaVenditori != null) {
                /*Scorro la lista*/
                for (VenditoreClass venditore : listaVenditori) {
                    /* Se i dati di accesso sono corretti loggo il cliente */
                    if (venditore.getUsername().equals(username) && venditore.getPassword().equals(password)) {
                        session.setAttribute("loggedIn", true);
                        session.setAttribute("venditore", venditore);
                        request.getRequestDispatcher("venditore.html").forward(request, response);
                        return;
                    }
                }
            }
            
            /* Se i dati sono errati manda un messaggio di errore */
            request.setAttribute("errore", true);
            request.setAttribute("username", username);
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
        request.getRequestDispatcher("sidebar.jsp").forward(request, response);

    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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

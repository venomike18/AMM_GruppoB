/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3.servlet;
import amm.milestone3.Oggetto;
import amm.milestone3.ClienteClass;
import amm.milestone3.OggettoFactory;
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
@WebServlet(name = "Cliente", urlPatterns = {"/cliente.html"})
public class Cliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);

        int idCurrObj = -1; // Variabile idCurrObj per l'oggetto corrente selezionato
        ArrayList<Oggetto>lista = OggettoFactory.getInstance().getOggettoList(); // Generazione lista degli oggetti in vendita per il cliente
        Oggetto currObj;
        Double spesa;

        /**
         * Predisposizione per la creazione di una pagina di conferma dopo l'acquisto
         */
        if (request.getParameter("objId") != null) {

            /* Verifico se ID è un INT */
            try {
                idCurrObj = Integer.parseInt(request.getParameter("objId"));
            } catch (RuntimeException e) {
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("cliente.jsp").forward(request, response);
            }

            currObj = OggettoFactory.getInstance().getOggettoById(idCurrObj); // L'ggoetto corrente viene inizializzo con l'ID selezionato
            session.setAttribute("prezzo", currObj.getPrezzo());

            /* 
             *  Faccio una verifica, se l'ID è esistente proseguo alla pagina di conferma da predisporre, altrimenti do errore
             */
            if (currObj != null) {
                session.setAttribute("currObj", currObj);
                request.setAttribute("obj", session.getAttribute("currObj"));
                request.getRequestDispatcher("conferma.jsp").forward(request, response);
            } else {
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("cliente.jsp").forward(request, response);
            }
        }

        /* Pagamento confermato */
        if (request.getParameter("conferma") != null) {
            ClienteClass currC = (ClienteClass) session.getAttribute("cliente");
            Double saldo = currC.getSaldo();
            Double objValue = (Double) session.getAttribute("prezzo");
            
            if (saldo >= objValue) {
                spesa = objValue;
                session.setAttribute("spesa", objValue);
                request.setAttribute("terminato", true);
            } else {
                request.setAttribute("terminato", false);
            }
            
            request.setAttribute("lista", lista);
            request.getRequestDispatcher("cliente.jsp").forward(request, response);
            return;
        }

        request.setAttribute("lista", lista);
        /* l'utente loggato è un cliente, rimandalo alla pagina di vendita bittr*/
        request.getRequestDispatcher("cliente.jsp").forward(request, response);
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

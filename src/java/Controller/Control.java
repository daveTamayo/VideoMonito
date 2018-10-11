/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import cl.model.dao.videoMonitoDao;
import cl.model.pojos.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Familia Pinilla
 */
@WebServlet(name = "Control", urlPatterns = {"/Control"})
public class Control extends HttpServlet {

    Cliente cliente = new Cliente();

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
        processRequest(request, response);

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

        if (request.getParameter("registro") != null) {
            //______________________________________________________________________________
            String id = request.getParameter("txtId");
            int identi = Integer.parseInt(id);
//______________________________________________________________________________
            String fecha = request.getParameter("fecha");
            String nombre = request.getParameter("txtNombre");
            String referente = request.getParameter("txtReferente");
            String correo = request.getParameter("txtCorreo");
            String pass = request.getParameter("txtPass");

            cliente.setIdentificacion(identi);
            cliente.setNombre(nombre);
            cliente.setFechaIntegracio(fecha);
            cliente.setPuntos(0);
            cliente.setReferente(referente);
            cliente.setUsuario(correo);
            cliente.setPassword(pass);

            videoMonitoDao vmd = new videoMonitoDao();
            vmd.GuardarUsuario(cliente);

//            processRequest(request, response);
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {

                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println(" <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
                out.println("<title>JSP Page</title>");
                out.println("<link href='css/grayscale.min.css' rel='stylesheet'>");
                out.println("<link href='vendor/bootstrap/css/bootstrap.min.css' rel='stylesheet'>");
                out.println(" <link href='vendor/fontawesome-free/css/all.min.css' rel='stylesheet'>");
                out.println("<link href=´'https://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet'>");
                out.println("<link href='https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i' rel='stylesheet'>");
                out.println("</head>");
                out.println("<body>");
                out.println("<secction id='signup' class='signup-section'>");
                out.println("<div class='container'>");
                out.println("<div class='row'>");
                out.println("<div class='col-md-10 col-lg-8 mx-auto text-center'>");
                out.println("<h1>Registrar Usuario!</h1>");
                out.println("<form action='Control' method='GET'>");
                out.println("<input type='text' class='form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0' name='txtId' placeholder='Identificacion...' required><br>");
                out.println("<input type='text' class='form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0' name='txtNombre' placeholder='Nombre Completo...' required><br>");
                out.println("<input type='date' class='form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0' name='fecha' min='2000-06-07' max='2018-09-29' required/><br>");
                out.println("<input type='text' class='form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0' name='txtReferente' placeholder='Referente...' required><br>");
                out.println("<input type='email' class='form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0' name='txtCorreo'  placeholder='Correo electrónico...' required><br>");
                out.println("<input type='password' class='form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0' name='txtPass' placeholder='Ingresa Contraseña...' required><br>");
                out.println("<input type='submit' class='btn btn-primary mx-auto' name='registro' value='Registrar'>");
                out.println("<div class='container'>");
                out.println("<h1>Usuario Registrado</h1>");
                out.println("</div>");
                out.println("</form>");
                out.println("<input type='submit'onclick='location.href='http://localhost:8080/VideoMonito/'' class='btn btn-primary mx-auto' name='volver' value='Volver'>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</secction>");
                out.println("<script src='vendor/jquery/jquery.min.js'></script>");
                out.println("<script src='vendor/bootstrap/js/bootstrap.bundle.min.js'></script>");
                out.println("<!-- Plugin JavaScript -->");
                out.println("<script src='vendor/jquery-easing/jquery.easing.min.js'></script>");
                out.println("<!-- Custom scripts for this template -->");
                out.println("<script src='js/grayscale.min.js'></script>");
                out.println("</body>");
                out.println("</html>");
            }

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Personajes.Elfo;
import Personajes.Humano;
import Personajes.Orco;
import Personajes.Personaje;
import armaduras.Armadura;
import armaduras.ArmaduraDeGuerrero;
import armaduras.ArmaduraLigera;
import armaduras.ArmaduraPesada;
import armas.Arco;
import armas.Arma;
import armas.Espada;
import armas.Hacha;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author alejo
 */
public class ServletPersonaje extends HttpServlet {
   
    public static void liskov(Personaje p, Arma a, Armadura ar){
        p.setArma(a);
        p.setArmadura(ar);
    }
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        Personaje p = new Personaje();
        Arma w = new Arma();
        Armadura ar = new Armadura();
        
        
        try{
        if((request.getParameter("clase")).equals("orco")){
            p = new Orco(); 
        }else if((request.getParameter("clase")).equals("humano")){
            p = new Humano();
        }else if((request.getParameter("clase")).equals("elfo")){
            p = new Elfo();
        }
        
        p.setNombre(request.getParameter("nombre")); 
        
        if((request.getParameter("arma")).equals("espada")){
            w = new Espada();
        }else if(request.getParameter("arma").equals("arco")){
            w = new Arco();
        }else if(request.getParameter("arma").equals("hacha")){
            w = new Hacha();
        }
        
        if((request.getParameter("armadura")).equals("aLigera")){
            ar = new ArmaduraLigera();
        }else if ((request.getParameter("armadura")).equals("aPesada")){
            ar = new ArmaduraPesada();
        }else if ((request.getParameter("armadura")).equals("aGuerrero")){
            ar = new ArmaduraDeGuerrero();
        }
        
        liskov(p,w,ar);
        }catch(Exception e){
            response.sendRedirect("error.jsp");
        }
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola " +p.getNombre() + "</title>");  
            out.println("<link id=\"hojaDeEstilo\" rel=\"stylesheet\" type=\"text/css\"\n" +
"              href=\"css/estilo.css\" media=\"screen\" />");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ahora eres del la legión de los " + p.getTipo() + "s</h1>");
            out.println("<table>");
            out.println("<tr><td>Nombre del personaje: </td><td>" + p.getNombre() + "</td></tr>");
            out.println("<tr><td>Tipo: " + p.getTipo() + "</td>");
            out.println("<td>Arma: " + p.getArma() + "</td>");
            out.println("<td>Armadura: " + p.getArmadura() + "</td></tr>");
            out.println("<tr><td><img src=" + p.getImgDir()+ " alt='espada' width='200' height='500' </td>");
            out.println("<td><img src=" + w.getImgDir()+ " alt='espada' width='200' height='500' </td>");
            out.println("<td><img src=" + ar.getImgDir()+ " alt='espada' width='200' height='500' </td></tr>");
            out.println("</table>");
            out.println("<a href='index.jsp'>regresar");
            out.println("</body>");
            out.println("</html>");
            
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

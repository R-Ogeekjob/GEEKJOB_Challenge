/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author 崚一
 */
public class db2 extends HttpServlet {

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
        
        Connection db_con = null;
        PreparedStatement db_pr = null;
        
        try (PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql//localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST","Onodera","takenoko929");
            
            db_pr = db_con.prepareStatement("insert into profiles(name,tel,age,birthday)values(?,?,?,?)");
            db_pr.setInt(3,22);
            db_pr.setString(1,"小野寺 崚一");
            db_pr.setString(2,"080-6053-6602");
            db_pr.setString(4,"1995-09-29");
            
            db_con.close();
            
        }catch (SQLException e_sql){
            System.out.println("SQLエラーが発生しました");
        }catch (Exception e){
            System.out.println("エラーが発生しました");
        }
            
            
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet db2</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet db2 at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
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

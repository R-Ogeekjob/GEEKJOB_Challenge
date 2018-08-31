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
public class db6 extends HttpServlet {

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
        Connection db_con =null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        PrintWriter out = response.getWriter();
        try  {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST","Onodera","takenoko929");
            db_st = db_con.prepareStatement("delete from profiles where name = ?");
            db_st.setString(1,"小野寺 崚一");
            db_st.executeUpdate();  // 削除実行
            
            db_st = db_con.prepareStatement("select * from profiles");
            db_data = db_st.executeQuery();
            
            while(db_data.next()){
                out.println("ID"+db_data.getInt("profiles")+"<br>");
                out.println("名前"+db_data.getString("name")+"<br>");
                out.println("電話番号"+db_data.getString("tel")+"<br>");
                out.println("年齢"+db_data.getInt("age")+"<br>");
                out.println("誕生日"+db_data.getDate("birthday")+"<br>");
            }
            db_con.close();
            db_st.close();
            db_data.close();
            
        }catch(Exception e_con){
            out.println(e_con.getMessage());
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet db6</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet db6 at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        }
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

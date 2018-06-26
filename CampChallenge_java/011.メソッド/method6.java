/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author 崚一
 */
public class method6 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    ArrayList <String> userProfile(int n){
        ArrayList <String> prof1 = new ArrayList <String>();
        prof1.add("1");
        prof1.add("技育太郎");
        prof1.add("東京");
        prof1.add("男");
        prof1.add("プログラマー");
        
        ArrayList <String> prof2 = new ArrayList <String>();
        prof2.add("2");
        prof2.add("技育花子");
        prof2.add("北海道");
        prof2.add("女");
        prof2.add("システムエンジニア");
        
        ArrayList <String> prof3 = new ArrayList <String>();
        prof3.add("3");
        prof3.add("技育三郎");
        prof3.add("大阪");
        prof3.add("男");
        prof3.add("Webエンジニア");
        
        //引数の値を文字列型変換
        String n2 = String.valueOf(n);
        
        //引数と配列の要素0の値を比較し合致する配列を返却
        if(prof1.get(0).equals(n2)){
            return prof1;
        }
        
        if(prof2.get(0).equals(n2)){
            return prof2;
        }
        
        if(prof3.get(0).equals(n2)){
            return prof3;
        }
        
        //該当なしの場合nullを返却
        return null;
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            //配列を変数に代入
            ArrayList <String> put = userProfile(2);
            
            //戻り値として返された配列を表示
            for(String data : put){
                out.print(data + "<br>");
            }
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

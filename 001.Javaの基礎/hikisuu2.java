/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author guest1Day
 */
public class hikisuu2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */   
String[] id(String pid) {
        //3名分のID,名前、生年月日、住所の配列
       String[] data;
        data=new String[] {"111","yuki","1992/01/01","神奈川県横浜市"};
        
         
       String[] data1;
        data1= new String[] {"222","jhon","1993/02/02","東京都中央区"};
         
        
        String[] data2;
              data2 =new String[] {"444","eri","1994/03/03","大阪府"};
               
            // ３人分のプロフィールから、IDが一致する一人分のプロフィールを返却する処理をここに
         return data2;

}
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
    
                /* TODO output your page here. You may use following sample code. */
  //3名分表示
  String[] data;
        data=new String[] {"111","yuki","1992/01/01","神奈川県横浜市<br>"};
               out.println(data[0]);
               out.println(data[1]);
               out.println(data[2]);
               out.println(data[3]);

 String[] data1;
        data1= new String[] {"222","jhon","1993/02/02","東京都中央区<br>"};                   out.print(data1[1]);
               out.println(data1[0]);
               out.println(data1[2]);
               out.println(data1[3]);
 String[] data2;
 
              data2 =new String[] {"444","eri","1994/03/03",null};
          //住所をnullに変更
     String str = null;
     
         //nullの値をcontinueでスキップ
        for (int i = 0; i < data2.length; i++) {
            if (data2[i].equals(str)) {
                continue;
            }
            out.println(data2[i]);
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
}
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
     // </editor-fold>

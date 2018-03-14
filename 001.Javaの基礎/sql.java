/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

/**
 *
 * @author guest1Day
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;


//DB操作2 sqlの操作   ここから続きやる3/12


public class sql1 {
    public static void main (String[] args){
     Connection  db_con = null;
     PreparedStatement db_st = null;
     ResultSet db_data = null;
          
       try
        {   //ドライバのロード
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // URL,PS,USERNAME
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/profiles", "yuka3","yuka0304");
  
            
      Statement stmt = db_con.createStatement();

      
      
      String sql = "select * from profiles";
      int num = stmt.executeUpdate(sql);

      sql = "select * from profiles";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
        String name = rs.getString("name");
        System.out.println("name:" + name);
      }

             
        
        
         //クローズ
                db_data.close();
                db_st.close();
                db_con.close();
       
               
        }catch (SQLException e_sql){
               System.out.println("接続時にエラーが発生しました;" + e_sql.toString());       
        }catch(Exception e){
               System.out.println("接続時にエラーが発生しました;" + e.toString());      
        }finally{
               if(db_con != null) {
                    try{
                        db_con.close();
                    }catch(Exception e_con){
                        System.out.print(e_con.getMessage());
               }  
               }
}
    }
}

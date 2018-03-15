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


//DB操作 profileID カラムでレコードを指定し，profileID 以外のカラムの値を更新,その後全件表示

public class sql5 {
    public static void main (String[] args){
     Connection  db_con = null;
     PreparedStatement db_st = null;
     ResultSet rset = null;
          
       try
        {   //ドライバのロード
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // URL,PS,USERNAME
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/profiles", "yuka3","yuka0304");
  
            
                Statement stmt = db_con.createStatement();

                /* Statementの作成 */
                stmt = db_con.createStatement();

                //updateの準備
                String sql ="UPDATE profiles SET age = 50 , tel = 080080808080 WHERE name = 'yosida sige'";


                PreparedStatement pStmt = db_con.prepareStatement(sql);

         
                // SQL文の実行 update
                int result = pStmt.executeUpdate();
                if(result != 1){
                }
              
                

                /* Resultsetの作成 */

                rset = stmt.executeQuery("select * from profiles");



/* 取得したデータを表示 */
while (rset.next()) {
System.out.println(rset.getString(1) + "\t" + rset.getString(2)+ "\t" + rset.getString(3)+ "\t" + rset.getString(4));
}
        
        
         //クローズ
                rset.close();
                db_st.close();
                db_con.close();
       
               
        }catch (SQLException e_sql){
               System.out.println("接続出来ました;" + e_sql.toString());       
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
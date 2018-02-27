/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class file1 {
    public static void main(String[] args){
//標準クラスDateクラスを使用して時間を表示

     file now  = new file();
        //処理を開始する表示
        System.out.println("処理を開始します。");
        
        //現在時刻の表示
         // 日付情報を作成
        Date nowtime= new Date(1519718779000L);
         System.out.println(nowtime +"開始");

        //処理を終了する表示
        System.out.println("処理を終了します。");
        Date nowtime1 = new Date(1519718973000L);
        System.out.println(nowtime1 +"終了");
        
          
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author guest1Day
 */
public class Day1 {
            public static void main(String[] args) {

        //タイムスタンプを作成
        Date now = new Date(1478221200000L);

     //SimpleDateFormatクラスでフォーマットパターンを設定する
     
        SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //表示
        String dateString = sdf.format(now);
        System.out.print(dateString);
    }

  
}

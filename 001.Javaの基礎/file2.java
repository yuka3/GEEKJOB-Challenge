/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author guest1Day
 */
public class file2 {
    public static void main(String[] args)throws Exception{
        //読出し
 try{   
   File fp = new File("new.txt")  ;
   FileReader fr = new FileReader(fp);
   
   BufferedReader br = new BufferedReader(fr);
   
    System.out.print(br.readLine());
    br.close();

}catch(IOException e){
  System.out.println(e);
}

    }
}

    
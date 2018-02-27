/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import java.io.*;



/**
 *
 * @author guest1Day
 */
public class file {
    public static void main(String[] args) throws FileNotFoundException, IOException{
       
    //File Open
    File fp = new File("txt");
    //FileWriter作成
    FileWriter fw = new FileWriter(fp);
    //Write
    fw.write("初めまして浦木由花と申します。");
    //close
    fw.close();
  
           }
}

    
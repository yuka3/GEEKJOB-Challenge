/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

/**
 *
 * @author guest1Day
 */
public class class2 {
    public static void main(String[] args) {
        // Humanクラスのインスタンス生成
        Human hito = new Human();
        // 人インスタンスのsetHumanメソッドを利用
        hito.setHuman(null, 0);
        
    }
}
class Human {
        // フィールドの宣言
         public String name = "";
         public int birth = 0;

        // メソッドの宣言
    public void setHuman(String n, int a) {
        // 引数をフィールドへ設定
        this.name = n;
        this.birth = a;
        System.out.println(this.name = n);
        System.out.println(this.birth = a);
          
}
//  Humanclassの継承
class Dr extends Human{
     Dr(){}
}
     
// Humanクラスを継承したので、
// nameフィールド
// birthフィールド
// setHumanメソッド
class Teacher extends Human {
    public void kougi() {
        String msg = "Drの" + this.name + "です。";
        System.out.print(msg);
    }


}
}





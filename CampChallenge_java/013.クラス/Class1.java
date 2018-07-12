/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 崚一
 */
public class Class1 {
    //フィールドの宣言
    public String name = "";
    public int age = 0;
    public String address = "";
    
    //メソッドの宣言
    public void setProfile(String n , int a , String ad){
        //引数をフィールドへ設定
        this.name = n;
        this.age = a;
        this.address = ad;
    }
    //フィールドを画面に表示するメソッドの宣言
    public void printProfile(){
        System.out.print("名前：" + name);
        System.out.print("年齢：" + age);
        System.out.print("住所：" + address);
    }
    
}

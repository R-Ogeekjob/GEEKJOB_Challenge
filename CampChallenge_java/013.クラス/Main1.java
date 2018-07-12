/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 崚一
 */
public class Main1 {
    public static void main(String[] args){
        //Class1インスタンスの生成
        Class1 onodera = new Class1();
        
        onodera.name = "小野寺崚一";
        onodera.age = 22;
        onodera.address = "埼玉県和光市";
        
        //Class1インスタンスのsetProfileを呼び出す
        onodera.setProfile("小野寺崚一" , 22 , "埼玉県和光市");
        
        //Class1インスタンスのprintProfileを呼び出す
        onodera.printProfile();
    }
    
}

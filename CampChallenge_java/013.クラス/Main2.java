/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 崚一
 */
public class Main2 {
    public static void main(String[] args){
        //Class2インスタンスを生成
        Class2 profile2 = new Class2();
        
        profile2.setProfile("小野寺崚一", 22, "埼玉県和光市");
        profile2.printProfile();
        profile2.clearProfile();
        profile2.printProfile();
    }
    
}

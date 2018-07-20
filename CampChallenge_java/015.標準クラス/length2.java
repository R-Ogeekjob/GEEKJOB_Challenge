/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author 崚一
 */
public class length2 {
    public static void main(String[] args){
        String mail ="r.o929geekjob@gmail.com";
        
        // @の位置を取得
        int a = mail.indexOf("@");
        // @以降の文字を取得
        String b =mail.substring(a);
        // @以降の文字数を取得
        System.out.println(b.length());
    }
    
}

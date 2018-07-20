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
public class replace {
    public static void main(String[] args){
      String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" ;
      String reword1 = word.replace("U","う");
      String reword2=reword1.replace("I", "い");
      
      System.out.println(reword2);
    }
    
}

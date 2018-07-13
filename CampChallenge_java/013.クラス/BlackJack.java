
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 崚一
 */
public class BlackJack {

    /**
     *
     * @param args
     */
    
    public static void main(String args[]){
        Dealer d = new Dealer();    //ディーラーのインスタンス生成 山札が用意される
        User u = new User();    //プレイヤーのインスタンス生成
        
        System.out.println("BlackJack開始");
        d.setCard(d.deal());    //手札に2枚のカードを追加
        u.setCard(d.deal());    //手札に2枚のカードを追加
        System.out.println("手札");
        System.out.println("プレイヤー" + u.myCards);
        System.out.println("ヒット or スタンド");
        
        //ディーラー
        System.out.println("ディーラーのターン"); 
        while(d.checkSum()){
            d.setCard(d.hit());
        }
        
        //プレイヤー
        System.out.println("プレイヤーのターン");
        while(u.checkSum()){
            System.out.println("ヒット");
            u.setCard(d.hit());
            System.out.println("ヒット後の手札");
            System.out.println(u.myCards);
            }
        System.out.println("スタンド");
        
        //ディーラーの手札公開
        System.out.println("ディーラーの手札公開");
        System.out.println(d.myCards);
        
        //勝敗
        int dt = d.open();  //ディーラーの手札の合計値
        int ut = u.open();  //プレイヤーの手札の合計値
        
        if(21<ut){
            System.out.println("バスト");
            System.out.println("敗北");
        }else if(21<dt){
            System.out.println("勝利");
        }else if(ut<dt){
            System.out.println("敗北");
        }else if(dt<ut){
            System.out.println("勝利");
        }else if(dt==ut){
            System.out.println("引き分け");
        }
            
        
    }
    
}

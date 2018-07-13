
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

public class Dealer extends Human{
    
    //山札をフィールド宣言
    protected ArrayList<Integer> cards = new ArrayList<Integer>();
    
    //コンストラクタで山札(変数=cards)にカードをセット
    public Dealer(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=13; j++){
            cards.add(j);
            }
        }
    }
    
    public ArrayList<Integer> deal(){
        ArrayList<Integer> hand =new ArrayList(); //手札(変数=hand)の配列作成
        Random rand = new Random();
        
        for(int l=0; l<=1; l++){ //山札から2枚取得し手札へ追加するループ処理
           Integer r=rand.nextInt(cards.size());//乱数取得
           int i=cards.get(r);//乱数の値を山札から取得
           cards.remove(i);
           hand.add(l,i); //「l」枚目の手札の値が「i」
        }
        return hand;
    }
    
    public ArrayList<Integer> hit(){
        ArrayList<Integer> hand =new ArrayList(); //手札(変数=hand)の配列作成
        Random rand = new Random();
        Integer r=rand.nextInt(cards.size());//乱数取得
        int i=cards.get(r);//乱数の値を山札から取得
        cards.remove(r);
        hand.add(i); 
        return hand;
    }

    @Override
    public int open() {
        int total=0;
        for(int i=0; i<myCards.size(); i++){
            if(10<myCards.get(i)){  //カードの数値が10より大きい場合値は10と認識
                myCards.set(i, 10);
            }
            total+= myCards.get(i);
        }
    return total;   //手札の合計値を返却
    }

    @Override
    public void setCard(ArrayList<Integer> a) { 
        //引数として受け取ったカードを
        //ループ処理で手札(Humanクラスで定義した変数=myCards)に追加
        for(int i=0; i<a.size(); i++){
            myCards.add(a.get(i));
        }
    }
    
    @Override
    public boolean checkSum() {
        int total=0;
        for(int i=0; i<myCards.size(); i++){
            if(10<myCards.get(i)){  //カードの数値が10より大きい場合値は10と認識
                myCards.set(i, 10);
            }
        total+= myCards.get(i);
        }
        
        if(total<17){
            return true;
        }else{
            return false;
        }
    }
    
}

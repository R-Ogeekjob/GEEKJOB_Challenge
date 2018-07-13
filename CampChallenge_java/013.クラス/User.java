
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 崚一
 */


public class User extends Human {

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
        
        if(total<15){
            return true;
        }else{
            return false;
        }
    }
    
}

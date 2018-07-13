
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

public abstract class Human {
    //フィールド
    protected ArrayList<Integer> myCards = new ArrayList<Integer>();
    
    abstract public int open(); //手札の合計値を計算するメソッド
    abstract public void setCard(ArrayList<Integer> a); //引いたカードを手札にセットするメソッド
    abstract public boolean checkSum(); //更にカードを引くべきか判断するメソッド
}

package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 崚一
 */

import java.util.Date;
import java.util.Calendar;


public class TimeStamp1 {
    public static void main(String[] args){
        // カレンダーインスタンスを作成
        Calendar c = Calendar.getInstance();
        // 日付を設定
        c.set(2016,0,1,0,0);
        Date d = c.getTime();
        System.out.print(d.getTime());
    }
    
}



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


import java.util.Date;
import java.text.SimpleDateFormat;

// 現在の日時を「1988年5月21日 1時23分45秒」といった形式で表現
public class nowTime {
    public static void main(String[] args){
        // 本日の日付生成
        Date d = new Date();
        // SimpleDateFormat作成
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        
        System.out.print(sdf.format(d));
        
    }
    
}

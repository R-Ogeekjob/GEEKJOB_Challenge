/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
        
/**
 *
 * @author 崚一
 */
// 「2016年11月4日 10時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示
// さらにこの情報を「2016-11-04 10:00:00」の形式で画面に表示

public class Timestamp2 {
    public static void main(String[] args){
        // カレンダーインスタンスの生成
        Calendar c = Calendar.getInstance();
        // 2016年11月4日 10時0分0秒
        c.set(2016, 10, 4, 10, 0, 0);
        
        // カレンダーインスタンスにセットした日時のタイムスタンプを取得
        Date d = c.getTime();
        System.out.println(d.getTime());
        
        // SimpleDateFormatインスタンス生成
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        System.out.print(sdf.format(d));
    }
}

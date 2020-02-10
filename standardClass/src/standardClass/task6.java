package standardClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class task6 {

	public static void main(String[] args) {
		Date Today = new Date();
        SimpleDateFormat TodayJpFormat = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(TodayJpFormat.format(Today));
        TodayJpFormat = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
        System.out.println(TodayJpFormat.format(Today));
    }


}
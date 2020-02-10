package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class task7 {

	public static void main(String[] args) {
	    SimpleDateFormat JpFormat = new SimpleDateFormat("yyyy年MM月dd日");

	    Calendar Cal = Calendar.getInstance(); // 今日
	    System.out.println("現在日時:" + JpFormat.format(Cal.getTime()));

	    Cal.add(Calendar.DAY_OF_MONTH, 7);     // 5 日後
	    System.out.println("一週間後:" + JpFormat.format(Cal.getTime()));
	    
	    String[] week_name = {"日", "月", "火", "水", "木", "金", "土"};
	    int week = Cal.get(Calendar.DAY_OF_WEEK) - 1;
	    Cal.add(Calendar.DAY_OF_YEAR,1);
	    System.out.println("一年後:" + JpFormat.format(Cal.getTime()) + "(" + week_name[week] + ")");

	}

}

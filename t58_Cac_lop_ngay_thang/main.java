package t58_Cac_lop_ngay_thang;

import java.awt.CardLayout;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class main 
{
	//https://openplanning.net/10245/java-date-time
	public static void main(String[] args) 
	{
		//Hàm lấy thời gian hiện tại
		long t1 = System.currentTimeMillis();
		
		//TimeUnit: Chuyển đổi thời gian
		System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000* 365) + "s");
		System.out.println("130 hours = " + TimeUnit.HOURS.toSeconds(130) + "s");
		
		//Date
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date.getDay() + "/" + (date.getMonth() + 1)+ "/" + (date.getYear()+1970 - 70));
		
		//Calendar
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(calendar.DATE) + "/" + (calendar.get(calendar.MONTH) + 1 )+ "/" + calendar.get(calendar.YEAR));
		calendar.add(calendar.HOUR, 30);
		System.out.println(calendar.get(calendar.DATE) + "/" + (calendar.get(calendar.MONTH) + 1 )+ "/" + calendar.get(calendar.YEAR));
		
		//DateFormat
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(date));
		df = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss");
		System.out.println(df.format(date));
		
		
	}
}

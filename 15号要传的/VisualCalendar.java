package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class VisualCalendar {
public static void main(String[] args) throws ParseException{
	System.out.println("请输入日期：（格式为：1990-9-1）");
	Scanner s = new Scanner(System.in);
	String str= s.nextLine();
	DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
	Date date = format.parse(str);
	Calendar c = new GregorianCalendar();
			c.setTime(date);
	int maxDay = c.getActualMaximum(Calendar.DATE);
	int day = c.get(Calendar.DATE);
	c.set(Calendar.DATE, 1);
	int week = c.get(Calendar.DAY_OF_WEEK);
	System.out.println("日\t一\t二\t三\t四\t五\t六 ");
	int count = 0;
	for(int i=0;i<week;i++){
		System.out.print("\t");
		count++;
	}
	for(int i = 1;i <=maxDay;i++){
		/*if(day==i){
			System.out.print(i+"*"+"\t");
		}*/
		System.out.print((day==i?i+"*":i)+"\t");
		
		count++;
		if (count%7==0){
			System.out.println();
		}
	}
}
}
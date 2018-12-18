package com.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		//根据年，月，日，时，分，秒构造对象
		Calendar calendar=new GregorianCalendar(2008,8,8,8,8,8);
		//获取对象calendar中的元素
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		//星期：1-7，1表示星期日，2表示星期一。。。。。
		int weekday=calendar.get(Calendar.DAY_OF_WEEK);
		//几号
		int day=calendar.get(Calendar.DATE);
		System.out.println(year);
		System.out.println(month);
		System.out.println(weekday);
		System.out.println(day);
		
		//设置日期的元素
		//不设置值的话默认为当前系统时间
		Calendar c2=new GregorianCalendar();
		c2.set(Calendar.YEAR, 8012);
		System.out.println(c2);
		
		//日期的计算
		Calendar c3=new GregorianCalendar();
		//day向后加100天
		c3.add(Calendar.DATE, 100);
		System.out.println(c3);
		
		//日期对象和时间对象的转换
		Date d4=c3.getTime();
		System.out.println(d4);
		Calendar c4=new GregorianCalendar();
		c4.setTime(new Date());
		
		TestCalendar.printCalendar(c4);
	}
	
	public static void printCalendar(Calendar c){
		//打印：比如:1918年10月10日 11:23:45 周三
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;   //0-11
		int  date = c.get(Calendar.DAY_OF_MONTH);
		int  dayweek  = c.get(Calendar.DAY_OF_WEEK)-1;    //1-7.1周日，2周1,3周2....
		String dayweek2 = dayweek==0?"日":dayweek+"";
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"年"+month+"月"+date+"日 "+hour+"时"+minute+"分"+second+"秒"
				+"   周"+dayweek2);
				
	}
}

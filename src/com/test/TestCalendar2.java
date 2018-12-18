package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar2 {

	public static void main(String[] args) throws ParseException {
		String str="2010-9-10";
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date date=df.parse(str);
		Calendar c=new GregorianCalendar();
		c.setTime(date);
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		//将日期设置为当前月份的1号
		c.set(Calendar.DAY_OF_MONTH, 1);
		for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
			System.out.print("\t");
		}
		//c.getActualMaximum(Calendar.DATE):获取当前月份最大天数
		int days=c.getActualMaximum(Calendar.DATE);
		for(int i=1;i<=days;i++){
			System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
			if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
				System.out.println();
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}

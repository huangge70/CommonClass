package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//format:将日期转换为字符串
		String str=df.format(new Date(4000000));
		System.out.println(str);
		
		//将字符串转换为时间对象
		DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
		Date d2=df2.parse("2000年1月1日  10时10分10秒");
		System.out.println(d2);
		
		//输出当前时间是今年的第多少天
		DateFormat df3=new SimpleDateFormat("D");
		String str3=df3.format(new Date());
		System.out.println(str3);
	}
}

package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//format:������ת��Ϊ�ַ���
		String str=df.format(new Date(4000000));
		System.out.println(str);
		
		//���ַ���ת��Ϊʱ�����
		DateFormat df2=new SimpleDateFormat("yyyy��MM��dd��  HHʱmm��ss��");
		Date d2=df2.parse("2000��1��1��  10ʱ10��10��");
		System.out.println(d2);
		
		//�����ǰʱ���ǽ���ĵڶ�����
		DateFormat df3=new SimpleDateFormat("D");
		String str3=df3.format(new Date());
		System.out.println(str3);
	}
}

package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalendar3 {

	public static void main(String[] args) throws ParseException {
		System.out.println("���������ڣ���ʽΪ��2010-9-10����");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date date=df.parse(str);
		Calendar c=new GregorianCalendar();
		c.setTime(date);
		int day=c.get(Calendar.DAY_OF_MONTH);
		System.out.println("��\tһ\t��\t��\t��\t��\t��\t");
		//����������Ϊ��ǰ�·ݵ�1��
		c.set(Calendar.DAY_OF_MONTH, 1);
		for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
			System.out.print("\t");
		}
		//c.getActualMaximum(Calendar.DATE):��ȡ��ǰ�·��������
		int days=c.getActualMaximum(Calendar.DATE);
		for(int i=1;i<=days;i++){
			if(i==day){
				System.out.print(c.get(Calendar.DAY_OF_MONTH)+"*\t");
			}else{
				System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
			}
			if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
				System.out.println();
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}

package com.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		//�����꣬�£��գ�ʱ���֣��빹�����
		Calendar calendar=new GregorianCalendar(2008,8,8,8,8,8);
		//��ȡ����calendar�е�Ԫ��
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		//���ڣ�1-7��1��ʾ�����գ�2��ʾ����һ����������
		int weekday=calendar.get(Calendar.DAY_OF_WEEK);
		//����
		int day=calendar.get(Calendar.DATE);
		System.out.println(year);
		System.out.println(month);
		System.out.println(weekday);
		System.out.println(day);
		
		//�������ڵ�Ԫ��
		//������ֵ�Ļ�Ĭ��Ϊ��ǰϵͳʱ��
		Calendar c2=new GregorianCalendar();
		c2.set(Calendar.YEAR, 8012);
		System.out.println(c2);
		
		//���ڵļ���
		Calendar c3=new GregorianCalendar();
		//day����100��
		c3.add(Calendar.DATE, 100);
		System.out.println(c3);
		
		//���ڶ����ʱ������ת��
		Date d4=c3.getTime();
		System.out.println(d4);
		Calendar c4=new GregorianCalendar();
		c4.setTime(new Date());
		
		TestCalendar.printCalendar(c4);
	}
	
	public static void printCalendar(Calendar c){
		//��ӡ������:1918��10��10�� 11:23:45 ����
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;   //0-11
		int  date = c.get(Calendar.DAY_OF_MONTH);
		int  dayweek  = c.get(Calendar.DAY_OF_WEEK)-1;    //1-7.1���գ�2��1,3��2....
		String dayweek2 = dayweek==0?"��":dayweek+"";
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"��"+month+"��"+date+"�� "+hour+"ʱ"+minute+"��"+second+"��"
				+"   ��"+dayweek2);
				
	}
}

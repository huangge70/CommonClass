package com.test;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		//��ǰϵͳʱ��
		Date d=new Date();
		System.out.println(d);
		
		//Ҳ���Դ������������1970��1��1�տ�ʼ����
		Date d2=new Date(2000);
		System.out.println(d2);
		
		//d.getTime():��ȡʱ������Ӧ�ĺ�����
		System.out.println(d.getTime());
		
		//�Ƚ�����ʱ�䣬�ĸ���ǰ�ĸ��ں�
		System.out.println(d.after(d2));
		
		
	}
}

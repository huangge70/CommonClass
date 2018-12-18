package com.test;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		//当前系统时间
		Date d=new Date();
		System.out.println(d);
		
		//也可以传入毫秒数，从1970年1月1日开始计算
		Date d2=new Date(2000);
		System.out.println(d2);
		
		//d.getTime():获取时间所对应的毫秒数
		System.out.println(d.getTime());
		
		//比较两个时间，哪个在前哪个在后
		System.out.println(d.after(d2));
		
		
	}
}

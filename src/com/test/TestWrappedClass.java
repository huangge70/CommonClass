package com.test;
//测试包装类
public class TestWrappedClass {

	public static void main(String[] args) {
		//基本数据类型转换为包装类对象
		Integer a=new Integer(3);
		Integer b=Integer.valueOf(30);//官方推荐
		
		//把包装类对象转换成基本数据类型
		int c=b.intValue();
		double d=b.doubleValue();
		
		//把字符串转换为包装类对象
		Integer e=new Integer("999");
		Integer f=Integer.parseInt("888");
		
		//把包装类对象转换为字符串
		String str=f.toString();
		
		System.out.println("整数最大为："+Integer.MAX_VALUE);
		
		
	}
}

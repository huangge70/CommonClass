package com.test;
//StringBuilder是可变字符序列，String是不可变字符序列
public class TestStringBuilder {

	public static void main(String[] args) {

		/*StringBuilder和StringBuffer的区别：
		 * StringBuilder线程不安全，效率高(使用较多)
		 * StringBuffer线程安全，效率低
		 */
		StringBuilder sb=new StringBuilder("aaaaaa");
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		sb.setCharAt(2, 'b');
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
	}

}

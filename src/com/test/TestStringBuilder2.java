package com.test;

public class TestStringBuilder2 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++){
			sb.append((char)('a'+i));
		}
		System.out.println(sb);
		//倒序
		sb.reverse();
		System.out.println(sb);
		sb.setCharAt(3, '高');
		System.out.println(sb);
		//StringBuilder支持链式调用
		sb.insert(1, '我').insert(0, '我');
		System.out.println(sb);
		
		sb.delete(20, 23);
		System.out.println(sb);
	}
}

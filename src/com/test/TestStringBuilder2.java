package com.test;

public class TestStringBuilder2 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++){
			sb.append((char)('a'+i));
		}
		System.out.println(sb);
		//����
		sb.reverse();
		System.out.println(sb);
		sb.setCharAt(3, '��');
		System.out.println(sb);
		//StringBuilder֧����ʽ����
		sb.insert(1, '��').insert(0, '��');
		System.out.println(sb);
		
		sb.delete(20, 23);
		System.out.println(sb);
	}
}

package com.test;
//StringBuilder�ǿɱ��ַ����У�String�ǲ��ɱ��ַ�����
public class TestStringBuilder {

	public static void main(String[] args) {

		/*StringBuilder��StringBuffer������
		 * StringBuilder�̲߳���ȫ��Ч�ʸ�(ʹ�ý϶�)
		 * StringBuffer�̰߳�ȫ��Ч�ʵ�
		 */
		StringBuilder sb=new StringBuilder("aaaaaa");
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		sb.setCharAt(2, 'b');
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
	}

}

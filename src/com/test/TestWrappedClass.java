package com.test;
//���԰�װ��
public class TestWrappedClass {

	public static void main(String[] args) {
		//������������ת��Ϊ��װ�����
		Integer a=new Integer(3);
		Integer b=Integer.valueOf(30);//�ٷ��Ƽ�
		
		//�Ѱ�װ�����ת���ɻ�����������
		int c=b.intValue();
		double d=b.doubleValue();
		
		//���ַ���ת��Ϊ��װ�����
		Integer e=new Integer("999");
		Integer f=Integer.parseInt("888");
		
		//�Ѱ�װ�����ת��Ϊ�ַ���
		String str=f.toString();
		
		System.out.println("�������Ϊ��"+Integer.MAX_VALUE);
		
		
	}
}

package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) throws IOException {
		//File f=new File("d:/a.txt");
		//������Ĵ���������ͬ����Ϊ\��ת���ַ���������Ҫд����
		File f=new File("d:\\a.txt");
		//�ı��ļ���
		f.renameTo(new File("d:/bb.txt"));
		
		//��ȡ��ǰ��ĿĿ¼
		System.out.println(System.getProperty("user.dir"));
		//�Ϳ�������ĿĿ¼�½��в���
		//����ĿĿ¼���½��ļ�
		File f2=new File("cc.txt");
		f2.createNewFile();
		
		System.out.println("File�Ƿ���ڣ�"+f2.exists());
        System.out.println("File�Ƿ���Ŀ¼��"+f2.isDirectory());
        System.out.println("File�Ƿ����ļ���"+f2.isFile());
        System.out.println("File����޸�ʱ�䣺"+new Date(f2.lastModified()));
        System.out.println("File�Ĵ�С��"+f2.length());
        System.out.println("File���ļ�����"+f2.getName());
        System.out.println("File��Ŀ¼·����"+f2.getAbsolutePath());
		
        
        File f3 = new File("d:/��Ӱ/����/��½");
        //boolean flag = f3.mkdir(); //Ŀ¼�ṹ����һ�������ڣ��򲻻ᴴ������Ŀ¼��
        boolean flag = f3.mkdirs();//Ŀ¼�ṹ����һ��������Ҳû��ϵ����������Ŀ¼��
        System.out.println(flag);//�����ɹ�
	}
}

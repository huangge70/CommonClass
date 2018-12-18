package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) throws IOException {
		//File f=new File("d:/a.txt");
		//与上面的代码意义相同，因为\是转义字符，所以需要写两个
		File f=new File("d:\\a.txt");
		//改变文件名
		f.renameTo(new File("d:/bb.txt"));
		
		//获取当前项目目录
		System.out.println(System.getProperty("user.dir"));
		//就可以在项目目录下进行操作
		//在项目目录下新建文件
		File f2=new File("cc.txt");
		f2.createNewFile();
		
		System.out.println("File是否存在："+f2.exists());
        System.out.println("File是否是目录："+f2.isDirectory());
        System.out.println("File是否是文件："+f2.isFile());
        System.out.println("File最后修改时间："+new Date(f2.lastModified()));
        System.out.println("File的大小："+f2.length());
        System.out.println("File的文件名："+f2.getName());
        System.out.println("File的目录路径："+f2.getAbsolutePath());
		
        
        File f3 = new File("d:/电影/华语/大陆");
        //boolean flag = f3.mkdir(); //目录结构中有一个不存在，则不会创建整个目录树
        boolean flag = f3.mkdirs();//目录结构中有一个不存在也没关系；创建整个目录树
        System.out.println(flag);//创建成功
	}
}

package cn.study;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 测试java读取txt文本文件的内容
 * @author Administrator
 */
public class Readfile {
	public static void main(String[] args) throws IOException {
			InputStreamReader isr=new InputStreamReader(new FileInputStream("C://Users/Administrator/Desktop/Spring.txt"),"gbk");
			BufferedReader br=new BufferedReader(isr);
			String s ;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
	}
}

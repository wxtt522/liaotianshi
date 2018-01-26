package cn.study;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *	客户端应用程序
 *	第一步：实现向服务器发送一条消息
 * @author WuLH
 */
public class Client {
	//客户端socket
	private Socket socket;
	//服务端socket
	//private ServerSocket serverSocket;
	
	private Scanner scan;
	/**
	 * 构造方法用于初始化
	 */
	public Client(){
		
		try {
			socket=new Socket("localhost",8080);
			System.out.println("连接已经获取。");
//			serverSocket = new ServerSocket(8088);
//			System.out.println("连接已经得到。");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//创建客户端工作方法
	public void start(){
		try {
			OutputStream os=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os, "utf-8");
			PrintWriter pw=new PrintWriter(osw,true);//追加写出
			scan=new Scanner(System.in);
			
			/*System.out.println("等待服务器反馈...");
			Socket socket2=serverSocket.accept();
			System.out.println("服务器反馈成功");
			InputStream is=socket2.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader bf=new BufferedReader(isr);*/
			
			while(true){
				pw.println(scan.nextLine());
				//System.out.println("服务器说:"+bf.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//scan.close();
			if(socket!=null){
				try {
					socket.close();
					scan.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	/*
	 * 顺便集成一下服务端、算了、懒得写在构造器里放方法里先使着
	 */

	
	public static void main(String[] args) {
		Client c=new Client();
		c.start();
		
	}
	
	
}

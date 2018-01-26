package cn.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端引用程序、接受client发送过来的数据
 * @author WuLH
 *
 */
public class Server {
	//服务端socket
	private ServerSocket serverSocket;
	//private Socket socket2;
	//private Scanner scan;
	/**
	 * 构造方法，用于初始化
	 */
	public Server(){
		try {
			serverSocket=new ServerSocket(8080);
			//socket2=new Socket("localhost",8088);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 夜晚是自己的，随便写写自己喜欢的代码，自娱自乐而已了】
	 * 这周写个带图形界面的
	 */
	public void start(){
		try {
			System.out.println("等待客户端连接.........");
			//监听客户端的连接
			Socket socket=serverSocket.accept();
			System.out.println("客户端已连接！");
			InputStream is=socket.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			
			/*OutputStream os=socket2.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os, "utf-8");
			PrintWriter pw=new PrintWriter(osw,true);//追加写出
			scan=new Scanner(System.in);*/
			
			while(true){
				//pw.println(scan.nextLine());
				System.out.println("客户端说:"+br.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Server s=new Server();
		s.start();
	}
	
}

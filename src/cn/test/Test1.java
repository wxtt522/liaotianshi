package cn.test;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
		Map <Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "ab");
		map.put(4, "ab");
		map.put(4, "ba");
		
		for(Map.Entry<Integer, String> m:map.entrySet()){
			System.out.println(m);
		}
		
		
	}
}

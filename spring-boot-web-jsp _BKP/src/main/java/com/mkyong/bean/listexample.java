package com.mkyong.bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class listexample {
	public static void hashiterate() {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		for(Integer i:map.keySet())
		{
			System.out.println(i+" "+map.get(i));
		}
		
		Iterator<Map.Entry<Integer, String>> it=map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> et=it.next();
			System.out.println(et.getKey()+" "+et.getValue());
		}
		
	}
	public static void pattern() {
		for(int i=0; i<=6; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(" "+j);
			}
			System.out.println("");
		}
		
		
		
	} 
	
	public static void StringAr() {
		String str="sdfs ae rt grrrtr";
		str=str.replace(" ", "");
		System.out.println(str);
		
		
		
	}
	
public static void removeDuplic() {
	String str="dsfsadgajjiuuikikl";
	char ch[]=str.toCharArray();
	char[] resut=new char[20];
	for(int i=0; i<=ch.length-1; i++)
	{
		for(int j=i+1; j<=ch.length-1; j++)
		{
			if(ch[i]==ch[j])
			{
				System.out.print(ch[i]);
				
			}
			
		}
	}
	System.out.println("**************"+resut);

	
	
}
	
	public static void test() {
		
		//New pattern like triangle
		
		for(int i=0; i<=6; i++)
		{
			for(int j=i; j<=6; j++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
		
	}

	public static void PatternEx() {
		
		for(int i=0; i<=6; i++)
		{
			
			for(int j=0; j<=i; j++)
			{
				System.out.print(""+i);
			}
			System.out.println("");
		}
		
		
	}
	
	
	
	//public static void main(String[] args) {
	//hashiterate();
	//pattern();
	//test();
	//PatternEx();
		//StringAr();
		//removeDuplic();
	//}

}

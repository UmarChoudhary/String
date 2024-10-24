package com.practiceSet;

public class Test1 {
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder("Ai4 fintech");
		String str1 =sb.toString();
//		String str2="Ai4 fintech";
//		String str2=sb.toString();
		String str2=str1;
//		String str2 = new String(str1);
		if(str1==str2)
		{
		System.out.println("True");
	}
		else
		{
			System.out.println("False");
		}
	}
}
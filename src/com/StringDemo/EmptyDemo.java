package com.StringDemo;

public class EmptyDemo {
   
   	
	public static void main(String[] args)
	{
		String s=new String ("ABBCDEFGH");
		
		
		System.out.println(s.isEmpty());
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.equals("abc"));
		System.out.println(s.equalsIgnoreCase("abc"));
		System.out.println(s.replace("ABC","EFG"));
		System.out.println(s.substring(3,7));
		System.out.println(s.indexOf("B"));
		System.out.println(s.lastIndexOf("B"));
		System.out.println(s.toLowerCase());
	}
} 
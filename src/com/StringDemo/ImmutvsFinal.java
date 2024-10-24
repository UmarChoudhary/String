package com.StringDemo;

public class ImmutvsFinal {
	public static void main(String[]args)
	{
		//final 
		StringBuffer sb=new StringBuffer("Ai4");
		sb.append("Fintech");
		System.out.println(sb);
		sb  =new StringBuffer("pvt ltd");
	}
}

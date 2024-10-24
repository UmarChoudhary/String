package com.stringBuffer;

public class ChainingMethod {
	public static void main(String[] args) 
	{
		StringBuilder sc=new StringBuilder("umar-");
		sc.append("choudhary-").append("AJ").insert(0,"mohammad-").trimToSize();
		System.out.println(sc.capacity());
		System.out.println(sc);
	}
}
//is called method chaining
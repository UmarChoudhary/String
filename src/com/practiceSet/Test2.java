package com.practiceSet;

public class Test2 {
	public static void main(String[] args) {
		
	StringBuilder sb= new StringBuilder("xyz");
	System.out.println(sb.length());
	sb.delete(0,3);
	System.out.println(sb.length());
}
}
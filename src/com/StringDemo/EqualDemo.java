package com.StringDemo;

public class EqualDemo {
	public static void main(String[] args) {
		String s1 = new String("Ai4");
		String s2 = new String("Fintech");
		s1.concat("pvt ltd");
		System.out.println(s1==s2); //False
		System.out.println(s1.equals(s2)); //False
		System.out.println(s1==s1); //True
	}
}
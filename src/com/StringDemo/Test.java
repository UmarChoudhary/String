package com.StringDemo;

public class Test {
	public static void main(String[] args) {
		String s1 = new String("Hashim");
		String s2 = new String ("Hashim");
		s2.concat("Sir");
		System.out.println(s2);
		System.out.println(s1.equals(s2));
	}
}
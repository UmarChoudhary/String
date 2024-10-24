package com.stringBuffer;

public class Test {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghhijklmnopqrstuv");
		System.out.println(sb.capacity());
		sb.append("qoi");
		System.out.println(sb.capacity());
		System.out.println();
	}
}
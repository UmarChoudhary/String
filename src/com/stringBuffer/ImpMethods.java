package com.stringBuffer;

public class ImpMethods {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Assorted");
		sb.append("Mixed");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(4));
		sb.setCharAt(6,'n');
		System.out.println(sb);
		sb.append(5);
		sb.insert(0,true);
		System.out.println(sb);
		System.out.println(sb.delete(0,4));
		System.out.println(sb.deleteCharAt(6));
//		System.out.println(sb.reverse());
		sb.setLength(6);
		System.out.println(sb);
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb);
//		javap java.lang.StringBuffer;
	}
}
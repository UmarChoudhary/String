package com.practiceSet;

public class MaskTest2 {
	public static String mask(String CreditCard)
	{
		String X="XXXX-XXXX-XXXX-";
		StringBuilder sb=new StringBuilder(X);
		sb.append(CreditCard,15,19);
		return sb.toString();
	}
	public static void main(String [] args)
	{
		System.out.println(mask("1234-5678-9101-5985"));
	}
}
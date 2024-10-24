package com.practiceSet;

public class MaskTest {
	
	public static String mask(String CreditCard)
	{
		String X="XXXX-XXXX-XXXX-";
		StringBuilder sb=new StringBuilder(CreditCard);
		sb.substring(15,19);
		return X+CreditCard.substring(15,19);
	}
	public static void main(String[] args)
	{
			System.out.println(mask("1234-5678-9101-5757"));
	}
	
	}

/**
StringBuilder sb=new StringBuilder(CreditCard);
sb.substring(15,19);
return x+sb;

*/
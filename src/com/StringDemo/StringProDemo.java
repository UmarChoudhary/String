package com.StringDemo;

import java.util.Scanner;

public class StringProDemo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your city name");
		String name=sc.nextLine().trim();
		if (name.equalsIgnoreCase("Hyderabad"))
		{
			System.out.println("Aadab");
		}
		else if (name.equalsIgnoreCase("chennai"))
		{
			System.out.println("vanakkam");
		}
		else if (name.equalsIgnoreCase("Banglore"))
		{
			System.out.println("Namaskar");
		}
		else
		{
			System.out.println("Enter valid city name");
		}
	}
}
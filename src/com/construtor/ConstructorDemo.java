package com.construtor;

final class ImmutableDemo
	{
		private int i;
		
		ImmutableDemo(int i)
		{
			this.i=i;
		}
		public ImmutableDemo modify(int i)
		{
			if (this.i==i)
			{
				return this;
			}
			else
			{
				return new ImmutableDemo(i);
			}
		}
		public static void main(String[] args)
		{
			ImmutableDemo c1=new ImmutableDemo(10);
			ImmutableDemo c2= new ImmutableDemo(100);
			ImmutableDemo c3=new ImmutableDemo(100);
			
			System.out.println(c2==c3);
			System.out.println(c1==c2);
		}
	}
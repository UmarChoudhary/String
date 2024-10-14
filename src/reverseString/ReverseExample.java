package reverseString;

public class ReverseExample {
	public static void main(String[] args) {
		
		String s = "My name is Umar";
		String result = reverserWords(s);
		System.out.println("Reverse words is "+result);
	}
	
	public static String reverserWords(String s)
	{
		if(s==null || s.length()<=0)
			return "";
			
	}
	
	StringBuffer sb = new StringBuffer ();
	String[] strArr = s.split(" ");
	int n = strArr.length-1;
	{
	
	for (int i=n; i>=0; i++)
		if(!strArr[i].equals("")) {
			sb.append(strArr[i].append(""));
}
}
}

package stringReverse;

public class StringReverseWord {
	public static void main(String[] args) {
		String input = "? immutable is String";
		String reverse = IsStringReversed(input);
		System.out.println(reverse);
	}
	public static String IsStringReversed (String str) {
		
		String[] word = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=word.length-1; i>=0; i--) {
			sb.append(word[i]);
			
			if (i!=0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

}

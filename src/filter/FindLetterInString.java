package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindLetterInString {
	  public static void main(String[] args) {
	        // List of string objects
	    List<String> words = Arrays.asList("umar", "choudhary", "grape", "orange", "kiwi");

	      // Define the letter to search for
	      String letter = "umar";

	      // Use stream to filter strings that contain the specific letter
	      List<String> filteredWords = words.stream()
	           .filter(word -> word.contains(letter)) //Filter strings that contain the letter "a"
	            .collect(Collectors.toList()); // Collect the result into a list
	            
	        filteredWords.forEach(System.out::println);
	    }}

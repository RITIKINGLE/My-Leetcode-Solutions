/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
*/

import java.util.Arrays;
public class valid_String{
	public static void main(String args[]){
		String s = "anagRam", t = "nagaram";
		if(s.length() != t.length()){
			System.out.println(false);
		}
		
		char[] charArray =s.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		String sortedS = new String(charArray);	
		
		char[] charArray2 = t.toCharArray();
		Arrays.sort(charArray2);
		String sortedT = new String(charArray2);
		

		boolean result = sortedS.equalsIgnoreCase(sortedT);
		System.out.println(result);
	}
}
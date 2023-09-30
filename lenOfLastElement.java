/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
*/
//---------------------------------------------------------------------
public class lenOfLastElement
{
	public static void main(String[] args) {
		
		 String s = "uffy is still joyboy ";
		 String s1[] = s.split(" ");
		 int count=0; 
		 int len = s1[s1.length-1].length();
		        
		 System.out.print(len);       
	}
}
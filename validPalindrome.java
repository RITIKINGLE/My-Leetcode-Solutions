/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
------------------------------------------
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
------------------------------------------
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters. Since an empty string reads the same forward and backward, it is a palindrome. 
*/


public class validPalindrome
{
	public static void main(String[] args) {
         String  s = "@A man, a plan, a canal: Panama";
        // String s  = "0P";
        StringBuilder sb = new StringBuilder(); 
        
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        if(sb.toString().isEmpty()){
            System.out.println(true);
        }
        else{
            if(sb.toString().equalsIgnoreCase(sb.reverse().toString())){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
	}
}
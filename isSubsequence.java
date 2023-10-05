/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*/
//-----------------------------------------------------------
public class isSubsequence
{
	public static void main(String[] args) {
        
        //  String s = "abc", t= "ahbgdc";
        //   String s = "acb", t = "ahbgdc";
        String s = "aaaaaa", t="bbaaaa";
        int count=0;
        int start =0;
        int n= 0;
    
        for(int i=0; i<s.length(); i++){
           n = start;
           while(n!=t.length()){
                if(s.charAt(i) == t.charAt(n)){
                   count++;
                   start = n+1;
                   break;
                }  
                n++;
           }
        }
        
        if(count == s.length())
            System.out.println(true);
        else
            System.out.println(false);
            
	}
}
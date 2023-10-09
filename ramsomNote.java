/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Input: ransomNote = "a", magazine = "b"
Output: false
*/

public class ransomNote
{
	public static void main(String[] args) {
        
        //  String ransomNote = "aa", magazine = "aab";
        //  String ransomNote = "aab", magazine = "baa";
          String ransomNote = "bg", magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
         
        StringBuilder sb = new StringBuilder(magazine);
        int count=0;
    
        for(int i=0; i<ransomNote.length(); i++){
            for(int j=0; j<sb.length(); j++){
                if(ransomNote.charAt(i) == sb.charAt(j)){
                    count++;
                    sb.deleteCharAt(j);
                    break;
                }
            }
        }
      
        if(count == ransomNote.length())
            System.out.println(true);
        else    
            System.out.println(false);
    
            
	}
}
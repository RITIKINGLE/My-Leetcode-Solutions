/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
*/


public class longestPrefix
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String strs[] = {"flower", "flown", "flight"};
	     StringBuilder longstring =new StringBuilder();
		StringBuilder sb = new StringBuilder();
		int temp=0;
			if(strs.length > 1){    		   
    		 for(int i=0; i<strs[0].length(); i++){
    	       
        	       sb=new StringBuilder();
        	       for(int j=0; j<=i; j++){
        	            sb.append(String.valueOf(strs[0].charAt(j)));
        	       }
        	       int count =0;
        	       for(int j=1; j<strs.length; j++){
        	            if(strs[j].startsWith(sb.toString())){
        	                count++;
        	            }
        	       }
        	       if(count == strs.length-1 && sb.length() > longstring.length()){
        	           //System.out.print(sb+" ");
        	            longstring=new StringBuilder();
        	            longstring.append(sb);
        	       }
        	  } 
		}	  
		else{
		    System.out.println(strs[0]);
		}
		
		System.out.println(longstring.toString());
    	
	}
}
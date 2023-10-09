import java.util.HashMap;

class Solution{
   boolean isIsomorphic(String s, String t){
         HashMap<Character, Character> mp = new HashMap<>();
	    if(s.length() != t.length()){
	        return false;
	    }
	    
	    for(int i=0; i<s.length(); i++){
	          if(mp.containsKey(s.charAt(i))){
	                if(!mp.get(s.charAt(i)).equals(t.charAt(i)))
	                    return false;	
                   }                        
              	  else{
           	         if(mp.containsValue(t.charAt(i))){
                	        return false;
                    }
                     mp.put(s.charAt(i), t.charAt(i));
                  }
	           
	         
	  	  } 
				 return true;
    }
}

public class isomorphic{
	public static void main(String args[]){
		String s = "foo", t = "bar";
		Solution s1 = new Solution();
		System.out.println(s1.isIsomorphic(s,t));
	}
}
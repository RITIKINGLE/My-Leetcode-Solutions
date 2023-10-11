import java.util.HashMap;
class solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hp = new HashMap<Character,String>();
        String s1[] = s.split(" ");

        if(pattern.length() != s1.length){
            return false;
        }

        for(int i=0; i<pattern.length(); i++){
            if(hp.containsKey(pattern.charAt(i))){
                if(!hp.get(pattern.charAt(i)).equals(s1[i])){
                    return false;
                }
                
            }
            else{
                if(hp.containsValue(s1[i]))
                    return false;

                hp.put(pattern.charAt(i), s1[i]);    
            }
        }
            return true;
        
    }
}

public class solution{
	public static void main(String args[]){
		String pattern = "abba", s = "dog cat cat dog";
		solution d1 = new solution();
		System.out.println(d1.wordPattern(pattern, s));
	}
}
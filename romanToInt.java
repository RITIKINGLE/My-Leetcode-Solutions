/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
*/

import java.util.Map;
import java.util.HashMap;
public class romanToInt{
	public static void main(String args[]){
		String s = "IV";
	
		Map<Character,Integer> symbol = new HashMap<>();
		symbol.put('I', 1);
		symbol.put('V', 5);
		symbol.put('X', 10);
		symbol.put('L', 50);
		symbol.put('C', 100);
		symbol.put('D', 500);
		symbol.put('M', 1000);
	
		int sum=symbol.get(s.charAt(s.length()-1));
		
		for(int i=s.length()-2; i>=0; i--){
	        	if(symbol.get(s.charAt(i)) < symbol.get(s.charAt(i+1))){
                		sum-= symbol.get(s.charAt(i));
	        }
            		else{
                		sum+=symbol.get(s.charAt(i));
            		}
		}
		System.out.print(sum);
	}
}
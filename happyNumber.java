/*
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
*/
import java.util.HashSet;
public class happyNumber{
	public static void main(String args[]){
		HashSet<Integer> myset = new HashSet<>();
		int n=19;
		int temp=0,sum=0;
		
		while(true){
			sum=0;
			while(n!=0){
				temp = n%10;
				sum += temp * temp;
				n/=10;
			}
			if(myset.contains(sum)){
				System.out.println(false);
				break;
			}
			else if(sum == 1){
				System.out.println(true);
				break;
			}	
			
			myset.add(sum);
			n = sum;
		}
		
		
	}
}
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Input: {7,1,5,3,6,4};
Output: 5;
*/


public class majority_element
{
	public static void main(String[] args) {
		int prices[] ={7,1,5,3,6,4}; 
		 int maxp=0;
        int p=0;
        int temp = prices[0];
        for(int i=0; i<prices.length; i++){
            if(prices[i]<temp){
                temp = prices[i];
            }
            maxp = prices[i] -temp;
            if(maxp > p)
                p = maxp;
        }
	  
      		System.out.println(p);
	}
}
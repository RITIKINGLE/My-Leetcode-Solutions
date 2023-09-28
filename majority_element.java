/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than [n/2] times. You may assume that the majority element always exists in the array.

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/


public class majority_element
{
	public static void main(String[] args) {
		int nums[] ={2,2,1,1,1,2,2}; 
		int k=0;
		int maj =0;
	   	int n= nums.length/2;
		for(int i=0; i<nums.length; i++){
	       		k=0;
	       		for(int j=i; j<nums.length; j++){
	       		   if(nums[i] == nums[j])
	         	  	 k++;
	      		 }
	      		 if(k > n)
	      		      maj = nums[i];
		}
	  
      		System.out.println(maj);
	}
}
/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k.
*/

public class remove_duplicates
{
	public static void main(String[] args) {
	
	    int nums[] ={0,0,1,1,1,2,2,3,3,4};
	    int pre = nums[0];
	    int k=1;
	    for(int i=1; i<nums.length; i++){
		 if(nums[i] != pre){
	            nums[k++] = nums[i];
	            pre = nums[i];
	            
	        }   
	    }
	    System.out.print(k);
	}
}
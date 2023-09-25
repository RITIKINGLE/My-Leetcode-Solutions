/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
*/

public class remove_element
{
	public static void main(String[] args) {
	
	    int nums[] ={0,1,2,2,3,0,4,2};
	    int val = 3;
	    int k =0;
	        
	    for(int i=0; i<nums.length; i++){
	        if(nums[i] != val){
	                nums[k++] = nums[i];
	        }
	    }
	   for(int i=0; i<k; i++)
	            System.out.print(nums[i]+" ");
	}
}
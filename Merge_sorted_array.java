/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.
*/
//output = {1, 2, 2, 3, 5, 6};

public class Merge_sorted_array{
	public static void main(String args[]){
	int nums1[] = {1,2,3,0,0,0};
	int nums2[] = {2,5,6};	
	int count=0, temp=0;
        for(int i=0; i<nums2.length; i++){
            nums1[(nums1.length - nums2.length )+ count++] = nums2[i];
        }
        for(int i=0;i<nums1.length; i++){
            for(int j=0; j<nums1.length-1; j++){
                if(nums1[j] > nums1[j+1]){
                    temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
	for(int i=0; i<nums1.length; i++){
		System.out.print(nums1[i]+" ");	
	}		

	}
}
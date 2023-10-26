import java.util.Map;
import java.util.HashMap;
public class containDuplicate2{
	public static void main(String args[]){
		int nums[] = {1,0,1,1};
		int k=1;
		
		Map<Integer, Integer>maps = new HashMap<>();
		for(int i=nums.length-1; i>=0; i--){	
			if(!maps.containsKey(nums[i])){
					maps.put(nums[i], i);
			}
			else{
				int preIndex = maps.get(nums[i]);
				if(Math.abs(preIndex - i) <= k){
					System.out.println(true);
					break;
				}
				else
					maps.put(nums[i], i);
			}
			
		}
		System.out.println(false);
	}
}
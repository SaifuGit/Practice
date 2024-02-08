package questions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
	
	public static void  doTwosum(List<Integer> nums,int target,List<Integer> res) {
		
	    //Stream.of(2, 6, 12, 16).forEach(element -> System.out.println(element));

	   // Stream.of(nums).forEach(element -> System.out.println(element));
//	     nums.stream().forEach(x-> 
//	   {
//		   if(nums.contains(target-x)) {
//			   System.out.println(nums.indexOf(x)+":"+nums.indexOf(target-x));
//			  
//		   }
//	   }
//
//	   );
	     nums.stream().anyMatch(element -> {
	    	 if(nums.contains(target-element)) {
				   System.out.println(nums.indexOf(element)+":"+nums.indexOf(target-element));

//				  res.add(nums.indexOf(element));
//				  res.add(nums.indexOf(target-element));
				  System.out.println(res);
				  return true;
				  
			   }
	           
	            return false; // Your condition here
	        });
	   

	}

	 public int[] twoSum(int[] nums, int target) {
	       List<Integer> list= Arrays.stream(nums)
	                .boxed()
	                .collect(Collectors.toList());
	        int[] res=new int[2];
	        for(int i=0;i<list.size();i++){
	            if(list.contains(target-list.get(i))){
	                res[0]=i;
	                res[1]=list.indexOf(target-list.get(i));
	                break;
	            }
	            
	        }
	        return res;
	         
	    }
	
	public static void main(String[] args) {
		Integer[] arr= {2,3,4,5,6,7};
		doTwosum(Arrays.asList(arr),9,List.of());
		
	}

}


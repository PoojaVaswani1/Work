package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Frequency1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,2,6,1,1,4};
		int result =getSingleElement(arr);
		System.out.println(result);

	}
	
	    public static int getSingleElement(int []arr){
	        // Write your code here.
	        HashMap<Integer,Integer> map = new HashMap<>();
	        int n=arr.length;
	       for(int i=0;i<n;i++){
	       int value=  map.getOrDefault(arr[i], 0);
	       map.put(arr[i],value+1);  
	       } 
	       for (Map.Entry<Integer, Integer> it :map.entrySet()) {
	            if (it.getValue() == 1) {
	                return it.getKey();
	            }
	        }
	        return -1;
	    }
	}



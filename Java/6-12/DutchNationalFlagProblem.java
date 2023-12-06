package Arrays;

import java.util.ArrayList;

public class DutchNationalFlagProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static void sortArray(ArrayList<Integer> arr, int n) {
	        // Write your code here.
	        for(int i=0;i<n;i++){
	            for(int j=i+1;j<n;j++){
	                if(arr.get(i)-arr.get(j)>0){
	                    int temp = arr.get(j);
	                   int temp1 = arr.get(i);
	                    arr.get(i) = temp;
	                }
	            }
	        }
	    }

}

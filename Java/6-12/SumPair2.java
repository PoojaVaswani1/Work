package Arrays;

public class SumPair2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] book = {1,2,3,4};
		int n=3;
		int target = 8;
		System.out.println(read(n, book, target));

	}
	
	    static String result =  "YES";
	   static String result1 =  "NO";
	        public static String read(int n, int []book, int target){
	        // Write your code here.
	        for(int i=0;i<n;i++){
	            for(int j=1;j<n;j++){
	            	if(book[i]+book[j]==target){
	                    return result;
	                }
	            }
	        }
	        return result1;
	        
	    }
	}



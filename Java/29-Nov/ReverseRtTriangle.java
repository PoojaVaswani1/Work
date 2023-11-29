package Pattern;

public class ReverseRtTriangle {

	public static void main(String[] args) {
        nForest(4);
    }
   
        // Write your code here
	   public static void nForest(int n) {
	        // Write your code here
	        for(int i=0;i<n;i++){
		    for(int j=0;j<n-i-1;j++){
		         System.out.print(" ");
	             

		}
		    for(int j =n-i-1;j<n;j++){
		         System.out.print("*");
		    }
		    System.out.println();
		}
	    }


}

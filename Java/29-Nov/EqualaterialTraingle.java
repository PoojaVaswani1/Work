package Pattern;

public class EqualaterialTraingle {

	public static void main(String[] args) {
        nForest(4);
    }
   
        // Write your code here
	   public static void nForest(int N) {
		   for (int i = 0; i < N; i++)
		    {
		        // For printing the spaces before stars in each row
		        for (int j =0; j<N-i-1; j++)
		        {
		            System.out.print(" ");
		        }
	        // Write your code here
		   for(int j=0;j< 2*i+1;j++){
	            
	            System.out.print("*");
	        }
	        
	        // For printing the spaces after the stars in each row
	         for (int j =0; j<N-i-1; j++)
	        {
	            System.out.print(" ");
	        }
	       
		    System.out.println();
		    
		}
	    }


}

package Pattern;

public class BinaryTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nBinaryTriangle(4);
	}
	 public static void nBinaryTriangle(int n) {
	        // Write your code here.
		 int start=1;
	        for(int i=1;i<=n;i++){
	        	if(i%2==0){
                  start=0; 
               }else{
                   start=1;
               }
	            for(int j=1;j<=i;j++){
	                System.out.print(start);
	                start= 1-start;
	                
	            }System.out.println();
	        }
	    }

}

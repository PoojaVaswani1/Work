package Arrays;

import java.util.Scanner;

public class ZerosatRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size");
		int n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("enter no.s in array ");
		for(int i =0 ; i<n ; i++) {
			array[i] = scan.nextInt();
		}
		
		int count = 0;  // Count of non-zero elements 
		  
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
            	array[count++] = array[i]; // here count is 
            }  
        }// incremented 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n) 
        	array[count++] = 0; 
        
     
		for(int l=0 ; l<n ; l++) {
			System.out.println(array[l]);
		}
		}
	}



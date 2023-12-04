package Recurssion;

class Recursion {
    
   public  static int Fibonacci(int N){
        
            // Base Condition.
            if(N <= 1){
                
                return N;
            }
            
            // Problem broken down into 2 functional calls
            // and their results combined and returned.
            int last = Fibonacci(N-1);
            int slast = Fibonacci(N-2);
            
            return last + slast;
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of N to be 4.
       int N = 4;
       System.out.println(Fibonacci(N));
    }
}
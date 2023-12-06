package Arrays;

class Solution{
    
    static int search(int arr[], int N, int X)
    {int i=0;
       for( i=0;i<N;i++ ) {
           if(arr[i]==X){
               return i;
           }
       }
        return i;
        
    }
    
}
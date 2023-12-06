package Arrays;

public class SubarrayOfSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,1,1,1};
		int k=3;
		System.out.println(longestSubarrayWithSumK(a,k));
	}
	public static int longestSubarrayWithSumK(int []a, long k) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(k==a[i])
				count++;
			for(int j=i+1;j<a.length;j++) {
                if(j<a.length-1){
				if((a[i] + a[j])== k||(a[i]+a[j]+a[j+1]) == k)
					count++;
                }
				
			}
		}
		return count;
    }

}

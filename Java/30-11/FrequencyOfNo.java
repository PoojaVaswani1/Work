package Hashing;

public class FrequencyOfNo {

	 public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 6, 3, 2};
	        int n = 6;
	        int x = 9;

	        int[] result = countFrequency(n, x, nums);

	        // Print the frequencies
	        for (int i = 0; i < result.length; i++) {
	            System.out.println("Frequency of " + (i + 1) + ": " + result[i]);
	        }
	    }

	    public static int[] countFrequency(int n, int x, int[] nums) {
	        int[] res = new int[n];

	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] - 1 < n)
	                res[nums[i] - 1]++;
	        }

	        return res;
	    }
}
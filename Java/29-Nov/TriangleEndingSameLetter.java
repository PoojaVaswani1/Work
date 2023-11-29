package Pattern;

public class TriangleEndingSameLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern18(4);
	}
		static void pattern18(int N)
		{
			 for (int i = 0; i < N; i++) {
		            char currentChar = (char) ('A' + N - 1);
		            for (int j = 0; j <= i; j++) {
		                System.out.print(currentChar);
		                currentChar--;  // Decrement the character value
		            }
		            System.out.println();
		        }

	}
}



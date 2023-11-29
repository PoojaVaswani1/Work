package Pattern;

public class ReverseABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n ;i>=0;i--) {
			for(char ch='A';ch<'A'+i;ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}

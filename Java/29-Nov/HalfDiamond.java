package Pattern;

public class HalfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hDiamond(5);

	}
	public static void hDiamond(int N) {
		for(int i=0;i<N;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=N;i>0;i--) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}

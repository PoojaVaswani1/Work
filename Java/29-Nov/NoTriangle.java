package Pattern;

public class NoTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		noTri(5);

	}
	public static void noTri(int N) {
		int count=1;
		for(int i=0;i<N;i++) {
			for(int j =0;j<i+1;j++) {
				System.out.print(count++);
				System.out.print(" ");
				
			}
			System.out.println();
			
		}

}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int D=new Scanner(System.in).nextInt();
		int sum=0;
		for (int i=0;i<=D;i++) {
			sum+=(isArithmeticSequence(i))?1:0;
		}
		System.out.println(sum);
	}

	private static boolean isArithmeticSequence(int d) {
		// TODO Auto-generated method stub
		int[] ar=getDigits(d);
		return isArithmeticSequence(ar);
	}

	private static boolean isArithmeticSequence(int[] ar) {
		// TODO Auto-generated method stub
		
		return false;
	}

	private static int[] getDigits(int d) {
		// TODO Auto-generated method stub
		int[] ar=new int[4];
		
		return ar;
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Integer> timeTable=new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		buildTimeTable();
		int D=new Scanner(System.in).nextInt();
		int sum=0;
		
		int n=D/(12*60);
		int m=D%(12*60);
		
		System.out.print(n*count(12*60-1)+count(m));

	}

	private static void buildTimeTable() {
		// TODO Auto-generated method stub
		int[] ar=new int[4];
		for (int i=0;i<12;i++) {
			if (i==0) {
				ar[0]=1;
				ar[1]=2;
				ar[2]=3;
				ar[3]=4;
				timeTable.add(changeToMinutes(ar));
			}
			else if (i<10){
				ar[0]=i/10;
				ar[1]=i%10;
				
				for (int dif=-9;dif<10;dif++) {
					ar[2]=ar[1]+dif;
					ar[3]=ar[2]+dif;
					if (ar[2]>=0 && ar[3]>=0 && ar[2]<6 && ar[3]<10) // ar[2] must be less than 6, since cannot exceed 59 minutes
					{
						timeTable.add(changeToMinutes(ar));
					}
				}
			} else if (i==11) {
				int[] ar1= {1,1,1,1};
			
				timeTable.add(changeToMinutes(ar1));
			}
		}
	}

	private static Integer changeToMinutes(int[] ar) {
		// TODO Auto-generated method stub
		int h=ar[0]*10+ar[1];
		int m=ar[2]*10+ar[3];
		if (h==12) 
			h=0;
		return h*60+m;
	}

	private static int count(int d) {
		
		// TODO Auto-generated method stub
		for (int i=0;i<timeTable.size();i++) {
			if (d<timeTable.get(i)) {
				return i;
			}
		}
		return timeTable.size();
		
	}

}

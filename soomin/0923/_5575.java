package baek;

import java.util.Scanner;

public class _5575 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 for(int i = 0; i < 3; i++) {
			 int shr = sc.nextInt(), smin = sc.nextInt(), ssec = sc.nextInt();
			 int ehr = sc.nextInt(), emin = sc.nextInt(), esec = sc.nextInt();
	
			 int start = (shr * 3600) + (smin*60) + ssec;
	         int end = (ehr * 3600) + (emin * 60) + esec;
	         
	         int worktime = end - start;
	         
	         int h = worktime / 3600;
	         int m = (worktime % 3600) / 60;
	         int s = (worktime % 3600) % 60;
	         
	         System.out.println(h + " " + m + " " + s);
	         
	         
		 }
		 sc.close();
	}
	
}


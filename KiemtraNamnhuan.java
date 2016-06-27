package buoi2;

import java.util.Scanner;

public class KiemtraNamnhuan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean check;
		System.out.println("Nhap nam:");
		int n = input.nextInt();
		
		if((n%4 ==0 && n%100!= 0) || n%400==0) {
			check = true ;
		} else
			check = false;
		System.out.println(check);
	}
	
}

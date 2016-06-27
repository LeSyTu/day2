package buoi2;

import java.util.Scanner;

public class ChuyendoFSangdoC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a, b;
		System.out.println("Nhap do F:");
		a = input.nextFloat();
		
		b = (float)((a-32)/1.8);
		
		System.out.println("Ket qua chuyen tu do F sang do C:"+ b);

	}

}

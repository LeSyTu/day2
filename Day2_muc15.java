package buoi2;

import java.util.Scanner;

public class Day2_muc15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vui long  nhap thong tin");
		System.out.println("=============================");
		System.out.println("Nhap ten:");
		String ten = input.nextLine();
		System.out.println("Nhap chieu cao:");
		float x = input.nextFloat();
		System.out.println("Nhap can nang:");
		float y =  input.nextFloat();
		
		float bmi =    (float) (y/(x*x));
		
		if(bmi<18.5) {
			System.out.println("Thieu can");
		} else if(18.5 <= bmi && bmi < 25) {
			System.out.println("Ly tuong");
			
		} else if(25<= bmi && bmi <= 30) {
			System.out.println("Thua can");
		} else if(bmi > 30) {
			System.out.println("Beo phi");
		}
			
		

	}

}

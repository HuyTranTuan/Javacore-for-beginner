package buoi01;

import java.util.Scanner;

public class Input3int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Input num1: "); int num1 = reader.nextInt();
		System.out.println("Input num2: "); int num2 = reader.nextInt();
		System.out.println("Input num3: "); int num3 = reader.nextInt();
		
		//check descending
		if(num1 > num2 & num2 > num3) {
			System.out.println("Descending");
		}
		//check ascending
		if(num1 < num2 & num2 < num3) {
			System.out.println("Ascending");
		}
	}

}

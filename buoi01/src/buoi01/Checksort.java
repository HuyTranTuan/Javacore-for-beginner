package buoi01;

import java.util.Scanner;

public class Checksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int num1 = reader.nextInt();
		int[] arr = new int[num1];
		printNumarr(arr);
		check(arr);
		checkd(arr);
		
	}
	public static void  printNumarr(int[] arr) {
		for (int i = 0; i < arr.length -1 ; i++) {
			System.out.println("Print num" + (i+1) + ": " + arr[i]);
		}
	}	
	
	public static boolean  check(int[] arr) {
		boolean isAscending = true;
		for (int i = 0; i < arr.length -1 ; i++) {
			if (arr[1]>arr[i+1]) {
				isAscending = false;
				break;
			}
		}
		return isAscending;
	}
	public static boolean  checkd(int[] arr) {
		boolean isDescending = true;
		for (int i = 0; i < arr.length -1 ; i++) {
			if (arr[1]<arr[i+1]) {
				isDescending = false;
				break;
			}
		}
		return isDescending;
	}
}

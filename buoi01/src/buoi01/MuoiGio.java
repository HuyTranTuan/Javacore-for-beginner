package buoi01;

import java.util.Scanner;

public class MuoiGio {
	public static void main(String[] args) {
		System.out.println("Mili second: " + System.currentTimeMillis());
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your timezone: ");
		int gmt = reader.nextInt();
		
		long mil = System.currentTimeMillis()%1000;
		long second = (System.currentTimeMillis() /1000) %60;
		long minute = (System.currentTimeMillis() /(1000*60)) %60;
		long hour = (System.currentTimeMillis() /(1000*60*60)) %24;
		long newHour= hour + gmt;
		System.out.println("Current time: " + newHour + ":" + minute + ":" + ":" + second);
	}
}

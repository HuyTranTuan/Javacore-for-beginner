package buoi01_nopbai;
import java.util.Scanner;
public class UocSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input n: ");int n = scanner.nextInt();
		if(n <= 0) {
			System.out.println("Input n: ");
		}
		for(int i = 1; i <= n; i++ ) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
	}

}

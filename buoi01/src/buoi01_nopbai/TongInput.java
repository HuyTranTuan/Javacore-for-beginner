package buoi01_nopbai;
import java.util.Scanner;
public class TongInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a num: ");
		int n = scanner.nextInt();
		SumEverySingleObject(n);
	}
	public static void SumEverySingleObject(int n) {
		int a;
		int sum = 0;
		while (n > 0) {
			if (n <= 9) {
				sum += n;
				break;
			}else {
				a = n % 10;
				n = n / 10;
				sum += a;
			}
		}
		System.out.println(sum);
	}
}

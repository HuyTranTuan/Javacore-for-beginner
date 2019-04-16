package buoi01_nopbai;
import java.util.Scanner;
import java.util.Scanner;

public class KiemtraGiong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a: ");int a = scanner.nextInt();
		System.out.print("Input b: ");int b = scanner.nextInt();
		int c,d,e,f;
		if(a<10 & b<10 & a>99 & b>99) {
			System.out.print("Input a: ");
			System.out.print("Input b: ");
		}else {
			c = a/10;
			d = a%10;
			e = b/10;
			f = b%10;
			if(c == e || c == f || d == e || d == f) {
				System.out.println("True");
			}else {
				System.out.println("Flase");
			}
		}
	}

}

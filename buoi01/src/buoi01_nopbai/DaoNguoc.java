package buoi01_nopbai;
import java.util.Scanner;
public class DaoNguoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a string: ");String a = scanner.nextLine();
		String b = new StringBuffer(a).reverse().toString();
		System.out.print("Reverse: " + b);
	}

}

package buoi01;
import java.util.Scanner;
public class InputAndCheckAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputArray();
	}
	public static void inputArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int j = 0; j < arr.length - 1; j++) {
            if(arr[9] == arr[j]) {
            	System.out.println(arr[j]);
            }
        }
	}

}

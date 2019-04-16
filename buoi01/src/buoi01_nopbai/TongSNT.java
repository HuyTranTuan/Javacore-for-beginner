package buoi01_nopbai;
import java.util.Scanner; 
public abstract class TongSNT {


	public static void lietKe(int n){
		 System.out.print(" 2"); 
		 int summarize = 2;
		 for(int i=3;i<n;i+=2){
			 if(isPrimeNumber(i))System.out.println(" "+i);
			 summarize +=i;
		 }
		 System.out.println(summarize);
	}
	public static int nhap(){
		Scanner input= new Scanner(System.in); 
		boolean check= false;
		int n=0; 
		while(!check){
			System.out.print(" "); 
			try{
				n= input.nextInt(); 
				check= true;
			}catch(Exception e){
			System.out.println("Ban phai nhap so! hay nhap lai..."); 
			input.nextLine();
			}
		}
		return (n);
	}
	public static void main(String[] args) { 
		System.out.print("Nhap n");
		int n= nhap();
		System.out.println("Cac so nguyen to nho hon "+n+ " "); 
		lietKe(n);
	}
	public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

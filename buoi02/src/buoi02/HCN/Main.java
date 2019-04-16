package buoi02.HCN;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		HCN hcn1 = new HCN(30,20);
		System.out.println("chieudai: "+ hcn1.get_ChieuDai());
		System.out.println("chieurong: "+ hcn1.get_ChieuRong());
		
		HCN hcn2 = new HCN(30);
		System.out.println("chieudai: "+ hcn2.get_ChieuDai());
		System.out.println("chieurong: "+ hcn2.get_ChieuRong());
		
		HCN hcn3 = new HCN();
		System.out.println("chieudai: "+ hcn3.get_ChieuDai());
		System.out.println("chieurong: "+ hcn3.get_ChieuRong());
		
		System.out.println("chieudai: "+ hcn1.DienTIch());
		System.out.println("chieurong: "+ hcn1.Chuvi());
	}

}

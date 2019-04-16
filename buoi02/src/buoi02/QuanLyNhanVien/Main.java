package buoi02.QuanLyNhanVien;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVienThuong("nguyenvana","123456","001","Nguyen Van A","0983599954",22,3f);
		NhanVien nv2 = new TruongPhong("tranvanb","abc456","002","Tran Van B","1245284563",20,3f,1000000);
		NhanVien nv3 = new Sep("huynhvanc","123xyz","003","Huynh Van C","1542387651",22,3f,1000000,100000);
		
		CongTy congty = new CongTy();
		congty.ThemNV(nv1);
		congty.ThemNV(nv2);
		congty.ThemNV(nv3);
		DangNhap(congty);
	}
	public static void DangNhap(CongTy congty) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("username: "); String username = scanner.nextLine();
		System.out.print("password: "); String password = scanner.nextLine();
		boolean daDangNhap = false;
		for(NhanVien nv : congty._DSNV) {
			if(nv.get_UserName().equals(username) && nv.get_PassWord().equals(password)) {
				daDangNhap = true;
				break;
			}
		}
		if(daDangNhap) {
			System.out.println("Dang nhap thanh cong");
		}else {
			System.out.println("Sai username hoac password");
			DangNhap(congty);
		}
	}

}

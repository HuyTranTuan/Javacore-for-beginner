package buoi02.Sinhvien;
import java.util.ArrayList;

public class LopHoc {
	public ArrayList<SinhVien> LopHoc = new ArrayList<SinhVien>();
	
	public void ThemSV(SinhVien sinhvien) {
		LopHoc.add(sinhvien);
	}
	public void InLopHoc() {
		for(SinhVien sinhvien : LopHoc) {
			System.out.println(sinhvien.ChuyenThanhString());
		}
		
		
	}
	
}

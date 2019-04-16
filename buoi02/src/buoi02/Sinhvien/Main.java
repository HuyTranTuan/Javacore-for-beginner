package buoi02.Sinhvien;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LopHoc Lophoc = new LopHoc();
		SinhVien Sv1 = new SinhVien("001","Gates",8f,9f,6f);
		SinhVien Sv2 = new SinhVien("002","Gatys",6f,9f,3f);
		SinhVien Sv3 = new SinhVien("003","Gatos",1f,5f,8f);
		
		Lophoc.ThemSV(Sv1);
		Lophoc.ThemSV(Sv2);
		Lophoc.ThemSV(Sv3);
		
		Lophoc.InLopHoc();
	}

}

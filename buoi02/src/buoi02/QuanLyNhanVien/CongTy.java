package buoi02.QuanLyNhanVien;
import java.util.ArrayList;

import buoi02.Sinhvien.SinhVien;
public class CongTy {
	ArrayList<NhanVien> _DSNV = new ArrayList<NhanVien>();
	
	//Them NV
	public void ThemNV(NhanVien nhanvien) {
		_DSNV.add(nhanvien);
	}
	
	//Tim vi tri nhan vien theo ma
	public int TimViTriTheoMa(String manhanvien) {
		for(int i = 0; i < _DSNV.size() ; i++) {
			if(_DSNV.get(i).get_MaSo().equals(manhanvien)) {
				return i;
			}
		}
		return -1;
	}
	
	//Tim nhan vien theo ma
	public NhanVien TimNhanVienTheoMa(String manhanvien) {
		int index = TimViTriTheoMa(manhanvien);
		return _DSNV.get(index);
	}
	
	//Sua nhan vien
	public void SuaNhanVien(NhanVien nhanvien) {
		int index = TimViTriTheoMa(nhanvien.get_MaSo());
		_DSNV.set(index, nhanvien);
	}
	
	//Xoa nhan vien
	public void XoaNhanVien(String manhanvien) {
		int index = TimViTriTheoMa(manhanvien);
		_DSNV.remove(index);
	}
	
	public void InDS() {
		for(NhanVien nhanvien : _DSNV) {
			System.out.println(nhanvien.ChuyenThanhString());
		}
		
		
	}
}

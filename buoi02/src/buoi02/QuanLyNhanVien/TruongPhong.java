package buoi02.QuanLyNhanVien;

public class TruongPhong extends NhanVien{
	private float _PhuCap;
	public TruongPhong(String _UserName,String _PassWord,String _MaSo, String _HoTen, String _SoDT, int _SoNgayLam, float _HeSoLuong, float _PhuCap) {
		super(_UserName,_PassWord,_MaSo, _HoTen, _SoDT, _SoNgayLam, _HeSoLuong, "TruongPhong");
		// TODO Auto-generated constructor stub
		this._PhuCap = _PhuCap;
	}
	public float TinhLuong() {
		return super.TinhLuong() + _PhuCap ;
	}
}

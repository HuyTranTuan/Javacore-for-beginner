package buoi02.QuanLyNhanVien;

public class Sep extends NhanVien{
	private float _PhuCap,_Thuong;

	public Sep(String _UserName,String _PassWord,String _MaSo, String _HoTen, String _SoDT, int _SoNgayLam, float _HeSoLuong, float _PhuCap, float _Thuong) {
		super(_UserName,_PassWord,_MaSo, _HoTen, _SoDT, _SoNgayLam, _HeSoLuong, "Sep");
		// TODO Auto-generated constructor stub
		this._PhuCap = _PhuCap;
		this._Thuong = _Thuong;
	}
	public float TinhLuong() {
		return super.TinhLuong() + _PhuCap + _Thuong;
	}	
}

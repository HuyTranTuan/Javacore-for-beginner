package buoi02.QuanLyNhanVien;

public class NhanVien {
	private String _MaSo, _HoTen, _SoDT,_ChucVu, _UserName, _PassWord;
	private int _SoNgayLam;
	private float _HeSoLuong;
	
	public NhanVien(String _UserName,String _PassWord, String _MaSo,String _HoTen,String _SoDT,int _SoNgayLam,float _HeSoLuong, String _ChucVu) {
		super();
		this._MaSo = _MaSo;
		this._HoTen = _HoTen;
		this._SoDT = _SoDT;
		this._SoNgayLam = _SoNgayLam;
		this._HeSoLuong = _HeSoLuong;
		this._ChucVu = _ChucVu;
		this._UserName = _UserName;
		this._PassWord = _PassWord;
	}

	public String get_UserName() {
		return _UserName;
	}

	public void set_UserName(String _UserName) {
		this._UserName = _UserName;
	}

	public String get_PassWord() {
		return _PassWord;
	}

	public void set_PassWord(String _PassWord) {
		this._PassWord = _PassWord;
	}

	public String get_ChucVu() {
		return _ChucVu;
	}

	public void set_ChucVu(String _ChucVu) {
		this._ChucVu = _ChucVu;
	}

	public String get_MaSo() {
		return _MaSo;
	}

	public void set_MaSo(String _MaSo) {
		this._MaSo = _MaSo;
	}

	public String get_HoTen() {
		return _HoTen;
	}

	public void set_HoTen(String _HoTen) {
		this._HoTen = _HoTen;
	}

	public String get_SoDT() {
		return _SoDT;
	}

	public void set_SoDT(String _SoDT) {
		this._SoDT = _SoDT;
	}

	public int get_SoNgayLam() {
		return _SoNgayLam;
	}

	public void set_SoNgayLam(int _SoNgayLam) {
		this._SoNgayLam = _SoNgayLam;
	}

	public float get_HeSoLuong() {
		return _HeSoLuong;
	}

	public void set_HeSoLuong(float _HeSoLuong) {
		this._HeSoLuong = _HeSoLuong;
	}
	public float TinhLuong() {
		return 1400000 * _SoNgayLam * _HeSoLuong;
	}
	public String ChuyenThanhString() {
		return _MaSo+_HoTen;
	}
}

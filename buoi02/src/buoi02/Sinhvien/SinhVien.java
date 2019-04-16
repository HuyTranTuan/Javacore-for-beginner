package buoi02.Sinhvien;

public class SinhVien {
	private String _MaSV, _HoTen;
	private float _DiemToan, _DiemLy, _DiemHoa;
	public SinhVien(String _MaSV,String _HoTen,float _DiemToan,float _DiemLy,float _DiemHoa) {
		super();
		this._DiemHoa = _DiemHoa;
		this._DiemLy = _DiemLy;
		this._DiemToan = _DiemToan;
		this._MaSV = _MaSV;
		this._HoTen = _HoTen;
	}
	
	public String get_MaSV() {
		return _MaSV;
	}
	public void set_MaSV(String _MaSV) {
		this._MaSV = _MaSV;
	}
	public String get_HoTen() {
		return _HoTen;
	}
	public void set_HoTen(String _HoTen) {
		this._HoTen = _HoTen;
	}
	public float get_DiemToan() {
		return _DiemToan;
	}
	public void set_DiemToan(float _DiemToan) {
		this._DiemToan = _DiemToan;
	}
	public float get_DiemLy() {
		return _DiemLy;
	}
	public void set_DiemLy(float _DiemLy) {
		this._DiemLy = _DiemLy;
	}
	public float get_DiemHoa() {
		return _DiemHoa;
	}
	public void set_DiemHoa(float _DiemHoa) {
		this._DiemHoa = _DiemHoa;
	}
	public float DiemTrungBinh() {
		return (_DiemHoa +_DiemLy+ _DiemToan)/3;
	}
	public String XepLoai() {
		String Xeploai = "";
		float dtb = DiemTrungBinh();
		if(dtb>8) {
			Xeploai = "gioi";
		}
		if(dtb<8 & dtb>5) {
			Xeploai = "Kha";
		}
		if(dtb<5) {
			Xeploai = "Khac";
		}
		return Xeploai;
	}
	public String ChuyenThanhString() {
		return _MaSV + _HoTen;
	}
}

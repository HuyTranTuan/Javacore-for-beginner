package buoi02.HCN;

public class HCN {
		private int _ChieuDai;
		private int _ChieuRong;
		public HCN(int _ChieuDai, int _ChieuRong) {
			super();
			if(_ChieuDai>=_ChieuRong) {
				this._ChieuDai = _ChieuDai;
				this._ChieuRong = _ChieuRong;
			}else {
				System.out.println("Nhap lai");
			}
		}
		
		public HCN(int _ChieuDai) {
			super();
			this._ChieuDai = 100;
			if(_ChieuDai>=_ChieuRong) {
				this._ChieuRong = _ChieuRong;
			}else {
				System.out.println("Nhap lai");
			}
		}
		
		public HCN() {
			super();
			this._ChieuRong = 50;
			if(_ChieuDai>=_ChieuRong) {
				this._ChieuDai = _ChieuDai;
			}else {
				System.out.println("Nhap lai");
			}
		}
		
		public int get_ChieuRong() {
			return _ChieuRong;
		}
		public int get_ChieuDai() {
			return _ChieuDai;
		}
		public void set_ChieuRong(int _ChieuRong) {
			this._ChieuRong = _ChieuRong;
		}
		public void set_ChieuDai(int _ChieuDai) {
			this._ChieuDai = _ChieuDai;
		}
		public int DienTIch() {
			return _ChieuDai * _ChieuRong;
		}
		public int Chuvi() {
			return (_ChieuDai + _ChieuRong)*2;
		}

}

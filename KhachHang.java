package Doan;

public class KhachHang {

	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	 private int maKH;
	 private String tenKH;
	 private TheThanhVien loaiThe;
	 private String SDT;
	 private LoaiKhachHang loaiKH;

     public KhachHang(int maKH, String tenKH, String SDT, TheThanhVien loaiThe, LoaiKhachHang loaiKH)
     {
         this.setMaKH(maKH);
         this.setTenKH(tenKH);
         this.setLoaiThe(loaiThe);
         this.setSDT(SDT);
         this.setLoaiKH(loaiKH);
     }

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public TheThanhVien getLoaiThe() {
		return loaiThe;
	}

	public void setLoaiThe(TheThanhVien loaiThe) {
		this.loaiThe = loaiThe;
	}

	public LoaiKhachHang getLoaiKH() {
		return loaiKH;
	}

	public void setLoaiKH(LoaiKhachHang loaiKH) {
		this.loaiKH = loaiKH;
	}
    public KhachHang(KhachHang khachHang)
    {
        maKH = khachHang.maKH;
        tenKH = khachHang.tenKH;
        loaiThe = khachHang.loaiThe;
        SDT = khachHang.SDT;
        loaiKH = khachHang.loaiKH;
    }
}

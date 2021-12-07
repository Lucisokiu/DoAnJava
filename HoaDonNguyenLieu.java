package Doan;

public class HoaDonNguyenLieu {

	public HoaDonNguyenLieu() {
	}
	 private int maHoaDon;
	 private String thoiGian;
	 private int soLuong;
	 private LoaiNguyenLieu maLoaiNguyenLieu;
	 private NhanVien maNhanVien;

     public HoaDonNguyenLieu(int maHoaDon, String thoiGian, int soLuong, LoaiNguyenLieu maLoaiNguyenLieu, NhanVien maNhanVien)
     {
         this.setMaHoaDon(maHoaDon);
         this.setThoiGian(thoiGian);
         this.setSoLuong(soLuong);
         this.setMaNhanVien(maNhanVien);
         this.setMaLoaiNguyenLieu(maLoaiNguyenLieu);  
     }

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public LoaiNguyenLieu getMaLoaiNguyenLieu() {
		return maLoaiNguyenLieu;
	}

	public void setMaLoaiNguyenLieu(LoaiNguyenLieu maLoaiNguyenLieu) {
		this.maLoaiNguyenLieu = maLoaiNguyenLieu;
	}

	public NhanVien getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(NhanVien maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
    public HoaDonNguyenLieu(HoaDonNguyenLieu HDNL)
    {
        maHoaDon = HDNL.maHoaDon;
        maNhanVien = HDNL.maNhanVien;
        maLoaiNguyenLieu = HDNL.maLoaiNguyenLieu;
        soLuong = HDNL.soLuong;
        thoiGian = HDNL.thoiGian;
    }

}

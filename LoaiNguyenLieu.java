package Doan;

public class LoaiNguyenLieu {

	public LoaiNguyenLieu() {
	}
	  private int maLoaiNguyenLieu;
	  private String thuocTinh;

    public LoaiNguyenLieu(int maLoaiNguyenLieu, String thuocTinh)
    {
        this.setMaLoaiNguyenLieu(maLoaiNguyenLieu);
        this.setThuocTinh(thuocTinh);
    }
	public String getThuocTinh() {
		return thuocTinh;
	}
	public void setThuocTinh(String thuocTinh) {
		this.thuocTinh = thuocTinh;
	}
	public int getMaLoaiNguyenLieu() {
		return maLoaiNguyenLieu;
	}
	public void setMaLoaiNguyenLieu(int maLoaiNguyenLieu) {
		this.maLoaiNguyenLieu = maLoaiNguyenLieu;
	}
    public LoaiNguyenLieu(LoaiNguyenLieu LoaiNguyenLieu)
    {
        maLoaiNguyenLieu = LoaiNguyenLieu.maLoaiNguyenLieu;
        thuocTinh = LoaiNguyenLieu.thuocTinh;
    }
}
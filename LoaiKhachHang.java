package Doan;

public class LoaiKhachHang {

	public LoaiKhachHang() {
		// TODO Auto-generated constructor stub
	}
	  private int maLoai;
	  private String tenLoai;
	  private String khuyenMai;

      public LoaiKhachHang(int MaLoai, String tenLoai, String khuyenMai)
      {
          this.setMaLoai(MaLoai);
          this.setTenLoai(tenLoai);
          this.setKhuyenMai(khuyenMai);
      }

	public int getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public String getKhuyenMai() {
		return khuyenMai;
	}

	public void setKhuyenMai(String khuyenMai) {
		this.khuyenMai = khuyenMai;
	}
    public LoaiKhachHang(LoaiKhachHang Loai)
    {
        khuyenMai= Loai.khuyenMai;
        tenLoai = Loai.tenLoai;
        maLoai = Loai.maLoai;
    }
}

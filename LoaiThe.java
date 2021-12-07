package Doan;

public class LoaiThe {

	public LoaiThe() {
		// TODO Auto-generated constructor stub
	}
	 private String tenLoai;
	 private int maLoai;

     public LoaiThe(int maLoai, String tenLoai)
     { 
     this.setMaLoai(maLoai);
     this.setTenLoai(tenLoai);
     }

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public int getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}
    public LoaiThe(LoaiThe loaiThe)
    {
        maLoai = loaiThe.maLoai;
        tenLoai = loaiThe.tenLoai;
    }
}

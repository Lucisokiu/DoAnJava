package Doan;

public class TheThanhVien {

	public TheThanhVien() {
		// TODO Auto-generated constructor stub
	}
	 private int maThe;
	 private LoaiThe maLoaiThe;

     public TheThanhVien(int maThe, LoaiThe maLoaiThe)
     {
         this.setMaThe(maThe);
         this.setMaLoaiThe(maLoaiThe);
     }

	public int getMaThe() {
		return maThe;
	}

	public void setMaThe(int maThe) {
		this.maThe = maThe;
	}

	public LoaiThe getMaLoaiThe() {
		return maLoaiThe;
	}

	public void setMaLoaiThe(LoaiThe maLoaiThe) {
		this.maLoaiThe = maLoaiThe;
	}
    public TheThanhVien(TheThanhVien theThanhVien)
    {
        maThe = theThanhVien.maThe;
        maLoaiThe = theThanhVien.maLoaiThe;
    }
}

package Doan;

public class VanChuyen {

	public VanChuyen() {
		// TODO Auto-generated constructor stub
	}
	 private int maVanChuyen;
	 private int thoiGian;
	 private Shipper maShipper;

     public VanChuyen(int maVanChuyen, int thoiGian, Shipper maShipper)
     {
         this.setMaVanChuyen(maVanChuyen);
         this.setThoiGian(thoiGian);
         this.setMaShipper(maShipper);
     }

	public int getMaVanChuyen() {
		return maVanChuyen;
	}

	public void setMaVanChuyen(int maVanChuyen) {
		this.maVanChuyen = maVanChuyen;
	}

	public int getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(int thoiGian) {
		this.thoiGian = thoiGian;
	}

	public Shipper getMaShipper() {
		return maShipper;
	}

	public void setMaShipper(Shipper maShipper) {
		this.maShipper = maShipper;
	}
    public VanChuyen(VanChuyen vc)
    {
        maVanChuyen = vc.maVanChuyen;
        thoiGian = vc.thoiGian;
        maShipper = vc.maShipper;
    }
}

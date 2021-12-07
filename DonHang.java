package Doan;

public class DonHang {

	public DonHang() {
		// TODO Auto-generated constructor stub
	}
	  private int maDon;
	  private VanChuyen maVanChuyen;
	  private KhachHang maKhachHang;
	  private AppGiaoHang app;
	  private Menu menu;

      public DonHang(int maDon, VanChuyen maVanChuyen, KhachHang maKhachHang, AppGiaoHang app, Menu menu)
      {
          this.setMaDon(maDon);
          this.setMaKhachHang(maKhachHang);
          this.setMaVanChuyen(maVanChuyen);
          this.setApp(app);
          this.setMenu(menu);
      }

	public int getMaDon() {
		return maDon;
	}

	public void setMaDon(int maDon) {
		this.maDon = maDon;
	}

	public VanChuyen getMaVanChuyen() {
		return maVanChuyen;
	}

	public void setMaVanChuyen(VanChuyen maVanChuyen) {
		this.maVanChuyen = maVanChuyen;
	}

	public KhachHang getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(KhachHang maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public AppGiaoHang getApp() {
		return app;
	}

	public void setApp(AppGiaoHang app) {
		this.app = app;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
    public DonHang(DonHang donHang)
    {
        maDon = donHang.maDon;
        maVanChuyen = donHang.maVanChuyen;
        maKhachHang = donHang.maKhachHang;
        app = donHang.app;
        menu = donHang.menu;
    }
}

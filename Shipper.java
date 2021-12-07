package Doan;

public class Shipper {

	public Shipper() {
		// TODO Auto-generated constructor stub
	}
	private int maShipper ;
	private String tenShipper ;
	private AppGiaoHang app ;

    public Shipper(int maShipper, String tenShipper, AppGiaoHang app)
    {
        this.setMaShipper(maShipper);
        this.setTenShipper(tenShipper);
        this.setApp(app);
    }

	public int getMaShipper() {
		return maShipper;
	}

	public void setMaShipper(int maShipper) {
		this.maShipper = maShipper;
	}

	public String getTenShipper() {
		return tenShipper;
	}

	public void setTenShipper(String tenShipper) {
		this.tenShipper = tenShipper;
	}

	public AppGiaoHang getApp() {
		return app;
	}

	public void setApp(AppGiaoHang app) {
		this.app = app;
	}
    public Shipper(Shipper shipper)
    {
        maShipper = shipper.maShipper;
        tenShipper = shipper.tenShipper;
        app = shipper.app;
    }
}

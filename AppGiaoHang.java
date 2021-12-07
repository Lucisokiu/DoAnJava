package Doan;

public class AppGiaoHang {

	public AppGiaoHang() {
		// TODO Auto-generated constructor stub
	}
	private int maApp;
	private String tenApp;

    public AppGiaoHang(int maApp, String tenApp)
    {
        this.setMaApp(maApp);
        this.setTenApp(tenApp);
    }

	public int getMaApp() {
		return maApp;
	}

	public void setMaApp(int maApp) {
		this.maApp = maApp;
	}

	public String getTenApp() {
		return tenApp;
	}

	public void setTenApp(String tenApp) {
		this.tenApp = tenApp;
	}
    public AppGiaoHang(AppGiaoHang app)
    {
        maApp= app.maApp;
        tenApp= app.tenApp;
    }
}

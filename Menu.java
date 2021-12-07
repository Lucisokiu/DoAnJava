package Doan;

public class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}
	private String tenMon;
    private ChiNhanh maChiNhanh;

    public Menu(String tenMon, ChiNhanh maChiNhanh)
    {
        this.setTenMon(tenMon);
        this.setMaChiNhanh(maChiNhanh);
    }

	public ChiNhanh getMaChiNhanh() {
		return maChiNhanh;
	}

	public void setMaChiNhanh(ChiNhanh maChiNhanh) {
		this.maChiNhanh = maChiNhanh;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}
    public Menu(Menu menu)
    {
        tenMon = menu.tenMon;
        maChiNhanh = menu.maChiNhanh;
    }
}

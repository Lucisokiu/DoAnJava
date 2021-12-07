
package Doan;

public class NhaPhanPhoi {

	public NhaPhanPhoi() {
	}
    private int maNhaPhanPhoi;
    private String tenNhaPhanPhoi;
    private String diaChiNhaPhanPhoi;

    public NhaPhanPhoi(int maNhaPhanPhoi, String tenNhaPhanPhoi, String diaChiNhaPhanPhoi)
    {
        this.setMaNhaPhanPhoi(maNhaPhanPhoi);
        this.setTenNhaPhanPhoi(tenNhaPhanPhoi);
        this.setDiaChiNhaPhanPhoi(diaChiNhaPhanPhoi);
    }

	public int getMaNhaPhanPhoi() {
		return maNhaPhanPhoi;
	}

	public void setMaNhaPhanPhoi(int maNhaPhanPhoi) {
		this.maNhaPhanPhoi = maNhaPhanPhoi;
	}

	public String getTenNhaPhanPhoi() {
		return tenNhaPhanPhoi;
	}

	public void setTenNhaPhanPhoi(String tenNhaPhanPhoi) {
		this.tenNhaPhanPhoi = tenNhaPhanPhoi;
	}

	public String getDiaChiNhaPhanPhoi() {
		return diaChiNhaPhanPhoi;
	}

	public void setDiaChiNhaPhanPhoi(String diaChiNhaPhanPhoi) {
		this.diaChiNhaPhanPhoi = diaChiNhaPhanPhoi;
	}
    public NhaPhanPhoi(NhaPhanPhoi NPP)
    {
        maNhaPhanPhoi = NPP.maNhaPhanPhoi;
        tenNhaPhanPhoi = NPP.tenNhaPhanPhoi;
        diaChiNhaPhanPhoi = NPP.diaChiNhaPhanPhoi;
    }
}

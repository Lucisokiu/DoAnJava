package Doan;

public class NguyenLieu{

	public NguyenLieu() {
	}
    private int maNguyenLieu;
    private String tenNguyenLieu;
    private LoaiNguyenLieu maLoaiNguyenLieu;
    private NhaPhanPhoi maNhaPhanPhoi;

    public NguyenLieu(int maNguyenLieu, String tenNguyenLieu, LoaiNguyenLieu maLoaiNguyenLieu, NhaPhanPhoi maNhaPhanPhoi)
    {
        this.setTenNguyenLieu(tenNguyenLieu);
        this.setMaNguyenLieu(maNguyenLieu);
        this.setMaNhaPhanPhoi(maNhaPhanPhoi);    }

	public String getTenNguyenLieu() {
		return tenNguyenLieu;
	}

	public void setTenNguyenLieu(String tenNguyenLieu) {
		this.tenNguyenLieu = tenNguyenLieu;
	}

	public int getMaNguyenLieu() {
		return maNguyenLieu;
	}

	public void setMaNguyenLieu(int maNguyenLieu) {
		this.maNguyenLieu = maNguyenLieu;
	}
	public NhaPhanPhoi getMaNhaPhanPhoi() {
		return maNhaPhanPhoi;
	}

	public void setMaNhaPhanPhoi(NhaPhanPhoi maNhaPhanPhoi) {
		this.maNhaPhanPhoi = maNhaPhanPhoi;
	}

	public LoaiNguyenLieu getMaLoaiNguyenLieu() {
		return maLoaiNguyenLieu;
	}

	public void setMaLoaiNguyenLieu(LoaiNguyenLieu maLoaiNguyenLieu) {
		this.maLoaiNguyenLieu = maLoaiNguyenLieu;
	}
    public NguyenLieu(NguyenLieu NguyenLieu)
    {
        tenNguyenLieu = NguyenLieu.tenNguyenLieu;
        maNguyenLieu = NguyenLieu.maNguyenLieu;
        maLoaiNguyenLieu = NguyenLieu.maLoaiNguyenLieu;
        maNhaPhanPhoi = NguyenLieu.maNhaPhanPhoi;
    }
}

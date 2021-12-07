package Doan;

public class NhanVien {

	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
    private int maNhanVien;
    private String tenNhanVien;
    private String viTri;
    private ChiNhanh maChiNhanh;
    public NhanVien(int maNhanVien, String tenNhanVien, String viTri)
    {
        this.setMaNhanVien(maNhanVien);
        this.setTenNhanVien(tenNhanVien);
        this.setViTri(viTri);
    }
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public int getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public ChiNhanh getMaChiNhanh() {
		return maChiNhanh;
	}
	public void setMaChiNhanh(ChiNhanh maChiNhanh) {
		this.maChiNhanh = maChiNhanh;
	}
    public NhanVien(NhanVien nv)
    {
        maNhanVien = nv.maNhanVien;
        tenNhanVien = nv.tenNhanVien;
        viTri = nv.viTri;
        maChiNhanh = nv.maChiNhanh;
    }
}

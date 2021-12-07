package Doan;

public class ChiNhanh {

	public ChiNhanh() {
	}
    private int maChiNhanh;
	private CuaHang maCuaHang;
    private String diaChi;
   public ChiNhanh(int maChiNhanh, CuaHang maCuaHang, String diaChi){
        this.setMaChiNhanh(maChiNhanh);
        this.setMaCuaHang(maCuaHang);
        this.setDiaChi(diaChi);
}
public int getMaChiNhanh() {
	return maChiNhanh;
}
public void setMaChiNhanh(int maChiNhanh) {
	this.maChiNhanh = maChiNhanh;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public CuaHang getMaCuaHang() {
	return maCuaHang;
}
public void setMaCuaHang(CuaHang maCuaHang) {
	this.maCuaHang = maCuaHang;
}
	public ChiNhanh(ChiNhanh cn)
{
    maChiNhanh = cn.maChiNhanh;
    maCuaHang = cn.maCuaHang;
    diaChi = cn.diaChi;
}

}

package Doan;

public class CuaHang {
	 private int maCuaHang;
	 private String tenCuaHang;

     public CuaHang()
     {}
     public CuaHang(int maCuaHang, String tenCuaHang)
     {
         this.setMaCuaHang(maCuaHang);
         this.setTenCuaHang(tenCuaHang);
     }
	public int getMaCuaHang() {
		return maCuaHang;
	}
	public void setMaCuaHang(int maCuaHang) {
		this.maCuaHang = maCuaHang;
	}
	public String getTenCuaHang() {
		return tenCuaHang;
	}
	public void setTenCuaHang(String tenCuaHang) {
		this.tenCuaHang = tenCuaHang;
	}
    public CuaHang(CuaHang CuaHang)
    {
        maCuaHang = CuaHang.maCuaHang;
        tenCuaHang = CuaHang.tenCuaHang;
    }
 }

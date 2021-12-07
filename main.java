package Doan;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
public class main {
	/*
	    	   CuaHang CuaHang = new CuaHang();
	    	   ChiNhanh ChiNhanh= new ChiNhanh();
	    	   NhaPhanPhoi NhaPhanPhoi= new NhaPhanPhoi();
	    	   LoaiNguyenLieu LoaiNguyenLieu = new LoaiNguyenLieu();
	    	   NguyenLieu NguyenLieu = new NguyenLieu();
	    	   NhanVien NhanVien = new NhanVien();
	    	   HoaDonNguyenLieu HoaDonNguyenLieu= new HoaDonNguyenLieu();
	    	   Menu Menu= new Menu();
	    	   LoaiKhachHang LoaiKhachHang = new LoaiKhachHang();
	    	   LoaiThe LoaiThe = new LoaiThe();
	    	   TheThanhVien TheThanhVien = new TheThanhVien();
	    	   KhachHang KhachHang = new KhachHang();
	    	   AppGiaoHang AppGiaoHang = new AppGiaoHang();
	    	   Shipper Shipper = new Shipper();
	    	   VanChuyen VanChuyen = new VanChuyen();
	    	   DonHang DonHang = new DonHang();
	    	   */
	 static List<CuaHang> cuaHang = new ArrayList<CuaHang>();
  	 static List<ChiNhanh> chiNhanh = new ArrayList<ChiNhanh>();
 	 static List<NhaPhanPhoi> nhaPhanPhoi = new ArrayList<NhaPhanPhoi>();
 	 static List<LoaiNguyenLieu> loaiNL = new ArrayList<LoaiNguyenLieu>();
	 static List<NguyenLieu> nguyenLieu = new ArrayList<NguyenLieu>();
	 static List<KhachHang> khHang = new ArrayList<KhachHang>();
 	 static List<LoaiKhachHang> loaiKH = new ArrayList<LoaiKhachHang>();
	 static List<NhanVien> nhVien = new ArrayList<NhanVien>();
     static List<DonHang> donHang = new ArrayList<DonHang>();
     static List<HoaDonNguyenLieu> hoaDonNL = new ArrayList<HoaDonNguyenLieu>();
     static List<Menu> menu = new ArrayList<Menu>();
     static List<AppGiaoHang> app = new ArrayList<AppGiaoHang>();
     static List<VanChuyen> vanChuyen = new ArrayList<VanChuyen>();
     static List<Shipper> shipper = new ArrayList<Shipper>();
     static List<TheThanhVien> theThanhVien = new ArrayList<TheThanhVien>();
     static List<LoaiThe> loaiThe = new ArrayList<LoaiThe>();
	        public static void TaoDanhSachCuaHang()
	        {
	            cuaHang.add(new CuaHang(111, "Tra Sua Ton Phat"));
	            cuaHang.add(new CuaHang(112, "Tra Sua Minh Nhut"));
	            cuaHang.add(new CuaHang(113, "Tra Sua Thu Hoai"));
	        }

	        public static void TaoDanhSachChiNhanh()
	        {
	            chiNhanh.add(new ChiNhanh(201, cuaHang[0], "Quan 1"));
	            chiNhanh.add(new ChiNhanh(202, cuaHang[0], "Quan 2"));
	            chiNhanh.add(new ChiNhanh(203, cuaHang[0], "Quan 3"));
	            chiNhanh.add(new ChiNhanh(204, cuaHang[0], "Quan 4"));
	            chiNhanh.add(new ChiNhanh(305, cuaHang[1], "Quan 5"));
	            chiNhanh.add(new ChiNhanh(206, cuaHang[1], "Quan 6"));
	            chiNhanh.add(new ChiNhanh(207, cuaHang[1], "Quan 7"));
	            chiNhanh.add(new ChiNhanh(208, cuaHang[1], "Quan 8"));
	            chiNhanh.add(new ChiNhanh(209, cuaHang[1], "Quan 9"));
	            chiNhanh.add(new ChiNhanh(210, cuaHang[1], "Quan 10"));
	            chiNhanh.add(new ChiNhanh(211, cuaHang[1], "Quan 11"));
	            chiNhanh.add(new ChiNhanh(212, cuaHang[2], "Quan 12"));
	            chiNhanh.add(new ChiNhanh(213, cuaHang[2], "Quan Binh Thanh"));
	            chiNhanh.add(new ChiNhanh(214, cuaHang[2], "Quan Go Vap"));
	            chiNhanh.add(new ChiNhanh(215, cuaHang[2], "Quan Phu Nhuan"));
	            chiNhanh.add(new ChiNhanh(216, cuaHang[2], "Quan Tan Binh"));
	            chiNhanh.add(new ChiNhanh(217, cuaHang[2], "Quan Tan Phu"));
	            chiNhanh.add(new ChiNhanh(218, cuaHang[2], "Quan Binh Tan"));
	        }

	        public static void TaoDanhSachNhaPhanPhoi()
	        {
	            nhaPhanPhoi.add(new NhaPhanPhoi(301, "Npp Huyen Nha Be", "Huyen Nha Be"));
	            nhaPhanPhoi.add(new NhaPhanPhoi(302, "Npp Huyen Hoc Mon", "Huyen Hoc Mon"));
	            nhaPhanPhoi.add(new NhaPhanPhoi(303, "Npp Quan Cu Chi", "Quan Cu Chi"));
	            nhaPhanPhoi.add(new NhaPhanPhoi(304, "Npp Huyen Binh Chanh", "Huyen Binh Chanh"));
	            nhaPhanPhoi.add(new NhaPhanPhoi(305, "Npp Huyen Can Gio", "Huyen Can Gio"));
	        }
	        public static void TaoDanhSachLoaiNguyenLieu()
	        {
	            loaiNL.add(new LoaiNguyenLieu(501, "Sua / Rich"));
	            loaiNL.add(new LoaiNguyenLieu(502, "Muc trai cay / Siro"));
	            loaiNL.add(new LoaiNguyenLieu(503, "Banh"));
	            loaiNL.add(new LoaiNguyenLieu(504, "Thuc An Nhanh"));
	            loaiNL.add(new LoaiNguyenLieu(505, "Tra"));
	        }

	        public static void TaoDanhSachNguyenLieu()
	        {
	            nguyenLieu.add(new NguyenLieu(401, "Sua dac Hoan Hao", loaiNL[1], nhaPhanPhoi[1]));
	            nguyenLieu.add(new NguyenLieu(402, "Sua tuoi Meiji", loaiNL[0], nhaPhanPhoi[1]));
	            nguyenLieu.add(new NguyenLieu(403, "Rich lun", loaiNL[0], nhaPhanPhoi[2]));
	            nguyenLieu.add(new NguyenLieu(404, "Rich cao", loaiNL[0], nhaPhanPhoi[3]));
	            nguyenLieu.add(new NguyenLieu(411, "Muc Dau", loaiNL[1], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(412, "Muc Viet Quat", loaiNL[1], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(413, "Muc Dao", loaiNL[1], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(414, "Muc Xoai", loaiNL[1], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(415, "Muc Nho", loaiNL[1], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(416, "Siro Chocolate", loaiNL[1], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(417, "Siro Almond", loaiNL[1], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(421, "Cupcake", loaiNL[2], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(422, "Chess Cake", loaiNL[2], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(423, "Bread", loaiNL[2], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(424, "Cookies", loaiNL[2], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(431, "Khoai Tay", loaiNL[3], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(432, "Ga", loaiNL[3], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(433, "Spaghetti", loaiNL[3], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(434, "Pizza", loaiNL[3], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(441, "Olong Tea", loaiNL[4], nhaPhanPhoi[4]));
	            nguyenLieu.add(new NguyenLieu(441, "Black Tea", loaiNL[4], nhaPhanPhoi[4]));
	            nguyenLieu.Add(new NguyenLieu(443, "Jasmine tea", loaiNL[4], nhaPhanPhoi[4]));
	            }

	        public static void TaoDanhSachLoaiKhachHang()
	        {
	            loaiKH.add(new LoaiKhachHang(501, "Than Thiet", "30%"));
	            loaiKH.add(new LoaiKhachHang(502, "Sinh Vien", "20%"));
	            loaiKH.add(new LoaiKhachHang(503, "Nguoi Lon", "10%"));
	            loaiKH.add(new LoaiKhachHang(504, "Tre Em", "20%"));
	        }

	        public static void TaoDanhSachKhachHang()
	        {
	            khHang.add(new KhachHang(15110064, "Tran Ngoc Khoa", "01235463830",theThanhVien[0], loaiKH[2]));
	            khHang.add(new KhachHang(15110007, "Nguyen Ngoc Duy Anh", "01234567890", theThanhVien[1], loaiKH[3]));
	            khHang.add(new KhachHang(15110012, "Trinh Duong Gia Bao", "01234576890", theThanhVien[2], loaiKH[0]));
	            khHang.add(new KhachHang(15110021, "Nguyen Viet Cuong", "01243567890", theThanhVien[4], loaiKH[1]));
	            khHang.add(new KhachHang(15110028, "Hoang Phuoc Dai", "01234657891", theThanhVien[7], loaiKH[2]));
	            khHang.add(new KhachHang(15110042, "Le Huu Han", "01325476890", theThanhVien[9], loaiKH[3]));
	            khHang.add(new KhachHang(15110048, "Nguyen Hoang Hiep", "01235463780", theThanhVien[6], loaiKH[0]));
	            khHang.add(new KhachHang(15110049, "Vo Gia Bao", "01235467360", theThanhVien[0], loaiKH[1]));
	        }

	        public static void TaoDanhSachLoaiThe()
	        {
	            loaiThe.add(new LoaiThe(601, "Silver Card"));
	            loaiThe.add(new LoaiThe(602, "Yellow Card"));
	            loaiThe.add(new LoaiThe(603, "Platinum Card"));
	            loaiThe.add(new LoaiThe(604, "BLack Card"));
	        }

	        public static void TaoDanhSachTheThanhVien()
	        {
	            theThanhVien.add(new TheThanhVien(701, loaiThe[0]));
	            theThanhVien.add(new TheThanhVien(702, loaiThe[0]));
	            theThanhVien.add(new TheThanhVien(703, loaiThe[1]));
	            theThanhVien.add(new TheThanhVien(704, loaiThe[1]));
	            theThanhVien.add(new TheThanhVien(705, loaiThe[2]));
	            theThanhVien.add(new TheThanhVien(706, loaiThe[2]));
	            theThanhVien.add(new TheThanhVien(707, loaiThe[3]));
	            theThanhVien.add(new TheThanhVien(708, loaiThe[3]));
	            theThanhVien.add(new TheThanhVien(709, loaiThe[1]));
	            theThanhVien.add(new TheThanhVien(710, loaiThe[2]));
	        }

	        public static void TaoDanhSachNhanVien()
	        {
	            nhVien.add(new NhanVien(1001, "Luu Van Manh", "Barista", chiNhanh[0]));
	            nhVien.add(new NhanVien(1002, "Le Thi Hong", "Cashier", chiNhanh[5]));
	            nhVien.add(new NhanVien(1003, "Le Thi Na", "Lobby", chiNhanh[8]));
	            nhVien.add(new NhanVien(1004, "Nong Anh Vu", "Leader", chiNhanh[3]));
	            nhVien.add(new NhanVien(1005, "Tran Van Tuong", "Barista", chiNhanh[9]));
	            nhVien.add(new NhanVien(1006, "Huynh Phan Dong", "Cashier", chiNhanh[10]));
	            nhVien.add(new NhanVien(1007, "Hoang Dieu", "Lobby", chiNhanh[4]));
	            nhVien.add(new NhanVien(1008, "Luu Van Linh", "Barista", chiNhanh[11]));
	            nhVien.add(new NhanVien(1009, "Le Thi Hong Hanh", "Cashier", chiNhanh[14]));
	            nhVien.add(new NhanVien(1010, "Le Hoang Anh", "Lobby", chiNhanh[17]));
	            nhVien.add(new NhanVien(1011, "Cao Anh Vu", "Leader", chiNhanh[15]));
	            nhVien.add(new NhanVien(1012, "Tran Vo Van Tuong", "Barista", chiNhanh[12]));
	            nhVien.add(new NhanVien(1013, "Huynh Thien An", "Cashier", chiNhanh[2]));
	            nhVien.add(new NhanVien(1014, "Hoang Thuy Linh", "Lobby", chiNhanh[1]));
	            nhVien.add(new NhanVien(1015, "Bach Hong An", "Barista", chiNhanh[5]));
	            nhVien.add(new NhanVien(1016, "Nguyen Thi Dieu", "Cashier", chiNhanh[7]));
	            nhVien.add(new NhanVien(1017, "Le Anh Tai", "Lobby", chiNhanh[6]));
	            nhVien.add(new NhanVien(1018, "Cao Thai Vu", "Leader", chiNhanh[13]));
	            nhVien.add(new NhanVien(1019, "Tran Le Trung Hieu", "Barista", chiNhanh[14]));
	            nhVien.add(new NhanVien(1020, "Huynh Khanh Linh", "Cashier", chiNhanh[16]));
	            nhVien.add(new NhanVien(1021, "Duong Hoang Yen", "Lobby", chiNhanh[2]));
	        }

	        public static void TaoDanhSachHoaDonNguyenLieu()
	        {
	            hoaDonNL.Add(new HoaDonNguyenLieu(97040672, "1/12/2021", 100, loaiNL[0], nhVien[4]));
	            hoaDonNL.Add(new HoaDonNguyenLieu(95690575, "2/12/2021", 100, loaiNL[1], nhVien[8]));
	            hoaDonNL.Add(new HoaDonNguyenLieu(97041619, "3/12/2021", 100, loaiNL[2], nhVien[16]));
	            hoaDonNL.Add(new HoaDonNguyenLieu(97415533, "4/12/2021", 100, loaiNL[3], nhVien[4]));
	            hoaDonNL.Add(new HoaDonNguyenLieu(97041581, "5/12/2021", 100, loaiNL[4], nhVien[8]));
	            hoaDonNL.Add(new HoaDonNguyenLieu(97074931, "6/12/2021", 100, loaiNL[2], nhVien[16]));
	            hoaDonNL.Add(new HoaDonNguyenLieu(97142023, "7/12/2021", 100, loaiNL[1], nhVien[8]));
	        }

	        public static void TaoDanhSachMenu()
	        {
	            menu.Add(new Menu("Tra Dao Cam Xa", chiNhanh[0]));
	            menu.Add(new Menu("Sua Tuoi Tran Chau Duong Den", chiNhanh[1]));
	            menu.Add(new Menu("Tra Olong", chiNhanh[2]));
	            menu.Add(new Menu("Choco Latte", chiNhanh[3]));
	            menu.Add(new Menu("Orio Frezze", chiNhanh[4]));
	            menu.Add(new Menu("Tra Trai Cay", chiNhanh[5]));
	            menu.Add(new Menu("Spaghetti", chiNhanh[6]));
	            menu.Add(new Menu("Ga Vien", chiNhanh[7]));
	            menu.Add(new Menu("Khoai Tay Lac", chiNhanh[8]));
	            menu.Add(new Menu("Pizza", chiNhanh[9]));
	            menu.Add(new Menu("Yogurt Xoai", chiNhanh[10]));
	            menu.Add(new Menu("Yogurt Dao", chiNhanh[11]));
	        }

	        public static void TaoDanhSachDonHang()
	        {
	            donHang.Add(new DonHang(800, vanChuyen[0], khHang[0], app[0],menu[10]));
	            donHang.Add(new DonHang(801, vanChuyen[1], khHang[1], app[1], menu[1]));
	            donHang.Add(new DonHang(802, vanChuyen[2], khHang[2], app[2], menu[1]));
	            donHang.Add(new DonHang(803, vanChuyen[3], khHang[3], app[3], menu[11]));
	            donHang.Add(new DonHang(804, vanChuyen[4], khHang[4], app[4], menu[1]));
	            donHang.Add(new DonHang(805, vanChuyen[5], khHang[5], app[5], menu[8]));
	            donHang.Add(new DonHang(806, vanChuyen[6], khHang[6], app[0], menu[6]));
	            donHang.Add(new DonHang(807, vanChuyen[7], khHang[7], app[1], menu[5]));
	            donHang.Add(new DonHang(808, vanChuyen[8], khHang[5], app[2], menu[1]));
	            donHang.Add(new DonHang(809, vanChuyen[9], khHang[3], app[3], menu[3]));
	            donHang.Add(new DonHang(810, vanChuyen[10], khHang[1], app[4], menu[1]));
	            donHang.Add(new DonHang(811, vanChuyen[11], khHang[4], app[5], menu[1]));
	        }

	        public static void TaoDanhSachVanChuyen()
	        {
	            vanChuyen.Add(new VanChuyen(901, 30, shipper[0]));
	            vanChuyen.Add(new VanChuyen(902, 45, shipper[1]));
	            vanChuyen.Add(new VanChuyen(903, 15, shipper[2]));
	            vanChuyen.Add(new VanChuyen(904, 20, shipper[3]));
	            vanChuyen.Add(new VanChuyen(905, 60, shipper[4]));
	            vanChuyen.Add(new VanChuyen(906, 55, shipper[5]));
	            vanChuyen.Add(new VanChuyen(907, 50, shipper[6]));
	            vanChuyen.Add(new VanChuyen(908, 35, shipper[7]));
	            vanChuyen.Add(new VanChuyen(909, 25, shipper[8]));
	            vanChuyen.Add(new VanChuyen(910, 40, shipper[9]));
	            vanChuyen.Add(new VanChuyen(911, 10, shipper[10]));
	            vanChuyen.Add(new VanChuyen(912, 5,  shipper[11]));
	        }

	        public static void TaoDanhSachShipper()
	        {
	            shipper.Add(new Shipper(9001, "Bui Tan Truong", app[0]));
	            shipper.Add(new Shipper(9002, "Que Ngoc Hai", app[1]));
	            shipper.Add(new Shipper(9003, "Nguyen Quang Hai", app[2]));
	            shipper.Add(new Shipper(9004, "Luong Xuan Truong", app[3]));
	            shipper.Add(new Shipper(9005, "Nguyen Tuan Anh", app[4]));
	            shipper.Add(new Shipper(9006, "Nguyen Hoang Duc", app[5]));
	            shipper.Add(new Shipper(9007, "Nguyen Van Toan", app[0]));
	            shipper.Add(new Shipper(9008, "Phan Van Duc", app[1]));
	            shipper.Add(new Shipper(9009, "Nguyen Cong Phuong", app[2]));
	            shipper.Add(new Shipper(9010, "Nguyen Van Hoang", app[3]));
	            shipper.Add(new Shipper(9011, "Nguyen Trong Hoang", app[4]));
	            shipper.Add(new Shipper(9012, "Ho Tan Tai", app[5]));
	        }

	        public static void TaoDanhSachAppGiaoHang()
	        {
	            app.add(new AppGiaoHang(2001, "BEAMIN"));
	            app.add(new AppGiaoHang(2002, "LOSHIP"));
	            app.add(new AppGiaoHang(2003, "FOODY"));
	            app.add(new AppGiaoHang(2004, "SHOPEE FOOD"));
	            app.add(new AppGiaoHang(2005, "GOJEK"));
	            app.add(new AppGiaoHang(2006, "GRAB FOOD"));
	        }

	       public static void Main(String[] args)
	        {
	            TaoDanhSachCuaHang();
	            TaoDanhSachChiNhanh();
	            TaoDanhSachNhaPhanPhoi();
	            TaoDanhSachLoaiNguyenLieu();
	            TaoDanhSachNguyenLieu();
	            TaoDanhSachNhanVien();
	            TaoDanhSachHoaDonNguyenLieu();
	            TaoDanhSachMenu();
	            TaoDanhSachLoaiKhachHang();
	            TaoDanhSachLoaiThe();
	            TaoDanhSachTheThanhVien();
	            TaoDanhSachKhachHang();
	            TaoDanhSachAppGiaoHang();
	            TaoDanhSachShipper();
	            TaoDanhSachVanChuyen();
	            TaoDanhSachDonHang();


}
}

package NHANVIEN;



public class THONGBAO {
    public static void main(String[] args) {
        NhanVienFULL NV1 = new NhanVienFULL();
        NV1.NhanvienFullTime("Khanh", 7);
        NV1.SetloaiChucVu(1);
        NV1.LoaiNhanVien("SEP");
        NV1.TinhLuong();
        NV1.InTT();
        NhanVienPart NV2 = new NhanVienPart();
        NV2.NhanVienPartTime("Hai", 40);
        NV2.LoaiNhanVien("NHAN VIEN PART TIME");
        NV2.TinhLuong();
        NV2.InTT();
    }
}
package LuongNhanVien;

public class NhanVienPart extends NhanVien {
    public int Giolamviec;

    public void NhanVienPartTime(String Ten, int Giolamviec) {
        this.Ten = Ten;
        this.Giolamviec = Giolamviec;
    }

    public void LoaiNhanVien(String LoaiNhanVien) {
        this.LoaiNhanVien = LoaiNhanVien;
    }

    public void TinhLuong() {
        Luong = configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * Giolamviec;
    }

    @Override
    public void InTT() {
        super.InTT();
    }
}
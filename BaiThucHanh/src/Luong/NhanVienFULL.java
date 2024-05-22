package  BaiThucHanh.src.Luong;

import java.util.Scanner;

public class NhanVienFULL extends NHANVIEN {
    public int NgayLamViec;
    public int loaiChucVU;
    Scanner sc = new Scanner(System.in);

    public void NhanvienFullTime(String Ten) {
        this.Ten = Ten;
    }

    public void NhanvienFullTime(String Ten, int NgayLamViec) {
        this.Ten = Ten;
        this.NgayLamViec = NgayLamViec;
    }

    public void SetloaiChucVu(int loaiChucVU) {
        this.loaiChucVU = loaiChucVU;
    }

    public void LoaiNhanVien(String LoaiNhanViec) {
        this.LoaiNhanVien = LoaiNhanViec;
    }

    public void TinhLuong() {
        if (loaiChucVU == 1) {
            Luong = configs. LUONG_NHAN_VIEN_FULL_TIME_SEP + configs.LUONG_LAM_THEM_MOI_NGAY * NgayLamViec;
        } else
            Luong = configs.LUONG_NHAN_VIEN_PART_TIME_LINH + configs.LUONG_LAM_THEM_MOI_NGAY * NgayLamViec;
    }

    @Override
    public void InTT() {
        super.InTT();
    }
}
package javaOOP.Lab2.src.people;

public class MainClass {
    public static void main(String[] args) {
        person per = new person();
        
        per.nhapThongTin();
        per.xuatThongTin();

       nhanvien nv = new nhanvien();
        nv.nhapThongTin("Nguyen Van A", "Ha Noi", 30);
        nv.xuatThongTin();
        
        nhanvienpartime nvp = new nhanvienpartime();
        nvp.so_gio_lam();
        nvp.Luong_NV_PartTime();

        nhanvienfulltime nvf = new nhanvienfulltime();
       nvf.nhapLCB();
        nvf.PhanTram_Doanhthu();
        nvf.thuong();
        nvf.Luong_FullTime();
    }
}
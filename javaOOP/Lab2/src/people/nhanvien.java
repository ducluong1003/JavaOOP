package javaOOP.Lab2.src.people;

public class nhanvien extends person {
    public float luong;
    public void nhapThongTin(String ten, String diachi, int tuoi)
    {
        HoTen = ten;
        DiaChi = diachi;
        Tuoi = tuoi;
    }
    public float inLuong()
    {   
        System.out.println("Luong: "+luong);
        return luong;
    }
}
package javaOOP.Lab2.src.people;

import java.util.Scanner;

public class nhanvienfulltime extends nhanvien {
    public float LuongCB;
    public float PhanTram_Doanhthu; 
    public float thuong;
    public void nhapLCB()
    {   nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Luong co ban: ");
        LuongCB = sc.nextFloat();
       
    }
    public void PhanTram_Doanhthu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Phan tram doanh thu: ");
        PhanTram_Doanhthu = sc.nextFloat();
       
    }
    public void thuong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Thuong: ");
        thuong = sc.nextFloat();
      
    }
    
    public void Luong_FullTime()
    {   
        luong = LuongCB + PhanTram_Doanhthu + thuong;
        inLuong();
    }
}
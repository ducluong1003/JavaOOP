package BaiThucHanh.src.Person;

import java.util.Scanner;

public class person {
    public String fullName;
    public int old;
    public float kg;
    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);  
        System.out.print(" Nhap ten : ");
        fullName = sc.nextLine();
        System.out.print(" Nhap tuoi : ");
        old = sc.nextInt();
        System.out.print(" Nhap can nang : ");
        kg = sc.nextFloat();
        sc.close();
      
    }
    public void xuatThongTin()
    {
        System.out.print(" Ten :" +fullName + " \n Tuoi :" + old + " \ncan nang :" + kg);
    }
    public person()
    {
        fullName = "Duc";
        old = 20;
        kg = 68;
    }
    public void xuatThongTin( int old)
    {
        System.out.println(" Tuoi = " + old);
    }
}

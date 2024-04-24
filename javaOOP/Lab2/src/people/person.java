package people;
import java.util.Scanner;

public class person {
    public String HoTen;
    public int Tuoi;
    public String DiaChi;

    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        DiaChi = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Tuoi = sc.nextInt();
        
    }
    public void xuatThongTin()
    {
        System.out.println("Ho ten: " + HoTen);
        System.out.println("Dia Chi: " + DiaChi);
        System.out.println("Tuoi: " + Tuoi);
    }
    public person()
    {
        HoTen = "Luong Anh Duc";
        DiaChi = "Thanh Hoa";
        Tuoi = 20;
    }
}
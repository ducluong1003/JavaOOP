package BaiThucHanh.src;
import java.util.Scanner;

public class Hinhchunhatkethua extends Hinhhoc {
    public float dai;
    public float rong;

    public void HinhChuNhat() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(" Ban kinh =  :  " + name);
        sc.close();
    }

    public void nhapchieudai() {
        Scanner sc = new Scanner(System.in);
        dai = sc.nextInt();
        System.out.println(" Ban kinh =  :  " + dai);
        sc.close();
    }

    public void nhapchieurong() {
        Scanner sc = new Scanner(System.in);
        rong = sc.nextInt();
        System.out.println(" Ban kinh =  :  " + rong);
        sc.close();
    }

    public void tinhChuVi() {
        chuvi = (dai + rong) * 2;
    }

    public void tinhDienTich() {
        dientich = dai * rong;
    }
}

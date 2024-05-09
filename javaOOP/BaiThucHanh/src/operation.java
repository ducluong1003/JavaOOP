package BaiThucHanh.src;
import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so thu nhat : ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao so thu hai : ");
        double b = sc.nextDouble();
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = 0;
        double chiaDu = 0;
        if (b != 0) {
            thuong = a / b;
            chiaDu = a % b;
        } else {
            System.out.println("khong the chia cho 0");
        }
        sc.close();
        System.out.println("tong :" + tong);
        System.out.println("hieu :" + hieu);
        System.out.println("tich :" + tich);
        if (b != 0) {
            System.out.println("thuong :" + thuong);
            System.out.println("chia lay phan du :" + chiaDu);
        }
        if (a > b) {
            System.out.println(a + " lon hon " + b);
        } else if (a < b) {
            System.out.println(a + " be hon " + b);
        } else {
            System.out.println(" Hai so bang nhau");
        }

    }
}
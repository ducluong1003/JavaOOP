import java.util.Scanner;

public class Hinhtronkethua extends Hinhhoc {
    public float bankinh;

    public void hinhtron() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(" Ten :  " + name);
        sc.close();

    }
    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextInt();
        System.out.println(" Ban kinh =  :  " + bankinh);
        sc.close();

    }
    public void tinhChuVi() {
        chuvi = 2 * Pi * bankinh;

    }
    public void tinhDienTich() {
        chuvi = bankinh* Pi * bankinh;

    }

    
}

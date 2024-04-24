package BaiThucHanh.src;
import java.util.Scanner;

public class Hinhtrukethua extends Hinhtronkethua {
    public float chieucao;

    public void hinhtron() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(" Ten :  " + name);
        sc.close();

    }
    public void nhapChieuCao() {
        Scanner sc = new Scanner(System.in);
       chieucao = sc.nextInt();
        System.out.println(" Ban kinh =  :  " + chieucao);
        sc.close();
}
    public void tinhTheTich()
    {
        thetich = Pi * bankinh * bankinh * chieucao;
    }
}

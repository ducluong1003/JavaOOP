import java.util.Scanner;

public class Hinhvuongkethua extends Hinhchunhatkethua {
    public void hinhvuong() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(" Ten :  " + name);
        sc.close();

    }

    public void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        dai = sc.nextInt();
        System.out.println(" Ban kinh =  :  " + dai);
        sc.close();
    }
}

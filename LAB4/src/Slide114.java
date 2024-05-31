
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Slide114 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        String traicay, traicay1, Search_traicay;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Trai cay: ");
            traicay =sc.nextLine();
            if( traicay == "")
                break;
            set1.add(traicay);
        }
        System.out.println(set1);
        System.out.println("Nhap loai trai cay can tim");
        Search_traicay = sc.nextLine();
        if(set1.contains(Search_traicay))
            System.out.println("Tim thay !");
        else
            System.out.println("Khong tim thay");
        
        System.out.println("Nhap loai trai cay can xoa");
        String TraiCay = sc.nextLine();
        if(set1.remove(TraiCay))
            System.out.println(" Xoa thanh cong !");
        else
            System.out.println("Khong co trai cay nay");
        System.out.println("Trai cay con lai : ");
        System.out.println(set1);
    }
}

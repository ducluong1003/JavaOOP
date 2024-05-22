package BaiThucHanh.src.Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Slide56chuong4 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSetStrings = new HashSet<>();
        hashSetStrings.add("Luong");
        hashSetStrings.add("Anh");
        hashSetStrings.add("Duc");
        hashSetStrings.add("Nguyen");
        hashSetStrings.add("Xuan");
        hashSetStrings.add("Khanh");
        System.out.println(" Cac phan tu co trong hashSetStrings la :");
        System.out.println(hashSetStrings);
        System.out.println(" Nhap ten phan tu can xoa : ");
        name = sc.nextLine();
        if (hashSetStrings.contains(name))
            
        {
            hashSetStrings.remove(name);
            System.out.println(" Xoa thanh cong ");
            System.out.println(" Cac phan tu con lai trong hashSetStrings la :");
            System.out.println(hashSetStrings);

        }
        else
        {
            System.out.println(" Xoa khong thanh cong : ");
        }

    }
}

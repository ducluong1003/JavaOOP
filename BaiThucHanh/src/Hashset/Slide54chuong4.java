package BaiThucHanh.src.Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Slide54chuong4 {
    public static void main(String[] args) {
        int Number;
        HashSet<Integer> hashSetIntegers = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetIntegers.add(0);
        hashSetIntegers.add(3);
        hashSetIntegers.add(1);
        hashSetIntegers.add(4);
        hashSetIntegers.add(2);
        hashSetIntegers.add(8);
        System.out.println(" Cac phan tu co trong hashsetIntegers la: ");
        System.out.println(hashSetIntegers);
        System.out.print(" Nhap phan tu can them: ");
        Number = sc.nextInt();

        if (!hashSetIntegers.contains(Number)) {
            hashSetIntegers.add(Number);
            System.out.println(" Them thanh cong !");
            System.out.println(" Cac phan tu trong hashSetIntegers sau khi them la : ");
            System.out.println(hashSetIntegers);
        } else {
            System.out.println(" phan tu " + Number + " da ton tai !");
        }
    }

}

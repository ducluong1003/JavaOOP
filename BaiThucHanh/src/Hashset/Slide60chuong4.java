package BaiThucHanh.src.Hashset;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Slide60chuong4 {
    public static void main(String[] args) {
        String FName;
        Scanner sc = new Scanner(System.in);
        Set <String> linhHashSet = new LinkedHashSet<>();
        linhHashSet.add("Java");
        linhHashSet.add("c++");
        linhHashSet.add("java");
        linhHashSet.add("PHD");
        for( String str : linhHashSet)
        {
            System.out.println(str);
        }
        System.out.println(" Nhap ten phan tu can xoa");
        FName = sc.nextLine();
        if(linhHashSet.contains(FName) )
        {
            linhHashSet.remove(FName);
            System.out.println(" Xoa thanh cong ");
            System.out.println(" Cac phan tu con lai trong hashSetStrings la :");
            System.out.println(linhHashSet);

        }
        else
        {
           System.out.println(" Xoa khong thanh cong"); 
        }

    }
}

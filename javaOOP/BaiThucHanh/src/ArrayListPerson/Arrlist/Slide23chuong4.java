package BaiThucHanh.src.ArrayListPerson.Arrlist;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class Slide23chuong4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.print("Nhap so phan tu cua ArrayList:");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu vao ArrayList: ");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        
            int Max = arrayList.get(0);
            for( int i = 0 ; i < arrayList.size(); i++ )
            {
                if( arrayList.get(i) > Max)
                {
                    Max = arrayList.get(i);
                }
            }
            System.out.println("Phan tu lon nhat trong ArrList la " + Max);
           
         
         
    
    }
}

package BaiThucHanh.src.ArrayListPerson.Arrlist;

import java.util.ArrayList;

public class Slide21chuong4 {
    public static void main(String[] args) {
        ArrayList < String > arrayListString = new ArrayList<>();
        arrayListString.add("JAVA");
        arrayListString.add("PHP");
        arrayListString.add("C#");
        arrayListString.add("C++");
        //duyet arrlist
        System.out.print(" Cac phan tu co trong arrlist la : ");
        for( int i = 0 ;i< arrayListString.size(); i++)
        {
            System.out.print(arrayListString.get(i) + " \t");
        }
        // Trả về phần tử tại chỉ số index
        String Index1 = arrayListString.get(1); 
        System.out.println( " \n" +"phan tu vi tri index thu 1 la :  " + Index1);
        //Thay thế một phần tử tại chỉ số index bằng phần tử element
       arrayListString.set(1, "ABC");
       System.out.println("Cac phan tu co trong arrlist sau khi thay the la : ");
        for( int i = 0 ;i< arrayListString.size(); i++)
        {
            System.out.println(arrayListString.get(i) + " \t");
        }
        // Loại bỏ phần tử tại vị trí có chỉ số index
        
        System.out.print("Cac phan tu co trong danh sach sau khi loai bo la : ");
        arrayListString.remove(2);
        for( int i = 0 ;i< arrayListString.size(); i++)
        {
            System.out.print(arrayListString.get(i) + " \t");
        }   
    }
}

package BaiThucHanh.src.ArrayListPerson;
import java.util.Scanner;

public class Person {
    public String fullName;
    public int ID;
    public int age;
    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);  
        System.out.print(" Nhap ten : ");
        fullName = sc.nextLine();
        System.out.print(" Nhap tuoi : ");
        age = sc.nextInt();
        System.out.print(" Nhap msv : ");
        ID = sc.nextInt();
      
      
    }
    public void xuatThongTin()
    {
        System.out.println( " Ten :" +fullName + " \n Tuoi :" + age + " \n Ma sinh vien :" + ID);
    }
   
   
}

  


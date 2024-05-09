package BaiThucHanh.src.ArrayListPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListPerson {
  public static void main(String[] args) {

    ArrayList<Person> arrListPerson = new ArrayList<Person>();
    Scanner sc = new Scanner(System.in);
    System.out.print(" Nhap n : ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      Person ps = new Person();
      ps.nhapThongTin();
      arrListPerson.add(ps); // Thêm person
    }
    for (int i = 0; i < n; i++) {
      arrListPerson.get(i).xuatThongTin();
    }

  }

}

import java.util.LinkedList;
import java.util.Scanner;
public class Slide112 {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int number, sum = 0, cnt = 0;
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhap phan tu thu " + i + ": " );
            number = sc.nextInt();
            link.add(number);}
       
        for(int i1 = 0; i1 < link.size(); i1++)
        {
            if (link.get(i1) %2 == 0) {
                cnt++;
                sum = sum + link.get(i1);
            }
        }
        int tbc = sum/cnt;
        System.out.println("Trung binh cong = "+ tbc);
    }
}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Slide111 {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhap phan tu thu " + i + ": " );
            number = sc.nextInt();
            arrInt.add(number);
        }
        int max = arrInt.get(0);
        for(int ii = 1; ii< arrInt.size();ii++)
        {
            if(arrInt.get(ii).compareTo(max) > 0)
                max = arrInt.get(ii);
        }
        
        System.out.println("Phan tu lon nhat = " + max);
        int y;
        System.out.println("nhap phan tu can xoa: ");
        y = sc.nextInt();
        for (int i = arrInt.size()-1; i >=0; i--) {
            if(y == arrInt.get(i))
            {
                arrInt.remove(i);
                System.out.println("xoa thanh cong!");                
            }
        sc.close();
        arrInt.sort(Comparator.comparingInt( o -> o));
        System.out.println("Cac phan tu co trong day : ");
        for(int ix = 0;ix < arrInt.size();ix++)
        {   System.out.println("Phan tu thu " + ix + ": "+ arrInt.get(ix));
        }
    }
    }
}
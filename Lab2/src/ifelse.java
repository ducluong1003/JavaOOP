import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.print(" Nhap vao mot so : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (a % 2 == 0) {
            System.out.println(a + " la so chan");
        } else {
            System.out.print(a + " la so le ");
        }
    }
}
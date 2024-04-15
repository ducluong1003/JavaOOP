import java.util.Scanner;

public class ptbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap  a: ");
        double a = scanner.nextDouble();

        System.out.print("nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("nhap c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiem cua phuong trinh la: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }

        scanner.close();
    }
}
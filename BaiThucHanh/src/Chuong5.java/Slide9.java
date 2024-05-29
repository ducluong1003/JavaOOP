public class Slide9 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(" Thuc hien phep chia ");
                int b = 39 / 0;
            } catch (ArithmeticException Ex) {
                System.out.println(Ex);
            }
            try {
                int a[] = new int[5];
                a[5] = 4;

            } catch (ArrayIndexOutOfBoundsException Ex) {
                System.out.println(Ex);
            }
            System.out.println(" Khoi lenh khac");
        } catch (Exception Ex)

        {
            System.out.println(" Xu li ngoai le ");
        }
        System.out.println(" Tiep tuc chuong trinh ");
    }
}

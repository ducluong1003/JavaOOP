public class Slide11 {
    public static void main(String[] args) {
        try {
            int data = 25;
            if (data % 2 != 0) {
                System.out.println(" is odd number ");
                return;
            }

        } catch (ArithmeticException Ex)
        {
            System.out.println(Ex);
        } finally {
            System.out.println(" finaly block is always executed ");
        }
        System.out.println(" Reset of the code...");
    }
}

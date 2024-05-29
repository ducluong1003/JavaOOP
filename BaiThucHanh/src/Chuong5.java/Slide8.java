public class Slide8 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;

        }

        catch (ArithmeticException Ex) {
            System.out.println(" Take 1 hoan thanh ");

        } catch (ArrayIndexOutOfBoundsException Ex) {
            System.out.println(" Take 2 hoan thanh ");

        }

        catch (Exception Ex) {
            System.out.println(" Take 3 hoan thanh ");

        }
        System.out.println(" reset of the code ...");
    }
}

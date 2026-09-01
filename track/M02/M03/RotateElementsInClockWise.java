
public class RotateElementsInClockWise {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int[] b = new int[a.length];
        int temp = a[a.length - 1];

        for (int i = 1; i < a.length; i++) {
            b[i] = a[i - 1];

        }
        b[0] = temp;

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

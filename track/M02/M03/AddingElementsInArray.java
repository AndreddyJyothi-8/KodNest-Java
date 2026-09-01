
import java.util.Scanner;

public class AddingElementsInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 20, 40, 50};
        int[] b = new int[a.length + 1];
        int element = 90;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[b.length - 1] = element;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

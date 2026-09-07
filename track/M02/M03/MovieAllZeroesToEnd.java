
public class MovieAllZeroesToEnd {

    public static void main(String[] args) {
        int[] a = {1, 0, 0, 5, 0, 8};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                count++;
            }
        }
        int[] b = new int[a.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[index] = a[i];
                index++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}


public class NestedDoWhile {

    public static void main(String[] args) {

        int i = 1;

        do {
            int j = 1; // Inner loop variable

            do {
                System.out.println("i = " + i + ", j = " + j);
                j++;
            } while (j <= 5);

            i++;
        } while (i <= 3);
    }
}

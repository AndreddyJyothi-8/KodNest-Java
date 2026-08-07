
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter byte value: ");
        byte a = sc.nextByte();
        System.out.println("Byte value is: " + a);

        System.out.println("Enter short value: ");
        short b = sc.nextShort();
        System.out.println("Short value is: " + b);

        System.out.println("Enter int value: ");
        int c = sc.nextInt();
        System.out.println("Int value is: " + c);

        System.out.println("Enter long value: ");
        long d = sc.nextLong();
        System.out.println("Long value is: " + d);

        System.out.println("Enter float value: ");
        float e = sc.nextFloat();
        System.out.println("Float value is: " + e);

        System.out.println("Enter boolean value: ");
        boolean f = sc.nextBoolean();
        System.out.println("Boolean value is: " + f);

        System.out.println("Enter double value: ");
        Double g = sc.nextDouble();
        System.out.println("Double value is: " + g);

    }
}

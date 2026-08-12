
import java.util.Scanner;

class FourSimpleMethodTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodDemo m = new MethodDemo();
        String name = sc.next();
        m.sayHello();
        m.greet(name);
        int num = m.getLuckyNumber();
        System.out.println("Lucky num is " + num);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int sum = m.add(first, second);
        System.out.println("Sum " + sum);

    }
}

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

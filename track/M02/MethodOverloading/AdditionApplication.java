
class AdditionApplication {

    public static void main(String[] args) {
        Addition a = new Addition();
        System.err.println(a.add(10, 20));
        System.err.println(a.add(10, 20.5));
    }
}

class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    double add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    double add(int a, int b, double c) {
        return a + b + c;
    }

}

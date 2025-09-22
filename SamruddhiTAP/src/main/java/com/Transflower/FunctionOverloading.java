public class FunctionOverloading {

    // First sum method (two integers)
    public int sum(int a, int b) {
        return a + b;
    }

    // Overloaded sum method (three integers)
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded sum method (two doubles)
    public double sum(double a, double b) {
        return a + b;
    }

    // Main method (program entry point)
    public static void main(String[] args) {
        FunctionOverloading obj = new FunctionOverloading();

        System.out.println("Sum of 2 + 3 = " + obj.sum(2, 3));
        System.out.println("Sum of 1 + 2 + 3 = " + obj.sum(1, 2, 3));
        System.out.println("Sum of 2.5 + 3.5 = " + obj.sum(2.5, 3.5));
    }
}

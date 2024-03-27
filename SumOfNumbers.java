public class SumOfNumbers {
    public int sum1(int a, int b) {
        return a + b;
    }

    public double sum2(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        SumOfNumbers obj = new SumOfNumbers();

        // Calls
        System.out.println("Sum1 (int, int): " + obj.sum1(5, 10)); // sum1 is called
        System.out.println("Sum2 (double, double): " + obj.sum2(5.0, 10.0)); // sum2 is called
        System.out.println("Mixed (int, double): " + obj.sum2(5, 10.0)); // sum2 is called, int is promoted to double
    }
}

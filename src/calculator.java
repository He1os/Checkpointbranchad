
public class calculator {

    public static void main(String[] args) {
        int[] numbers = {5, 99, -1, 45, -201, -77, 175};

        double sum = calculateSum(numbers);
        System.out.println("Sum: " + sum);
    }

    private static double calculateSum(int[] doubles) {
        double total = 0.0;
        for (int i = 0; i < doubles.length; ++i) {
            double current = doubles[i];
            total += current;
        }
        return total;
    }
}

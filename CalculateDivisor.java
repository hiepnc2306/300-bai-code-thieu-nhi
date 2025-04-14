import java.util.Scanner;

public class CalculateDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long m = Long.parseLong(input[2]);

        // formula: fib(n) = 1/sqrt(5) * (((1 + sqrt(5))/2)^n - (1 - sqrt(5))/2)^n)
        long fibA = a < 2 ? a :
                (long) (1 / Math.sqrt(5) * (Math.pow(((1 + Math.sqrt(5)) / 2), a)
                        - Math.pow(((1 - Math.sqrt(5)) / 2), a)));
        long fibB = b < 2 ? b : (long) (1 / Math.sqrt(5) * (Math.pow(((1 + Math.sqrt(5)) / 2), b)
                - Math.pow(((1 - Math.sqrt(5)) / 2), b)));
        if (fibB > fibA) {
            long temp = fibA;
            fibA = fibB;
            fibB = temp;
        }
        while (true) {
            long r = fibA % fibB;
            if (r == 0) break;
            fibA = fibB;
            fibB = r;
        }
        System.out.println(fibB % m);
    }
}

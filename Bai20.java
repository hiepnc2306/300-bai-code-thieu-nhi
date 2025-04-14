import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        System.out.print("Cac uoc so: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("");
        System.out.println("Tong cac uoc: " + sum);
    }
}

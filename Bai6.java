import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 3 so a, b, c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int temp = a;
        // neu a > b => doi cho a va b
        if (a > b) {
            a = b;
            b = temp;
        }
        // neu a > c => a cho c
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("Tang dan: " + a + " " + b + " " + c);
    }
}

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a1, b1, c1: ");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap a2, b2, c2: ");
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        int D = a1 * b2 - a2 * b1;
        int Dx = c1 * b2 - c2 * b1;
        int Dy = a1 * c2 - a2 * c1;

        if (D != 0) {
            System.out.println("x = " + (float) Dx / D + ", y = " + (float) Dy / D);
        } else {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Vo so nghiem!");
            } else {
                System.out.println("Vo nghiem");
            }
        }
    }
}

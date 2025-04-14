import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Toa do diem A(xA, yA): ");
        float xA = scanner.nextFloat();
        float yA = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Toa do diem B(xB, yB): ");
        float xB = scanner.nextFloat();
        float yB = scanner.nextFloat();

        float kc = (float) Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));

        System.out.println("Khoang cach giua 2 diem A va B: " + kc);
    }
}

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float pi = 3.1415926535f;

        System.out.print("Nhap so do x cua goc(phut): ");
        float x = scanner.nextFloat();

        float degree = x / 60;
        degree = degree % 360;
        if (degree < 0) degree += 360;

        if (degree <= 90) {
            System.out.println("X thuoc goc phan tu thu 1");
        } else if (degree <= 180) {
            System.out.println("X thuoc goc phan tu thu 2");
        } else if (degree <= 270) {
            System.out.println("X thuoc goc phan tu thu 3");
        } else {
            System.out.println("X thuoc goc phan tu thu 4");
        }

        float radian = (pi / 180) * degree;
        System.out.println("cos(x) = " + Math.cos(radian));
    }
}

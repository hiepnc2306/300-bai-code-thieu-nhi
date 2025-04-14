import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ax + b = 0 => ax = -b => x = -b/a
        // a = 0 va b = 0 x co the la gia tri bat ky
        // a = 0 va b != 0 khong ton tai x
        System.out.print("Nhap a, b: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        tinhPTBN(a, b);

    }

    public static void tinhPTBN(float a, float b) {
        if (a != 0) {
            float result = -b / a;
            System.out.println("x = " + result);
        } else if (b == 0) {
            System.out.println("Thoa man voi moi gia tri cua x!");
        } else {
            System.out.println("Khong ton tai gia tri cua x thoa man dieu kien!");
        }
    }
}

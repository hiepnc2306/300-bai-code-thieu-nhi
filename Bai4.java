import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap 3 canh cua tam giac: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        if (a + b > c && b + c > a && c + a > b) {
            if (a == b && b == c) {
                System.out.println("Day la tam giac deu");
            } else if (a == b || b == c || c == a) {
                System.out.println("Day la tam giac can");
            } else {
                float a2 =(float) Math.pow(a, 2);
                float b2 =(float) Math.pow(b, 2);
                float c2 =(float) Math.pow(c, 2);
                if (a2 + b2 == c2 || b2 + c2 == a2 || c2 + a2 == b2) {
                    System.out.println("Day la tam giac vuong");
                } else {
                    System.out.println("Day la tam giac thuong");
                }
            }
            float p = (a + b + c) / 2;
            float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Dien tich cua tam giac la: " + s);
        } else {
            System.out.println("Day khong phai tam giac!");
        }
    }
}

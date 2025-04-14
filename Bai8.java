import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a, b, c: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        // a=0, b=0, c=0 luon dung voi moi x
        // a=0, b=0, c!=0 vo nghiem
        // a=0, b!=0 quay tro lai ptbn
        // a!=0, b=0, c=0 co nghiem duy nhat x=0
        // a!=0, b!=0, c=0
        // a!=0, b!=0, c!=0

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Luon dung voi moi x!");
                } else {
                    System.out.println("Vo nghiem");
                }
            } else {
                Bai7.tinhPTBN(b, c);
            }
        } else {
            if (b == 0 && c == 0) {
                System.out.println("Pt co 1 nghiem x = 0");
            } else {
                float delta = (float) Math.pow(b, 2) - 4 * a * c;
                float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Pt co 2 nghiem x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}

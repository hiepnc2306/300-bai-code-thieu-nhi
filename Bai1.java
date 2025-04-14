import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // dien tich cua mat cau: S = 4 * pi * R^2 => ban kinh: R = can bac 2 (S / (4 * pi))
        // the tich cua hình cau: V = 4/3 * pi *  R^3

        final double pi = 3.141593;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap dien tich S: ");
        double S = scanner.nextDouble();

        double R = Math.sqrt(S / (4 * pi));
        double V = (double) 4/3 * pi * Math.pow(R, 3);

        System.out.println("THe tich cua hinh cau: " + V);
    }
}

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // C den M la bao nhieu
        // so sanh CM va R
        // neu CM = R => nam tren duong tron
        // neu CM < R => nam trong duong tron
        // neu CM > R => nam ngoai duong tron
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap toa do tam C(xC, yC): ");
        float xC = scanner.nextFloat();
        float yC = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Nhap ban kinh R: ");
        float R = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Nhap toa do M(xM, yM): ");
        float xM = scanner.nextFloat();
        float yM = scanner.nextFloat();

        //cong thuc tinh khoang cach = sqrt((xM - xC)^2 + (yM - yC)^2)
        float CM = (float) Math.sqrt(Math.pow(xM - xC, 2) + Math.pow(yM - yC, 2));

        if (CM == R) {
            System.out.println("M nam tren duong tron");
        } else if (CM < R) {
            System.out.println("M nam trong duong tron");
        } else {
            System.out.println("M nam ngoai duong tron");
        }
    }
}

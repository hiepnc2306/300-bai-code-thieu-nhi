import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap toa do cac diem: ");
        System.out.print("A(xA, yA): ");
        float xA = scanner.nextFloat();
        float yA = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("B(xB, yB): ");
        float xB = scanner.nextFloat();
        float yB = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("C(xC, yC): ");
        float xC = scanner.nextFloat();
        float yC = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("M(xM, yM): ");
        float xM = scanner.nextFloat();
        float yM = scanner.nextFloat();
        scanner.close();

        // cong thuc: s = 1/2 * abs(xA * yB - xB * yA + xB * yC - xC * yB + xC * yA - xA * yC)
        // sMAB, sMBC, sMCA, sABC
        float sMAB = tinhDienTich(xM, yM, xA, yA, xB, yB);
        float sMBC = tinhDienTich(xM, yM, xB, yB, xC, yC);
        float sMCA = tinhDienTich(xM, yM, xC, yC, xA, yA);
        float sABC = tinhDienTich(xA, yA, xB, yB, xC, yC);

        if (sMAB + sMBC + sMCA > sABC) {
            System.out.println("M nam ngoai tam giac ABC");
        } else if (sMAB == 0 || sMBC == 0 || sMCA == 0) {
            System.out.println("M nam tren tam giac ABC");
        } else {
            System.out.println("M nam trong tam giac ABC");
        }
    }

    private static float tinhDienTich(float xA, float yA,
                                      float xB, float yB,
                                      float xC, float yC) {
        return (float) 1/2 * Math.abs(xA * yB - xB * yA + xB * yC - xC * yB + xC * yA - xA * yC);
    }
}

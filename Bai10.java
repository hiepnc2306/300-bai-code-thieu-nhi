import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("SIN (0 de thoat): ");
            String[] sinArr = scanner.nextLine().split("");
            if (sinArr.length == 1 && Integer.parseInt(sinArr[0]) == 0) {
                return;
            }
            checkInsuranceNumber(sinArr);
        }


    }

    public static void checkInsuranceNumber(String[] sinArr) {
        if (sinArr.length != 9) {
            System.out.println("SIN khong hop le");
        } else {
            int trongso = Integer.parseInt(sinArr[8]);
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    trongso += Integer.parseInt(sinArr[i]);
                } else {
                    int doubled = Integer.parseInt(sinArr[i]) * 2;
                    trongso = trongso + doubled / 10 + doubled % 10;
                }
            }
            if (trongso % 10 == 0) {
                System.out.println("SIN hop le");
            } else {
                System.out.println("SIN khong hop le");
            }
        }
    }
}

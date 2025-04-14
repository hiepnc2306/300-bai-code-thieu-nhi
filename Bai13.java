import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay, thang va nam: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if (year < 0) {
            System.out.println("Nam khong hop le");
            return;
        }
        if (month < 1 || month > 12) {
            System.out.println("Ngay thang khong hop le!");
            return;
        }
        int lastDayOfMonth = getLastDayOfMonth(month, year);

        if (day < 1 || day > lastDayOfMonth) {
            System.out.println("Ngay thang khong hop le");
        } else {
            month = month > 2 ? month : month + 12;
            int K = year % 100;
            int J = year / 100;
            int h = (day + ((13 * (month + 1)) / 5) + K + (K / 4) + (J / 4) - (2 * J)) % 7;
            System.out.println("h = " + h);
            switch (h) {
                case 0:
                    System.out.println("Thu bay");
                    break;
                case 1:
                    System.out.println("Chu nhat");
                    break;
                case 2:
                    System.out.println("Thu hai");
                    break;
                case 3:
                    System.out.println("Thu ba");
                    break;
                case 4:
                    System.out.println("Thu tu");
                    break;
                case 5:
                    System.out.println("Thu nam");
                    break;
                case 6:
                    System.out.println("Thu sau");
                    break;
            }
        }
    }

    public static int getLastDayOfMonth(int month, int year) {
        int lastDayOfMonth;
        boolean nhuan = (year % 4 == 0 && year % 100 == 0) || (year % 400 == 0);
        lastDayOfMonth = switch (month) {
            case 2 -> nhuan ? 29 : 28;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> 30;
        };
        return lastDayOfMonth;
    }
}

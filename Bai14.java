import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ngay thang nam: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        printTomorrow(day, month, year);
        printYesterday(day, month, year);
    }

    public static void printTomorrow(int day, int month, int year) {
        final int lastMonthOfYear = 12;
        int lastDayOfMonth = Bai13.getLastDayOfMonth(month, year);
        System.out.print("Ngay mai: ");
        if (day == lastDayOfMonth) {
            if (month == lastMonthOfYear) {
                printDate(1, 1, year + 1);
            } else {
                printDate(1, month + 1, year);
            }
        } else {
            printDate(day + 1, month, year);
        }
    }

    public static void printYesterday(int day, int month, int year) {
        final int firstDayOfMonth = 1;
        final int firstMonthOfYear = 1;
        System.out.print("Hom qua: ");
        if (day == firstDayOfMonth) {
            if (month == firstMonthOfYear) {
                printDate(31, 12, year - 1);
            } else {
                printDate(Bai13.getLastDayOfMonth(month - 1, year), month - 1, year);
            }
        } else {
            printDate(day - 1, month, year);
        }
    }

    public static void printDate(int day, int month, int year) {
        System.out.println(day + "/" + month + "/" + year);
    }
}

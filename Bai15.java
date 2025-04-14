import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ngay thang nam: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        int dayOfYear = calculateDayOfYear(day, month, year);
        System.out.println("Day la ngay thu: " + dayOfYear + " cua nam!");
    }

    public static int calculateDayOfYear(int day, int month, int year) {
        int dayOfYear = day;
        if (month == 1) {
            return day;
        } else {
            for (int i = 1; i < month; i++) {
                dayOfYear += Bai13.getLastDayOfMonth(i, year);
            }
            return dayOfYear;
        }
    }
}

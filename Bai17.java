import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gio phut giay 1: ");
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int second1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap gio phut giay 2: ");
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int second2 = scanner.nextInt();

        int time1 = (hour1 * 60 * 60) + (minute1 * 60) + second1;
        int time2 = (hour2 * 60 * 60) + (minute2 * 60) + second2;

        int time = Math.abs(time1 - time2);
        int hour = time / (60 * 60);
        int minute = time % (60 * 60) / 60;
//        int second = time % (60 * 60) % 60;
        int second = time - (hour * 60 * 60) - (minute * 60);

        System.out.println("Hieu thoi gian: " + hour + " gio, " + minute + " phut, " + second + " giay.");
    }
}

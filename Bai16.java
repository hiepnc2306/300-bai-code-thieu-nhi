import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        final int hoursInWeek = 24 * 7;
        final int hoursInDay = 24;

        int numberWeek = hours / hoursInWeek;
        int numberDay = (hours % hoursInWeek) / hoursInDay;
        int remainHours = (hours % hoursInWeek) % hoursInDay;

        System.out.println(numberWeek + " tuan, " + numberDay + " ngay, " + remainHours + " gio.");
    }
}

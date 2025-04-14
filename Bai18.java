import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tu 0 kW : 500đ/kW
        // tu 100 kW - 250kW = tu 0 + 300đ/kW
        // tu 250kW - 350kW = tu 100 + 200đ/kW
        // tu 350kW = tu 250 + 500đ/kW

        System.out.print("Nhap so kW tieu thu: ");
        int inp = scanner.nextInt();

        int money = inp * 500;
        if (inp > 100) money += (inp - 100) * 300;
        if (inp > 250) money += (inp - 250) * 200;
        if (inp > 350) money += (inp - 350) * 500;

        System.out.println("Chi phi: " + money);
    }
}

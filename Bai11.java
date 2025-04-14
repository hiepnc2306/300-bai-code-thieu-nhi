import java.util.Random;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final char[] chars = {'b', 'd', 'k'};

        int humanResul = 0, computerResult = 0;

        while (true) {
            System.out.print("Nhap ky tu (b-d-k), nhap ky tu khac de thoat: ");
            String inp = scanner.nextLine();

            if (inp.length() != 1) return;
            boolean isValid = inp.charAt(0) == 'b' || inp.charAt(0) == 'd' || inp.charAt(0) == 'k';
            if (!isValid) return;

            char computerChoice = chars[random.nextInt(chars.length)];
            char humanChoice = inp.charAt(0);
            System.out.println("Computer: " + computerChoice);

            if (computerChoice == humanChoice) {
                System.out.println("Ty so human - computer: " + humanResul + " - " + computerResult);
                continue;
            }

            if ((humanChoice == 'b' && computerChoice == 'd') ||
                    (humanChoice == 'd' && computerChoice == 'k') ||
                    (humanChoice == 'k' && computerChoice == 'b')) {
                humanResul += 1;
            } else {
                computerResult += 1;
            }

            System.out.println("Ty so human - computer: " + humanResul + " - " + computerResult);
        }
    }
}

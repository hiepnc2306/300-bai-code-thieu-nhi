import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GiveCandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();
        List<Integer> student = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();
        Integer[] studentArr = student.toArray(new Integer[0]);
        for (int i = 0; i < n; i++) {
            List<Integer> action = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt).toList();
            if (action.get(0) == 1) {
                studentArr[action.get(1)] = action.get(2);
            } else if (action.get(0) == 2) {
                long result = 0;
                for (int j = action.get(1); j < action.get(2); j++) {
                    
                }
            }
        }
    }

    protected final void printGiveCandy() {
        System.out.println("Give candy");
    }
}

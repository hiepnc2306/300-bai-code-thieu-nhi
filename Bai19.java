import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final HashMap<String, Float> danhSachKhuVuc = new HashMap<>(
                Map.of("A", 2F,
                        "B", 1F,
                        "C", 0.5F)
        );
        final HashMap<Integer, Float> danhSachDoiTuong = new HashMap<>(
                Map.of(1, 2.5F,
                        2, 1.5F,
                        3, 1F)
        );

        System.out.print("Nhap diem chuan: ");
        float diemChuan = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Nhap diem 3 mon thi: ");
        float diemToan = scanner.nextFloat();
        float diemLy = scanner.nextFloat();
        float diemHoa = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Nhap khu vuc(A, B, C): ");
        String khuVuc = scanner.nextLine();

        System.out.print("Nhap doi tuong(1, 2, 3): ");
        int doiTuong = scanner.nextInt();

        if (diemToan == 0 || diemLy == 0 || diemHoa == 0) {
            System.out.println("Rot [Co 1 mon 0 diem]");
        } else {
            float diemKhuVuc = danhSachKhuVuc.getOrDefault(khuVuc, 0F);
            float diemDoiTuong = danhSachDoiTuong.getOrDefault(doiTuong, 0F);
            float tongDiem = diemToan + diemLy + diemHoa + diemKhuVuc + diemDoiTuong;

            if (tongDiem >= diemChuan) {
                System.out.println("Trung tuuyen [" + tongDiem + "]");
            } else {
                System.out.println("Rot [" + tongDiem + "]");
            }
        }
    }
}

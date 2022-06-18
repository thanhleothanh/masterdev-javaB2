import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int y1, m1, d1, y2, m2, d2;

        try {
            System.out.println("Tính số ngày từ y2/m2/d2 đến y1/m1/d1!");
            System.out.println("Nhập năm, tháng, ngày 1 (y1/m1/d1): ");
            System.out.print("y1: ");
            y1 = inputScanner.nextInt();
            System.out.print("m1: ");
            m1 = inputScanner.nextInt();
            System.out.print("d1: ");
            d1 = inputScanner.nextInt();
            LocalDate localdate1 = LocalDate.of(y1, m1, d1);
            String date1 = localdate1.toString();

            System.out.println("Nhập năm, tháng, ngày 2 (y2/m2/d2): ");
            System.out.print("y2: ");
            y2 = inputScanner.nextInt();
            System.out.print("m2: ");
            m2 = inputScanner.nextInt();
            System.out.print("d2: ");
            d2 = inputScanner.nextInt();
            LocalDate localdate2 = LocalDate.of(y2, m2, d2);
            String date2 = localdate2.toString();

            System.out.println("Khoảng cách từ ngày " + date2 + " đến " + date1 + " là: " + localdate2.datesUntil(localdate1).count() + " ngày!");
        } catch (Exception e) {
            System.out.println("Vui lòng nhập ngày tháng năm chính xác! và đảm bảo y1/m1/d1 > y2/m2/d2!");
        }
        inputScanner.close();

    }
}

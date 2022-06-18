import java.time.Month;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        bai1.bai1WithEnum();
//        bai1.bai1WithoutEnum();
    }

    public void bai1WithoutEnum() {
        System.out.println("Chọn 1 tháng để xem số ngày: ");
        for (int i = 1; i < 13; i++) {
            System.out.println(i + ". Tháng " + i);
        }
        Scanner inputScanner = new Scanner(System.in);
        int inputMonth = inputScanner.nextInt();
        switch (inputMonth) {
            case 2:
                System.out.println("Tháng " + inputMonth + " có 28 ngày!");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Tháng " + inputMonth + " có 31 ngày!");
                break;
            case 4, 6, 9, 11:
                System.out.println("Tháng " + inputMonth + " có 30 ngày!");
                break;
            default:
                System.out.println("Yêu cầu nhập đúng tháng!");
                break;
        }
        inputScanner.close();
    }

    public void bai1WithEnum() {
        System.out.println("Chọn 1 tháng để xem số ngày: ");
        for (int i = 1; i < 13; i++) {
            System.out.println(i + ". Tháng " + i);
        }
        Scanner inputScanner = new Scanner(System.in);
        int inputMonth = inputScanner.nextInt();
        switch (inputMonth) {
            case 2:
                System.out.println("Tháng " + inputMonth + " có " + Month.FEBRUARY.minLength() + " ngày!");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Tháng " + inputMonth + " có " + Month.JANUARY.minLength() + " ngày!");
                break;
            case 4, 6, 9, 11:
                System.out.println("Tháng " + inputMonth + " có " + Month.APRIL.minLength() + " ngày!");
                break;
            default:
                System.out.println("Yêu cầu nhập đúng tháng!");
                break;
        }
        inputScanner.close();
    }
}
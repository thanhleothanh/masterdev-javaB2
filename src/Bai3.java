public class Bai3 {
    public static void main(String[] args) {
        Bai3 bai3 = new Bai3();
        bai3.usingForLoop();
//        bai3.usingDoWhileLoop();
//        bai3.usingWhileLoop();
    }

    private void usingForLoop() {
        int tong = 0;
        for (int i = 0; i < 10001; i++) {
            if (isNguyento(i)) {
                tong += i;
            }
        }
        System.out.println(tong);
    }

    private void usingWhileLoop() {
        int i = 0;
        int tong = 0;
        while (i++ < 10001) {
            if (isNguyento(i)) {
                tong += i;
            }
        }
        System.out.println(tong);
    }

    private void usingDoWhileLoop() {
        int i = 0;
        int tong = 0;
        do {
            if (isNguyento(i)) {
                tong += i;
            }
        } while (i++ < 10001);
        System.out.println(tong);
    }

    private boolean isNguyento(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
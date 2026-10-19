
import java.util.Scanner;

public class TongSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int tong = 0;

        while (tong <= 50) {
            System.out.print("Nhap mot so nguyen: ");
            n = sc.nextInt();

            tong += n;
        }

        System.out.println("Tong cac so da nhap la: " + tong);
        System.out.println("Tong da lon hon 50. Ket thuc chuong trinh!");

        sc.close();
    }
}

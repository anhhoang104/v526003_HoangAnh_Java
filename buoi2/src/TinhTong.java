
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int S = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
            S += a[i];
        }

        System.out.println("Tong cac phan tu trong mang la: " + S);

        sc.close();
    }
}

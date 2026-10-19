
import java.util.Scanner;

public class PhanTuMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        int max = a[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, a[i]);
        }

        System.out.println("Phan tu lon nhat la: " + max);

        sc.close();
    }
}

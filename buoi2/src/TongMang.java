
import java.util.Scanner;

public class TongMang {

    public static int[] tinhTongMang(int[] a, int[] b) {
        int n = Math.max(a.length, b.length);
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            int x = 0;
            int y = 0;

            if (i < a.length) {
                x = a[i];
            }

            if (i < b.length) {
                y = b[i];
            }

            c[i] = x + y;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu mang a: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Nhap so phan tu mang b: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = sc.nextInt();
        }

        int[] c = tinhTongMang(a, b);

        System.out.print("Mang tong: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}

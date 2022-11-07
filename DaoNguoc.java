import java.util.Scanner;

public class DaoNguoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai cua mang: ");
        int n = sc.nextInt();
        String[] mang = new String[n];
        String[] mang1 = new String[n];
        for (int i = 0; i < mang.length; i++){
            mang[i] = sc.next();
        }
        for (int i = 0; i < mang.length; i++){
            mang1[i] = mang[mang.length-(i+1)];
        }
        System.out.println("Mang 1: ");
        for (int i = 0; i < mang.length; i++){
            System.out.print(mang1[i] + " ");
        }
    }

}

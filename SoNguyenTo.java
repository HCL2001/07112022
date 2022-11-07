import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        int a = sc.nextInt();
        int n = 0;
        for (int i = 1; i <= a ;i++){
            if (a % i == 0){
                n++;
            }
        }
        if (n == 2){
            System.out.println(a + " la so nguyen to");
        }else
            System.out.println(a + " khong phai la so nguyen to");
    }
}

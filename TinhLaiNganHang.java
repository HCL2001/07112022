import java.util.Scanner;

public class TinhLaiNganHang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so tien gui: ");
        int a = input.nextInt();
        System.out.print("Nhap vao lai xuat: ");
        int b = input.nextInt();
        System.out.print("Nhap vao so thang gui: ");
        int c =input.nextInt();
        int d = a * b / 12 * c;
        System.out.println("So tien lai la: " + d);
    }
}

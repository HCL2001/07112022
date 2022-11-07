import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        int a = input.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.print("Hai so " + a + " va " + b + " deu khong co uoc chung lon nhat");
        }
        while (a != b){
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Uoc chung lon nhat la: " + a);
    }
}

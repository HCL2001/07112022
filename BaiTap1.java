import java.util.Scanner;

public class BaiTap1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu rong: ");
        int weight = sc.nextInt();
        System.out.print("Nhap vao chieu dai: ");
        int height = sc.nextInt();
        drawRectangle(weight, height);
        squareTriangel(5);
        isoscelesTriangle(5);
    }
    public static void drawRectangle(int w, int h){
        for (int i = 0; i < w; i++){
            for (int j = 0; j < h; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void squareTriangel(int g){
        System.out.println("Hinh 1");
        for (int i = 0; i <= g; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hinh 2");
        for (int i = 0; i <= g; i++){
            for (int j = g; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Hinh 3");
        for (int i = 0; i <= g; i++){
            for (int j = g; j >= i; j--){
                System.out.print(" ");
                if (i == j) {
                    for (int k = 0; k <= i; k++){
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Hinh 4");
        for (int i = g; i >= 1; i--){
            for (int j = g; j >= 1; j--){
                if (j == i){
                    for (int k = 1; k <= i; k++){
                        System.out.print("*");
                    }
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void isoscelesTriangle(int dai){
        for (int i = 0; i < dai; i++){
            int j;
            //Thêm vòng lặp này để đặt khoảng cách ở trước mỗi hàng
            for(j = i; j < dai; j++){
                System.out.print(" ");
            }
            for(j = dai-i; j < dai; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

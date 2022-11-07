import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        long number = Long.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int count = 0;
        for (int i = 1; i < number; i++){
            if (count < 20){
                for (int j = 1; j <= i; j++){
                    if (i % j == 0)
                        n++;
                }if (n == 2){
                    System.out.print(i + " ");
                    count++;
                }
                n = 0;
            }else
                break;
        }
    }
}

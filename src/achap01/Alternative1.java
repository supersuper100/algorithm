package achap01;

import java.util.Scanner;
public class Alternative1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출렵합니다.");
        do{
            System.out.println("n값 : ");
            n = stdIn.nextInt();

        }while (n <= 0);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.println("+");
            else
                System.out.println("-");
        }
    }
}

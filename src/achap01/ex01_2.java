package achap01;
import java.util.Scanner;

public class ex01_2 {
    static int min3(int a, int b, int c){
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b, c;
        System.out.println("3개의 정수의 최솟값");
        System.out.print("a : "); a = stdIn.nextInt();
        System.out.print("a : "); b = stdIn.nextInt();
        System.out.print("a : "); c = stdIn.nextInt();

        int min = min3(a, b, c);
        System.out.println("최솟값은 : " + min + "입니다");
    }

}

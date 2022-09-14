import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите гб:");
        long gb = new Scanner(System.in).nextLong();
        long mb = 1024 * gb;
        long b = 1024 * mb;

        System.out.println("B " + gb + " гигабайтах " + mb + " мегабайт, или " + b + " байт");


    }

}

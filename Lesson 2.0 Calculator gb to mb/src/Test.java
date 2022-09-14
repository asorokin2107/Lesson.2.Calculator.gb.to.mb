import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите гб:");
        long gb = new Scanner(System.in).nextLong();
        int meaning = 1024;
        long mb = meaning * gb;
        long b = meaning * mb;

        System.out.println("B " + gb + " гигабайтах " + mb + " мегабайт, или " + b + " байт");


    }

}

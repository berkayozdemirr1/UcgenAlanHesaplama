import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, x, cevre, alan;
        Scanner kenar = new Scanner(System.in);
        System.out.print("1. Kenari Giriniz : ");
        a = kenar.nextDouble();
        System.out.print("2. Kenari Giriniz : ");
        b = kenar.nextDouble();
        System.out.print("3. Kenari Giriniz : ");
        c = kenar.nextDouble();

        x = (a+b+c)/2;
        cevre = (2*x);

        alan = Math.sqrt((x*((x-a)*(x-b)*(x-c))));
        System.out.print("Ucgenin Alani : "+ alan);

    }
}

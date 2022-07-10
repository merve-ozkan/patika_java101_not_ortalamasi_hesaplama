package odevler;
import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        double a,b,c,u,alan;
        Scanner kenar = new Scanner(System.in);
        System.out.print("1.Kenar: ");
        a = kenar.nextDouble();
        System.out.print("2.Kenar: ");
        b = kenar.nextDouble();
        System.out.print("3.Kenar: ");
        c = kenar.nextDouble();
        u = (a+b+c)/2;
        alan = Math.sqrt(((u*(u-a)*(u-b)*(u-c))));
        System.out.println("Üçgenin alanı: " + alan);
    }
}

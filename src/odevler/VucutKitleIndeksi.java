package odevler;
import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner kg = new Scanner(System.in);
        System.out.print("kilonuzu giriniz: ");
        double kilo = kg.nextDouble();
        Scanner metre = new Scanner(System.in);
        System.out.print("boyunuzu giriniz: ");
        double boy = metre.nextDouble();
        double vucutKitleIndeksi = kilo/(boy*boy);
        System.out.println("vucut kitle indeksiniz: " + vucutKitleIndeksi);
    }
}

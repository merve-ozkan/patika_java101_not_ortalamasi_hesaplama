package odevler;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double acilisUcreti = 10, km, kmUcreti = 2.20;
        Scanner ucret = new Scanner(System.in);
        System.out.println("Mesafeyi Giriniz: ");
        km = ucret.nextDouble();
        double toplam = (acilisUcreti+km*kmUcreti);
        System.out.println("Odenecek Tutar: " + (toplam <= 20 ? 20:toplam));
    }

}

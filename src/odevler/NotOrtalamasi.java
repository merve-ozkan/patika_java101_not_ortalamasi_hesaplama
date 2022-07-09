package odevler;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int matematikNotu;
        Scanner mat = new Scanner(System.in);
        System.out.println("Matematik Notunu Giriniz:");
        matematikNotu = mat.nextInt();

        int fizikNotu;
        Scanner fiz = new Scanner(System.in);
        System.out.println("Fizik Notunu Giriniz:");
        fizikNotu = fiz.nextInt();

        int kimyaNotu;
        Scanner kim = new Scanner(System.in);
        System.out.println("Kimya Notunu Giriniz:");
        kimyaNotu = kim.nextInt();

        int turkceNotu;
        Scanner turk = new Scanner(System.in);
        System.out.println("Türkçe Notunu Giriniz:");
        turkceNotu = turk.nextInt();

        int tarihNotu;
        Scanner tar = new Scanner(System.in);
        System.out.println("Tarih Notunu Giriniz:");
        tarihNotu = tar.nextInt();

        int muzikNotu;
        Scanner muz = new Scanner(System.in);
        System.out.println("Müzik Notunu Giriniz:");
        muzikNotu =muz.nextInt();

        double ortalama = ((matematikNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu) / 6);
        System.out.println("Ortalamanız: " + ortalama );
        System.out.println( ortalama >= 60 ? "Sınıfı Geçti":"Sınıfta Kaldı");










    }
}

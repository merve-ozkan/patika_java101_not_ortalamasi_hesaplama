package odevler;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplam;
        double armutKg= 2.14, elmaKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patlicanKg = 5;
        Scanner kg = new Scanner(System.in);
        System.out.println("armut kac kilo? : ");
        armut = kg.nextDouble();
        System.out.println("elma kac kilo? : ");
        elma = kg.nextDouble();
        System.out.println("domates kac kilo? : ");
        domates = kg.nextDouble();
        System.out.println("muz kac kilo? : ");
        muz = kg.nextDouble();
        System.out.println("patlican kac kilo? : ");
        patlican = kg.nextDouble();
        toplam = (armut*armutKg) + (elma*elmaKg) + (domates*domatesKg) + (muz*muzKg) + (patlican*patlicanKg);
        System.out.println("toplam tutar: " + toplam);
    }
}

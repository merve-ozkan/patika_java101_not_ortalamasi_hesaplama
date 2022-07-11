package odevler;
import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {
        double r, pi = 3.14, merkezAci, daireDilimiAlani;
        Scanner yaricap = new Scanner(System.in);
        System.out.print("yaricapi giriniz: ");
        r = yaricap.nextDouble();
        Scanner aci = new Scanner(System.in);
        System.out.print("merkez acinin olcusunu giriniz: ");
        merkezAci = aci.nextDouble();
        daireDilimiAlani = (pi*(r*r)*merkezAci)/360;
        System.out.println(daireDilimiAlani);
    }
}

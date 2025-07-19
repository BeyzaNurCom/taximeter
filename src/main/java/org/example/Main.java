package org.example;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        double a,b,c;
        System.out.println("KM giriniz: ");
        System.out.println("(Küsüratlı ise virgül kullanınız.)");
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = 10 + (2.2*a);
        c = (b>20) ? b:20;
        System.out.println("Taksimetre: " + c );

    }

}
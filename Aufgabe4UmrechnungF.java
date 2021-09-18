import java.util.Scanner;

public class Aufgabe4UmrechnungF{
    public static void main(String[] args) {
        //Deklarieren
        double temperatur;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Temperatur in Celsius eingeben: ");
        temperatur = sc.nextDouble();

        //Rechnung
        double fahrenheit= 9.0/5.0*temperatur+32;

        System.out.println("Temperatur in Celsius: "+ temperatur);
        System.out.println("\n");
        System.out.println(temperatur + " Grad Celsius sind " + fahrenheit + " Grad Fahrenheit ; )");

        
    }
}
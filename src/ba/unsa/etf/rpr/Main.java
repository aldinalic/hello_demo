package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    private static boolean djeljiviSaSumomCif (int x) {

        int temp = x, suma = 0;
        while (temp != 0) {
            suma += temp%10;
            temp/=10;
        }
        return x % suma == 0;   // ovo je bolje nego if(x%suma == 0) return true, else return false
    }
    public static void main(String[] args) {

        int n;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n = ulaz.nextInt();

        for (int i = 1; i < n; i++) {
            if (djeljiviSaSumomCif(i)) System.out.print(i + ", ");
        }
        System.out.println("\nSve je proslo OK");
    }
}

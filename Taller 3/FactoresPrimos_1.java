import java.util.ArrayList;
import java.util.Scanner;

public class FactoresPrimos_1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        int num = n;
        ArrayList<Integer> factors = new ArrayList<>();

        int i = 2;

        while (num > 1) {
            if (num % i == 0) {
                factors.add(i);
                num = num / i;
            } else {
                i = i + 1;
            }
        }

        System.out.println("Factores primos de " + n + ": " + factors);
    }
}

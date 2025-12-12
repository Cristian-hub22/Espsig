import java.util.Scanner;

public class CombiPermu_2 {

    public static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static long permutacion(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static long combinacion(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Ingrese r: ");
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("Error: r no puede ser mayor que n.");
        } else {
            System.out.println("Permutación P(n,r): " + permutacion(n, r));
            System.out.println("Combinación C(n,r): " + combinacion(n, r));
        }
    }
}

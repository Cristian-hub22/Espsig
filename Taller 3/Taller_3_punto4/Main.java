public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("Firulais");
        Perro p2 = new Perro("Max");
        Perro p3 = new Perro("Luna");

        Gato g1 = new Gato("Horus");
        Gato g2 = new Gato("Bola de Nieve");
        Gato g3 = new Gato("Kira");


        System.out.println("--- PERROS ---");
        p1.ladrar(10);
        p1.caminar(3);

        p2.ladrar(3);
        p2.caminar(2);

        p3.ladrar(7);
        p3.caminar(4);

        System.out.println("\n--- GATOS ---");
        g1.maullar(true);
        g1.comer(3);

        g2.maullar(false);
        g2.comer(2);

        g3.maullar(true);
        g3.comer(1);
    }
}

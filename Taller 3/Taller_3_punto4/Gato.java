public class Gato {
    String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public void comer(int porciones) {
        while (porciones > 0) {
            System.out.println(nombre + " comió una porción. Restan: " + porciones);
            porciones--;
        }
        System.out.println(nombre + " ya está lleno.");
    }

    public void maullar(boolean quiereComida) {
        if (quiereComida) {
            System.out.println(nombre + " está maullando por comida.");
        } else {
            System.out.println(nombre + " está tranquilo.");
        }
    }
}

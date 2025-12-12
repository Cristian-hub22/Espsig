public class Perro {
    String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }


    public void ladrar(int energia) {
        if (energia > 5) {
            System.out.println(nombre + " está ladrando.");
        } else {
            System.out.println(nombre + " está muy cansado para ladrar.");
        }
    }
    public void caminar(int pasos) {
        for (int i = 1; i <= pasos; i++) {
            System.out.println(nombre + " dio el paso " + i);
        }
    }
}

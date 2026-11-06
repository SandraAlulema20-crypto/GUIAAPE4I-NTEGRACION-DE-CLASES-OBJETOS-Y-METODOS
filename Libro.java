public class Libro {
    String titulo;
    boolean disponible;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true; // al inicio está disponible
    }

    // Retorna true si el libro estaba disponible y se prestó
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponible = true;
    }
}

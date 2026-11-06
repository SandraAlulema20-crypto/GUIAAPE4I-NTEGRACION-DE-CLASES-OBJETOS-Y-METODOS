public class Main1 {
    public static void main(String[] args) {
        Autor a1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("Jorge Icaza", "Ecuatoriano");

        Libro l1 = new Libro1("Cien años de soledad", 1967, a1);
        Libro l2 = new Libro1("Huasipungo", 1934, a2);

        l1.mostrarInformacion();
        l2.mostrarInformacion();
    }
}
public class Libros {
    String titulo;
    int anio;
    Autor autor; // objeto como atributo

    public Libros (String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Autor: " + autor.nombre
                + " (" + autor.nacionalidad + ")");
        System.out.println("---------------------------");
    }
}
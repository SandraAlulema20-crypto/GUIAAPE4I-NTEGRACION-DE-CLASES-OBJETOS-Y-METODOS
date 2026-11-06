class Usuario {
    String nombre;
    String cedula;

    Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
}

class Libro {
    String titulo;
    boolean disponible = true;

    Libro(String titulo) {
        this.titulo = titulo;
    }

    boolean prestar() {
        if (disponible == true) {
            disponible = false;
            return true;
        } else {
            return false;
        }
    }

    void devolver() {
        disponible = true;
    }
}

class Prestamo {
    Usuario usuario;
    Libro libro;

    Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    void registrar() {
        boolean resultado = libro.prestar();
        if (resultado == true) {
            System.out.println("Prestamo exitoso: " + usuario.nombre
                    + " se llevo el libro " + libro.titulo);
        } else {
            System.out.println("Prestamo fallido: " + usuario.nombre
                    + " no pudo llevarse el libro " + libro.titulo
                    + " porque ya esta prestado");
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Maria Perez", "1805123456");
        Usuario u2 = new Usuario("Carlos Gomez", "1804987654");
        Libro libro = new Libro("Don Quijote");

        Prestamo p1 = new Prestamo(u1, libro);
        Prestamo p2 = new Prestamo(u2, libro);

        p1.registrar();
        p2.registrar();

        libro.devolver();
        System.out.println("El libro fue devuelto");
        p2.registrar();
    }
}
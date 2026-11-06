public class Main3 {
    public static void main(String[] args) {
        Producto p = new Producto("Laptop", 750.0, 5);
        p.mostrarProducto();

        System.out.println("\n--- Venta de 2 unidades ---");
        new Venta(2).aplicar(p);
        p.mostrarProducto();

        System.out.println("\n--- Venta de 10 unidades ---");
        new Venta(10).aplicar(p);
        p.mostrarProducto();
    }
}

public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Solo reduce el stock si hay unidades suficientes
    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio
                + " | Stock: " + stock);
    }
}
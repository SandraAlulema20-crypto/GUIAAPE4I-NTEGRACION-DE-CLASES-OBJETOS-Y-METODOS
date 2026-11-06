public class Venta {
    int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    // Recibe un objeto Producto como parámetro
    public void aplicar(Producto producto) {
        int stockAntes = producto.stock;
        producto.reducirStock(cantidad);

        // Si el stock bajó, la venta se realizó
        if (producto.stock < stockAntes) {
            double total = cantidad * producto.precio;
            System.out.println("Venta realizada. Total a pagar: $" + total);
        }
    }
}

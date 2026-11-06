public class Main4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Ana", 500.0);
        Cuenta c2 = new Cuenta("Luis", 200.0);

        System.out.println("--- Estado inicial ---");
        c1.mostrar();
        c2.mostrar();

        System.out.println("\n--- Transferencia válida ---");
        c1.transferir(c2, 150.0);

        System.out.println("\n--- Transferencia que falla ---");
        c1.transferir(c2, 1000.0);

        System.out.println("\n--- Estado final ---");
        c1.mostrar();
        c2.mostrar();
    }
}

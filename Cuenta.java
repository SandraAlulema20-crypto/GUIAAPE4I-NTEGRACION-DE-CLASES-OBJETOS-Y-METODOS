public class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    // Retorna true si el retiro se pudo realizar
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    // Recibe otro objeto Cuenta como parámetro
    public void transferir(Cuenta destino, double monto) {
        if (retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia exitosa de $" + monto
                    + " de " + titular + " a " + destino.titular);
        } else {
            System.out.println("Transferencia fallida: fondos "
                    + "insuficientes en la cuenta de " + titular);
        }
    }

    public void mostrar() {
        System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
    }
}

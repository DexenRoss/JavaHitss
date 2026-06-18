package clases;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Emilio",45000);
        //cuenta.titular = "Emilio";
        cuenta.depositar(3000);
        cuenta.mostrarSaldo();
        System.out.println("======Cuena 2=====");
        CuentaBancaria cuenta2 = new CuentaBancaria("Juan Perez", 1500);
        //cuenta2.titular = "juan Perez";
        //cuenta2.saldo = 1500;
        cuenta2.mostrarSaldo();
        cuenta2.depositar(2500);
        cuenta2.mostrarSaldo();
        cuenta2.retirar(1000);
        cuenta2.mostrarSaldo();
    }
}

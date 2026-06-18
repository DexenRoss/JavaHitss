package clases;

public class CuentaBancaria {
    String titular;
    double saldo;

    
    // 1. Constructor o varios
    CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;

    }

    // 2 Metodos de logica
    //metodos --> alcance | tipo de retorno | nombre de la funcion | parametros a pasar (Si es necesario) fun(tipo nombre, tipo nombre)
    public void depositar(double dinero){
        saldo += dinero;
    }

    public void retirar(double dinero){
        if (dinero <= saldo) {
            saldo -= dinero;    
        } else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Titular: "+titular);
        System.out.println("Saldo $: "+saldo);
    }
}

package br.com.testeTdd.Entity;

public abstract class  Conta {

    private int numero;
    protected double saldo;
//    private boolean ativa;

    public Conta(int numero) {
        this.numero = numero;
    }

    //Get e set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos
    public void depositar (double valor){
        if (valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo indisponível");
        }
    }
}

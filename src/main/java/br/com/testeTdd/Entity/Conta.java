package br.com.testeTdd.Entity;

public abstract class  Conta {

    private int numero;
    private double saldo;
    private boolean ativa;

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

    //Metodos
    public void depositar (double valor){
        saldo += valor;
    }

    public void sacar (double valor){
        saldo += valor;
    }
}

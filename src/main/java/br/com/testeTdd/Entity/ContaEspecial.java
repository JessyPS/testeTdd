package br.com.testeTdd.Entity;

public class ContaEspecial extends Conta {

    public ContaEspecial(int numero) {
        super(numero);
    }

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}

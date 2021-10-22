package br.com.testeTdd.Entity;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void usarLimite (double valor){

        limite -= valor;
        super.depositar(valor);
    }

    @Override
        public void depositar (double valor){
        double taxa = (saldo*0.002); //taxa especificada para os processos de conta especial
        super.sacar(taxa);
        super.depositar(valor);
    }

//    public void setSaldo(double saldo) {
//        super.setSaldo(saldo);
//    }

}

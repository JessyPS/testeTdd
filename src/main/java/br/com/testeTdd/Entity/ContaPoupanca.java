package br.com.testeTdd.Entity;

public class ContaPoupanca extends Conta {

    private int diaAniversarioConta;

    public ContaPoupanca(int numero, int diaAniversarioConta) {
        super(numero);
        this.diaAniversarioConta = diaAniversarioConta;
    }

    public int getDiaAniversarioConta() {
        return diaAniversarioConta;
    }

    public void setDiaAniversarioConta(int diaAniversarioConta) {
        this.diaAniversarioConta = diaAniversarioConta;
    }

    public void correcao (int dia){
        if (dia == diaAniversarioConta) {
            super.depositar(super.getSaldo()*0.005);
        }
    }
}

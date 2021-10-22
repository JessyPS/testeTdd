package br.com.testeTdd;

import br.com.testeTdd.Entity.ContaPoupanca;
import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void PoupancaTeste(){

        //cenario
        ContaPoupanca cp1 = new ContaPoupanca(1,1);

        //executa
        cp1.depositar(100.00);
        //saldo na conta R$100,00
        cp1.sacar(101.00); //testando tirar da conta

        double resultado = cp1.getSaldo();
        //verifica
        Assert.assertEquals(resultado, 100.00,0);
    }

}

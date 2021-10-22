package br.com.testeTdd;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void estrutura(){

        //cenario
        int numero1 = 10, numero2 = 20;

        //executa
        int resultado = numero1 + numero2;

        //verifica
        Assert.assertEquals(resultado, 30);
    }

    @Test
    public void teste2(){
        //cenario
        int numero1 = -10, numero2 = 20;

        //executa
        int resultado = numero1 + numero2;

        //verifica
        Assert.assertEquals(resultado, 30);
    }

}

package grupo11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest 
{
    
    @Test
    public void testaMultiplicador1(){
        Numero n1 = new Numero(3);
        Numero n2 = new Numero(5);
        Somador s = new Somador();
        Multiplicador m = new Multiplicador(s);

        m.set(n1);
        m.vezes(n2);

        Numero exp = new Numero(15);
        Assertions.assertEquals(exp.valor(), m.resultado().valor());
    }

    @Test
    public void testaMultiplicador2(){
        Numero n1 = new Numero(10);
        Numero n2 = new Numero(2);
        Somador s = new Somador();
        Multiplicador m = new Multiplicador(s);

        m.set(n1);
        m.vezes(n2);

        Numero exp = new Numero(20);
        Assertions.assertEquals(exp.valor(), m.resultado().valor());
    }

    @Test
    public void testaMultiplicadorComZero(){
        Numero n1 = new Numero(3);
        Numero n2 = new Numero(0);
        Somador s = new Somador();
        Multiplicador m = new Multiplicador(s);

        m.set(n1);
        m.vezes(n2);

        Numero exp = new Numero(0);
        Assertions.assertEquals(exp.valor(), m.resultado().valor());
    }

    @Test
    public void testaDivisor1(){
        Numero n1 = new Numero(10);
        Numero n2 = new Numero(2);
        Somador s = new Somador();
        Multiplicador m = new Multiplicador(s);

        m.set(n1);
        m.dividir(n2);

        Numero exp = new Numero(5);
        Assertions.assertEquals(exp.valor(), m.resultado().valor());
    }

    @Test
    public void testaDivisor2(){
        Numero n1 = new Numero(10);
        Numero n2 = new Numero(7);
        Somador s = new Somador();
        Multiplicador m = new Multiplicador(s);

        m.set(n1);
        m.dividir(n2);

        Numero exp = new Numero(1);
        Assertions.assertEquals(exp.valor(), m.resultado().valor());
    }

    @Test
    public void testaFatorial(){
        Numero n1 = new Numero(5);
        Somador s = new Somador();
        Multiplicador m = new Multiplicador(s);
        Fatorial f = new Fatorial(m);
        f.fatorial(n1);

        Numero exp = new Numero(120);
        Assertions.assertEquals(exp.valor(), f.resultado().valor());
    }

    @Test
    public void testaFatorialComZero(){
        Numero n1 = new Numero(0);
        Somador s = new Somador();
        Multiplicador m = new Multiplicador(s);
        Fatorial f = new Fatorial(m);
        f.fatorial(n1);

        Numero exp = new Numero(1);
        Assertions.assertEquals(exp.valor(), f.resultado().valor());
    }

    @Test
    public void testaPotencia(){
        Numero n1 = new Numero(2);
        Numero n2 = new Numero(4);
        Somador s = new Somador();
        Multiplicador m = new Multiplicador(s);
        Potencia p = new Potencia(m);
        p.potencia(n1, n2);

        Numero exp = new Numero(16);
        Assertions.assertEquals(exp.valor(), p.resultado().valor());
    }

    @Test
    public void testaPotenciaComZero(){
        Numero n1 = new Numero(4);
        Numero n2 = new Numero(0);
        Somador s = new Somador();
        Multiplicador m = new Multiplicador(s);
        Potencia p = new Potencia(m);
        p.potencia(n1, n2);

        Numero exp = new Numero(1);
        Assertions.assertEquals(exp.valor(), p.resultado().valor());
    }

    @Test
    public void testaFibonacci1(){
        Numero n1 = new Numero(1);
        Somador s = new Somador();
        Fibonacci fibo = new Fibonacci(s);
        fibo.fibonacci(n1);

        Numero exp = new Numero(1);
        Assertions.assertEquals(exp.valor(), fibo.resultado().valor());
    }

    @Test
    public void testaFibonacci2(){
        Numero n1 = new Numero(7);
        Somador s = new Somador();
        Fibonacci fibo = new Fibonacci(s);
        fibo.fibonacci(n1);

        Numero exp = new Numero(13);
        Assertions.assertEquals(exp.valor(), fibo.resultado().valor());
    }
}
package grupo11;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Numero n1 = new Numero(2);
        Numero n2 = new Numero(4);
        //Numero n3 = new Numero(3);
        Somador s = new Somador();
        
        Multiplicador m = new Multiplicador(s);
        m.set(n1); //valor
        m.vezes(n2); //vezes

        //Fatorial f = new Fatorial(m);        
        //f.fatorial(n1);

        //Numero n2 = new Numero(3);

        //Potencia p = new Potencia(m);
        //p.potencia(n1, n2);
        //System.out.println(p.resultado().valor());

        Fibonacci fibo = new Fibonacci(s);
        fibo.fibonacci(n1);

        System.out.println(fibo.resultado().valor());
    }
}

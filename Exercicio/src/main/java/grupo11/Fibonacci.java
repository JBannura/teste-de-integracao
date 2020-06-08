package grupo11;

public class Fibonacci {
    
    private Somador resultado;

    public Fibonacci(Somador somador){
        this.resultado = somador;
    }

    /**
     * Exibe o número da sequência de fibonacci que 
     * está na posição absoluta "numero".
     *  Ex.: param numero = 7; return = 8;
     */
    public Fibonacci fibonacci(Numero numero)
    { 
        Numero count = numero.duplica();
        Numero n1 = new Numero(0);
        Numero n2 = new Numero(1);

        resultado.set(n1); // atualiza resultado inicial para 0
        this.resultado.mais(n1);

        resultado.set(n1);
        this.resultado.mais(n2);
        //System.out.println("Fibo: " + resultado.resultado() + "     Count: " + count);
        count = count.abs(); // count = 7
        System.out.println(count.valor());
        //System.out.println("N1: " + n1.valor() + "       N2: " + n2.valor() + "\n");

        // 1 2 3 4 5 6 7 8  9 
        // 1 1 2 3 5 8 13 21


        while (count.valor() > 2) 
        {
            resultado.set(n1);
            this.resultado.mais(n2);
            System.out.println("Fibo: " + resultado.resultado());
            //System.out.println("Fibo: " + resultado.resultado() + "     Count: " + count);
            
            n1 = new Numero(n2.valor());
            n2 = new Numero(resultado.resultado().valor()); // n2 = ultimo valor calculado
            
            //System.out.println("N1: " + n1.valor() + "       N2: " + n2.valor() + "\n");
            
            count.dec();

            //resultado = new Somador();
        }

        return this;
    }

    public Numero resultado(){ return resultado.resultado(); }

}
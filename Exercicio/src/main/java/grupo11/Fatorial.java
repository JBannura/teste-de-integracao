package grupo11;

public class Fatorial {
    
    private Multiplicador resultado;

    public Fatorial(Multiplicador multiplicador){
        resultado = multiplicador;
    }
    
    public Fatorial fatorial(Numero valor){

        if(valor.valor() == 0){
            resultado.set(new Numero(1));
            resultado.vezes(new Numero(1));
            return this;
        }

        Numero aux = valor.duplica();

        valor = valor.abs();
        resultado.set(valor);
        resultado.vezes(aux.dec());
        
        while(aux.valor() > 1){
            Numero val = new Numero(resultado.resultado().valor());
            resultado.set(val);
            resultado.vezes(aux.dec());
        }
            
        return this;
    }

    public Numero resultado(){ return resultado.resultado(); }

}
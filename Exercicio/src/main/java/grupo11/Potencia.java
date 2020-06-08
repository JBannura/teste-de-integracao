package grupo11;

public class Potencia {
    
    Multiplicador multiplicador;

    public Potencia(Multiplicador multiplicador){
        this.multiplicador = multiplicador;
    }

    public void potencia(Numero base, Numero expoente){
        
        if(expoente.valor()==0){
            multiplicador.set(new Numero(1));
            multiplicador.vezes(new Numero(1));
            return;
        }

        Numero aux = expoente.duplica();
        
        multiplicador.set(base);
        multiplicador.vezes(base);
        aux.dec();

        while (aux.valor() > 1){
            Numero val = new Numero(multiplicador.resultado().valor());
            multiplicador.set(val);
            multiplicador.vezes(base);
            aux.dec();
        }
    }

    public Numero resultado(){ return multiplicador.resultado(); }

}
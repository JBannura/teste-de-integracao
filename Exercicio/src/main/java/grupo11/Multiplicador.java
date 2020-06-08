    package grupo11;

    public class Multiplicador 
    {
        // 10 * 5
        // multiplicando * multiplicador
        Somador resultado = new Somador();
        Numero operando = new Numero(0);

        public Multiplicador(Somador somador){
            this.resultado = somador;
        }

        public Multiplicador set(Numero valor){
            zeraResultado();
            this.operando = valor;
            return this;
        }

        public Multiplicador vezes(Numero outro){
            zeraResultado();
            Numero aux = outro.duplica();
            aux = aux.abs();

            while(aux.valor() > 0){
                resultado.mais(operando);
                aux.dec();
            }
            
            return this;
        }

        public Multiplicador dividir(Numero outro){
            zeraResultado();
            
            if(outro.valor() == 0){
                return this;
            }

            while(operando.valor() >= outro.valor()){
                resultado.resultado().inc();
                operando = new Numero(operando.valor() - outro.valor());
            }
            
            return this;
        }

        public void zeraResultado(){
            if (this.resultado.resultado().valor() != 0) { this.resultado = new Somador(); }
        }

        public Numero resultado(){ return resultado.resultado(); }

    }
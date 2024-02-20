public class Banco {
    public Conta[] contas;
    private int indice;
    private double taxa = 0.01;

    public Banco(){//construtor

        contas = new Conta[10]; //banco tem 10 contas
        indice = 0;
    }

    public void cadastrarConta(Conta c){
        contas[indice] = c;
        indice++;
    }

    public Conta acharConta(String numero){
        int i;
        boolean achou = false;
        Conta encontrada = null;

        for(i = 0; i < contas.length && achou == false; i++){
            if(contas[i].getNumero().equals(numero)){
                achou = true;
                encontrada = contas[i];
                
            }
        }
        return encontrada;
    }
    public void debitarConta(String n,double valor){
        Conta c;
        c = this.acharConta(n);
        c.debitar(valor);
    }

    public void creditarConta(String n,double valor){
        Conta c;
        c = this.acharConta(n);
        c.creditar(valor);
    }

    public void transferir(String conta1, String conta2, double valor){
        Conta c1, c2;
        c1 = this.acharConta(conta1);
        c2 = this.acharConta(conta2);

        c1.debitar(valor);
        c2.creditar(valor);
    }

    public void renderJuros(String numero){
        Conta c;
        c = this.acharConta(numero);
        if(c instanceof Poupanca){
            ((Poupanca) c).renderJuros(taxa);
        }
    }

    public void renderBonus(String numero){
        Conta c;
        c = this.acharConta(numero);
        if(c instanceof ContaEspecial){
            ((ContaEspecial) c).renderBonus();
        }
    }
}


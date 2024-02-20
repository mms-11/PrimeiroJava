public class Conta {
    private String numero;
    private double saldo;

    //construtor

    public Conta(String numeroInicial){
      numero = numeroInicial;
  
    }

    public void setSaldo(double valor){
      this.saldo = valor;
    }

    

    public double getSaldo(){

      return this.saldo;
    }

    public String getNumero(){

        return this.numero;
      }

    public void creditar(double valor){
        this.saldo += valor;
    }
    public void debitar(double valor){
        this.saldo -= valor;
    }





  }


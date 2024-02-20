





public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123");
       
        c1.setSaldo(30);

        String numero = c1.getNumero();
        double saldo = c1.getSaldo();


        System.out.printf("%.2f é o saldo%n", saldo);

    }
}

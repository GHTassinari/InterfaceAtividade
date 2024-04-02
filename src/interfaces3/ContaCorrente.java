package interfaces3;

public class ContaCorrente implements Conta {

    private int numero;
    private double saldo;
    private double limite;

    public ContaCorrente() {
        System.out.println("Construindo uma conta!");
        this.saldo = saldo;
        this.limite = limite;
        this.numero = numero;

    }

    public int getNumero() {
        return numero;
    }

    private static int totalDeContas;

    private int identificador;

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean saca(double quantidade) {
        if(this.getSaldo() >= quantidade) {
            this.saldo = this.saldo - quantidade;
            System.out.println("Saque realizado com sucesso!");
            return true;
        }else{
            System.out.println("Saldo insuficiente: " + this.saldo);
            return false;
        }
    }

    public void transfere(interfaces2.Conta destino, double quantidade){
        if(this.saca(quantidade)){
            destino.deposita(quantidade);
        }else {
            System.out.println("Transferência não realizada!");
        }
    }

    public double getSaldo() {
        return saldo + limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void deposita(double quantidade) {
        this.saldo = this.saldo + quantidade;
    }

    @Override
    public void retira(double valor) {

    }

    @Override
    public void atualiza(double taxaSelic) {

    }
}

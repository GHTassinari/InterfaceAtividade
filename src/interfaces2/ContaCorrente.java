package interfaces2;

class ContaCorrente extends Conta implements Tributavel {
    // outros atributos e metodos
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
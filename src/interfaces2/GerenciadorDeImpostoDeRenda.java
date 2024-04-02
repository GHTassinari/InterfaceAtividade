package interfaces2;

public class GerenciadorDeImpostoDeRenda {
    private double total;

    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t.calculaTributos());
        this.total += t.calculaTributos();
    }

    public double getTotal() {
        return total;
    }
}

package interfaces;

class Teste {
    public static void main(String[] args) {
        AreaCalculavel a1 = new Retangulo(3,2);
        System.out.println(a1.calculaArea());
        AreaCalculavel a2 = new Circulo(9);
        System.out.println(a2.calculaArea());
    }
}
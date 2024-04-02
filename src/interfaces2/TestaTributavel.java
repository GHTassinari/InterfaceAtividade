package interfaces2;

class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());

        Tributavel t = cc;
        System.out.println(t.calculaTributos());

        // t.getSaldo(); Não funciona, pois ele não herda o getsaldo da conta,
        // pois não é filho, esse objeto tributável com uma conta corrente serve apenas
        // para executar o método tributável
    }
}
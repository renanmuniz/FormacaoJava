public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(950,343722);
        Conta conta2 = new Conta(950,343723);
        Conta conta3 = new Conta(950,343724);
        Conta conta4 = new Conta(950,343725);

        System.out.println("Total de contas criadas ate o momento: " + Conta.getTotal());

    }
}

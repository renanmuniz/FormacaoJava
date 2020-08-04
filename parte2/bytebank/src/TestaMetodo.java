public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println(conta.saldo);
        boolean sacou = conta.saca(20);
        if (sacou) {
            System.out.println("Saque efetuado");
        }
        System.out.println(conta.saldo);

        Conta c1 = new Conta();
        c1.deposita(1000);

        Conta c2 = new Conta();
        c2.deposita(500);

        System.out.println("Saldo c1: " + c1.saldo);
        System.out.println("Saldo c2: " + c2.saldo);

        if(c1.transfere(250,c2)){
            System.out.println("Transferencia efetuada com sucesso.");
        } else {
            System.out.println("Falha na transferencia");
        }
        System.out.println("Saldo c1: " + c1.saldo);
        System.out.println("Saldo c2: " + c2.saldo);

        c1.titular = "renan muniz";
        System.out.println(c1.titular);


    }
}

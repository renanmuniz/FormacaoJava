public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        int idade = 16;
        int quantidadePessoas = 2;
        boolean acompanhado;

        if(quantidadePessoas>1) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("Idade = " + idade);
        System.out.println("Acompanhado = " + acompanhado);

        if(idade >= 18 || acompanhado) {
            System.out.println("Seja Bem-Vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }

        if(idade >= 18 && acompanhado) {
            System.out.println("Seja Bem-Vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}

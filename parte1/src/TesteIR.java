public class TesteIR {
    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario >= 1900.0 && salario <= 2800.0 ) {
            System.out.println("aliquota 7,5%");

        } else if (salario > 2800.0 && salario <= 3751.0 ) {
            System.out.println("aliquota 15%");

        } else if (salario > 3751.0 && salario <= 4664.0) {
            System.out.println("aliquota 22,5%");

        } else {
            System.out.println("Não definido.");
        }
    }
}

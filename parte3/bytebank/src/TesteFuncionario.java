public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();
        nico.setNome("Nico Steppat");
        nico.setCpf("123456789");
        nico.setSalario(2600.0);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}

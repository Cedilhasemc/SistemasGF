public class FuncionarioIntegral extends Funcionario {

    public FuncionarioIntegral(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario(); // Salário fixo
    }
}

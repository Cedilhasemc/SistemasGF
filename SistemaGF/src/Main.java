public class Main {
    public static void main(String[] args) {

        Funcionario funcionarioIntegral = new FuncionarioIntegral("João Silva", 35, 3500.00);
        Funcionario funcionarioPorHora = new FuncionarioPorHora("Maria Oliveira", 28, 20.00, 40, 80);
        Funcionario gerente = new Gerente("Carlos Almeida", 42, 5000.00, 1000.00);

        System.out.println("Salário do Funcionário Integral: " + funcionarioIntegral.calcularSalario());
        System.out.println("Salário do Funcionário por Hora: " + funcionarioPorHora.calcularSalario());
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
    }
}

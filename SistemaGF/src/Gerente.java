public class Gerente extends Funcionario {

    private double bonusDesempenho;

    public Gerente(String nome, int idade, double salario, double bonusDesempenho) {
        super(nome, idade, salario);
        this.bonusDesempenho = bonusDesempenho;
    }

    public double getBonusDesempenho() {
        return bonusDesempenho;
    }

    public void setBonusDesempenho(double bonusDesempenho) {
        this.bonusDesempenho = bonusDesempenho;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bonusDesempenho;
    }
}

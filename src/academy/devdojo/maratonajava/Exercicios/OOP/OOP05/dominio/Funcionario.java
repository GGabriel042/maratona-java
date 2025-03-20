package Exercicios.OOP05.dominio;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculoSalarialFinal() {
        double salarioFinal;
        if (salario < 5000) {
            salarioFinal = salario - (salario * 0.10);
        } else if (salario > 5000 && salario < 100000) {
            salarioFinal = salario - (salario * 0.25);
        } else {
            salarioFinal = salario - (salario * 0.50);
        }

        return salarioFinal;
    }

    public void imprime() {
        System.out.println("O funcionario " + getNome() + " que trabalha na função de " + getCargo() + " recebeu esse mes: R$" + salario + ", após os descontos com imposto seu sálario ficou de: R$" + calculoSalarialFinal());
    }
}

package Exercicios.OOP09.dominio;

public class Paciente {
    private String nome;
    private int idade;
    private String[] consultas;

    public Paciente(String nome, int idade, String[] consultas) {
        this.nome = nome;
        this.idade = idade;
        this.consultas = consultas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String[] getConsultas() {
        return consultas;
    }

    public void setConsultas(String[] consultas) {
        this.consultas = consultas;
    }

    public void adicionarConsulta(String novaConsulta){
        String[] novaListaConsultas = new String [consultas.length + 1];
        for (int i = 0; i <consultas.length; i++){
            novaListaConsultas[i] = consultas[i];
        }
        novaListaConsultas[novaListaConsultas.length - 1] = novaConsulta;
        this.consultas = novaListaConsultas;
    }

    public void imprimeConsultas(){
        System.out.println("Paciente " + nome + " tem marcado as consultas ");
        for (String consulta : consultas) {
            System.out.print(consulta + " ");
        }
        System.out.println("\n--------------");
    }
}

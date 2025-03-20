package Exercicios.OOP04.dominio;

public class Aluno {
    private String nomeAluno;
    private String matriculaAluno;
    private double[] notas;

    public Aluno(String nomeAluno, String matriculaAluno, double[] notas) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
        this.notas = notas;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMediaNotas() {
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media /= notas.length;
        return media;
    }

    public void imrpime(){
        System.out.println("O aluno " + getNomeAluno() + " com a matricula " + getMatriculaAluno() + " teve " + calcularMediaNotas() + " de media");
    }
}

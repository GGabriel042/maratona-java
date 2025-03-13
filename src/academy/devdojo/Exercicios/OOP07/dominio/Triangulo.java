package Exercicios.OOP07.dominio;

public class Triangulo {
    private int[] lados;

    public Triangulo(int[] lados) {
        this.lados = lados;
    }

    public int[] getLados() {
        return lados;
    }

    public void setLados(int[] lados) {
        this.lados = lados;
    }

    public void verificacaoTriangulo() {
        String trianguloValido = "Este triangulo é válido";
        String trianguloNaoValido = "Este triangulo nao é válido";

        if (lados.length > 3) {
            System.out.println(trianguloNaoValido);
        }else if (lados[0] > (lados[1] - lados[2]) && lados[0] < lados[1] + lados[2] ||
                    lados[1] > (lados[0] - lados[2]) && lados[1] < lados[0] + lados[2] ||
                    lados[2] > (lados[0] - lados[1]) && lados[2] < lados[0] + lados[1]) {
            System.out.println(trianguloValido);
        }
        else System.out.println(trianguloNaoValido);
    }

    public double areaTriangulo() {
        double semiP = (lados[0] + lados[1] + lados[2]) / 2;
        double area = Math.sqrt(semiP * (semiP - lados[0]) * (semiP - lados[1]) * (semiP - lados[2]));
        return area;
    }
}

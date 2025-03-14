package Exercicios.OOP19.dominio;

public class Dias {
    private int quantidadeDias;
    private boolean isFeriado;

    public Dias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
        this.isFeriado = false;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public void setFeriado(boolean feriado) {
        isFeriado = feriado;
    }

    public boolean isFeriado() {
        return isFeriado;
    }
}

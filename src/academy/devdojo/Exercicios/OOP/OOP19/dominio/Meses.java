package Exercicios.OOP19.dominio;

import java.util.ArrayList;
import java.util.List;

public class Meses {
    private String nomeMes;
    private List<Dias> dias;

    public Meses(String nomeMes) {
        this.dias = new ArrayList<>();
        this.nomeMes = nomeMes;
    }

    public String getNomeMes() {
        return nomeMes;
    }

    public void setNomeMes(String nomeMes) {
        this.nomeMes = nomeMes;
    }

    public List<Dias> getDias() {
        return dias;
    }

    public void adicionarDia(Dias dia){
        dias.add(dia);
    }

}

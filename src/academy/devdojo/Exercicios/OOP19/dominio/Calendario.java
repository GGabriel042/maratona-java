package Exercicios.OOP19.dominio;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
    protected List<Meses> meses;

    public Calendario() {
        this.meses = new ArrayList<>();
    }

    public List<Meses> getMeses() {
        return meses;
    }

    public void setMeses(List<Meses> meses) {
        this.meses = meses;
    }

    public void construirMeses(String nome, int dias) {
        Meses mes = new Meses(nome);
        mes.setNomeMes(nome);
        for (int i = 1; i <= dias; i++) {
            Dias dia = new Dias(i);
            mes.adicionarDia(dia);
        }
        meses.add(mes);
    }

    public void mostrarMes(String nomeMesProcurado) {
        for (Meses mes : meses) {
            if (mes.getNomeMes().equals(nomeMesProcurado)) {
                System.out.println("\nO calendario do mes de " + mes.getNomeMes());
                for (Dias dia : mes.getDias()) {
                    System.out.print(dia.getQuantidadeDias() + " ");
                }
            }
        }
    }

    public void marcarFeriado(String nomeMes, int diaFeriado) {
        for (Meses mes : meses) {
            if (mes.getNomeMes().equals(nomeMes)) {
                for (Dias d : mes.getDias()) {
                    if (d.getQuantidadeDias() == diaFeriado) {
                        d.setFeriado(true);
                        return;
                    }
                }
            }
        }
    }

    public void conferirFeriado(String nomeMesProcurado, int diaFeriado) {
        for (Meses mes : meses) {
            if (mes.getNomeMes().equals(nomeMesProcurado)) {
                for (Dias dia : mes.getDias()) {
                    if (dia.getQuantidadeDias() == diaFeriado) {
                        if (dia.isFeriado()) {
                            System.out.println("\nO dia " + diaFeriado + " de " + nomeMesProcurado + " é feriado.");
                        } else {
                            System.out.println("\nO dia " + diaFeriado + " de " + nomeMesProcurado + " não é feriado.");
                        }
                        return;
                    }
                }
                System.out.println("\nDia " + diaFeriado + " não encontrado no mês de " + nomeMesProcurado + ".");
                return;
            }
        }
        System.out.println("\nMês '" + nomeMesProcurado + "' não encontrado.");
    }

    public void calcularDistanciaDatas(String nomePrimeiroMes, int diaPrimeiroMes, String nomeSegundoMes, int diaSegundoMes) {
        int posicaoPrimeiraData = -1;
        int posicaoSegundaData = -1;
        int diasAcumulados = 0;

        for (Meses mes : meses) {
            if (mes.getNomeMes().equals(nomePrimeiroMes)) {
                posicaoPrimeiraData = diasAcumulados + diaPrimeiroMes;
            }

            if (mes.getNomeMes().equals(nomeSegundoMes)) {
                posicaoSegundaData = diasAcumulados + diaSegundoMes;
            }

            diasAcumulados += mes.getDias().size();
        }

        if (posicaoPrimeiraData == -1 || posicaoSegundaData == -1) {
            System.out.println("\nErro: Um dos meses ou dias não foi encontrado.");
        }

        int distancia = Math.abs(posicaoSegundaData - posicaoPrimeiraData);
        System.out.println("\nA distância entre as datas é de " + distancia + " dias.");
    }
}

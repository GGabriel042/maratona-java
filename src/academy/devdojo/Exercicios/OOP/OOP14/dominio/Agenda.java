package Exercicios.OOP14.dominio;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<String> contatos;
    private ArrayList<Integer> numeros;

    public Agenda() {
        this.contatos = new ArrayList<>();
        this.numeros = new ArrayList<>();
    }

    public ArrayList<String> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<String> contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public void adicionarContato(int numero, String nome) {
        if (numeros.contains(numero)) {
            System.out.println("Numero já cadastrado");
        } else {
            numeros.add(numero);
            contatos.add(nome);
            System.out.println("Contato "+nome +" adicionado com sucesso");
        }
    }

    public void deletarContato(int numero) {
        boolean encontrado = false;
        for (int i = 0; i < numeros.size(); i++) {
            if (numero == numeros.get(i)) {
                numeros.remove(i);
                contatos.remove(i);
                System.out.println("Contato removido com sucesso");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não existe");
        }
    }

    public void deletarContato(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < contatos.size(); i++) {
            if (nome.equals(contatos.get(i))) {
                numeros.remove(i);
                contatos.remove(i);
                System.out.println("Contato removido com sucesso");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não existe");
        }
    }

    public void mostrarAgenda() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia");
        } else {
            System.out.println("Lista de Contatos: ");
            System.out.println("-----------------");
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println("Contato: " + contatos.get(i));
                System.out.println("Numero: " + numeros.get(i));
                System.out.println("-----------------");
            }
        }
    }

    public void editarContato(int numero, String novoNome, int novoNumero) {
        boolean encontrado = false;
        for (int i = 0; i < numeros.size(); i++) {
            if (numero == numeros.get(i)) {
                numeros.set(i, novoNumero);
                contatos.set(i, novoNome);
                System.out.println("Contato alterado com sucesso");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não existente");
        }
    }

    public void editarContato(String nome, String novoNome, int novoNumero) {
        boolean encontrado = false;
        for (int i = 0; i < contatos.size(); i++) {
            if (nome.equals(contatos.get(i))) {
                numeros.set(i, novoNumero);
                contatos.set(i, novoNome);
                System.out.println("Contato alterado com sucesso");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não existente");
        }
    }
}

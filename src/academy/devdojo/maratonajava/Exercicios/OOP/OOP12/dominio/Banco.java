package Exercicios.OOP12.dominio;

import java.util.ArrayList;

public class Banco {
    private ArrayList<String> nomesClientes;
    private ArrayList<Integer> contasBancarias;
    private ArrayList<Integer> saldosClientes;

    public Banco() {
        this.nomesClientes = new ArrayList<>();
        this.contasBancarias = new ArrayList<>();
        this.saldosClientes = new ArrayList<>();
    }

    public ArrayList<String> getNomesClientes() {
        return nomesClientes;
    }

    public void setNomesClientes(ArrayList<String> nomesClientes) {
        this.nomesClientes = nomesClientes;
    }

    public ArrayList<Integer> getContasBancarias() {
        return contasBancarias;
    }

    public void setContasBancarias(ArrayList<Integer> contasBancarias) {
        this.contasBancarias = contasBancarias;
    }

    public ArrayList<Integer> getSaldosClientes() {
        return saldosClientes;
    }

    public void setSaldosClientes(ArrayList<Integer> saldosClientes) {
        this.saldosClientes = saldosClientes;
    }

    public void cadastrarCliente(String nome) {
        int contaBancaria;
        boolean contaRepetida;

        do {
            contaBancaria = (int) (Math.random() * 5000);
            contaRepetida = false;

            for (int conta : contasBancarias) {
                if (conta == contaBancaria) {
                    contaRepetida = true;
                    break;
                }
            }
        } while (contaRepetida);

        nomesClientes.add(nome);
        contasBancarias.add(contaBancaria);
        saldosClientes.add(0);

        System.out.println("Cliente " + nome + " cadastrado com a conta: " + contaBancaria);
    }

    public void conferirContaBancaria(String nomeCliente) {
        boolean encontrado = false;

        for (int i = 0; i < nomesClientes.size(); i++) {
            if (nomeCliente.equals(nomesClientes.get(i))) { // Compara strings com .equals()
                System.out.println("Nome: " + nomesClientes.get(i));
                System.out.println("Conta bancária: " + contasBancarias.get(i));
                System.out.println("Saldo: R$" + saldosClientes.get(i));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Você não tem uma conta bancária.");
        }
    }

    public void saque(String nome,int valorSaque) {
        boolean encontrado = false;

        for (int i = 0; i < nomesClientes.size(); i++) {
            if (nome.equals(nomesClientes.get(i))) {
                encontrado = true;

                int saldoAtual = saldosClientes.get(i);

                if (saldoAtual >= valorSaque) {
                    saldosClientes.set(i, saldoAtual - valorSaque);
                    System.out.println("Saque de R$" + valorSaque + " realizado com sucesso");
                    System.out.println("Novo saldo: R$" + saldosClientes.get(i));
                } else {
                    System.out.println("Valor insuficiente para saque");
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente não encontrado");
        }
    }

    public void deposito(String nome,int valorSaque) {
        boolean encontrado = false;

        for (int i = 0; i < nomesClientes.size(); i++) {
            if (nome.equals(nomesClientes.get(i))) {
                encontrado = true;

                int saldoAtual = saldosClientes.get(i);
                saldosClientes.set(i, saldoAtual + valorSaque);
                System.out.println("Saque de R$" + valorSaque + " realizado com sucesso");
                System.out.println("Novo saldo: R$" + saldosClientes.get(i));
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente não encontrado");
        }
    }

    public void transferencia(String nomePagante, String nomeRecebedor, int valor) {
        boolean paganteEncontrado = false;
        boolean recebedorEncontrado = false;
        int indicePagante = -1;
        int indiceRecebedor = -1;

        for (int i = 0; i < nomesClientes.size(); i++) {
            if (nomePagante.equals(nomesClientes.get(i))){
                paganteEncontrado = true;
                indicePagante = i;
            }
            if (nomeRecebedor.equals(nomesClientes.get(i))){
                recebedorEncontrado = true;
                indiceRecebedor = i;
            }
        }

        int saldoAtualPagante = saldosClientes.get(indicePagante);
        int saldoAtualRecebedor = saldosClientes.get(indiceRecebedor);

        if (saldoAtualPagante >= valor){
            saldosClientes.set(indicePagante, saldoAtualPagante - valor);
            saldosClientes.set(indiceRecebedor, saldoAtualRecebedor + valor);
            System.out.println("O depósito foi feito com sucesso.");
            System.out.println("A conta de "+nomePagante + " agora está com: R$"+saldosClientes.get(indicePagante));
            System.out.println("A conta de "+nomeRecebedor + " agora está com: R$"+saldosClientes.get(indiceRecebedor));
        } else {
            System.out.println("Sem saldo suficiente");
        }
    }
}

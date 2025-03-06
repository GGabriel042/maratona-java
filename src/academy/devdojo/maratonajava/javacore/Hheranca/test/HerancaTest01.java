package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345-209");
        Pessoa pessoa = new Pessoa("Gabriel");
        pessoa.setCpf("123456-50");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("----------------------");

        Funcionario funcionario = new Funcionario("Luffy");
        funcionario.setCpf("987654-99");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000.55);

        funcionario.imprime();
    }
}

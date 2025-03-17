package academy.devdojo.maratonajava.javacore.Oexeption.exception.test;

import academy.devdojo.maratonajava.javacore.Oexeption.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexeption.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexeption.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();


        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}

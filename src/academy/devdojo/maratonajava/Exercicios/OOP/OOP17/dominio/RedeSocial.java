package Exercicios.OOP17.dominio;

import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
    protected List<Usuarios> usuarios;

    public RedeSocial() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuarios usuario){
        usuarios.add(usuario);
        System.out.println("Usuario :"+usuario + " adiconado com sucesso.");
    }

    public void buscarUsuario(String nome) {
        for (Usuarios usuario : usuarios) {
            if (nome.equals(usuario.getNome())){
                System.out.println("Usuario encontrado: " + usuario.getNome());
                System.out.println("------------");
                return;
            }
        }
        System.out.println("Usuario não encontrado");
    }
}

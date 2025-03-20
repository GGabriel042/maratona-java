package Exercicios.OOP17.test;

import Exercicios.OOP17.dominio.RedeSocial;
import Exercicios.OOP17.dominio.Usuarios;

public class RedeSocialTest {
    public static void main(String[] args) {
        RedeSocial orkut = new RedeSocial();
        Usuarios gabriel = new Usuarios("Gabriel", orkut);
        Usuarios rafael = new Usuarios("Rafael", orkut);
        Usuarios daniel = new Usuarios("Daniel", orkut);

        gabriel.adicionarAmigos(rafael);
        gabriel.adicionarAmigos(daniel);
        gabriel.mostrarListaAmigos();
        rafael.mostrarListaAmigos();
        daniel.mostrarListaAmigos();

        orkut.buscarUsuario("Gabriel");

        gabriel.postarMensgem("Ola Mundo");
        gabriel.postarMensgem("Ola Mundo denovo");
        gabriel.mostrarPost();

        daniel.comentarPost(gabriel,0,"Ola Gabriel");
        rafael.comentarPost(gabriel, 1, "Pra que postar denovo?");

        gabriel.mostrarPost();

        gabriel.removerAmigos(rafael);
        rafael.mostrarListaAmigos();
    }
}

package Exercicios.OOP17.dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    private String nome;
    private List<Usuarios> amigos;
    private List<String> posts;

    public Usuarios(String nome, RedeSocial redeSocial) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.posts = new ArrayList<>();
        redeSocial.adicionarUsuario(this);
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAmigos(Usuarios amigo) {
        if (!this.amigos.contains(amigo)){
            this.amigos.add(amigo);
            amigo.amigos.add(this);
        }
    }

    public void removerAmigos(Usuarios amigo) {
        if (this.amigos.contains(amigo)){
            this.amigos.remove(amigo);
            amigo.amigos.remove(this);
        }
    }

    public void mostrarListaAmigos(){
        System.out.println("Lista de amigos do " + this.nome + ":");
        for (int i = 0; i < amigos.size(); i++) {
            System.out.println(amigos.get(i).getNome());
        }
        System.out.println("-------------");
    }

    public void postarMensgem(String mensagem) {
        posts.add(mensagem);
    }

    public void mostrarPost(){
        System.out.println("Lista de post do " + this.nome + ":");
        for (int i = 0; i < posts.size(); i++) {
            System.out.println(posts.get(i));
        }
        System.out.println("-------------");
    }

    public void comentarPost(Usuarios autor, int indicePost, String comentario) {
        if (autor.posts.size() > indicePost) {
            String postOriginal = autor.posts.get(indicePost);
            autor.posts.set(indicePost, postOriginal + "\nComentário de " + this.nome + ": " + comentario);
        } else {
            System.out.println("Post não encontrado.");
        }
    }

    public List<Usuarios> getAmigos() {
        return amigos;
    }

    public List<String> getPosts() {
        return posts;
    }
}

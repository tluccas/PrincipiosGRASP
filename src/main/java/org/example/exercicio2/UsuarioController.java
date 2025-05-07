package org.example.exercicio2;

public class UsuarioController {

    private UsuarioDAO dao;

    public Usuario login(String usuario, String senha){
        Usuario user = dao.buscarUsuario(usuario);
        if (user != null && user.getSenha().equals(senha)){
            System.out.println("LOGIN BEM SUCEDIDO");
            return user;
        }
        return null;
    }

    public void criarUsuario(String nome, String senha){
        Usuario novoUsuario = new Usuario(nome, senha);
        dao.criarUsuario(novoUsuario);
    }

    public void deletaUsuario(String usuario){
        dao.deletaUsuario(usuario);
    }

}

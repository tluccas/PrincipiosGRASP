package org.example.exercicio2;

public class UsuarioController {

    private UsuarioDAO dao;

    public Usuario login(String usuario, String senha){
        Usuario user = dao.buscarUsuario(usuario);
        if (user.getSenha().equals(senha)){
            System.out.println("LOGIN BEM SUCEDIDO");
            return user;
        }
        return null;
    }

}

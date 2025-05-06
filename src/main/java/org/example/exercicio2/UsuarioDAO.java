package org.example.exercicio2;

import java.util.List;

public class UsuarioDAO {

    private List<Usuario> usuarios;

    public Usuario buscarUsuario(String nome){
        for (Usuario usuario : usuarios){
            if (usuario.getUsuario().equals(nome)){
                return usuario;
            }
        }
        return null;
    }

    public void criarUsuario(String usuario, String senha)
}

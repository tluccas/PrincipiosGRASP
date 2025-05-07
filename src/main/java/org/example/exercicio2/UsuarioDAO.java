package org.example.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario buscarUsuario(String nome){
        for (Usuario usuario : usuarios){
            if (usuario.getUsuario().equals(nome)){
                return usuario;
            }
        }
        return null;
    }

    public void criarUsuario(Usuario novoUsuario){
        usuarios.add(novoUsuario);
    }

    public void deletaUsuario(String usuario){
        usuarios.remove(buscarUsuario(usuario));
    }
}

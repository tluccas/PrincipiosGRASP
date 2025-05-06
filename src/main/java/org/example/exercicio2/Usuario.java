package org.example.exercicio2;

/* TODO: 2 - Aplique o princípio do Controlador (Controller).
    Explique de forma breve os problemas identificados e o que foi feito para adequar
    o código existente ao princípio.

    RESPOSTA:

    A classe usuario original está responsavel por métodos que não cabem a ela estar responsável(ela sendo Model) que no caso são responsáveis por
    fazer a conexão entre a interface e o Banco de dados ou local de armazenamento o que é dever do Controller ao seguir o principío do Controlador, sem contar
    que os métodos apresentam a falta de validações como no caso do login, a falta de parametros no criarUsuario e no deletarUsuario.

*/
public class Usuario {

    private String usuario;
    private String senha;

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void criaUsuario(){

    }
    public void deletaUsuario(){}





}

package org.example.exercicio3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* TODO: 3 - Aplique o princípio do Baixo Acoplamento (Low Coupling).
    Cite os focos de acoplamento encontrados e como adequou o código existente
    para que o princípio fosse atendido.

    RESPOSTA:

    A classe Pedido estava fazendo coisas que não deveria, como validar os dados e se preocupar com a persistência no banco.
    Isso acabou deixando a classe muito "pesada", difícil de manter e testar. Essas tarefas de validação e persistência deviam
    estar em outras classes, para deixar tudo mais organizado. Então, para aplicar o princípio de Baixo Acoplamento, separei as
    responsabilidades em três partes: a classe Pedido só fica com os dados (o modelo), o PedidoDAO cuida de salvar esses dados no
    banco e o PedidoService faz toda a parte de validação e regras de negócio.

*/
public class Pedido {

    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

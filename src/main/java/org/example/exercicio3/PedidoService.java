package org.example.exercicio3;

public class PedidoService {

    PedidoDAO dao = new PedidoDAO();

    public void processarPedido(Pedido pedido) {
        //Lógica de validação dos dados do pedido
        System.out.println("Validando dados do pedido " + pedido.getId());
        if (pedido.getDescricao().isEmpty() || pedido.getDescricao() == null){
            System.out.println("A descrição não pode estar vazia");
        }
        dao.salvar(pedido);
    }
}

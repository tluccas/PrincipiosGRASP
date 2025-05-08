package org.example.exercicio4;

public class ClienteService {
    private ClienteDAO dao;
    private EmailService emailService;

    public ClienteService(ClienteDAO dao, EmailService emailService) {
        this.dao = dao;
        this.emailService = emailService;
    }

    public void cadastrarCliente(Cliente cliente) {
        // Validação
        System.out.println("Cadastrando o cliente " + cliente.getNome());

        // Persistência
        dao.salvar(cliente);

        // Envio de e-mail
        emailService.enviarBoasVindas(cliente.getEmail());
    }
}

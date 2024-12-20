package servicos;

import java.util.ArrayList;

import dao.ClienteDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import model.Cliente;

public class ClienteServico {

    ClienteDAO cDAO = DAOFactory.getClienteDAO();

    public void cadastrarCliente(Cliente cVO) {
        cDAO.cadastrarCliente(cVO);
    }

    public ArrayList<Cliente> listaClientes() {
        return cDAO.getClientes();
    }

    public Cliente getClienteById(int IDCliente) {
        return cDAO.getClienteById(IDCliente);
    }

    public void atualizaCliente(Cliente cVO) {
        cDAO.atualizarCliente(cVO);
    }

    public void deletarCliente(int IDCliente) {
        cDAO.deletarCliente(IDCliente);
    }

    public Cliente buscarClientePorLoginSenha(String login, String senha) throws SQLException {
        // Verifica se login ou senha estão vazios ou nulos
        if (login == null || login.isEmpty() || senha == null || senha.isEmpty()) {
            throw new IllegalArgumentException("Login e senha não podem estar vazios.");
        }

        // Busca o cliente no DAO
        Cliente cliente = cDAO.buscarClientePorLoginSenha(login, senha);

        // Verifica se um cliente foi encontrado
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não encontrado ou dados inválidos.");
        }

        return cliente;
    }

    public void deletarClientePorLogin(String login, String senha) throws SQLException {
        Cliente cliente = cDAO.buscarClientePorLoginSenha(login, senha); // Primeiro, busca o cliente pelo login

        if (cliente != null) {
            deletarCliente(cliente.getIDUsuario()); // Chama o método de deletar por ID
            System.out.println("Cliente deletado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado com o login fornecido.");
        }
    }
}

package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Venda;

public class ControleVenda {

    public void inserir(Venda v) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // salvar o venda no banco de dados
        gerente.persist(v);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();

    }

    public void excluir(Venda v) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // pegar o objeto do banco utilizando sua chave primária
        Venda vendaExcluir = gerente.find(Venda.class, v.getIdVenda());

        // inicia uma transação
        gerente.getTransaction().begin();

        // excluir o venda no banco de dados
        gerente.remove(vendaExcluir);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public void alterar(Venda v) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // faz um merge - atualizar um registrto
        gerente.merge(v);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public List<Venda> listarTodas() {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Venda> consulta = gerente.createNamedQuery("Venda.Todas", Venda.class);

        return consulta.getResultList();

    }

    public List<Venda> Relatorio() {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Venda> consulta = gerente.createNamedQuery("Venda.Relatorio", Venda.class);

        return consulta.getResultList();

    }

}

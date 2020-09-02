package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Distribuidora;

public class ControleDistribuidora {

    public void inserir(Distribuidora d) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // salvar a distribuidora no banco de dados
        gerente.persist(d);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();

    }

    public void excluir(Distribuidora d) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // pegar o objeto do banco utilizando sua chave primária
        Distribuidora funcionarioExcluir = gerente.find(Distribuidora.class, d.getIdDistribuidora());

        // inicia uma transação
        gerente.getTransaction().begin();

        // excluir a distribuidora no banco de dados
        gerente.remove(funcionarioExcluir);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public void alterar(Distribuidora d) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // faz um merge - atualizar um registrto
        gerente.merge(d);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public List<Distribuidora> listarTodas() {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Distribuidora> consulta = gerente.createNamedQuery("Distribuidora.Todas", Distribuidora.class);

        return consulta.getResultList();
    }

    public List<Distribuidora> listarPorNome(String nome) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Distribuidora> consulta
                = gerente.createNamedQuery("Distribuidora.porNome", Distribuidora.class);

        consulta.setParameter("nome", "%" + nome + "%");

        return consulta.getResultList();
    }

    public List<Distribuidora> listarPorFilme(Distribuidora idDistribuidora) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Distribuidora> consulta
                = gerente.createNamedQuery("Distribuidora.porFilme", Distribuidora.class);

        consulta.setParameter("idDistribuidora", idDistribuidora);

        return consulta.getResultList();
    }

}

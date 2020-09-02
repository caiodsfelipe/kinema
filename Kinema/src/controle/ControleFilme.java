package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Filme;

public class ControleFilme {

    public void inserir(Filme f) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // salvar o filme no banco de dados
        gerente.persist(f);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();

    }

    public void excluir(Filme f) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // pegar o objeto do banco utilizando sua chave primária
        Filme filmeExcluir = gerente.find(Filme.class, f.getIdFilme());

        // inicia uma transação
        gerente.getTransaction().begin();

        // excluir o filme no banco de dados
        gerente.remove(filmeExcluir);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public void alterar(Filme f) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // faz um merge - atualizar um registrto
        gerente.merge(f);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public List<Filme> listarTodos() {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Filme> consulta = gerente.createNamedQuery("Filme.Todos", Filme.class);

        return consulta.getResultList();

    }

    public List<Filme> listarPorNome(String nome) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Filme> consulta
                = gerente.createNamedQuery("Filme.porNome", Filme.class);

        consulta.setParameter("nome", "%" + nome + "%");

        return consulta.getResultList();
    }
    
    public List<Filme> listarPorSessao(Filme idFilme) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Filme> consulta
                = gerente.createNamedQuery("Filme.porSessao", Filme.class);

        consulta.setParameter("idFilme", idFilme);

        return consulta.getResultList();
    }

}

package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Produto;

public class ControleProduto {

    public void inserir(Produto p) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // salvar a distribuidora no banco de dados
        gerente.persist(p);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();

    }

    public void excluir(Produto p) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // pegar o objeto do banco utilizando sua chave primária
        Produto produtoExcluir = gerente.find(Produto.class, p.getIdProduto());

        // inicia uma transação
        gerente.getTransaction().begin();

        // excluir a distribuidora no banco de dados
        gerente.remove(produtoExcluir);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public void alterar(Produto p) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // faz um merge - atualizar um registrto
        gerente.merge(p);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public List<Produto> listarTodos() {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Produto> consulta = gerente.createNamedQuery("Produto.Todos", Produto.class);

        return consulta.getResultList();
    }

    public List<Produto> listarPorNome(String descricao) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Produto> consulta
                = gerente.createNamedQuery("Produto.porDescricao", Produto.class);

        consulta.setParameter("descricao", "%" + descricao + "%");

        return consulta.getResultList();
    }

    public List<Produto> listarPorVenda(Produto idProduto) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Produto> consulta
                = gerente.createNamedQuery("Produto.porVenda", Produto.class);

        consulta.setParameter("idProduto", idProduto);

        return consulta.getResultList();
    }

}

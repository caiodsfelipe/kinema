package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Ingresso;
import modelo.Venda;

public class ControleIngresso {

    public void inserir(Ingresso i) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // salvar o ingresso no banco de dados
        gerente.persist(i);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();

    }

    public void excluir(Ingresso i) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // pegar o objeto do banco utilizando sua chave primária
        Ingresso ingressoExcluir = gerente.find(Ingresso.class, i.getIdIngresso());

        // inicia uma transação
        gerente.getTransaction().begin();

        // excluir o ingresso no banco de dados
        gerente.remove(ingressoExcluir);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public void alterar(Ingresso i) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // faz um merge - atualizar um registrto
        gerente.merge(i);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public List<Ingresso> listarTodos() {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Ingresso> consulta = gerente.createNamedQuery("Ingresso.Todos", Ingresso.class);

        return consulta.getResultList();
    }
    
    public List<Ingresso> porVenda(Venda v) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Ingresso> consulta
                = gerente.createNamedQuery("Ingresso.porVenda", Ingresso.class);

        consulta.setParameter("idVenda", v);
        
        return consulta.getResultList();
    }

}

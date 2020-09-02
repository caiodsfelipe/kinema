package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Sala;

public class ControleSala {

    public void inserir(Sala s) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // salvar a sala no banco de dados
        gerente.persist(s);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();

    }

    public void excluir(Sala s) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // pegar o objeto do banco utilizando sua chave primária
        Sala salaExcluir = gerente.find(Sala.class, s.getIdSala());

        // inicia uma transação
        gerente.getTransaction().begin();

        // excluir a sala no banco de dados
        gerente.remove(salaExcluir);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public void alterar(Sala s) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // faz um merge - atualizar um registrto
        gerente.merge(s);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public List<Sala> listarTodas() {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Sala> consulta = gerente.createNamedQuery("Sala.Todas", Sala.class);

        return consulta.getResultList();

    }

    public List<Sala> listarPorNumero(int numero) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Sala> consulta
                = gerente.createNamedQuery("Sala.porNumero", Sala.class);

        consulta.setParameter("numero", numero);

        return consulta.getResultList();
    }

    public List<Sala> listarPorSessao(Sala idSala) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Sala> consulta
                = gerente.createNamedQuery("Sala.porSessao", Sala.class);

        consulta.setParameter("idSala", idSala);

        return consulta.getResultList();
    }

}

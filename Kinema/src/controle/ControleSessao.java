
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Sessao;

public class ControleSessao {
    
    public void inserir(Sessao s) {
        
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // inicia uma transação
        gerente.getTransaction().begin();
        
        // salvar a sessão no banco de dados
        gerente.persist(s);
        
        // finaliza a transação
        gerente.getTransaction().commit();
        
        // finaliza a conexao com o banco
        gerente.close();
        
    }
    
    public void excluir(Sessao s) {
        
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // pegar o objeto do banco utilizando sua chave primária
        Sessao sessaoExcluir = gerente.find(Sessao.class, s.getIdSessao());
        
        // inicia uma transação
        gerente.getTransaction().begin();
        
        // excluir a sessão no banco de dados
        gerente.remove(sessaoExcluir);
        
        // finaliza a transação
        gerente.getTransaction().commit();
        
        // finaliza a conexao com o banco
        gerente.close();
    }
    
    public void alterar(Sessao s) {
        
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
    
    public List<Sessao> listarTodas() {
        
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // criar um objeto do tipo Consulta
        TypedQuery<Sessao> consulta = gerente.createNamedQuery("Sessao.Todas", Sessao.class);
        
        return consulta.getResultList();
        
    }
    
    public List<Sessao> listarTodasDisponiveis() {
        
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // criar um objeto do tipo Consulta
        TypedQuery<Sessao> consulta = gerente.createNamedQuery("Sessao.todasDisponiveis", Sessao.class);
        
        return consulta.getResultList();
        
    }
}

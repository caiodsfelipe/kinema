package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Funcionario;

public class ControleFuncionario {

    private static Funcionario usuarioLogado = null;

    public void inserir(Funcionario f) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // salvar o funcionário no banco de dados
        gerente.persist(f);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();

    }

    public void excluir(Funcionario f) {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // pegar o objeto do banco utilizando sua chave primária
        Funcionario funcionarioExcluir = gerente.find(Funcionario.class, f.getIdFuncionario());

        // inicia uma transação
        gerente.getTransaction().begin();

        // excluir o funcionário no banco de dados
        gerente.remove(funcionarioExcluir);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    public void alterar(Funcionario f) {

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

    public List<Funcionario> listarTodos() {

        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Funcionario> consulta = gerente.createNamedQuery("Funcionario.Todos", Funcionario.class);

        return consulta.getResultList();

    }

    public List<Funcionario> listarPorNome(String nome) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Funcionario> consulta
                = gerente.createNamedQuery("Funcionario.porNome", Funcionario.class);

        consulta.setParameter("nome", "%" + nome + "%");

        return consulta.getResultList();
    }

    // Método de classe que permite pegar o usuário que está logado no sistema
    // retorna null se não houver usuário logado
    public static Funcionario getUsuarioLogado() {
        return usuarioLogado;
    }

    // método de classe que permite saber se há ou não usuário logado. Retorna
    // true se houver usuário logado ou false caso não houver.
    public static boolean isUsuarioLogado() {
        if (usuarioLogado == null) {
            return false;
        } else {
            return true;
        }
    }

    // método de classe que permite indicar ao sistema que o usuário efetuou 
    // logout, ou seja, não há mais usuário logado
    public static void logoutUsuario() {
        ControleFuncionario.usuarioLogado = null;
    }

    // Método de classe que recebe o nome e a senha de um usuário e é capaz de 
    // verificar se esse nome e senha estão correto e posteriormente torna esse 
    // usuário logado no sistema. Retorna false caso o usuário e senha estejam 
    // incorretos e true caso conseguiu logar.
    public static boolean logarUsuario(String cpfUsuario, String senhaUsuario) {

        boolean logou = false;

        EntityManager gerente = GerenciadorConexao.getGerente();

        List<Funcionario> listaUsuarios;

        // cria uma consulta com base na NamedQuery "Usuario.Acessar" que pesquisa
        // por nome de usuário e senha.
        TypedQuery<Funcionario> consultaUsuario
                = gerente.createNamedQuery("Funcionario.Acessar", Funcionario.class);

        consultaUsuario.setParameter("cpf", cpfUsuario);
        consultaUsuario.setParameter("senha", senhaUsuario);

        listaUsuarios = consultaUsuario.getResultList();

        // verifica se na lista de retorno tem algum usuário
        if (listaUsuarios.isEmpty()) {
            // se ela estiver vazia, não há usuário logado
            ControleFuncionario.usuarioLogado = null;

        } else {
            // se houver usuário na lista indicar o primeiro usuário como 
            // sendo o usuário logado
            ControleFuncionario.usuarioLogado = listaUsuarios.get(0);
            logou = true;
        }

        return logou;
    }

    public List<Funcionario> listarPorVenda(Funcionario idFuncionario) {

        EntityManager gerente = GerenciadorConexao.getGerente();

        TypedQuery<Funcionario> consulta
                = gerente.createNamedQuery("Funcionario.porVenda", Funcionario.class);

        consulta.setParameter("idFuncionario", idFuncionario);

        return consulta.getResultList();
    }

}

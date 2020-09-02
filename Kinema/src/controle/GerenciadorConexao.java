
package controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// esta classe tem por objetivo, criar um EntityManagerFactory global para todas
// as outras classes do projeto, e a partir deste EntityManagerFactory, gerar
// várias EntityManager

public class GerenciadorConexao {

    // definindo um EntityManagerFactory "Global" (static)
    private static EntityManagerFactory emf;
    
    public static EntityManagerFactory getFabrica() {
        
        // verifica se a fábrica não existe
        if(emf == null) {
            
            // cria uma EntityManagerFactory e associa a emf
            emf = Persistence.createEntityManagerFactory("KinemaPU");
            
        }
        
        return emf;
    }
    
    public static EntityManager getGerente() {
        
        // retorna uma EntityManager a partir de fábrica existente
        return getFabrica().createEntityManager();
        
    }
    
}
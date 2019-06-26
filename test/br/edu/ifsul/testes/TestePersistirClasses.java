package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Cidade;
import br.edu.ifsul.modelo.Pessoa;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author Jorge
 */
public class TestePersistirClasses {
    
    public TestePersistirClasses() {
    }
    
    @Test
    public void teste(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroPessoasModelPU");
        EntityManager em = emf.createEntityManager();
        Cidade c = new Cidade();
        c.setNome("Passo Fundo");
        c.setUf("RS");
        Pessoa p = new Pessoa();
        p.setNome("João");
        p.setSalario(2000.00);
        p.setNascimento(Calendar.getInstance());
        p.setCidade(c);
        em.getTransaction().begin();
        em.persist(c);
        em.persist(p);
        em.getTransaction().commit();
    }
    
}

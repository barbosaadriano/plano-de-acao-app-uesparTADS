package br.com.adrianob.service;

import br.com.adrianob.model.domain.Responsavel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrador
 */
public class DaoGenerico {

    private static DaoGenerico instance;

    public static DaoGenerico getInstance() {
        if (DaoGenerico.instance == null) {
            DaoGenerico.instance = new DaoGenerico();
        }
        return instance;
    }

    public static final String SALVAR = "salvar";
    public static final String REMOVER = "remover";

    private EntityManagerFactory emf;
    private EntityManager em;

    private DaoGenerico() {
        this.emf = Persistence.createEntityManagerFactory("puACAO");
        this.em = emf.createEntityManager();
    }

    public void salvarOuRemover(List lista, String tipo) {
        em.getTransaction().begin();
        Iterator<Object> it = lista.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            o = em.merge(o);
            if (tipo.equalsIgnoreCase(DaoGenerico.SALVAR)) {
                em.persist(o);
            } else if (tipo.equalsIgnoreCase(DaoGenerico.REMOVER)) {
                em.remove(o);
            }
        }
        em.getTransaction().commit();
    }

    public List listar(String sql, Map<String, String> p) {
        Query qry = em.createQuery(sql);
        if (p.size() > 0) {
            Iterator<Map.Entry<String, String>> it = p.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                qry.setParameter(next.getKey(), next.getValue());
            }
        }
        return qry.getResultList();
    }

    public void closeEm() {
        em.close();
        emf.close();
        DaoGenerico.instance = null;
    }
}

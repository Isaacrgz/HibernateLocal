package mx.com.iri.dao;

import jakarta.persistence.*;
import java.util.List;
import mx.com.iri.domain.Person;

public class PersonDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public List<Person> listar() {
        String hql = "SELECT p FROM Person p";
        Query query = em.createQuery(hql);
        List<Person> people = query.getResultList();

        return people;
    }

    // si la aplicacion no esta en un servidor empresarial como glassfish, jboss, etc. se debe hacer el cerrar las peticiones manualmente
    public void insertar(Person person) {
        try {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } //finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public void modificar(Person person) {
        try {
            em.getTransaction().begin();
            em.merge(person);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } //finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public Person buscarPersonaPorId(Person person) {
        return em.find(Person.class, person.getIdPerson());
    }
    
    public void eliminar(Person person) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(person));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } //finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
}

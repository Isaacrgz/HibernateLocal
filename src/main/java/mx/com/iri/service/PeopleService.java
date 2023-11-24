package mx.com.iri.service;

import java.util.List;
import mx.com.iri.dao.PersonDAO;
import mx.com.iri.domain.Person;

public class PeopleService {
    
    private PersonDAO personDAO;
    
    public PeopleService() {
        this.personDAO = new PersonDAO();
    }
    
    public List<Person> listaPeople() {
        return this.personDAO.listar();
    }
}

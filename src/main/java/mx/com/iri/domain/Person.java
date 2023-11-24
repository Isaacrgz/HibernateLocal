package mx.com.iri.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "person") //puede usarse para especificar el nombre de la tabla cuando no se encuentra por caracteries o Modelo diferente al nombre de la tabla
public class Person implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Column(name="id_person") //se especifica el nombre de la columna cuando no cuincide con la variable
    @Id
    private int idPerson;
    
    private String name;
    
    private String lastname;
    
    private String email;
    
    private String phone;
    
    public Person(){
    }

    public Person(int idPerson, String name, String lastname, String email, String phone) {
        this.idPerson = idPerson;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }
    

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + ", name=" + name + ", lastname=" + lastname + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
    
}

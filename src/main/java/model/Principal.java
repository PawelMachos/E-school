package model;

import javax.persistence.*;


@Entity(name = "Principa")
@Table(name = "principat")
public class Principal extends EntityBase {


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}


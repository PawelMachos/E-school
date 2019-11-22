package model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Student")
@Table(name = "student")
public class Student extends EntityBase {

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Grade> grades;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "Group")
    public Group group;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Grade> getGrades(){
        return grades;
    }

    public void setGrades(List<Grade> grades){
        this.grades = grades;
    }
}

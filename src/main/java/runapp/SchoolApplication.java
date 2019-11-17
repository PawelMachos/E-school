package runapp;

import com.google.common.collect.Lists;
import model.Person;
import model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class SchoolApplication {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.sda.school_project");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Person p = new Person();
        p.setFirstName("Jan");
        p.setLastName("Kowalski");
//
//        Student s = new Student();
//        s.setPerson(p);
//        s.setGrades(Lists.newArrayList(new Grade(5,s), new Grade(3,s)));
//        //s.setGrades(Arrays.asList(new Grade(5,s), new Grade(3, s))); - alternatywa dla bez google collections dependencies
//
//        em.persist(s);
//        em.getTransaction().commit();

        String query = "SELECT s FROM Student s WHERE s.person.firstName =:firstName AND s.person.lastName =:lastName";

        List<Student> people = em.createQuery(query)
                .setParameter("lastName", "Kovalski").setParameter("firstName", "Janek").getResultList();

        Student found = em.find(Student.class, 2L);

        em.getTransaction().begin();
        Student student = em.find(Student.class, 3L);
        student.getPerson().setFirstName("Tadeusz");
        em.merge(student);
        em.getTransaction().commit();
        
    }
}

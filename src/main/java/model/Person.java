package model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "person")
@Entity(name = "Person")
public class Person extends EntityBase {

    @Column(name = "first_name", updatable = true)
    private String firstName;

    @Column(name = "last_name", updatable = true)
    private String lastName;

    @Column(name = "birth_Date")
    private Date birthDate;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;


    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public Date getBirthDate() { return birthDate; }

    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }




}

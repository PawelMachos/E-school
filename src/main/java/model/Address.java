package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Address")
@Table(name = "address")
public class Address extends EntityBase {

    @Column(name = "person_id")
    private Integer person_id;

    @Column(name = "contact_data", nullable = false)
    private String contact_data;

    public Integer getPerson_id() { return person_id; }

    public void setPerson_id(Integer person_id) { this.person_id = person_id; }

    public String getContact_data() { return contact_data; }

    public void setContact_data(String contact_data) { this.contact_data = contact_data; }
}

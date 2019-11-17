package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "group")
@Entity(name = "Group")
public class Group extends EntityBase {

    @Column(name = "name", nullable = false)
    private String name;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}

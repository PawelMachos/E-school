package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Subject")
@Table(name = "subject")
public class Subject {

@Column(name = "name", nullable = false)
    private String name;

@Column(name = "class_id", nullable = false)
    private Integer class_id;

@Column(name = "teacher_id", nullable = false)
    private Integer teacher_id;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getClass_id() { return class_id; }

    public void setClass_id(Integer class_id) { this.class_id = class_id; }

    public Integer getTeacher_id() { return teacher_id; }

    public void setTeacher_id(Integer teacher_id) { this.teacher_id = teacher_id; }
}

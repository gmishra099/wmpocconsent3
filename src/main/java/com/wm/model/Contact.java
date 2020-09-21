package com.wm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "contact", schema="salesforce")
public class Contact {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "Name")
    private String name;
    


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s'}", id, name);
    }
}

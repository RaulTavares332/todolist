package com.raultavares.Todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private boolean realized;
    private int prioritized;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isRealized() {
        return realized;
    }
    public void setRealized(boolean realized) {
        this.realized = realized;
    }
    public int getPrioritized() {
        return prioritized;
    }
    public void setPrioritized(int prioritized) {
        this.prioritized = prioritized;
    }

    
}

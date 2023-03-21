package org.ironhack.bootcamp.jpt13.jpa.models.relations;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Spell {

    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private SpellLevel level;


    @ManyToMany(mappedBy = "spells")
    private List<Student> students = new ArrayList<>();


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

    public SpellLevel getLevel() {
        return level;
    }

    public void setLevel(SpellLevel level) {
        this.level = level;
    }
}

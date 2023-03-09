package org.ironhack.bootcamp.jpt13.jpa.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class MathSection extends Section {
    @Column(name = "math_credits")
    private final int mathCredit;

    public MathSection(int mathCredit) {
        super(30);
        this.mathCredit = mathCredit;
    }

    public int getMathCredit() {
        return mathCredit;
    }
    // other constructors, getters, and setters were omitted for brevity
}

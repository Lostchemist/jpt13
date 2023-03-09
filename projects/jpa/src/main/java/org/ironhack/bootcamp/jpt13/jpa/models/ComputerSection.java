package org.ironhack.bootcamp.jpt13.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class ComputerSection extends Section {
    @Column(name = "computer_credits")
    private final int computerCredit;

    public ComputerSection() {
        super();
        this.computerCredit = 10;
    }

    public ComputerSection(int computerCredit) {
        super(15);
        this.computerCredit = computerCredit;
    }

    public int getComputerCredit() {
        return computerCredit;
    }
}

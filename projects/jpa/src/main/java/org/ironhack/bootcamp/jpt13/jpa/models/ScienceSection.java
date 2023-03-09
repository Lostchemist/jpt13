package org.ironhack.bootcamp.jpt13.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class ScienceSection extends Section {
    @Column(name = "science_credits")
    private final int scienceCredit;
    private Integer labRoomNum;

    public ScienceSection() {
        super();
        this.scienceCredit = 15;
    }

    public ScienceSection(int scienceCredit) {
        super(30);
        this.scienceCredit = scienceCredit;
    }

    public Integer getLabRoomNum() {
        return labRoomNum;
    }

    public void setLabRoomNum(Integer labRoomNum) {
        this.labRoomNum = labRoomNum;
    }

    public int getScienceCredit() {
        return scienceCredit;
    }
    // other constructors, getters, and setters were omitted for brevity
}

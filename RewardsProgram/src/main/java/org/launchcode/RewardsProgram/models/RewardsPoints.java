package org.launchcode.RewardsProgram.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RewardsPoints {

    @Id
    @GeneratedValue
    private int id;

    private int points;

    public RewardsPoints() {}
    public RewardsPoints(int points) {
        this.points = points;
    }

}

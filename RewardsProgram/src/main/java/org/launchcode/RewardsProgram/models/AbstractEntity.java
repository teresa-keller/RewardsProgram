package org.launchcode.RewardsProgram.models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    public void totalPoints() {
        return;
    }
//
//    public String totalPoints(double amount) {
//        double firstHundred = 0;
//        double onePointTotal = 0;
//        double extra = 0;
//        double twoPointsTotal = 0;
//        double points = 0;
//        if (amount < 50) {
//            return "No points earned.";
//        } else if (amount >= 50 && amount < 100) {
//            firstHundred = amount - 50;
//
//        } else {
//            firstHundred = 50;
//            extra = amount - 100;
//        }
//        onePointTotal = firstHundred * 1;
//        twoPointsTotal = extra * 2;
//        points = onePointTotal + twoPointsTotal;
//
//        return "You have earned " + points + "points.";
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractEntity)) return false;
        AbstractEntity that = (AbstractEntity) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

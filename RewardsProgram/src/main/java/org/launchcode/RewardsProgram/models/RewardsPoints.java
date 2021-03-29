package org.launchcode.RewardsProgram.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "rewardsPoints")
public class RewardsPoints extends AbstractEntity{

//    @OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private double points;
    private List<RewardsPoints> earnedPoints = new ArrayList<>();

    private Purchase purchase = new Purchase();
    private final double amount = purchase.getAmount();
    public List<RewardsPoints> getPoints() {
        return earnedPoints;
    }

    public RewardsPoints() {}

    public RewardsPoints(double points){
        this.points = points;
        totalPoints();
    }

    public double totalPoints(double amount) {
        double firstHundred = 0;
        double onePointTotal = 0;
        double extra = 0;
        double twoPointsTotal = 0;
        double points = 0;
        if (amount < 50) {
            points = 0;
        } else if (amount >= 50 && amount < 100) {
            firstHundred = amount - 50;

        } else {
            firstHundred = 50;
            extra = amount - 100;
        }
        onePointTotal = firstHundred * 1;
        twoPointsTotal = extra * 2;
        points = onePointTotal + twoPointsTotal;
        return points;
    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof RewardsPoints)) return false;
//        RewardsPoints that = (RewardsPoints) o;
//        return getId() == that.getId() && Objects.equals(getPoints(), that.getPoints());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getPoints());
//    }
}

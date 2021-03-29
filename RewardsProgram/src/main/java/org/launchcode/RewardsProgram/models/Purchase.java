package org.launchcode.RewardsProgram.models;

import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "purchase")
public class Purchase extends AbstractEntity{

    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "rewardsPoints_id",referencedColumnName = "id",nullable = false,unique = true)
    private RewardsPoints points;

    private double amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Purchase() {}

    public Purchase(double amount, Date date, RewardsPoints points) {
        this.amount = amount;
        this.date = date;
        this.points = points;
    }

    public String totalPoints(double amount) {
        double firstHundred = 0;
        double onePointTotal = 0;
        double extra = 0;
       double twoPointsTotal = 0;
        double points = 0;
        if (amount < 50) {
            return "No points earned.";
        } else if (amount >= 50 && amount < 100) {
            firstHundred = amount - 50;

        } else {
            firstHundred = 50;
            extra = amount - 100;
        }
        onePointTotal = firstHundred * 1;
        twoPointsTotal = extra * 2;
        points = onePointTotal + twoPointsTotal;

        return "You have earned " + points + "points.";
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public RewardsPoints getPoints() {
        return points;
    }

    public void setPoints(RewardsPoints points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchase)) return false;
        Purchase purchase = (Purchase) o;
        return getId() == purchase.getId() && Double.compare(purchase.getAmount(), getAmount()) == 0 && Objects.equals(getDate(), purchase.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAmount(), getDate());
    }
}

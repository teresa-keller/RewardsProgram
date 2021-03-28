package org.launchcode.RewardsProgram.models;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Purchase {

    @Id
    @GeneratedValue
    private int id;

    private double amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Purchase() {}

    public Purchase(double amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchase)) return false;
        Purchase purchase = (Purchase) o;
        return getId() == purchase.getId() &&
                Double.compare(purchase.getAmount(), getAmount()) == 0 &&
                getDate() == purchase.getDate();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAmount(), getDate());
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}

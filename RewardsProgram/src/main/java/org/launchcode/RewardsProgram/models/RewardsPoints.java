package org.launchcode.RewardsProgram.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "rewardsPoints")
public class RewardsPoints extends AbstractEntity{

//    @OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private final List<RewardsPoints> points = new ArrayList<>();


    public RewardsPoints() {}

    public RewardsPoints(List<RewardsPoints> points) {
    }

//    public List<RewardsPoints> getPoints() {
//        return points;
//    }


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

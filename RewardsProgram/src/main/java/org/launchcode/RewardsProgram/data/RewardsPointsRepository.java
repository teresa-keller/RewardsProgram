package org.launchcode.RewardsProgram.data;

import org.launchcode.RewardsProgram.models.RewardsPoints;
import org.springframework.data.repository.CrudRepository;

public interface RewardsPointsRepository extends CrudRepository<RewardsPoints, Integer> {
}

package org.launchcode.RewardsProgram.data;

import org.launchcode.RewardsProgram.models.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
}

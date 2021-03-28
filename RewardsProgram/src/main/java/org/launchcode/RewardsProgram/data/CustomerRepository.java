package org.launchcode.RewardsProgram.data;

import org.launchcode.RewardsProgram.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}

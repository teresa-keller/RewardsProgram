package org.launchcode.RewardsProgram;

import org.launchcode.RewardsProgram.data.CustomerRepository;
import org.launchcode.RewardsProgram.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    @Autowired
    public DatabaseLoader (CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.customerRepository.save(new Customer("Frodo", "Baggins"));
    }
}

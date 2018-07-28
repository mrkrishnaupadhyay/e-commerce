package com.dragomir.ecommerce.repositories;

import com.dragomir.ecommerce.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

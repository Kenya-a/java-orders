package com.lambdaschool.javaorders.repos;

import com.lambdaschool.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
}

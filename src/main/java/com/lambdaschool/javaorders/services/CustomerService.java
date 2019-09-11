package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;

import java.util.List;

public interface CustomerService
{
    List<Customer> findAll();
    Customer findAgentById(long id);
    Customer findAgentByName(String name);
    void delete(long id);
    Customer save(Customer customer);
    Customer update(Customer customer, long id);
}


//package com.lambdaschool.javaorders.services;
//
//import com.lambdaschool.javaorders.models.Agent;
//
//import java.util.List;
//
//public interface AgentService
//{
//    List<Agent> findAll();
//    Agent findAgentById(long id);
//    Agent findAgentByName(String name);
//    void delete(long id);
//    Agent save(Agent agent);
//    Agent update(Agent agent, long id);
//
//}
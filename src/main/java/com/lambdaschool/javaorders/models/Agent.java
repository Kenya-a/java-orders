package com.lambdaschool.javaorders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agents")
public class Agent
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long agentcode;

    @Column(unique = true, nullable = false)
    private String agentname;

    private String workingarea;
    private double commission;
    private String phone;
    private String country;

    //one to many
    @OneToMany
    private List<Customer> customers = new ArrayList<>();
}

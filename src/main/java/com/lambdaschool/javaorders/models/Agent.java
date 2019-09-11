package com.lambdaschool.javaorders.models;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "agents")
public class Agent
{
    @Column(unique = true, nullable = false)
    private String agentname;

    private String workingarea;
    private double commission;
    private String phone;
    private String country;
}

package com.lambdaschool.javaorders.services;


import com.lambdaschool.javaorders.models.Agent;
import com.lambdaschool.javaorders.repos.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "agentService")
public class AgentServiceImpl implements AgentService
{
    @Autowired
    private AgentRepository agentrepos;

    @Override
    public List<Agent> findAll()
    {
        List<Agent> list = new ArrayList<>();
        agentrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Agent findAgentById(long id)
    {
        return null;
    }

    @Override
    public Agent findAgentByName(String name)
    {
        return null;
    }

    @Override
    public void delete(long id)
    {

    }

    @Override
    public Agent save(Agent agent)
    {
        return null;
    }

    @Override
    public Agent update(Agent agent, long id)
    {
        return null;
    }
}

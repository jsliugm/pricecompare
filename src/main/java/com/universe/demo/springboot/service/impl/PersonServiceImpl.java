package com.universe.demo.springboot.service.impl;

import com.universe.demo.springboot.entity.Person;
import com.universe.demo.springboot.mapper.PersonMapper;
import com.universe.demo.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public void addPerson() {
        Person p = new Person();
        p.setName("zhangsan");
        personMapper.insert(p);
    }
}

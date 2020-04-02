package com.universe.demo.springboot.controller;

import com.universe.demo.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {
    @Autowired
    private PersonService personService;
    @RequestMapping("/person/add")
    public void select(){
        personService.addPerson();
    }
}

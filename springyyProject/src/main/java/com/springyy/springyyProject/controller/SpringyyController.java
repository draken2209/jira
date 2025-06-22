package com.springyy.springyyProject.controller;


import com.springyy.springyyProject.entity.springyyPojos;
import com.springyy.springyyProject.service.springyyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

// key points
// ORM : object - relational -mapping  used to map java objects to data base
//       allows us t ouse oops concepts  and make interaction with DB easy
//       eg hibernate what it basically does is maps feild names to colums in DB
//JPA : java persistance api is a way to achive ORM its like set of rules have interfaces and annotaes etc
//spring JPA its built on top of JPA to make more abstaction
//tese are for sql DBs so JPAs are set only with sqls DBs
//quer medhod DSL and criteria API are 2 differnt ways to interact with DB with spring JPA(SQLs) or spring data MONGODB
//quer medhod DSL based on method naming convanetions we can create a query criteria DP approch for compex queries

@RestController
@RequestMapping("/task")
public class SpringyyController {

    @Autowired
    private springyyService service;


    @GetMapping
    public List<springyyPojos> getListOfTasks() {
        return null;
    }

    @PostMapping
    public boolean postTask(@RequestBody springyyPojos entry) {
        service.postTasks(entry);
        return true;
    }

    @GetMapping("/{id}")
    public springyyPojos getById(@PathVariable UUID id) {
        return null;
    }


}

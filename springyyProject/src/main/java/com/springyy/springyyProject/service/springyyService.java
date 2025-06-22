package com.springyy.springyyProject.service;

import com.springyy.springyyProject.entity.springyyPojos;
import com.springyy.springyyProject.repo.springyyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class springyyService {
    @Autowired
    private springyyRepo springyyRepo;

    public void postTasks(springyyPojos data){
        springyyRepo.save(data);

    }

}

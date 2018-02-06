package com.example.service;

import org.springframework.stereotype.Component;

/**
 * Created by wzb on 2018/2/5.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

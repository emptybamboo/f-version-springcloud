package com.example.sericefeign.controller;

import com.example.sericefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lanjun
 * @Date 2021/5/12 9:28
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}

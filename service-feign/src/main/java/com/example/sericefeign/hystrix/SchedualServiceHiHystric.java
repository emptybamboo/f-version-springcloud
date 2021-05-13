package com.example.sericefeign.hystrix;

import com.example.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author lanjun
 * @Date 2021/5/12 11:16
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}

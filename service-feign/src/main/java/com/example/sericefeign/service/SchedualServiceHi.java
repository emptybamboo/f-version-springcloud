package com.example.sericefeign.service;

import com.example.sericefeign.hystrix.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value="name") String name);
}

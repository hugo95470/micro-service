package com.equi.talkandpokeloadbalancer.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadBalancerControler {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping(value = "/")
    public String method() {
        ServiceInstance serviceInstance = loadBalancer.choose("talkandpokeapi1");
        return serviceInstance.getUri().toString();
    }
}

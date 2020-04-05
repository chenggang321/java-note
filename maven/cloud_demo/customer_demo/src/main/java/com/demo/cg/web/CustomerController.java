package com.demo.cg.web;

import com.demo.cg.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("{id}")
    public Items queryById(@PathVariable("id") Long id){
        // 获取服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("items-service");
        // 从实例中获取ip和端口
        ServiceInstance instance = instances.get(0);
        String url = "http://"+instance.getHost()+":"+instance.getPort()+"/items/" + id;
        return restTemplate.getForObject(url,Items.class);
    }
}

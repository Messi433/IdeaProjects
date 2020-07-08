package org.example.product.controller;

import org.example.product.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 模拟订单服务
 * 订单模块9002, 调用商品服务接口9001
 * 这里演示调用微服务的方式
 */
@RestController //Restful风格
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate; //Spring提供的restTemplate

    @Autowired
    private DiscoveryClient discoveryClient; // springcloud提供的元数据工具类 => 调用方法获取元数据信息

    /**
     * 方式1：restTemplate，硬编码方式调用
     */

   /* @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {
        //硬编码方式，把地址写死
        Product product = restTemplate.getForObject("http://127.0.0.1:9001/product/" + id, Product.class);
        //通过获取元数据，拼接地址，防止了硬编码
        return product;
    }*/

    /**
     * 方式2：通过discoveryClient的API获取对象元数据 => 拼接成url => 再调用restTemplate
     */

   /* @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {
        //调用discoveryClient对象的方法 => 获取元数据
        List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
        //获取唯一的一个元数据
        ServiceInstance instance = instances.get(0);
        //通过获取元数据，拼接地址，防止了硬编码
        Product product = restTemplate.getForObject("http://" + instance.getHost() + ":" + instance.getPort() + "/product/" + id, Product.class);
        return product;
    }*/

    /**
     * 方式3：@LoadBalanced => 请求http不用输入指定ip地址，输入service-product
     */
     @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {
        //硬编码方式，把地址写死
        Product product = restTemplate.getForObject("http://service-product:9001/product/" + id, Product.class);
        //通过获取元数据，拼接地址，防止了硬编码
        return product;
    }
}

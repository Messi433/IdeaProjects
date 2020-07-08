package org.example.product.controller;

import org.example.product.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

    /**
     * 方式1：restTemplate，硬编码方式调用
     */

    /*@RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {
        //硬编码方式，把地址写死
        Product product = restTemplate.getForObject("http://127.0.0.1:9001/product/" + id, Product.class);
        //通过获取元数据，拼接地址，防止了硬编码
        return product;
    }*/

    /**
     * 方式1：restTemplate，根据服务名称调用
     */
    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {
        //硬编码方式，把地址写死
        Product product = restTemplate.getForObject("http://service-product/product/" + id, Product.class);
        //通过获取元数据，拼接地址，防止了硬编码
        return product;
    }

}

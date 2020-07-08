package org.example.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Product启动类
 */
@SpringBootApplication
@EntityScan("org.example.product.domain")
public class OrderApplication {
    /**
     * 使用spring提供的RestTemplate发送http请求到商品服务
     *     1.创建RestTemplate对象交给容器管理
     *     2.在使用的时候，调用其方法完成操作(getXX, postxxx)
     *     @LoadBalanced :是ribbon提供的负载均衡的注解
     */
    @LoadBalanced //加入该注解后若用host地址而不用服务名称发送http请求，则会报错.
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}

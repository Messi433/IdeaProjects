package com.example.cglib;

import com.example.Proxy.IProducer;

/**
 * 模拟一个生产者
 */
public class Producer {

    /**
     * 销售
     *
     * @param money
     */
    public void sale(float money) {
        System.out.println("销售产品，拿到钱  " + money);
    }

    /**
     * 售后
     *
     * @param money
     */
    public void backSale(float money) {
        System.out.println("解决售后，拿到钱  " + money);
    }
}

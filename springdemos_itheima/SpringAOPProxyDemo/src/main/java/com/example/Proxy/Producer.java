package com.example.Proxy;

/**
 * 模拟一个生产者
 */
public class Producer implements IProducer {

    /**
     * 销售
     * @param money
     */
    @Override
    public void sale(float money) {
        System.out.println("销售产品，拿到钱  "+money);
    }

    /**
     * 售后
     * @param money
     */
    @Override
    public void backSale(float money) {
        System.out.println("解决售后，拿到钱  "+money);
    }
}

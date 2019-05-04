package com.gp.learn.pattern.adapter;

/**
 * @author wjzhu
 * @createDate 2019-05-04 16:41
 */
public class AliPayAdapter implements PayAdapter{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof AliPayAdapter;
    }
    @Override
    public void pay() {
        System.out.println("支付宝支付");

    }
}

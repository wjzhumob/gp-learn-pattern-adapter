package com.gp.learn.pattern.adapter;

/**
 * @author wjzhu
 * @createDate 2019-05-04 16:51
 */
public class WechatAdapter implements PayAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof WechatAdapter;
    }

    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}

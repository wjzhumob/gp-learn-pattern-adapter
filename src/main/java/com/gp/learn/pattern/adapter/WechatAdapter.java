package com.gp.learn.pattern.adapter;

/**
 * @author wjzhu
 * @createDate 2019-05-04 16:51
 */
public class WechatAdapter extends Pay implements PayAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof WechatAdapter;
    }

    @Override
    public void pay() {
        System.out.println("微信转现金");
        super.pay();
    }
}

package com.gp.learn.pattern.adapter;

/**
 * @author wjzhu
 * @createDate 2019-05-04 16:53
 */
public class ThirdAdapter extends Pay {

    public void payForAli(){
        processPay(AliPayAdapter.class);
    }

    public void payForWechat(){
        processPay(WechatAdapter.class);
    }

    private void processPay(Class<? extends PayAdapter> clazz) {
        try {
            PayAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                adapter.pay();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

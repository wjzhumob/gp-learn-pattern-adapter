package com.gp.learn.pattern.adapter;

/**
 * @author wjzhu
 * @createDate 2019-05-04 16:57
 */
public class PayTest {
    public static void main(String[] args) {
        ThirdAdapter third = new ThirdAdapter();
        third.payForAli();
        third.payForWechat();
    }
}

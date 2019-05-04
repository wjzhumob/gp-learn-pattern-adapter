package com.gp.learn.pattern.adapter;

/**
 * @author wjzhu
 * @createDate 2019-05-04 16:40
 */
public interface PayAdapter {
    boolean support(Object adapter);
    void pay();
}

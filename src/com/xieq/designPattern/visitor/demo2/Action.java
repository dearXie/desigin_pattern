package com.xieq.designPattern.visitor.demo2;


/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public abstract  class Action {
    protected String type;
    abstract void getManAction(Man man);

    abstract void getWomanAction(Woman woman);

}

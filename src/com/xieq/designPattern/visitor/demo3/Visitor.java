package com.xieq.designPattern.visitor.demo3;

/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public abstract class Visitor {

    public String visitorName;

    public abstract void visitorElementA(ElementA elementA);

    public abstract void visitorElementB(ElementB elementA);

    public abstract String getVisitorName();
}

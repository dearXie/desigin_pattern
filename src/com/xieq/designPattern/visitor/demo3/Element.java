package com.xieq.designPattern.visitor.demo3;

/**
 *
 * @author xieq
 */
public abstract  class Element {
    public String elementName;
    public abstract void accept(Visitor visitor);
    public abstract String getElementName();
}

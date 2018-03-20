package com.xieq.designPattern.visitor.demo3;

/**
 *
 * @author xieq
 */
public class ElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorElementB(this);
    }

    public ElementB() {
        this.elementName = "element B";
    }

    @Override
    public String getElementName() {
        return this.elementName;
    }
}

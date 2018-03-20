package com.xieq.designPattern.visitor.demo3;

/**
 *
 * @author xieq
 */
public class ElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorElementA(this);
    }

    public ElementA() {
        this.elementName = "element A";
    }

    @Override
    public String getElementName() {
        return this.elementName;
    }
}

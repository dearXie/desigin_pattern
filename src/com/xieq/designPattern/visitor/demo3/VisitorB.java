package com.xieq.designPattern.visitor.demo3;

/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class VisitorB extends Visitor {
    @Override
    public void visitorElementA(ElementA elementA) {
        System.out.println(this.getVisitorName() + "访问" + elementA.getElementName() + "的属性");
    }

    @Override
    public void visitorElementB(ElementB elementB) {
        System.out.println(this.getVisitorName() + "访问" + elementB.getElementName() + "的属性");
    }

    public VisitorB() {
        this.visitorName = "visitor B";
    }

    @Override
    public String getVisitorName() {
        return this.visitorName;
    }
}

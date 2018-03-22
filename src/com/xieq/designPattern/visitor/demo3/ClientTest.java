package com.xieq.designPattern.visitor.demo3;

/**
 * <p>其他说明: 无</p>
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class ClientTest {

    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();

        ElementA elementA = new ElementA();
        o.addElement(elementA);
        ElementB elementB = new ElementB();
        o.addElement(elementB);

        VisitorA visitorA = new VisitorA();
        o.display(visitorA);
        VisitorB visitorB = new VisitorB();
        o.display(visitorB);
    }
}

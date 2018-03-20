package com.xieq.designPattern.visitor.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>其他说明: 无</p>
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class ObjectStructure {
    public List<Element> list = new ArrayList<>();

    public void addElement(Element element){
        this.list.add(element);
    }
    public void removeElement(Element element){
        this.removeElement(element);
    }

    public void display(Visitor visitor){
        for (Element element : list) {
            element.accept(visitor);
        }
    }
}

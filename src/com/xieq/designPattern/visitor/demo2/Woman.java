package com.xieq.designPattern.visitor.demo2;

/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class Woman extends Person {

    public  String getName(){
        return  "女人";
    }
    @Override
    public void accept(Action action) {
        action.getWomanAction(this);
    }
}

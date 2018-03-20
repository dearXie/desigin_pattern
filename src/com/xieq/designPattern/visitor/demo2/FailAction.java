package com.xieq.designPattern.visitor.demo2;

/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class FailAction extends Action {
    @Override
    void getManAction(Man man) {
        System.out.println("当" + man.getName() + this.getType() +"喝闷酒谁也别劝");
    }

    @Override
    void getWomanAction(Woman woman) {
        System.out.println("当" + woman.getName() + this.getType() +"两眼泪汪汪，谁也劝不动");
    }

    public FailAction() {
        this.type="失败";
    }

    public String getType() {
        return this.type;
    }

}

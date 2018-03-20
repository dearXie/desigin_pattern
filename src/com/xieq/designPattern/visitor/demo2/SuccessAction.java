package com.xieq.designPattern.visitor.demo2;

/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class SuccessAction extends Action {
    @Override
    void getManAction(com.xieq.designPattern.visitor.demo2.Man man) {
        System.out.println( "当"+man.getName()+ this.getType()+"时，背后多半有一个伟大的女人！");
    }

    @Override
    void getWomanAction(com.xieq.designPattern.visitor.demo2.Woman woman) {
        System.out.println("当"+woman.getName()+this.getType()+"时，背后多半有一个不成功的男人！");
    }

    public SuccessAction() {
        this.type="成功";
    }


    public String getType(){
        return this.type;
    }
}

package com.xieq.designPattern.visitor.demo1;

/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class Man extends Person {
    @Override
    void showState() {
        if (this.state.equals("成功")) {
            System.out.println("男人成功时，背后多半有一个伟大的女人");
        }
        if (this.state.equals("失败")) {
            System.out.println("男人失败时，喝闷酒谁也不用劝");
        }
        if (this.state.equals("恋爱")) {
            System.out.println("男人恋爱时，遇事不懂装懂");
        }
    }

    public Man(String state) {
        this.state = state;
    }
}

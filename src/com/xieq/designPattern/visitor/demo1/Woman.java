package com.xieq.designPattern.visitor.demo1;

/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class Woman extends Person {

    @Override
    void showState() {
        if (this.state.equals("成功")) {
            System.out.println("女人成功时，背后多半有个不成功的男人");
        }
        if (this.state.equals("失败")) {
            System.out.println("女人失败时，两眼泪汪汪，谁也劝不了");
        }
        if (this.state.equals("恋爱")) {
            System.out.println("女人恋爱时，遇事懂也装不懂");
        }
    }

    public Woman(String state) {
        this.state = state;
    }
}

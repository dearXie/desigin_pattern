package com.xieq.designPattern.visitor.demo2;

/**
 * <p>文件名称: ${FILE_NAME}</p>
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class Man extends com.xieq.designPattern.visitor.demo2.Person {

    public  String getName(){
        return "男人";
    }
    @Override
    public void accept(Action visitor) {
        visitor.getManAction(this);
    }
}

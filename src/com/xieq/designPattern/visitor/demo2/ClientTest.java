package com.xieq.designPattern.visitor.demo2;

/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class ClientTest {

    static ObjectStructure o = new ObjectStructure();
    static SuccessAction success = new SuccessAction();
    static FailAction fail = new FailAction();

    public static void main(String[] args) {
        Man man = new Man();
        o.addPerson(man);

        Woman woman = new Woman();
        o.addPerson(woman);

        o.desplay(success);
        o.desplay(fail);
    }
}

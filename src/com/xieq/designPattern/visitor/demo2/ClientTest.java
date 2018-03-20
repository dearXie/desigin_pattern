package com.xieq.designPattern.visitor.demo2;

/**
 * <p>文件名称: ${FILE_NAME}</p>
 * <p>文件描述: 用户管理实现类</p>
 * <p>版权所有: 版权所有(C)2017</p>
 * <p>公 司: 深圳竹云科技有限公司</p>
 * <p>内容摘要: 主要包含了用户的增删查改启用禁用</p>
 * <p>其他说明: 无</p>
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

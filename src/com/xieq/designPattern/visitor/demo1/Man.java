package com.xieq.designPattern.visitor.demo1;

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

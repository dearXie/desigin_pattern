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

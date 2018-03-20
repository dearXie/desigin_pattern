package com.xieq.designPattern.visitor.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class client {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        Man man1 = new Man("成功");
        person.add(man1);
        Woman woman1 = new Woman("成功");
        person.add(woman1);
        Man man2 = new Man("失败");
        person.add(man2);
        Woman woman2 = new Woman("失败");
        person.add(woman2);

        Man man3 = new Man("恋爱");
        person.add(man3);

        Woman woman3 = new Woman("恋爱");
        person.add(woman3);

        for (Person p : person) {
            p.showState();
        }

    }
}

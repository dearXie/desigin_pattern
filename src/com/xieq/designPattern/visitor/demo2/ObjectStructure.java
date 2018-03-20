package com.xieq.designPattern.visitor.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>完成日期: 2018/3/20 0020</p>
 *
 * @author xieq
 */
public class ObjectStructure {

    public List<Person> persons = new ArrayList<>();

    public void addPerson(Person p) {
        persons.add(p);
    }

    public void removePerson(Person p) {
        persons.remove(p);
    }

    public void desplay(Action visitor) {
        for (Person person : persons) {
            person.accept(visitor);
        }
    }
}

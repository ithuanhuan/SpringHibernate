package net.xiayule.springhibernate.model;

/**
 * Created by huan on 2015/5/29 0029.
 */
public class Person {
    private Integer id;

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

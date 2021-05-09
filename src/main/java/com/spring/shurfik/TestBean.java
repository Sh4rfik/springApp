package com.spring.shurfik;

public class TestBean {

    private String name;

    public TestBean(String name) {
        System.out.println("Create new testBean");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

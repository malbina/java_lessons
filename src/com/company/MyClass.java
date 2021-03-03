package com.company;

public class MyClass {
    private long id;
    private String name;

    public MyClass(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals (Object obj){
        MyClass other =(MyClass) obj;
        return id ==other.id&& name.equals(other.name);
    }
}

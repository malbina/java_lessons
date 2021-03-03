package com.company;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + age;
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,age);
    }

    @Override
    public boolean equals(Object obj) {
      if (this==obj)  return true;
      if(this instanceof Cat){
          Cat cat = (Cat)obj;
          return cat.getName().equals(this.getName()) &&
                  cat.getAge()==this.getAge();
      }
      return false;


}
}
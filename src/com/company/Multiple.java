package com.company;

import java.util.Objects;

public class Multiple {
    private Integer a;
    private Integer b;

    public Multiple(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    public Integer getmultAB ( ){
        return a*b;
    }
//

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Multiple multiple = (Multiple) o;
//        return Objects.equals(a, multiple.a) && Objects.equals(b, multiple.b);
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Multiple multiple = (Multiple) o;
//
//        return new org.apache.commons.lang.builder.EqualsBuilder().append(a, multiple.a).append(b, multiple.b).isEquals();
//    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString (){
        return"A: "+getA()+", B: "+getB();
    }


    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}

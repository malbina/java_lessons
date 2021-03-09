package com.company;

public class Me {
    private int age;
    private String education;

    public void eatFood (AbstractFood food) throws Exception{
        if(food instanceof Honey){
            throw new Exception();}
    else {
        System.out.println("I'm eating");
    }
}
public void goTo (AbstractDestination dest ) {
        if (dest ==null){
            throw new IllegalArgumentException();
        }
        else {
            System.out.println("I go to anywhere");
        }
}



}

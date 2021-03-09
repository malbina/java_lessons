package com.company.housing;

public class Apartment extends AbstractHousing{
    public Apartment(String street, int house) {
        super(street, house);
    }
    @Override
    public void payBill (){
        System.out.println("Pay utilities bills");
    }
}

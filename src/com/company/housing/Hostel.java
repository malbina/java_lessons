package com.company.housing;

public class Hostel extends AbstractHousing {
    public Hostel(String street, int house) {
        super(street, house);
    }
    @Override
    public void payBill (){
        System.out.println("Pay for accommodation");
    }
}

package com.company.housing;

public abstract class AbstractHousing {
    private String street;
    private int house;
    private int roomNumber;

    public AbstractHousing(String street, int house) {
        this.street = street;
        this.house = house;

    }
    public abstract void payBill();

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }


    @Override
    public String toString (){
        return getStreet()+" "+getHouse();
    }

    public static class Hotel extends AbstractHousing {
        public Hotel(String street, int house) {
            super(street, house);
        }
        @Override
        public void payBill (){
            System.out.println("Pay for acommodation");
        }
    }
}

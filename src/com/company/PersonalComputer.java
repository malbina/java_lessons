package com.company;

public class PersonalComputer extends AbstractComputer{
    private int monitorDiagonal;

    public PersonalComputer(double price, Model model, double discount, int monitorDiagonal) {
        super(price, model, discount);
        this.monitorDiagonal = monitorDiagonal;
    }
    @Override
    public String toString(){
        return"\n\nPrice: "+getPrice()+"\nModel: "+getModel()+"\nDiagonal: "+monitorDiagonal+
                "\nDiscount: "+getDiscount()+"\nPrice with discount: "+getPriceWithDiscount();

    }
}

package com.company;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public abstract class AbstractComputer {
    private double price;
    private Model model;
    private double discount;

    public AbstractComputer(double price, Model model, double discount) {
        this.price = price;
        this.model = model;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getPriceWithDiscount (){
        return price *(100-20)/100;
    }
    @Override
    public String toString(){
        return"\n\nPrice: "+getPrice()+"\nModel: "+getModel()+
                "\nDiscount: "+getDiscount()+"\nPrice with discount: "+getPriceWithDiscount();
    }
  @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj instanceof AbstractComputer)
            return((AbstractComputer)obj).getPrice()==this.getPrice()
            &&((AbstractComputer)obj).getModel().equals(this.getModel());
        return false;
  }
  public AbstractComputer find(List<AbstractComputer> comps){
        for(AbstractComputer comp :comps){
          if(this.equals(comp)) return this;
        }return null;





  }

}
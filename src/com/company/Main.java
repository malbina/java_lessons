package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        List<AbstractComputer>computers = new ArrayList<>();
//        double discount =20;
//        for(int i =1;i<=50;i++){
//            computers.add(new Laptop(i*150,Model.Dell,discount));
//            computers.add(new PersonalComputer(i*100,Model.HP,0,23));
//        }
//        System.out.println(computers);
//     int lpPriceSum = 0, lpPriceWithDiscount=0;
//     int psPriceSum =0, psPriceWithDiscount =0;
//     for(AbstractComputer comp : computers){
//         if(comp instanceof Laptop){
//             lpPriceSum+=comp.getPrice();
//             lpPriceWithDiscount+=comp.getPriceWithDiscount();
//         }else {
//             psPriceSum +=comp.getPrice();
//             psPriceWithDiscount+=comp.getPriceWithDiscount();
//         }
//     }
//        System.out.println("\n\nLaptop price sum: "+lpPriceSum+"\nLaptop price with discount: "+lpPriceWithDiscount+"" +
//                "\nComputer price sum: "+psPriceSum+"\nComputer price with discount: "+psPriceWithDiscount);
//
//        double findePrice =150;
//        String findModel="Dell";
//       for(AbstractComputer comp:computers){
//           if(comp.getPrice()==findePrice && comp.getModel().equals(findModel));
//           System.out.println(comp);
//           break;
//       }
//        AbstractComputer laptop= new Laptop(150,Model.Dell,20);
//        System.out.println("Found: "+laptop.find(computers));
//
//
//        Model model[]=Model.values();
//        System.out.println(Model.Dell.ordinal());
//        System.out.println(Model.HP.ordinal());
//        WeekDay weekDay=WeekDay.Wednesday;
//        if(weekDay==WeekDay.Monday|| weekDay==WeekDay.Wednesday||weekDay==WeekDay.Friday){
//            System.out.println("Учёба в "+weekDay.getRusName());
//        }else {
//            System.out.println("Я не учусь в "+weekDay.getRusName());
//        }
//
//        switch(weekDay){
//            case Monday:
//            case Wednesday:
//            case Friday:
//                System.out.println("Учеба в "+weekDay.getRusName());
//            default:
//                System.out.println("В "+weekDay.getRusName()+" не учусь");
//        }


        int [] a =new int [5];
        Random random = new Random();
        for(int i =0;i<a.length;i++){
            a[i]= random.nextInt(2);
            System.out.printf("a[%d] = %d\n",i,a[i]);

        }
        System.out.println("_____________________");
       int [] newArray=sort(a);
       for(int i =0;i< newArray.length;i++){
           System.out.printf("a[%d] = %d\n",i,newArray[i]);
       }

//        int t =5;
//        int d=7;
//        int temp =t;
//        t=d;
//        d=temp;
//

    }
    public static int []sort (int [] a ){
    for(int i =0;i<a.length;i++){
        for(int j =0;j<a.length-i-1;j++){
            int nextIndex =j+1;
            if (a[j] > a[nextIndex]) {
                int t = a[j];
                a[j]=a[nextIndex];
                a[nextIndex]=t;
            }
        }
    }return a;
//    }
//    public static  ArrayList<Integer>sort(ArrayList<Integer> List){
//        for(int )
//    }

//    public static LinkedList<Integer> sort(ArrayList<Integer> List){
//
//        return null;
//    }

}}
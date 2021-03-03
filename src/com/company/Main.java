package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//            List<Multiple> multipleList= new ArrayList<>();
//            Multiple m1 = new Multiple(10,10);
//            Multiple m2 = new Multiple(40,10);
//            Multiple m3 = new Multiple(20,3);
//            Multiple m4 = new Multiple(20,5);
//
//            fillListWithUnique(multipleList,m1);
//            fillListWithUnique(multipleList,m2);
//            fillListWithUnique(multipleList,m3);
//            fillListWithUnique(multipleList,m3);
//            System.out.println(multipleList);


            List<Cat>cats = new ArrayList<>();

            Cat cat1 = new Cat("Kitty",1);
            Cat cat2 = new Cat("Lisa",2);
            cats.add(cat1);
            cats.add(cat2);
            cats.add(new Cat("Kris",1));

           for (int i =0;i<cats.size();i++){
               for(int j =i+1;j< cats.size();j++){
                   if(cats.get(i).equals(cats.get(j))){
                       System.out.println("Similar cats");
                       break;
                   }
               }
           }

           for(Cat cat: cats){
               System.out.println(cat.hashCode());
           }

List<Integer>dupList = new ArrayList<>();
int duplSum=0;
for(int i=0;i<4;i++){
    for(int j=1;j<=100;j++){
        dupList.add(j);
        duplSum+=j;
    }
}

        System.out.println(dupList);
        System.out.println("Duplist sum: "+duplSum  );
Set<Integer> hashSet= new HashSet<>(dupList);
int hashSetSum=0;
for(Iterator<Integer> it=hashSet.iterator();it.hasNext();){
    Integer i = it.next();
    hashSetSum +=i;
    System.out.println(i);
}
        System.out.println("Hashset sum: "+hashSetSum);
  Cat cat3= new Cat("Hil",4);
  Cat cat4 = new Cat("jkd",5);
  Set<Cat> catsHash = new HashSet<>();
  catsHash.add(cat1);
  catsHash.add(cat2);
  catsHash.add(cat3);
  catsHash.add(cat4);
        System.out.println("CatHash size: "+catsHash.size());
  catsHash.add(cat1);
  catsHash.add(new Cat("Hil",4));
        System.out.println("New size: "+catsHash.size());



//            System.out.println(cat1.getName()+ ": "+cat1.hashCode());
//            System.out.println(cat2.getName()+ ": "+cat2.hashCode());

        }
        public static boolean fillListWithUnique (List<Multiple> list,Multiple mult){
            if(list.contains(mult))
                return false;
            else list.add(mult);
            return true;
        }
    }


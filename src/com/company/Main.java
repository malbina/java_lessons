package com.company;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
//            String str = "Hello";
//            String str2="Hello";
//            String str3 = new String ("Hello");
//            System.out.println(str==str2);
//
            Scanner sc = new Scanner(System.in);
//            String string= sc.nextLine();
////            String newString =string.replace('а','б');
////            System.out.println( newString);
//           String[] newString =string.split("//s");
//            System.out.println(newString);
//            System.out.println("Please enter a string");
//            String words = sc.nextLine();
//            String [] word = words.trim().split("\\s+");
//            for(String str:word){
//                System.out.println(str);
//            }
//            System.out.println("Found words: "+word.length);
//
//            int longestIndex =0;
//            for(int i =1;i<word.length;i++){
//                if(word[i].length()>word[longestIndex].length()){
//                    longestIndex=i;
//                }
//            }
//            System.out.println("The longest word: "+word[longestIndex]+", lengt: "+word[longestIndex].length());


            System.out.println("Введите имя файла: ");
            String file=sc.nextLine();
            System.out.println("Введите новое расширение: ");
            String ext =sc.nextLine();
            System.out.println("Результат: "+editExt(file,ext));


        }


        public static  String editExt (String file,String newExt) {
            int lastDotIndex = file.lastIndexOf('.');
            if (lastDotIndex < 0) {
                file = file.concat("." + newExt);
            } else {
                file =file.substring(0,lastDotIndex+1)+newExt;
            }
            return file;

        }
    }


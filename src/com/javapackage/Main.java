package com.javapackage;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //right click class
        //open in terminal
        //javac Main.java
        //ls Main.class(generated bytecode file of the java class- stored in out file and can be run on any environment with a JRE) and Main.java

        //Executing java code

//        moleon@MacBook-Pro-4 javapackage % cd ..
//        moleon@MacBook-Pro-4 com % cd ..
//        moleon@MacBook-Pro-4 src % java com.javapackage.Main
//        Hello World
        //these are the compilation and execution steps we don't see when we are using Intellij

        //Variables
        int age = 30;
        int temperature = 20;
        age = 35;
         int myAge = 24;
         int herAge = myAge;
        System.out.println(herAge);

        //Primitive Types
        byte hisAge = 30;
        int viewsCount = 123_456_789; //just like we use commas in java we can add underscores to support readability
        System.out.println(viewsCount);
        long viewCount = 3_123_456_789L; // L or l is needed
        double price = 10.99;
        float totalPrice = 10.99f;
        char letter = 'A'; //single quote
        boolean isEligible = true;

        //Reference Types
        //use new to allocate memory - //reference types like string don't require new or an import but are reference types
        Date now = new Date(); //now is a new instance of the Date class pre-written in Java
        System.out.println(now);
             now.getTime();    //the now instance can now use all the methods written within the Date class by using the "." reference
                    //. for i methods are pre-built in and are good time savers


        //Reference Types vs Primitive Types
        //data allocation

        Point point1 = new Point();
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "    Hello World" +"!    ";
        System.out.println(message.endsWith("!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("o")); //returns -1 if  no occurrence
        System.out.println(message.replace("e","*"));//these values here are arguments target and replacement are parameters, but the e and * are arguments
        System.out.println(message);
        System.out.println(message.trim()); //gets rid of unnecessary white spaces

        //Escape Sequences
        String pathDirectories = "c:\\Windows\\..";//only prints one slash and this is how we put\ in quotes - if we need to put " in our string we just follow it with a \
        System.out.println(pathDirectories);
        String showingNewLine = "c:\nWindows\\.."; // \n creates a new line
        System.out.println(showingNewLine);
        String showingTab = "c:\tWindows\\.."; // \t creates a tab space
        System.out.println(showingTab);


        //Arrays
        int[] numbersArr = new int[5];//in brackets specify length of array
        //older syntax for initializing an array
        numbersArr[0] =1;
        numbersArr[1] = 2;

        System.out.println(numbersArr); //prints out weird string which corresponds to the arrays location in memory == [I@5b2133b1
        System.out.println(Arrays.toString(numbersArr)); //prints out array

        //newer syntax
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers.length);



    }
}

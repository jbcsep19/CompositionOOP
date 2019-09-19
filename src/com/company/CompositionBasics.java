package com.company;

import java.util.Scanner;

public class CompositionBasics {

    public static void main(String[] args) {
        // Create a person and display the default values
        Person jake = new Person();
        System.out.println("Jake's salary: " + jake.getSalary());
        System.out.println(jake.toString() + "\n");

        //Create a new person and update their salary
        Person luke = new Person();
        System.out.println("Luke's old salary: " + luke.getSalary());
        Scanner input = new Scanner(System.in);
        System.out.println("What is the salary?");
        long salary = input.nextLong();
        luke.getJob().setSalary(salary);
        System.out.println("Luke's new salary: " + luke.getSalary());

        //Create a new person with a default salary other than 50K
        System.out.println("What is the salary?");
        salary = input.nextLong();
        Person tom = new Person(salary);
        System.out.println("Tom's salary: " + tom.getSalary());




    }
}

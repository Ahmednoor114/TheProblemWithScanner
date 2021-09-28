/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdisg.theproblemwithscanner;

import java.util.Scanner;

/**
 *
 * @author ahmednoorabdi
 */
public class ScannerTest {
    public static void main(String[] args){
        String name;
        int age;
        int numComputers;
        String hometown;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        name = sc.nextLine();
        System.out.println("Please enter your age: ");
        age = sc.nextInt();
        System.out.println("Please enter number of your computers: ");
        numComputers = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Please enter your Hometown: ");
        hometown = sc.nextLine();
        
        
        System.out.println("You said: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number of Computers: " + numComputers);
        System.out.println("Hometown: " + hometown);
       
    }
    
}



import Categories.*;
import Specific.*;

import java.lang.annotation.Target;
import java.util.ArrayList;

import java.util.Objects;
import java.util.Scanner;

public class Store implements Search,AddItems {
    Scanner scanner = new Scanner(System.in);
    private double wallet = 0;
    static int k = 1;
    static int p = 1;
    static Smartphone[] smartphones = new Smartphone[k];
    Computer[] computers = new Computer[p];
    private ArrayList<Vagetables> vagetables = new ArrayList<>();
    private ArrayList<Candy> candies = new ArrayList<>();
    private ArrayList<Water> waters = new ArrayList<>();
    private ArrayList<Soda> sodas = new ArrayList<>();
    private ArrayList<Dress> dresses = new ArrayList<>();

   /* void setSmartphones() {

        System.out.println("Enter ID");
        int smartID = 11;//scanner.nextInt();

        for (int i = 0; i < smartphones.length - 1; i++) {
            if (smartID == smartphones[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + smartphones[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                smartphones[i].setValue(smartphones[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + smartphones[i].getValue());
            } else break;
        }
        //scanner.nextLine();
        System.out.println("Enter name:");
        String smartName = "Nokia";//scanner.nextLine();
        System.out.println("Enter value");
        int value = 5;//scanner.nextInt();
       // scanner.nextLine();
        System.out.println("Enter description");
        String description = "lol";// scanner.nextLine();
        System.out.println("Enter price");
        double price = 300;//scanner.nextDouble();
        //scanner.nextLine();
        System.out.println("Enter OS type");
        String operationSys = "android";//scanner.nextLine();
        System.out.println("Enter RAM size");
        int ramSize = 4;//scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Enter RAM type");
        String ramType = "ddr4";// scanner.nextLine();
        System.out.println("Enter number of core");
        int numbCore = 4;//scanner.nextInt();
        System.out.println("Enter core frequency");
        double freqCore =5.5;// scanner.nextDouble();
        System.out.println("Enter screen size");
        float screenSize = (float) 5.5;// scanner.nextFloat();
        //scanner.nextLine();
        System.out.println("Enter battery life time");
        int battLife = 36;//scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Enter warranty");
        int warranty =12;// scanner.nextInt();

        smartphones[k - 1] = new Smartphone(smartID, smartName, value, description, price,
                new OperationSystem(operationSys),
                new Ram(ramSize, ramType), new Cpu(numbCore, freqCore),
                new Screen(screenSize),
                new WorkTimeBaterry(battLife),
                new Warranty(warranty));


        k++;

        System.out.println("Smartphone successfully added to the warehouse");
    }*/

   AddItems add = new AddItems() {
       @Override
       public void addItem(Smartphone[] mass) {
           System.out.println("Enter ID");
           int smartID = 11;//scanner.nextInt();

           for (int i = 0; i < mass.length - 1; i++) {
               if (smartID == mass[i].getId()) {
                   System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                   int valuePlus = scanner.nextInt();
                   mass[i].setValue(mass[i].getValue() + valuePlus);
                   System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
               } else break;
           }
           scanner.nextLine();
           System.out.println("Enter name:");
           String smartName = "Nokia";//scanner.nextLine();
           System.out.println("Enter value");
           int value = 5;//scanner.nextInt();
           scanner.nextLine();
           System.out.println("Enter description");
           String description = "lol";// scanner.nextLine();
           System.out.println("Enter price");
           double price = 300;//scanner.nextDouble();
           scanner.nextLine();
           System.out.println("Enter OS type");
           String operationSys = "android";//scanner.nextLine();
           System.out.println("Enter RAM size");
           int ramSize = 4;//scanner.nextInt();
           //scanner.nextLine();
           System.out.println("Enter RAM type");
           String ramType = "ddr4";// scanner.nextLine();
           System.out.println("Enter number of core");
           int numbCore = 4;//scanner.nextInt();
           System.out.println("Enter core frequency");
           double freqCore =5.5;// scanner.nextDouble();
           System.out.println("Enter screen size");
           float screenSize = (float) 5.5;// scanner.nextFloat();
           //scanner.nextLine();
           System.out.println("Enter battery life time");
           int battLife = 36;//scanner.nextInt();
           //scanner.nextLine();
           System.out.println("Enter warranty");
           int warranty =12;// scanner.nextInt();

           smartphones[k - 1] = new Smartphone(smartID, smartName, value, description, price,
                   new OperationSystem(operationSys),
                   new Ram(ramSize, ramType), new Cpu(numbCore, freqCore),
                   new Screen(screenSize),
                   new WorkTimeBaterry(battLife),
                   new Warranty(warranty));


           k++;

           System.out.println("Smartphone successfully added to the warehouse");

       }

       @Override
       public void sellItem(Smartphone[] mass) {
           //scanner.nextLine();
           System.out.println("name");
           String name = "Nokia";// scanner.next();
           System.out.println("amount");
           int amount = 3;// scanner.nextInt();

           for (int i = 0; i < mass.length; i++) {

               if (name.equals(mass[i].getName())) {
                   if (mass[i].getValue() >= amount) {
                       mass[i].setValue(mass[i].getValue() - amount);
                       wallet+=mass[i].getPrice()*amount;
                   } else {
                       System.out.println("You cannot sell this amount");
                       sellItem();
                   }

               }

           }
           System.out.println(wallet);
       }
   };
    Search search = new Search() {
        @Override
        public void search(Smartphone[] mass) {

        }

        @Override
        public void search(Computer[] mass) {

        }
    };

    /*void sellSmartphones() {
        //scanner.nextLine();
        System.out.println("name");
        String name = "Nokia";// scanner.next();
        System.out.println("amount");
        int amount = 3;// scanner.nextInt();

        for (int i = 0; i < smartphones.length; i++) {

            if (name.equals(smartphones[i].getName())) {
                if (smartphones[i].getValue() >= amount) {
                    smartphones[i].setValue(smartphones[i].getValue() - amount);
                    wallet+=smartphones[i].getPrice()*amount;
                } else {
                    System.out.println("You cannot sell this amount");
                    sellSmartphones();
                }

            }

        }
        System.out.println(wallet);
    }*/


    /*void searcher(Computer[]mass,String name){

        Search search = new Search() {
            void serch(){
                for (int i = 0; i <smartphones.length ; i++) {
                    if (smartphones[i].getName().contains(name)){
                        System.out.println();
                    }

                }
            }
        };

    }*/

    



}

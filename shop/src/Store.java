

import Categories.*;
import Specific.*;

import java.lang.annotation.Target;
import java.util.ArrayList;

import java.util.Objects;
import java.util.Scanner;

public class Store implements Search,AddItems {
    private Scanner scanner = new Scanner(System.in);
    double wallet = 0;
    private static int k = 1;
    private static int p = 1;
    Smartphone[] smartphones = new Smartphone[k];
    Computer[] computers = new Computer[p];
    private ArrayList<Vagetables> vagetables = new ArrayList<>();
    private ArrayList<Candy> candies = new ArrayList<>();
    private ArrayList<Water> waters = new ArrayList<>();
    private ArrayList<Soda> sodas = new ArrayList<>();
    private ArrayList<Dress> dresses = new ArrayList<>();

   void doType(Smartphone[]mass){
       System.out.println("1 - Add Item" +
               "\n2 - Sell Item" +
               "\n3 - Search Item");
       System.out.print("Выберите задание из списка:");
       int input = scanner.nextInt();

       switch (input) {
           case 1:
               add.addItem(mass);
               repeet();
               break;
           case 2:
               add.sellItem(mass);
               repeet();
               break;
           case 3:
               search(mass);
               repeet();
               break;

           default:
               System.out.println("Вы ввели не верный номер задания, повторите ввод!");
               repeet();


       }

   }
   void repeet() {
        String yes = "y";
        String no = "n";
        Main.rerun = false;
        System.out.println("\nПродолжить?" +
                "\n(y)YES или (n)NO");
        String question = scanner.next();
        if (question.equals(yes)) {
            Main.rerun = true;
        } else if (question.equals(no)) {
            System.out.println("Спасибо");
        } else {
            System.out.println("Введите другую букву: ");
            repeet();
        }
    }

   private AddItems add = new AddItems() {
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
           //scanner.next();
           System.out.println("Enter name:");
           String smartName = "Nokia";//scanner.nextLine();
           System.out.println("Enter value");
           int value = 5;//scanner.nextInt();
           //scanner.next();
           System.out.println("Enter description");
           String description = "lol";// scanner.nextLine();
           System.out.println("Enter price");
           double price = 300;//scanner.nextDouble();
           //scanner.next();
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
           System.out.println(smartphones[0].getName());

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
                       sellItem(smartphones);
                   }

               }

           }
           System.out.println(wallet);
       }

       @Override
       public void sellItem(Computer[] mass) {

       }

       @Override
       public void addItem(Computer[] mass) {

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





}

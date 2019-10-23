

import Categories.*;
import Specific.*;

import java.lang.annotation.Target;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Store extends AddItems implements Search {
    private Scanner scanner = new Scanner(System.in);
    double wallet = 0;
    private ArrayList<Vagetables> vagetables = new ArrayList<>();
    private ArrayList<Candy> candies = new ArrayList<>();
    private ArrayList<Water> waters = new ArrayList<>();
    private ArrayList<Soda> sodas = new ArrayList<>();
    private ArrayList<Dress> dresses = new ArrayList<>();

    @Override
    public void doType(Smartphone[] mass) {
        System.out.println("1 - Add Item" +
                "\n2 - Sell Item" +
                "\n3 - Search Item");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addItem(mass);
                repeet();
                break;
            case 2:
                sellItem(mass);
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

    @Override
    public void doType(Computer[] mass) {
        System.out.println("1 - Add Item" +
                "\n2 - Sell Item" +
                "\n3 - Search Item");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addItem(mass);
                repeet();
                break;
            case 2:
                sellItem(mass);
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

    @Override
    public void doType(Vagetables[] mass) {

    }

    @Override
    public void search(Smartphone[] mass) {

    }

    @Override
    public void search(Computer[] mass) {

    }

    @Override
    public void search(Vagetables[] mass) {

    }

    @Override
    public void addItem(Smartphone[] mass) {
        System.out.println("Enter ID");
        Id = 11;//scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                repeet();
                break;

            } else break;

        }
        //scanner.next();
        System.out.println("Enter name:");
        name = "Nokia";//scanner.nextLine();
        System.out.println("Enter value");
        value = 5;//scanner.nextInt();
        //scanner.next();
        System.out.println("Enter description");
        description = "lol";// scanner.nextLine();
        System.out.println("Enter price");
        price = 300;//scanner.nextDouble();
        //scanner.next();
        System.out.println("Enter OS type");
        operationSys = "android";//scanner.nextLine();
        System.out.println("Enter RAM size");
        ramSize = 4;//scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Enter RAM type");
        ramType = "ddr4";// scanner.nextLine();
        System.out.println("Enter number of core");
        numbCore = 4;//scanner.nextInt();
        System.out.println("Enter core frequency");
        freqCore = 5.5;// scanner.nextDouble();
        System.out.println("Enter warranty");
        warranty = 12;// scanner.nextInt();
        System.out.println("Enter screen size");
        float screenSize = (float) 5.5;// scanner.nextFloat();
        //scanner.nextLine();
        System.out.println("Enter battery life time");
        int battLife = 36;//scanner.nextInt();


        smartphones[k] = new Smartphone(Id, name, value, description, price,
                new OperationSystem(operationSys),
                new Ram(ramSize, ramType), new Cpu(numbCore, freqCore),
                new Screen(screenSize),
                new WorkTimeBaterry(battLife),
                new Warranty(warranty));


        System.out.println("++" + k);
        smartphones = Arrays.copyOf(smartphones, smartphones.length + 1);
        System.out.println(smartphones.length);
        System.out.println("Smartphone successfully added to the warehouse");
        System.out.println("---" + smartphones[k].getName() + "---");
        k++;

    }

    @Override
    public void addItem(Computer[] mass) {
        System.out.println("Enter ID");
        Id = 11;//scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                repeet();
                break;

            } else break;

        }
        //scanner.next();
        System.out.println("Enter name:");
        name = "Dell";//scanner.nextLine();
        System.out.println("Enter value");
        value = 3;//scanner.nextInt();
        //scanner.next();
        System.out.println("Enter description");
        description = "lol";// scanner.nextLine();
        System.out.println("Enter price");
        price = 300;//scanner.nextDouble();
        //scanner.next();
        System.out.println("Enter RAM size");
        ramSize = 8;//scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Enter RAM type");
        ramType = "ddr4";// scanner.nextLine();
        System.out.println("Enter number of core");
        numbCore = 4;//scanner.nextInt();
        System.out.println("Enter core frequency");
        freqCore = 3.5;// scanner.nextDouble();
        System.out.println("Enter Video Card CPU");
        videoCpu = 4; //scanner.nextInt();
        System.out.println("Enter video core frequency");
        videoCpuFreq = 3.5;// scanner.nextDouble();
        System.out.println("Enter RAM size");
        videoRamSize = 4; //scanner.nextInt();System.out.println("Enter RAM size");
        videoRamType = "DDR5"; //scanner.nextLine();
        System.out.println("Enter warranty");
        warranty = 12;// scanner.nextInt();
        computers[p] = new Computer(Id, name, value, description, price,
                new OperationSystem(operationSys),
                new Ram(ramSize, ramType), new Cpu(numbCore, freqCore),
                new VideoCard(videoCpu, videoCpuFreq),
                new VideoMemory(videoRamSize, videoRamType),
                new Warranty(warranty));


        System.out.println("++" + k);
        computers = Arrays.copyOf(computers, computers.length + 1);
        System.out.println(computers.length);
        System.out.println("Computer successfully added to the warehouse");
        System.out.println("---" + computers[p].getName() + "---");
        p++;


    }

    @Override
    public void addItem(Vagetables[] mass) {
        System.out.println("Enter ID");
        Id = 11;//scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                repeet();
                break;

            } else break;

        }
        //scanner.next();
        System.out.println("Enter name:");
        name = "Dell";//scanner.nextLine();
        System.out.println("Enter value");
        value = 3;//scanner.nextInt();
        //scanner.next();
        System.out.println("Enter description");
        description = "lol";// scanner.nextLine();
        System.out.println("Enter price");
        price = 300;//scanner.nextDouble();

    }

    @Override
    public void sellItem(Smartphone[] mass) {
        //scanner.nextLine();
        System.out.println("name");
        String name = "Nokia";// scanner.next();
        System.out.println("amount");
        int amount = 3;// scanner.nextInt();

        for (int i = 0; i < mass.length - 1; i++) {

            if (name.equals(mass[i].getName())) {
                if (mass[i].getValue() >= amount) {
                    mass[i].setValue(mass[i].getValue() - amount);
                    wallet += mass[i].getPrice() * amount;
                    break;
                } else {
                    System.out.println("You cannot sell this amount");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);

    }

    @Override
    public void sellItem(Computer[] mass) {
        //scanner.nextLine();
        System.out.println("name");
        String name = "Dell";// scanner.next();
        System.out.println("amount");
        int amount = 3;// scanner.nextInt();

        for (int i = 0; i < mass.length - 1; i++) {

            if (name.equals(mass[i].getName())) {
                if (mass[i].getValue() >= amount) {
                    mass[i].setValue(mass[i].getValue() - amount);
                    wallet += mass[i].getPrice() * amount;
                    break;
                } else {
                    System.out.println("You cannot sell this amount");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);

    }

    @Override
    public void sellItem(Vagetables[] mass) {

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


}

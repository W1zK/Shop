

import Categories.*;
import Specific.*;

import java.lang.annotation.Target;
import java.text.ParseException;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Store extends AddItems implements Search {
    private Scanner scanner = new Scanner(System.in);
    double wallet = 0;
   /* SubscriptionManager subscriptionManager = new SubscriptionManager();*/



    @Override
    public void doType(Smartphone[] mass) throws ParseException {
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
    public void doType(Computer[] mass) throws ParseException {
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
    public void doType(Vagetables[] mass) throws ParseException {
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
    public void doType(Candy[] mass) throws ParseException {
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
    public void doType(Water[] mass) throws ParseException {
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
    public void doType(Soda[] mass) throws ParseException {
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
    public void doType(Dress[] mass) throws ParseException {
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


    /*@Override
    public void search(Smartphone[] mass) {

    }

    @Override
    public void search(Computer[] mass) {

    }

    @Override
    public void search(Vagetables[] mass) {

    }

    @Override
    public void search(Candy[] mass) {

    }

    @Override
    public void search(Water[] mass) {

    }

    @Override
    public void search(Soda[] mass) {

    }*/

    @Override
    public void addItem(Smartphone[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = 11;//scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
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
    public void addItem(Computer[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = 8;//scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
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
    public void addItem(Vagetables[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = 11;//scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }

        //scanner.next();
        System.out.println("Enter name:");
        name = "Tomato";//scanner.nextLine();
        System.out.println("Enter value");
        value = 5;//scanner.nextInt();
        //scanner.next();
        System.out.println("Enter description");
        description = "lol";// scanner.nextLine();
        System.out.println("Enter price");
        price = 25;//scanner.nextDouble();
        System.out.println("Enter Variety");
        variety = "black tomato"; // scanner.nextLine();
        System.out.println("Enter date of manufacture(dd.MM.yyyy)");
        dateIn = "23.10.2019"; // scanner.nextLine();
        temperature = 5.5; //scanner.nextDouble();
        expDay = 21; //scanner.nextInt();
        vagetables[v] = new Vagetables(Id, name, value, description, price,
                new Variety(variety),
                new ShelfLife(dateIn, temperature, expDay));


        vagetables = Arrays.copyOf(vagetables, vagetables.length + 1);

        System.out.println("Computer successfully added to the warehouse");
        System.out.println("---" + vagetables[v].getName() + "---");
        v++;

    }

    @Override
    public void addItem(Candy[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = 2034;//scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }

        //scanner.next();
        System.out.println("Enter name:");
        name = "korovka";//scanner.nextLine();
        System.out.println("Enter value");
        value = 10;//scanner.nextInt();
        //scanner.next();
        System.out.println("Enter description");
        description = "lol";// scanner.nextLine();
        System.out.println("Enter price");
        price = 16;//scanner.nextDouble();
        dateIn = "23.10.2019"; // scanner.nextLine();
        temperature = 5.5; //scanner.nextDouble();
        expDay = 156; //scanner.nextInt();
        candies[c] = new Candy(Id, name, value, description, price,
                new ShelfLife(dateIn, temperature, expDay));
        candies = Arrays.copyOf(candies, candies.length + 1);

        System.out.println("Computer successfully added to the warehouse");
        System.out.println("---" + candies[c].getName() + "---");
        c++;


    }

    @Override
    public void addItem(Water[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = 8954;//scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }
        //scanner.next();
        System.out.println("Enter name:");
        name = "bonaqua";//scanner.nextLine();
        System.out.println("Enter value");
        value = 10;//scanner.nextInt();
        //scanner.next();
        System.out.println("Enter description");
        description = "lol";// scanner.nextLine();
        System.out.println("Enter price");
        price = 3;//scanner.nextDouble();

        water[w] = new Water(Id, name, value, description, price);
        water = Arrays.copyOf(water, water.length + 1);

        System.out.println("Computer successfully added to the warehouse");
        System.out.println("---" + water[w].getName() + "---");
        w++;

    }

    @Override
    public void addItem(Soda[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = 8749;//scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }

        //scanner.next();
        System.out.println("Enter name:");
        name = "Cola";//scanner.nextLine();
        System.out.println("Enter value");
        value = 12;//scanner.nextInt();
        //scanner.next();
        System.out.println("Enter description");
        description = "lol";// scanner.nextLine();
        System.out.println("Enter price");
        price = 16;//scanner.nextDouble();
        dateIn = "23.10.2019"; // scanner.nextLine();
        temperature = 5.5; //scanner.nextDouble();
        expDay = 156; //scanner.nextInt();
        soda[s] = new Soda(Id, name, value, description, price,
                new ShelfLife(dateIn, temperature, expDay));
        soda = Arrays.copyOf(soda, soda.length + 1);

        System.out.println("Computer successfully added to the warehouse");
        System.out.println("---" + soda[s].getName() + "---");
        s++;

    }

    @Override
    public void addItem(Dress[] mass) throws ParseException {
        System.out.println("Enter ID");
        Id = 3513;//scanner.nextInt();
        for (int i = 0; i < mass.length - 1; i++) {
            if (Id == mass[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + mass[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                mass[i].setValue(mass[i].getValue() + valuePlus);
                System.out.println("Smartphone successfully added to the warehouse" + mass[i].getValue());
                Main.rerun = true;
                Main.doing();
                break;

            } else break;

        }
        //scanner.next();
        System.out.println("Enter name:");
        name = "Kofta";//scanner.nextLine();
        System.out.println("Enter value");
        value = 10;//scanner.nextInt();
        //scanner.next();
        System.out.println("Enter description");
        description = "lol";// scanner.nextLine();
        System.out.println("Enter price");
        price = 3;//scanner.nextDouble();
        System.out.println("Enter year of foundation");
        year = "25.10.1927";// scanner.nextLine();
        System.out.println("Enter brend name");
        brendName = "Prado";// scanner.nextLine();
        System.out.println("Enter value of personal");
        personal = 1250;//scanner.nextInt();
        System.out.println("Enter num of country");
        countries = 180; //scanner.nextInt();


        dresses[d] = new Dress(Id, name, value, description, price,
                new Brend(year, brendName, personal, countries));
        dresses = Arrays.copyOf(dresses, dresses.length + 1);

        System.out.println("Computer successfully added to the warehouse");
        System.out.println("---" + dresses[d].getName() + "---");
        d++;

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
        //scanner.nextLine();
        System.out.println("name");
        String name = "Tomato";// scanner.next();
        System.out.println("amount");
        int amount = 2;// scanner.nextInt();

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
    public void sellItem(Candy[] mass) {
        //scanner.nextLine();
        System.out.println("name");
        String name = "korovka";// scanner.next();
        System.out.println("amount");
        int amount = 4;// scanner.nextInt();

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
    public void sellItem(Water[] mass) {
        //scanner.nextLine();
        System.out.println("name");
        String name = "bonaqua";// scanner.next();
        System.out.println("amount");
        int amount = 1;// scanner.nextInt();

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
    public void sellItem(Soda[] mass) {
        //scanner.nextLine();
        System.out.println("name");
        String name = "Cola";// scanner.next();
        System.out.println("amount");
        int amount = 1;// scanner.nextInt();

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
    public void sellItem(Dress[] mass) {
        //scanner.nextLine();
        System.out.println("name");
        String name = "Kofta";// scanner.next();
        System.out.println("amount");
        int amount = 1;// scanner.nextInt();

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

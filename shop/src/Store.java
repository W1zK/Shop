import offline.praktika.Categories.*;
import offline.praktika.Specific.*;

import java.util.ArrayList;

import java.util.Scanner;

public class Store {
    Scanner scanner = new Scanner(System.in);
    private double pocket = 0;
    static int k = 1;
    static Smartphone[]smartphones = new Smartphone[k];

    //ArrayList<Smartphone> smartphones=new ArrayList<>();

    //Smartphone[]smartphones = new Smartphone[0];
    private ArrayList<Computer> computers = new ArrayList<>();
    private ArrayList<Vagetables> vagetables = new ArrayList<>();
    private ArrayList<Candy> candies = new ArrayList<>();
    private ArrayList<Water> waters = new ArrayList<>();
    private ArrayList<Soda> sodas = new ArrayList<>();
    private ArrayList<Dress> dresses = new ArrayList<>();

    void setSmartphones(){



        //ArrayList<Smartphone> smartphones=new ArrayList<>();


        System.out.println("Enter ID");
        int smartID = scanner.nextInt();

        for (int i = 0; i <smartphones.length-1 ; i++) {
            if(smartID==smartphones[i].getId()){
                System.out.println("Введите количество добавляемых смартфонов"+smartphones[i].getName()+":");
                int valuePlus = scanner.nextInt();
                smartphones[i].setValue(smartphones[i].getValue()+valuePlus);
                System.out.println("Smartphone successfully added to the warehouse"+smartphones[i].getValue());
            }else break;
        }
        scanner.nextLine();
        System.out.println("Enter name:");
        String smartName = scanner.nextLine();
        System.out.println("Enter value");
        int value = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter description");
        String description = scanner.nextLine();
        System.out.println("Enter price");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter OS type");
        String operationSys = scanner.nextLine();
        System.out.println("Enter RAM size");
        int ramSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter RAM type");
        String ramType=scanner.nextLine();
        System.out.println("Enter number of core");
        int numbCore  = scanner.nextInt();
        System.out.println("Enter core frequency");
        double freqCore=scanner.nextDouble();
        System.out.println("Enter screen size");
        float screenSize = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter battery life time");
        int battLife = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter warranty");
        int warranty = scanner.nextInt();




        smartphones[k-1] = new Smartphone(smartID,smartName,value,description,price,
                new OperationSystem(operationSys),
                new Ram(ramSize,ramType),new Cpu(numbCore,freqCore),
                new Screen(screenSize),
                new WorkTimeBaterry(battLife),
                new Warranty(warranty));

        /*smartphones.add(new Smartphone(smartID,smartName,value,description,price,
                                        new OperationSystem(operationSys),
                                        new Ram(ramSize,ramType),new Cpu(numbCore,freqCore),
                                        new Screen(screenSize),
                                        new WorkTimeBaterry(battLife),
                                        new Warranty(warranty)));*/
        System.out.println(k);
        this.k++;
        System.out.println("k+1"+k);
        System.out.println("Smartphone successfully added to the warehouse");












    }

}

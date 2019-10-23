package Specific;

import Categories.Computer;
import Categories.Smartphone;
import Categories.Vagetables;


import java.text.ParseException;
import java.util.Scanner;


public abstract class AddItems extends Param{
    public static final Scanner scanner = new Scanner(System.in);

    public Smartphone[] smartphones = new Smartphone[1];
    public Computer[] computers = new Computer[1];
    public Vagetables[] vagetables = new Vagetables[1];




    public abstract void addItem(Computer[] mass);
    public abstract void addItem(Smartphone[] mass);
    public abstract void addItem(Vagetables[] mass) throws ParseException;


    public abstract  void sellItem(Computer[] mass);
    public abstract void sellItem(Smartphone[] mass);
    public abstract void sellItem(Vagetables[] mass);



    public abstract void doType(Smartphone[]mass);
    public abstract void doType(Computer[]mass);
    public abstract void doType(Vagetables[]mass) throws ParseException;




}

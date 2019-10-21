package Categories;


import Specific.*;


public class Smartphone extends Items implements TechSpecification {
    private OperationSystem operationSystem;
    private Ram ram;
    private Cpu cpu;
    private Screen screenSize;
    private WorkTimeBaterry baterry;
    private Warranty warranty;

    public Smartphone(int id, String name, double value, String other, double price) {
        super(id, name, value, other, price);
    }

    public Smartphone(int id, String name, double value, String other, double price, OperationSystem os, Ram ram, Cpu cpu, Screen size, WorkTimeBaterry baterry,Warranty warranty) {
        super(id, name, value, other, price);
        this.operationSystem =os;
        this.ram = ram;
        this.cpu = cpu;
        this.screenSize = size;
        this.baterry = baterry;
        this.warranty=warranty;


    }
    public Smartphone() {

    }


    @Override
    public void show() {
        super.show();
        System.out.println(operationSystem.getOs());

    }
}

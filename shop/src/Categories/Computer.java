package Categories;

import Specific.*;


public class Computer extends Items implements TechSpecification {
    private OperationSystem operationSystem;
    private Cpu cpu;
    private Ram ram;
    private VideoCard video;
    private VideoMemory videoMemory;
    private Warranty warranty;

    public Computer(int id, String name, double value, String other, double price) {
        super(id, name, value, other, price);
    }

    public Computer(int id, String name, double value, String other, double price, OperationSystem os, Ram ram, Cpu cpu, VideoCard video, VideoMemory videoMemory, Warranty warranty) {
        super(id, name, value, other, price);
        this.operationSystem = os;
        this.ram = ram;
        this.cpu = cpu;
        this.video = video;
        this.videoMemory = videoMemory;
        this.warranty=warranty;


    }
    public Computer() {

    }

    @Override
    public void show() {
        super.show();
    }
}

package Categories;
import Specific.TechSpecification;


public class Vagetables extends Items implements TechSpecification {

    public Vagetables(int id, String name, double value, String other, double price) {
        super(id, name, value, other, price);
    }
}

import Categories.Items;
import Categories.Smartphone;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        //store.setSmartphones();
        System.out.println(Store.smartphones[0].getId()+"=="+Store.smartphones[0].getValue());
        store.serch(Store.smartphones);
    }
}

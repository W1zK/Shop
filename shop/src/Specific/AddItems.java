package Specific;

import Categories.Computer;
import Categories.Smartphone;


public interface AddItems {
    default void addItem() {

    }
    default void sellItem() {

    }

    default void sellItem(Smartphone[] mass) {

    }

    default void addItem(Smartphone[] mass) {


    }
    default void sellItem(Computer[] mass) {

    }

    default void addItem(Computer[] mass) {


    }
}

package Specific;

import Categories.Computer;
import Categories.Smartphone;
import Categories.Vagetables;

import java.util.Scanner;

public interface Search {
    Scanner scanner = new Scanner(System.in);

    default void search() {

    }

    default void search(Smartphone[] mass) {
        System.out.println("Enter the name");
        scanner.next();
        String nm = scanner.nextLine();
        for (int i = 0; i < mass.length-1; i++) {
            if (mass[i].getName().contains(nm)) {
                System.out.println("Full Name" + mass[i].getName() + "\nID" + mass[i].getId() + "\namount" + mass[i].getValue());
            }

        }

    }

    default void search(Computer[] mass) {
        System.out.println("Enter the name");
        scanner.next();
        String nm = scanner.nextLine();
        for (int i = 0; i < mass.length-1; i++) {
            if (mass[i].getName().contains(nm)) {
                System.out.println("Full Name" + mass[i].getName() + "\nID" + mass[i].getId() + "\namount" + mass[i].getValue());
            }

        }

    }
    default void search(Vagetables[] mass) {
        System.out.println("Enter the name");
        scanner.next();
        String nm = scanner.nextLine();
        for (int i = 0; i < mass.length-1; i++) {
            if (mass[i].getName().contains(nm)) {
                System.out.println("Full Name" + mass[i].getName() + "\nID" + mass[i].getId() + "\namount" + mass[i].getValue());
            }

        }

    }
}

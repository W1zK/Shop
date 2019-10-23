import java.text.ParseException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    static boolean rerun = true;
    private static Store store = new Store();




    static void doing() throws ParseException {
        while (rerun){
            rerun = false;
            System.out.println("Выберите категорию");
            System.out.println();
            int d = scanner.nextInt();
            switch (d){
                case 1:
                    store.doType(store.smartphones);

                    break;
                case 2:
                    store.doType(store.computers);

                    break;
                case 3:
                    store.doType(store.vagetables);

                    break;
                case 4:
                    System.out.println("Wallet: "+store.wallet+"$");
                    store.repeet();
                    break;
                case 5: rerun = false;
                break;
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        doing();


    }

}

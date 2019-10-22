import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    static boolean rerun = true;
    private static Store store = new Store();



    static void doing(){
        while (rerun){
            rerun = false;
            System.out.println("Выберите категорию");
            System.out.println();
            int d = 1;//scanner.nextInt();
            switch (d){
                case 1:
                    store.doType(store.smartphones);
                    System.out.println("добавление");
                    break;
                case 2:
                    System.out.println("Sell");
                    break;
                case 3:
                    System.out.println("Search");
                    break;
                case 4:
                    System.out.println("Wallet: "+store.wallet+"$");
                    break;
                case 5: rerun = false;
                break;
            }
        }

    }

    public static void main(String[] args) {

        /*while (rerun) {

            rerun = false;
            System.out.println("1 - считает в консоли до числа Х" +
                    "\n2 - drawRectangle рисует прямоугольник" +
                    "\n3 - перегрузка задания №2" +
                    "\n4 - функция getMax(int,float)" +
                    "\n5 - рекурсия, задание №1" +
                    "\n6 - рекурсия, задание №2");
            System.out.print("Выберите задание из списка:");
            int input = scanner.nextInt();


            switch (input) {
                case 1:
                    store.addItem(store.smartphones);
                    repeet();
                    break;
                case 2:
                    store.sellItem(store.smartphones);
                    repeet();
                    break;
                case 3:
                    store.search(store.smartphones);
                    repeet();
                    break;

                default:
                    System.out.println("Вы ввели не верный номер задания, повторите ввод!");


            }
        }*/
        doing();


    }
    private static void repeet(){
        String yes = "y";
        String no = "n";
        rerun = false;
        System.out.println("\nПродолжить?"+
                "\n(y)YES или (n)NO");
        String question = scanner.next();
        if (question.equals (yes)) {
            rerun = true;
        } else if (question.equals(no)) {
            System.out.println("Спасибо");
        } else {
            System.out.println("Введите другую букву: ");
            repeet();
        }
        store.add.addItem(store.smartphones);
        store.sellItem();
        System.out.println(store.smartphones[0].getId()+"=="+store.smartphones[0].getValue());
        store.search(store.smartphones);
        store.search.search(store.smartphones);
        store.search(store.smartphones);
        store.search(store.smartphones);



    }
}

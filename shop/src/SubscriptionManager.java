
import java.util.Arrays;
import java.util.Scanner;

public class SubscriptionManager {


    private Users[] users = new Users[1];
    private Sender sender = new Sender("shcherbanuk.a@blest.ua", "zxc123A21");
    private String sendFrom = "shcherbanuk.a@blest.ua";
    Scanner scanner = new Scanner(System.in);
    Store store = new Store();

    public void doi() {
        System.out.println("1 - Add Item" +
                "\n2 - Sell Item" +
                "\n3 - Search Item");
        System.out.print("Выберите задание из списка:");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                userAdd();
                store.repeet();
                break;
            case 2:
                System.out.println("Enter name");
                String name = scanner.next();
                System.out.println("Enter message");
                String message = scanner.next();
                sendMessage(name, message);
                store.repeet();
                break;
            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                store.repeet();


        }


    }


    void sendMessage(String subject, String message) {
        for (int i = 0; i < users.length-1; i++) {
            if (users[i].ifSend) {
                sender.send(subject, message, sendFrom, users[i].getEmail());
            }
        }
    }

    void userAdd() {
        int k = 0;

        System.out.println("Enter ID");
        int Id =123;// scanner.nextInt();
        if (users.length == 1) {
            scanner.nextLine();
            System.out.println("Enter user name: ");
            String name = "Bob";//scanner.nextLine();
            System.out.println("Enter user email: ");
            String email = "rezorqqq5@gmail.com";//scanner.nextLine();
            System.out.println("Enter today date dd/MM/yyyy: ");
            String signUpDate ="22/10/2019";// scanner.nextLine();
            System.out.println("Send emails to user? (1-Y/2-N)");
            boolean sendMail = false;
            int choice = 1;// scanner.nextInt();
            if (choice == 1) {
                sendMail = true;
            }
            users[k] = new Users(Id, name, email, signUpDate, sendMail);
            users = Arrays.copyOf(users, users.length + 1);
            System.out.println("New user" + users[k].getUserName());
            k++;

        } else {
            for (int i = 0; i < users.length; i++) {
                if (Id == users[i].getUserId()) {
                    System.out.println("User already registered");
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Enter user name: ");
            String name = scanner.nextLine();
            System.out.println("Enter user email: ");
            String email = scanner.nextLine();
            System.out.println("Enter today date dd/MM/yyyy: ");
            String signUpDate = scanner.nextLine();
            System.out.println("Send emails to user? (1-Y/2-N)");
            boolean sendMail = false;
            int choice = scanner.nextInt();
            if (choice == 1) {
                sendMail = true;
            }
            users[k] = new Users(Id, name, email, signUpDate, sendMail);
            users = Arrays.copyOf(users, users.length + 1);
            System.out.println("New user"+ users[k].getUserName());
            k++;


        }


    }
}





import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер завдання (1, 2, 3, 5): ");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                Task1 a = new Task1 ();
                break;
            case 2:
                Task2 b = new Task2 ();
                break;
            case 3:
                Task3 c = new Task3 ();
                break;
            case 5:
                Task5 d = new Task5 ();
            default:
                System.out.println("Немає такого завдання =)");
        }
    }
}
import java.util.Scanner;

public class Task5 {

    public Task5 () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер місяця (1-12): ");
        int month = scanner.nextInt();

        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Літо";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осінь";
                break;
            default:
                season = "Невірний номер місяця";
        }

        System.out.println("Місяць " + month + " відноситься до " + season);
    }
}
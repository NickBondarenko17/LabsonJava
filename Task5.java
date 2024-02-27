import java.util.Scanner; // імпортуємо клас Scanner з пакету java.util.
public class Task5 { // оголошення класу

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //створює новий об'єкт
        System.out.print("Введіть число: ");
        int number = scanner.nextInt(); //запрошуємо користувача ввести число

        int sotni = number / 100; // ділимо наше число на 100 для отримання сотні
        int desyatki = (number % 100) / 10; // результат ділимо на 10 для отримання десятків
        int odinitci= number % 10; // отримання одиниці

        int reversedNumber = odinitci * 100 + desyatki * 10 + sotni; //Множимо одиницю на 100, десяток на 10 і складаємо їх з сотнею, щоб отримати реверсоване число.

        System.out.println("Оригінальне число: " + number); //виведення записаного числа
        System.out.println("Реверсоване число: " + reversedNumber); //виведення реверснутого числа
    }
}
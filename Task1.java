public class Task1 {

    public static void main(String[] args) {
        //Оголошуємо значення змінних
        int a = 12;
        int b = 23;
        int c = 34;
        int d = 45;
        int e = 56;
        int f = 67;
        int g = 78;
        int h = 89;
        int i = 90;
        int j = 101;

        int suma = a + b + c + d + e + f + g + h + i + j; // додаємо значення змінних
        int riznitsya = a - b - c - d - e - f - g - h - i - j; //віднімаємо значення змінних
        int dobutok = a * b * c * d * e * f * g * h * i * j; // добуток змінних
        int chastka = a / b / c / d / e / f / g / h / i / j; //частка змінних

        //виводимо значення оголощенних змінних
        System.out.println("Сума: " + suma);
        System.out.println("Різниця: " + riznitsya);
        System.out.println("Добуток: " + dobutok);
        System.out.println("Частка: " + chastka);
    }
}

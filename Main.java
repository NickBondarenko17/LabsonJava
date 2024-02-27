
    public class Main {

        public static void main(String[] args) {
            // посилаємося на наш клас з заданими параметрами змінних. Присвоюємо змінним значення відповідно кожні 10 раз
            Car car1 = new Car(150, 1.6, "Червоний", "Toyota Corolla", 2023, true, 5, "Японія", "Бензин", 7.0);
            Car car2 = new Car(180, 2.0, "Синій", "Ford Focus", 2022, false, 5, "США", "Бензин", 8.5);
            Car car3 = new Car(200, 2.5, "Білий", "Volkswagen Passat", 2021, true, 5, "Німеччина", "Бензин", 9.0);
            Car car4 = new Car(120, 1.4, "Сірий", "Skoda Octavia", 2020, false, 5, "Чехія", "Бензин", 6.5);
            Car car5 = new Car(160, 1.8, "Чорний", "Renault Megane", 2019, true, 5, "Франція", "Бензин", 7.5);
            Car car6 = new Car(220, 3.0, "Сріблястий", "BMW 3 Series", 2018, false, 5, "Німеччина", "Бензин", 10.0);
            Car car7 = new Car(140, 1.6, "Зелений", "Audi A4", 2017, true, 5, "Німеччина", "Бензин", 8.0);
            Car car8 = new Car(170, 2.0, "Фіолетовий", "Mercedes-Benz C-Class", 2016, false, 5, "Німеччина", "Бензин", 9.5);
            Car car9 = new Car(250, 3.5, "Жовтий", "Porsche 911", 2015, true, 4, "Німеччина", "Бензин", 12.0);
            Car car10 = new Car(130, 1.5, "Помаранчевий", "Fiat 500", 2014, false, 4, "Італія", "Бензин", 6.0);

            double totalEngineVolume = car1.getEngineVolume() + car2.getEngineVolume() + car3.getEngineVolume()
                    + car4.getEngineVolume() + car5.getEngineVolume() + car6.getEngineVolume() + car7.getEngineVolume()
                    + car8.getEngineVolume() + car9.getEngineVolume() + car10.getEngineVolume(); // Просумувати покахник літражу двигуна

            int totalHorsepower = car1.getHorsepower() + car2.getHorsepower() + car3.getHorsepower() + car4.getHorsepower()
                    + car5.getHorsepower() + car6.getHorsepower() + car7.getHorsepower() + car8.getHorsepower()
                    + car9.getHorsepower() + car10.getHorsepower();
            System.out.println("Загальний об'єм двигунів: " + totalEngineVolume);
            System.out.println("Загальна потужність: " + totalHorsepower); // сума кінських сил 10 автомобілів


        }
    }

    class Lab1_Task3 {
       public static void main(String[] args) {
        // Створити 10 об'єктів класу User
        User user1 = new User(1, 20, "Іван", "Петренко", 70.0, 1.80);
        User user2 = new User(2, 25, "Марія", "Іванова", 60.0, 1.70);
        User user3 = new User(3, 30, "Аліна", "Голод", 55.0, 1.58);
        User user4 = new User(4, 35, "Микита", "Бондаренко", 75.0, 1.80);
        User user5 = new User(5, 40, "Сергій", "Гончаренко", 90.0, 1.85);
        User user6 = new User(6, 45, "Олена", "Зайцева", 65.0, 1.75);
        User user7 = new User(7, 50, "Дмитро", "Коваленко", 85.0, 1.95);
        User user8 = new User(8, 55, "Анна", "Попова", 50.0, 1.65);
        User user9 = new User(9, 60, "Микола", "Степаненко", 75.0, 1.80);
        User user10 = new User(10, 65, "Юлія", "Левченко", 60.0, 1.70);

        // Додати між собою значення їх віку
        int totalAge = user1.getAge() + user2.getAge() + user3.getAge() + user4.getAge() + user5.getAge() +
                user6.getAge() + user7.getAge() + user8.getAge() + user9.getAge() + user10.getAge();

        // Додати між собою значення їх ваги
        double totalWeight = user1.getWeight() + user2.getWeight() + user3.getWeight() + user4.getWeight() +
                user5.getWeight() + user6.getWeight() + user7.getWeight() + user8.getWeight() + user9.getWeight() +
                user10.getWeight();

        // Додати між собою значення їх зросту
        double totalHeight = user1.getHeight() + user2.getHeight() + user3.getHeight() + user4.getHeight() +
                user5.getHeight() + user6.getHeight() + user7.getHeight() + user8.getHeight() + user9.getHeight() +
                user10.getHeight();

        // Вивести результат у консоль
        System.out.println("Загальний вік: " + totalAge);
        System.out.println("Загальна вага: " + totalWeight);
        System.out.println("Загальний зріст: " + totalHeight);
    }
}

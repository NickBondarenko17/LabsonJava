public class Car {

    private int horsepower; //кінські сили
    private double engineVolume; //літраж бензину
    private String color; //колір
    private String model; // модель
    private int yearOfProduction; // рік випуску
    private boolean isAutomatic; //автоматична КПП чи ні
    private int numberOfSeats; //кількість місць
    private String countryOfOrigin; // країна походження
    private String fuelType; // тип бензину
    private double fuelConsumption; // споживання палива

    public Car(int horsepower, double engineVolume, String color, String model, int yearOfProduction,
               boolean isAutomatic, int numberOfSeats, String countryOfOrigin, String fuelType, double fuelConsumption) {
        //викликаємо конструктор типу
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.color = color;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isAutomatic = isAutomatic;
        this.numberOfSeats = numberOfSeats;
        this.countryOfOrigin = countryOfOrigin;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
    }

    public int getHorsepower() {
        return horsepower; //вертаємо значення кінських сил
    }

    public double getEngineVolume() {
        return engineVolume; //вертаємо значення літражу двигуна
    }
}

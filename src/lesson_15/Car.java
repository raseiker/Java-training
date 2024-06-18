package lesson_15;

public class Car {
    private String brand;
    private String model;
    private String year;

    public Car() {}

    public Car(String brand, String model, String year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public void printData(int number) {
        String message = "Car n°" + number + ": ";

        message += brand == null
        ? "Doesnt have a brand, "
        : "Brand: " + brand + ", ";

        message += model == null
        ? "Doesnt have a model, "
        : "Model: " + model + ", ";

        message += year == null
        ? "Doesnt have a year"
        : "Year: " + year;

        System.out.println(message);
    }
}

public class Car {

    static String companyName = "Honda";
    String carModel1 = "Civic";
    String carModel2 = "Accord";

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("Car company name is: " + Car.companyName);
        System.out.println("Car model 1 is: " + car.carModel1);
        System.out.println("Car model 2 is: " + car.carModel2);

    }
}
public class CarDemo {
    public static void main(String[] args) {
        // Creating a Car object using the constructor
        Car car1 = new Car("Corolla", 2022, "Blue", "Toyota", 25000, 10);

        // Printing the details of the car using toString() method
        System.out.println(car1.toString());

        // Selling 3 cars
        car1.sell(3);

        // Printing all fields using getter methods
        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Quantity: " + car1.getQuantity());

        // Changing some fields using setter methods
        car1.setPrice(23000);
        car1.setColor("Red");

        // Printing details again after changes
        System.out.println(car1.toString());
    }
}

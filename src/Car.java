import java.util.Objects;

class Car {
    private String model;
    private int year;
    private String color;
    private String brand;
    private int price;
    private int quantity;

    public Car(String model, int year, String color, String brand, int price, int quantity) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && price == car.price && quantity == car.quantity && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, color, brand, price, quantity);
    }
    void sell(int sold){quantity-=sold;}
    void delivery(int delivery){price+=delivery;}
}

package chapter9_set_map.exercise.exercise_v4_chapter9;

public abstract class MobilePhone {
    protected String id;
    protected String name;
    protected double price;
    protected String warranty;
    protected String manufacturer;
    public abstract double calculateTotalPrice();

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warrantyPeriod) {
        this.warranty = warrantyPeriod;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public MobilePhone(String id, String name, double price, String warrantyPeriod, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warrantyPeriod;
        this.manufacturer = manufacturer;
    }

    public abstract void displayInfo();

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getManufacturer() { return manufacturer; }

    public abstract void applyDiscount(double percentage);
}
package chapter6_abstract_class_interface.exercise_v3_chapter6;

public class OldPhone extends MobilePhone implements Promotion {
    private int batteryStatus;
    private String description;

    public int getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OldPhone(String id, String name, double price, String warrantyPeriod, String manufacturer, int batteryStatus, String description) {
        super(id, name, price, warrantyPeriod, manufacturer);
        this.batteryStatus = batteryStatus;
        this.description = description;
    }

    @Override
    public void displayInfo() {
        System.out.printf("| %-7s | %-15s | %-12.2f | %-10s | %-10s | Bat: %d%% | %s\n",
                id, name, price, warranty, manufacturer, batteryStatus, description);
    }

    @Override
    public double calculateTotalPrice() {
        return this.price; //
    }

    @Override
    public void applyDiscount(double percentage) {
        // Price = Price * (100 - percentage) / 100
        this.price = this.price * (1 - (percentage / 100));
    }
}


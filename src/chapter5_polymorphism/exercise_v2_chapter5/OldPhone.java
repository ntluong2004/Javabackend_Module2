package chapter5_polymorphism.exercise_v2_chapter5;

public class OldPhone extends MobilePhone {
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
}


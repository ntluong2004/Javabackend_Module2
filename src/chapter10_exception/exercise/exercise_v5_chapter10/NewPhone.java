package chapter10_exception.exercise.exercise_v5_chapter10;

public class NewPhone extends MobilePhone {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public NewPhone(String id, String name, double price, String warrantyPeriod, String manufacturer, int quantity) {
        super(id, name, price, warrantyPeriod, manufacturer);
        this.quantity = quantity;
    }

    @Override
    public void displayInfo() {
        System.out.printf("| %-7s | %-15s | %-12.2f | %-10s | %-10s | Qty: %d\n",
                id, name, price, warranty, manufacturer, quantity);
    }

    @Override
    public void applyDiscount(double percentage) {

    }

    @Override
    public double calculateTotalPrice() {
        return this.quantity * this.price; //
    }
}

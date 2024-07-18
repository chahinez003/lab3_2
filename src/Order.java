import java.util.ArrayList;
import java.util.List;

public class Order {
    private double totalPrice;
    private int itemQuantity;
    private double shippingCost;
    private List<OrderObserver> observer = new ArrayList<>();
    private String id ;

    public void attach (OrderObserver observers) {
        observer.add(observers);
    }

    public void detach( OrderObserver observers) {
        observer.remove(observers);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getCount() {
        return itemQuantity;
    }

    public void updateOrder(double price, int count) {
        this.totalPrice = price;
        this.itemQuantity = count;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observer) {
            observer.update(this);
        }
    }
    @Override
    public String toString() {
        return "Order: " + "Total Price: " + totalPrice + ", Item Quantity: " + "Shipping cost: "+ shippingCost;

    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void addItem(double price) {
        // Update item quantity
        this.itemQuantity++;

        // Update total price
        this.totalPrice += price;

        // Notify observers
        notifyObservers();
    }
}

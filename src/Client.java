public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.updateOrder(250, 6);
        System.out.println(order);

        order.updateOrder(150, 4);
        System.out.println(order);

        // Testing PriceObserver update
        priceObserver.update(order);
        System.out.println("After PriceObserver update:");
        System.out.println(order);

        // Testing QuantityObserver update
        quantityObserver.update(order);
        System.out.println("After QuantityObserver update:");
        System.out.println(order);
    }
}
public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.updateOrder(201, 6);
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
        System.out.println();

        //Testing addItems:
        order.addItem(10.5);
        order.addItem(100);
        order.addItem(26);
        order.addItem(250);

        System.out.println("Final Order Total Price: $" + order.getTotalPrice());
        System.out.println("Final quantity: " + order.getCount());
        System.out.println();
        System.out.println("Thank you !");
    }
}
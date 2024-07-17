public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        // Exemple de mise à jour de la commande
        order.updateOrder(250, 6);
        System.out.println(order);

        order.updateOrder(150, 4);
        System.out.println(order);
    }
}
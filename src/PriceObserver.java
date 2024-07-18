class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            double newPrice = order.getTotalPrice() - 20;
            order.updateOrder(newPrice, order.getCount());

        }
    }
}

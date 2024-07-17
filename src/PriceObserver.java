class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            order.updateOrder(order.getTotalPrice() - 20, order.getCount());
        }
    }
}
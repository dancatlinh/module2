public class Store {
    private double salesStore;

    public Store() {}
    public Store(double salesStore) {
        this.salesStore = salesStore;
    }

    public double getSalesStore() {
        return salesStore;
    }

    public void setSalesStore(double salesStore) {
        this.salesStore = salesStore;
    }

    @Override
    public String toString() {
        return "Store{" +
                "Doanh thu cửa hàng = " + salesStore +
                '}';
    }
}

public class Order {
    private int idOrder;
    private int idCustomer;
    private String nameCustomer;
    private int phoneCustomer;
    private String idProduct;
    private int quanityOrder;



    public Order() {
    }

    public Order(int idOrder, int idCustomer, String nameCustomer, int phoneCustomer, String idProduct,int quanityOrder) {
        this.idOrder = idOrder;
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.phoneCustomer = phoneCustomer;
        this.idProduct = idProduct;
        this.quanityOrder = quanityOrder;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(int phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public int getQuanityOrder() {
        return quanityOrder;
    }

    public void setQuanityOrder(int quanityOrder) {
        this.quanityOrder = quanityOrder;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", idCustomer=" + idCustomer +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", phoneCustomer=" + phoneCustomer +
                ", idProduct='" + idProduct + '\'' +
                ", quanityOrder=" + quanityOrder +
                '}';
    }
}

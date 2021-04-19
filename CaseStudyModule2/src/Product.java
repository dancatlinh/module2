public class Product {
    private String nameProduct;
    private String idProduct;
    private int quanityProduct;
    private double priceProduct;
    private String descriptionProduct;

    public Product() {}

    //region CONTRUCTOR
    public Product(String nameProduct, String idProduct, int quanityProduct, double priceProduct, String descriptionProduct) {
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.quanityProduct = quanityProduct;
        this.priceProduct = priceProduct;
        this.descriptionProduct = descriptionProduct;
    }

    //endregion


    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuanityProduct() {
        return quanityProduct;
    }

    public void setQuanityProduct(int quanityProduct) {
        this.quanityProduct = quanityProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    @Override
    public String toString() {
        return
                nameProduct + "," +
                idProduct + "," +
                 quanityProduct + "," +
                 priceProduct + "," +
                 descriptionProduct;

    }
}

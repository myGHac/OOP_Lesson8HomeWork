package task3;

public class Price {
    private String product;
    private String shop;
    private int price;

    public Price() {
    }

    public Price(String product, String shop, int price) {
        this.product = product;
        this.shop = shop;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  product + " " + shop + " " +  price ;
    }
}

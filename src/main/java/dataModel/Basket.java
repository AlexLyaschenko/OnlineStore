package dataModel;

public class Basket {
    private int idBasket;
    private int price;
    private String productList;

    public Basket (int idBasket, int price, String productList) {
        this.idBasket = idBasket;
        this.price = price;
        this.productList = productList;
    }
    public void setIdBasket(int idBasket) {
        this.idBasket = idBasket;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public int getIdBasket() {
        return idBasket;
    }

    public int getPrice() {
        return price;
    }

    public String getProductList() {
        return productList;
    }
}

package dataModel;

public class Basket {
    private int idBasket;
    private int idProduct;

    public Basket (int idBasket, int idProduct) {
        this.idBasket = idBasket;
        this.idProduct = idProduct;
    }
    public void setIdBasket(int idBasket) {
        this.idBasket = idBasket;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdBasket() {
        return idBasket;
    }

    public int getIdProduct() {
        return idProduct;
    }
}

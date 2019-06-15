package dataModel;

public class Product {
    private int idProduct;
    private String name;
    private double price;
    private int idSection;
    private int weight;
    private String dateOfManufacture;
    private String expirationDate;

    public Product (int idProduct, String name, double price, int idSection, int weight, String dateOfManufacture, String expirationDate) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.idSection = idSection;
        this.weight = weight;
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getIdSection() {
        return idSection;
    }

    public int getWeight() {
        return weight;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

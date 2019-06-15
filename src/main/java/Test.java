import DAO.BasketDAO;
import DAO.ProductDAO;
import dataModel.Basket;
import dataModel.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        BasketDAO basketDAO = new BasketDAO();
        List<Basket> baskets = new ArrayList<>();
        ProductDAO productDAO = new ProductDAO();
        List<Product> products = new ArrayList<>();
        try {
            products = productDAO.getProductFromDB(-1,"",-1,-1,-1,"","");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            baskets = basketDAO.getBasketFromDB(-1, -1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(baskets.size());
        System.out.println(products.size());
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}

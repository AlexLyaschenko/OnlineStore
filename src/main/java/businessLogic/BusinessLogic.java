package businessLogic;

import DAO.BasketDAO;
import DAO.ProductDAO;
import dataModel.Product;
import factory.BeanFactory;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public class BusinessLogic {

    public void getGoods(HttpServletRequest req) throws SQLException {
        List<Product> customerGoods = ((ProductDAO) BeanFactory.getBean(ProductDAO.class)).getProductFromDB(
                -1,"", -1, 1, -1, "", "");
        List<Product> intermediateConsumptionGoods = ((ProductDAO) BeanFactory.getBean(ProductDAO.class)).getProductFromDB(
                -1, "", -1, 2, -1, "","");
        List<Product> manufacturedGoods = ((ProductDAO) BeanFactory.getBean(ProductDAO.class)).getProductFromDB(
                -1, "", -1, 3, -1, "", "");
        req.setAttribute("customerGoods", customerGoods);
        req.setAttribute("intermediateConsumptionGoods", intermediateConsumptionGoods);
        req.setAttribute("manufacturedGoods", manufacturedGoods);
    }

    public void addToBasket(HttpServletRequest req) throws SQLException {
        BasketDAO basketDAO = (BasketDAO) BeanFactory.getBean(BasketDAO.class);
        basketDAO.setBasketToDB(Integer.parseInt(req.getAttribute("idProduct").toString()));

    }
}

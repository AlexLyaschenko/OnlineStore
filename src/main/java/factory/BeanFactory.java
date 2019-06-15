package factory;

import DAO.BasketDAO;
import DAO.ProductDAO;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    private static Map<Class<?>, Object> beans = new HashMap<>();

    static {
        BasketDAO basketDAO = new BasketDAO();
        beans.put(BasketDAO.class, basketDAO);

        ProductDAO productDAO = new ProductDAO();
        beans.put(ProductDAO.class, productDAO);
    }

    public static Object getBean(Class<?> beanClass) {
        return beans.get(beanClass);
    }
}

package DAO;

import dataConnection.DataConnection;
import dataModel.Basket;
import servlets.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BasketDAO {

    public List<Basket> getBasketFromDB(int idBasket, int price, String productList) throws SQLException {
        List<Basket> getBasketArr = new ArrayList<>();
        Connection connection = DataConnection.getDBConnection();

        final String sqlQuery =
                String.format("SELECT * FROM Basket WHERE idBascet %s AND price %s AND productList %s",
                        idBasket == Constants.SELECT_ALL_INT ? "LIKE '%'" : "= " + idBasket,
                        price == Constants.SELECT_ALL_INT ? "LIKE '%'" : "= " + price,
                        productList.equals(Constants.SELECT_ALL_STR) ? "LIKE '%'" : "= '" + productList + "'"
                );

        PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            Basket basket = new Basket(rs.getInt("idBascet"), rs.getInt("price"), rs.getString("productList"));
            getBasketArr.add(basket);
        }
        connection.close();
        return getBasketArr;

    }
}
